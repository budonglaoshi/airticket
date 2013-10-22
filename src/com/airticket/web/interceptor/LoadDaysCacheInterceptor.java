package com.airticket.web.interceptor;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.airticket.web.action.FlightSerchAction;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class LoadDaysCacheInterceptor implements Interceptor {

	private static final Logger logger = Logger.getLogger(LoadDaysCacheInterceptor.class);


	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		//获取用户ip
		String ip = this.getIpAddr(ServletActionContext.getRequest());

		FlightSerchAction serchAction = (FlightSerchAction)invocation.getAction();
		Date[] days=new Date[7];
		Date loadDay=null;
		Date date=SignatureUtils.formatStringToDate(MemcachedUtil.get(ip + "departTime").toString(), "yyyy-MM-dd");
		//serchAction.getView().setDepartDate(date);

		System.out.println(SignatureUtils.formatDateToString(serchAction.getView().getDepartDate(),"yyyy-MM-dd"));
		if(null==MemcachedUtil.get(ip + "days_views")
				||date.getTime()!=serchAction.getView().getDepartDate().getTime()
				|| (!serchAction.getView().getDepartCity().equals(MemcachedUtil.get(ip + "depart"))
				|| serchAction.getView().getDepartDate().getTime()!=SignatureUtils.formatStringToDate(MemcachedUtil.get(ip + "departTime").toString(),"yyyy-MM-dd").getTime()
				|| !serchAction.getView().getArriveCity().equals(MemcachedUtil.get(ip + "arrive"))
				|| !serchAction.getView().getSearchType().equals(MemcachedUtil.get(ip + "type")))) {
			
			//查询日期距离当前时间-4天内
			if((Long.valueOf((serchAction.getView().getDepartDate().getTime()-(new Date().getTime())))/(1000 * 60 * 60 * 24))<4){
				loadDay=new Date();
				days[0]=loadDay;
				for (int i = 1; i < 7; i++) {
					loadDay=new Date(loadDay.getTime()+(1000 * 60 * 60 * 24));
					days[i]=loadDay;
				}
			}else{
				//查询时间距离当前时间-超过4天
				for (int i = 0; i < 7; i++) {
					if(i<3){
						loadDay=new Date(serchAction.getView().getDepartDate().getTime()-((1000 * 60 * 60 * 24)*(3-i)));
					}else if(i==3){
						loadDay=serchAction.getView().getDepartDate();
					}
					else{
						loadDay=new Date(serchAction.getView().getDepartDate().getTime()+((1000 * 60 * 60 * 24)*(i-3)));
					}
					days[i]=loadDay;
				}
			}
			
			serchAction.setDays(days);
			
			invocation.invoke();
			
		
			MemcachedUtil.delete(ip + "days_views");
			// 缓存时间
			Date cacheTime = new Date(System.currentTimeMillis() + 20 * 1000 * 60);
			
			if (!MemcachedUtil.add(ip + "days_views", ActionContext.getContext().get("days_views"),cacheTime))
				logger.error(ip + "days_views 缓存数据失败！");
		} else {
			ActionContext.getContext().put("days_views", MemcachedUtil.get(ip + "days_views"));
		}
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		try {
			serchAction.getView().setDepartDate(SignatureUtils.formatStringToDate(MemcachedUtil.get(ip + "departTime").toString(),"yyyy-MM-dd"));
			System.out.println(SignatureUtils.formatStringToDate(MemcachedUtil.get(ip + "departTime").toString(),"yyyy-MM-dd"));
			ActionContext.getContext().put("departTime1111",SignatureUtils.formatStringToDate(MemcachedUtil.get(ip + "departTime").toString(),"yyyy-MM-dd"));
			response.getWriter().print(MemcachedUtil.get(ip + "days_views"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * 获取用户ip
	 * 
	 * @param request
	 * @return
	 */
	private String getIpAddr(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}

		ip += ",";
		String[] ips = ip.split(",");
		for (String str : ips) {
			if (str.equalsIgnoreCase("unknown"))
				continue;
			ip = str;
		}

		return ip;
	}

}
