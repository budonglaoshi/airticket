package com.airticket.web.interceptor;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.airticket.bean.RequestView;
import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.airticket.web.action.FlightSerchAction;
import com.airticket.web.action.ReserveFlightAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class FlightSearchCacheInterceptor  implements Interceptor {
	
	private static final Logger logger = Logger.getLogger(FlightSearchCacheInterceptor.class);
	
	public void destroy() {}

	public void init() {}

	public String intercept(ActionInvocation invocation) throws Exception {
		//获取用户ip
		String ip = this.getIpAddr(ServletActionContext.getRequest());
		
		ActionContext context = invocation.getInvocationContext().getContext();
		Map<String, Object> params = invocation.getInvocationContext().getParameters();
		
		FlightSerchAction serchAction = (FlightSerchAction)invocation.getAction();
		
		
		Object departObj = params.get("view.departCity");
		Object departDateObj = params.get("view.departDate");
		Object arriveObj = params.get("view.arriveCity");
		Object returnObj = params.get("view.returnDate");
		Object typeObj = params.get("view.searchType");
		//提取
		String departCity = (null!=departObj?((String[])departObj)[0]:StaticData.EMPTY);
		String departDate = (null!=departDateObj?((String[])departDateObj)[0]:StaticData.EMPTY);
		String arriveCity = (null!=arriveObj?((String[])arriveObj)[0]:StaticData.EMPTY);
		String returnDate = (null!=returnObj?((String[])returnObj)[0]:StaticData.EMPTY);
		String searchType = (null!=typeObj?((String[])typeObj)[0]:StaticData.EMPTY);
		//初始
		serchAction.setView(new RequestView());
		serchAction.getView().setDepartCity(departCity);
		serchAction.getView().setDepartDate(SignatureUtils.formatStringToDate(departDate,"yyyy-MM-dd"));
		serchAction.getView().setArriveCity(arriveCity);
		serchAction.getView().setReturnDate(SignatureUtils.formatStringToDate(returnDate,"yyyy-MM-dd"));
		serchAction.getView().setSearchType(searchType);
		
		if ((null == MemcachedUtil.get(ip + "views"))
				|| (!departCity.equals(MemcachedUtil.get(ip + "depart"))
						|| !departDate.equals(MemcachedUtil.get(ip + "departTime"))
						|| !arriveCity.equals(MemcachedUtil.get(ip + "arrive"))
						|| (!returnDate.equals(null == MemcachedUtil.get(ip+ "arriveTime") ? StaticData.EMPTY: MemcachedUtil.get(ip+ "arriveTime"))) 
						|| !searchType.equals(MemcachedUtil.get(ip + "type")))) {
			
			String callback = invocation.invoke();
			
			
			// 缓存前先清除以前的缓存
			MemcachedUtil.delete(ip + "views");
			MemcachedUtil.delete(ip + "depart");
			MemcachedUtil.delete(ip + "departTime");
			MemcachedUtil.delete(ip + "arrive");
			MemcachedUtil.delete(ip + "arriveTime");
			MemcachedUtil.delete(ip + "type");
			
			MemcachedUtil.delete(ip + "days_views");
			
			// 缓存时间
			Date cacheTime = new Date(System.currentTimeMillis() + 20 * 60 * 1000);
			
			// 设置缓存
			if (!MemcachedUtil.add(ip + "views", context.get("viewers"), cacheTime))
				logger.error(ip + "views 缓存数据失败！");
			if (!MemcachedUtil.add(ip + "depart", context.get("depart"),cacheTime))
				logger.error(ip + "depart 缓存数据失败！");
			if (!MemcachedUtil.add(ip + "departTime",context.get("departTime"), cacheTime))
				logger.error(ip + "departTime 缓存数据失败！");
			if (!MemcachedUtil.add(ip + "arrive", context.get("arrive"),cacheTime))
				logger.error(ip + "arrive 缓存数据失败！");
			if (!MemcachedUtil.add(ip + "arriveTime",null == context.get("arriveTime") ? StaticData.EMPTY :context.get("arriveTime"), cacheTime))
				logger.error(ip + "arriveTime 缓存数据失败！");
			if (!MemcachedUtil.add(ip + "type",context.get("type"),cacheTime))
				logger.error(ip + "type 缓存数据失败！");
			
			return callback;
		}else{
			
			context.put("viewers", MemcachedUtil.get(ip + "views"));
			context.put("depart", MemcachedUtil.get(ip + "depart"));
			context.put("departTime",MemcachedUtil.get(ip + "departTime"));
			context.put("arrive", MemcachedUtil.get(ip + "arrive"));
			context.put("arriveTime",MemcachedUtil.get(ip+ "arriveTime"));
			context.put("type", MemcachedUtil.get(ip + "type"));
			
			return Action.SUCCESS;
		}
		
		
		
	}

	
	/**
	 * 获取用户ip
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
