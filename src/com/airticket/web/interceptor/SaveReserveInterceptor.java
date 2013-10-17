package com.airticket.web.interceptor;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsDateJsonBeanProcessor;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.airticket.bean.RequestView;
import com.airticket.bean.ResponseView;
import com.airticket.util.JsonUtil;
import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.airticket.web.action.ReserveFlightAction;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

@SuppressWarnings("serial")
public class SaveReserveInterceptor implements Interceptor {

	private static final Logger logger = Logger
			.getLogger(SaveReserveInterceptor.class);

	public void destroy() {}
	public void init() {}

	
	public String intercept(ActionInvocation invocation) throws Exception {

		// 获取用户ip
		String ip = this.getIpAddr(ServletActionContext.getRequest());

		ActionContext context = invocation.getInvocationContext().getContext();
		ReserveFlightAction action = (ReserveFlightAction) invocation.getAction();
		
		RequestView view = action.getView();
		
		// 查询结果缓存
		List<ResponseView> responseViews = (List<ResponseView>) MemcachedUtil.get(ip + "views");
		// 要获取的对象
		ResponseView viewer = null;

		// 判断订单列表缓存是否有订单

		// 订单列表数据缓存
		List<ResponseView> reserveViews = (List<ResponseView>) MemcachedUtil.get(ip + "reserveViews");

		if (null != reserveViews && 0 != reserveViews.size()) {
			for (ResponseView resview : reserveViews) {
				if(null!=resview){
					if (view.getPrice().equals(resview.getPrice().toString())
							&& view.getFlightNo().equals(resview.getFlightNo().toString())
							&& view.getFlightClass().equals(resview.getFlightClass().toString())
							&& view.getDepartCity().equals(resview.getDepCityDetail().getCityCode())
							&& view.getArriveCity().equals(resview.getArrCityDetail().getCityCode())
							&&view.getTakeOffTime().equals(SignatureUtils.formatDateToString(resview.getTakeOffTime(),"yyyy-MM-dd hh:mm:ss"))) {
						viewer = resview;
						break;
					}
				}
			}

		}

		invocation.invoke();
		// 预定机票的最新信息
		Object rvs = context.get(ip+"rvs");

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();

		if (null != rvs) {
			List<ResponseView> jsonRes = (List<ResponseView>) rvs;
			boolean isok = false;
			// 判断机票是够发生变化
			for (ResponseView new_responseView : jsonRes) {
				
				if (String.valueOf(view.getPrice()).equals(String.valueOf(new_responseView.getPrice()))
						&& view.getFlightNo().equals(new_responseView.getFlightNo())
						&& view.getFlightClass().equals(new_responseView.getFlightClass())) {
					if (null == viewer) {
						viewer = new_responseView;
						if(null==reserveViews){
							reserveViews = new ArrayList<ResponseView>();
						}
						reserveViews.add(new_responseView);
						MemcachedUtil.delete(ip + "reserveViews");
						MemcachedUtil.add(ip + "reserveViews", reserveViews);
						isok = true;
						break;
					}
					isok = false;
				}
			}
			
			if(isok){
				writer.print(JsonUtil.objectToJsonDateSerializer(viewer, "yyyy-MM-dd hh:mm:ss"));
				System.out.println(JsonUtil.objectToJsonDateSerializer(viewer, "yyyy-MM-dd hh:mm:ss"));
			}else{
				MemcachedUtil.delete(ip + "views");
				MemcachedUtil.add(ip + "views", jsonRes);
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
}
