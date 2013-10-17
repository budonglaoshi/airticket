package com.airticket.web.interceptor;


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class SaveOrderInterceptor  implements Interceptor {
	
	private static final Logger logger = Logger.getLogger(SaveOrderInterceptor.class);
	
	public void destroy() {}

	public void init() {}

	public String intercept(ActionInvocation invocation) throws Exception {
		
//		//获取用户ip
//		String ip = this.getIpAddr(ServletActionContext.getRequest());
//		
		//ActionContext context = invocation.getInvocationContext().getContext();
//		System.out.println(((OrderAction)invocation.getAction()).getOrderPassengers().size());
//		Map session=context.getSession();
//		
//		List<OrderPassenger> orderPassengers=(List<OrderPassenger>)session.get("orderPassengers");
//		System.out.println(orderPassengers.size());
		
		invocation.invoke();
		
//		if ((null == MemcachedUtil.get(ip + "views"))
//				|| (!departCity.equals(MemcachedUtil.get(ip + "depart"))
//						|| !departDate.equals(MemcachedUtil.get(ip + "departTime"))
//						|| !arriveCity.equals(MemcachedUtil.get(ip + "arrive"))
//						|| (!returnDate.equals(null == MemcachedUtil.get(ip+ "arriveTime") ? StaticData.EMPTY: MemcachedUtil.get(ip+ "arriveTime"))) 
//						|| !searchType.equals(MemcachedUtil.get(ip + "type")))) {
//			
//			String callback = invocation.invoke();
//			
//			
//			// 缓存前先清除以前的缓存
//			MemcachedUtil.delete(ip + "views");
//			MemcachedUtil.delete(ip + "depart");
//			MemcachedUtil.delete(ip + "departTime");
//			MemcachedUtil.delete(ip + "arrive");
//			MemcachedUtil.delete(ip + "arriveTime");
//			MemcachedUtil.delete(ip + "type");
//
//			// 缓存时间
//			Date cacheTime = new Date(System.currentTimeMillis() + 20 * 60 * 1000);
//			
//			// 设置缓存
//			if (!MemcachedUtil.add(ip + "views", context.get("viewers"), cacheTime))
//				logger.error(ip + "views 缓存数据失败！");
//			if (!MemcachedUtil.add(ip + "depart", context.get("depart"),cacheTime))
//				logger.error(ip + "depart 缓存数据失败！");
//			if (!MemcachedUtil.add(ip + "departTime",context.get("departTime"), cacheTime))
//				logger.error(ip + "departTime 缓存数据失败！");
//			if (!MemcachedUtil.add(ip + "arrive", context.get("arrive"),cacheTime))
//				logger.error(ip + "arrive 缓存数据失败！");
//			if (!MemcachedUtil.add(ip + "arriveTime",null == context.get("arriveTime") ? StaticData.EMPTY :context.get("arriveTime"), cacheTime))
//				logger.error(ip + "arriveTime 缓存数据失败！");
//			if (!MemcachedUtil.add(ip + "type",context.get("type"),cacheTime))
//				logger.error(ip + "type 缓存数据失败！");
//			
//			return callback;
//		}else{
//			
//			context.put("viewers", MemcachedUtil.get(ip + "views"));
//			context.put("depart", MemcachedUtil.get(ip + "depart"));
//			context.put("departTime",MemcachedUtil.get(ip + "departTime"));
//			context.put("arrive", MemcachedUtil.get(ip + "arrive"));
//			context.put("arriveTime",MemcachedUtil.get(ip+ "arriveTime"));
//			context.put("type", MemcachedUtil.get(ip + "type"));
//			
//			return Action.SUCCESS;
//		}
//		
		return null;
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
