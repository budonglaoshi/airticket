package com.airticket.web.interceptor;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import com.airticket.bean.RequestView;
import com.airticket.bean.ResponseView;
import com.airticket.biz.OrderBiz;
import com.airticket.dao.OrderDao;
import com.airticket.util.JsonUtil;
import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.web.action.OrderAction;
import com.airticket.web.action.ReserveFlightAction;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

@SuppressWarnings("serial")
public class SaveReserveInterceptor implements Interceptor {

	private static final Logger logger = Logger.getLogger(SaveReserveInterceptor.class);
	private OrderBiz orderBiz;
	
	

	public void destroy() {
	}

	public void init() {
	}

	public String intercept(ActionInvocation invocation) throws Exception {

		// 获取用户ip
		String ip = this.getIpAddr(ServletActionContext.getRequest());
		RequestView view =null;
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		
		
		
		ActionContext context = invocation.getInvocationContext().getContext();
		try {
			ReserveFlightAction action = (ReserveFlightAction) invocation.getAction();
			view = action.getView();
		} catch (Exception e) {
			try {
				OrderAction action = (OrderAction) invocation.getAction();
				view = action.getView();
			} catch (Exception e2) {
				writer.print("false");
			}
			
		}
		
		

		 
		// 要获取的对象
		ResponseView viewer = null;
		Date cacheTime = new Date(System.currentTimeMillis() + 20 * 60 * 1000);
		invocation.invoke();
		// 预定机票的最新信息
		Object rvs = context.get(ip + "rvs");
		if (null != rvs) {
			List<ResponseView> jsonRes = (List<ResponseView>) rvs;
			boolean isok = false;
			// 判断机票是够发生变化
			for (ResponseView new_responseView : jsonRes) {
				// 判断数据是否过期
				if (String.valueOf(view.getPrice()).equals(
						String.valueOf(new_responseView.getPrice()))
						&& view.getFlightNo().equals(
								new_responseView.getFlightNo())
						&& view.getFlightClass().equals(
								new_responseView.getFlightClass())
						&& view.getDepartCity().equals(
								new_responseView.getDepCityDetail()
										.getCityCode())
						&& view.getArriveCity().equals(
								new_responseView.getArrCityDetail()
										.getCityCode())
						&& view.getTakeOffTime().equals(
								SignatureUtils.formatDateToString(
										new_responseView.getTakeOffTime(),
										"yyyy-MM-dd hh:mm:ss"))) {
					
					
					MemcachedUtil.delete(ip + "views");
					MemcachedUtil.add(ip + "views",jsonRes,cacheTime);
					writer.print(JsonUtil.objectToJsonDateSerializer(new_responseView,"yyyy-MM-dd hh:mm:ss"));
					isok = true;
					break;
				}
			}
			if (!isok) {
				writer.print("false");
			}
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

	
	//
	public OrderBiz getOrderBiz() {
		return orderBiz;
	}

	public void setOrderBiz(OrderBiz orderBiz) {
		this.orderBiz = orderBiz;
	}

}
