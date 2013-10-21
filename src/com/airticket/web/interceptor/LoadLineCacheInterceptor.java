package com.airticket.web.interceptor;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.airticket.bean.RequestView;
import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.airticket.web.action.FlightSerchAction;
import com.danga.MemCached.MemCachedClient;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class LoadLineCacheInterceptor implements Interceptor {

	private static final Logger logger = Logger.getLogger(LoadLineCacheInterceptor.class);


	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		// 获取用户ip
		String ip = this.getIpAddr(ServletActionContext.getRequest());

		ActionContext context = invocation.getInvocationContext().getContext();
		Map<String, Object> params = invocation.getInvocationContext()
				.getParameters();
		FlightSerchAction serchAction = (FlightSerchAction) invocation
				.getAction();
		
		RequestView viewer = serchAction.getView();
		
		
		if (null == MemcachedUtil.get(ip + "lineviews")
				|| !viewer.getDepartCity().equals(MemcachedUtil.get(ip + "linedepart"))
				|| !viewer.getArriveCity().equals(MemcachedUtil.get(ip + "linearrive"))) {

			invocation.invoke();
			// 缓存前先清除以前的缓存
			MemcachedUtil.delete(ip + "lineviews");
			MemcachedUtil.delete(ip + "linedepart");
			MemcachedUtil.delete(ip + "linearrive");
			// 缓存时间
			Date cacheTime = new Date(System.currentTimeMillis() + 20 * 1000 * 60);
			// 设置缓存
			if (!MemcachedUtil.add(ip + "lineviews", context.get("lineviews"),cacheTime))
				logger.error(ip + "lineviews 缓存数据失败！");
			if (!MemcachedUtil.add(ip + "linedepart", context.get("linedepart"),cacheTime))
				logger.error(ip + "linedepart 缓存数据失败！");
			if (!MemcachedUtil.add(ip + "linearrive", context.get("linearrive"),cacheTime))
				logger.error(ip + "linearrive 缓存数据失败！");
		} else {
			context.put("viewers", MemcachedUtil.get(ip + "lineviews"));
		}
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		try {
			response.getWriter().print(MemcachedUtil.get(ip + "lineviews"));
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
