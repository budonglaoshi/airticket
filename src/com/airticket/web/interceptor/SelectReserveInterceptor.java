package com.airticket.web.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.airticket.bean.ResponseView;
import com.airticket.util.MemcachedUtil;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class SelectReserveInterceptor implements Interceptor {
	
	private static final Logger logger = Logger.getLogger(SelectReserveInterceptor.class);
	
	
	public void destroy() {}

	public void init() {}

	public String intercept(ActionInvocation invocation) throws Exception {

		//获取用户ip
		String ip = this.getIpAddr(ServletActionContext.getRequest());
		
		ActionContext context = invocation.getInvocationContext().getContext();
		
		
		List<ResponseView> reserveViews=(List<ResponseView>) MemcachedUtil.get(ip + "reserveViews");
		
		if(reserveViews!=null&&reserveViews.size()>0){
			
			context.put("reserveViews", reserveViews);
			return invocation.invoke();
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
