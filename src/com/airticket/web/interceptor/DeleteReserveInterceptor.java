package com.airticket.web.interceptor;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.airticket.bean.ResponseView;
import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class DeleteReserveInterceptor implements Interceptor {
	
	private static final Logger logger = Logger.getLogger(DeleteReserveInterceptor.class);
	
	public void destroy() {}

	public void init() {}

	public String intercept(ActionInvocation invocation) throws Exception {

		//获取用户ip
		String ip = this.getIpAddr(ServletActionContext.getRequest());
		
		ActionContext context = invocation.getInvocationContext().getContext();
		Map<String, Object> params = invocation.getInvocationContext().getParameters();
		

		Object takeOffTimeObj = params.get("view.takeOffTime");
		Object priceObj = params.get("view.price");
		Object flightNoObj = params.get("view.flightNo");
		Object flightClassObj = params.get("view.flightClass");
		
		//提取
		String takeOffTime=(null!=takeOffTimeObj?((String[])takeOffTimeObj)[0]:StaticData.EMPTY);
		String price=(null!=priceObj?((String[])priceObj)[0]:StaticData.EMPTY);
		String flightNo=(null!=flightNoObj?((String[])flightNoObj)[0]:StaticData.EMPTY);
		String flightClass=(null!=flightClassObj?(((String[])flightClassObj)[0]):StaticData.EMPTY);

		
		List<ResponseView> reserveViews=(List<ResponseView>) MemcachedUtil.get(ip + "reserveViews");
		
		if(null==reserveViews||reserveViews.size()==0){
			return Action.NONE;
		}
		
		for (ResponseView responseView : reserveViews) {
			if(price.equals(responseView.getPrice().toString())&&flightNo.equals(responseView.getFlightNo().toString())&&flightClass.equals(responseView.getFlightClass().toString())&&takeOffTime.equals(SignatureUtils.formatDateToString(responseView.getTakeOffTime(), "yyyy-MM-dd hh:mm:ss").toString())){
				context.put("responseView", responseView);
				
				return invocation.invoke();
			}
		}
				
		return Action.NONE;
		
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
