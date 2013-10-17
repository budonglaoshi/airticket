package com.airticket.web.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import com.airticket.adapter.DataReceiver;
import com.airticket.bean.RequestView;
import com.airticket.bean.ResponseView;
import com.airticket.biz.IFlightSerchBiz;
import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ReserveFlightAction extends ActionSupport {

	private static Logger logger = Logger.getLogger(ReserveFlightAction.class);

	private RequestView view;
	private IFlightSerchBiz flightSerchBiz;
	private DataReceiver groupDataReceiver;
	
	/**
	 * 预订机票
	 * @return
	 */
	public String select_reserveFlight(){
		ActionContext context = ActionContext.getContext();
		List<ResponseView> responseViews=(List<ResponseView>)context.get("reserveViews");
		context.put("reserveViews", responseViews);
		return responseViews!=null?SUCCESS:NONE;
	}
	
	/**
	 * 预订机票
	 * @return
	 */
	public String save_reserveFlight(){
		// 用户IP
		String ip = this.getIpAddr(ServletActionContext.getRequest());
		ActionContext context = ActionContext.getContext();
		
		if (null != view.getDepartCity()
				&& !StaticData.EMPTY.equals(view.getDepartCity())
				&& null != view.getArriveCity()
				&& !StaticData.EMPTY.equals(view.getArriveCity())
				&& null != view.getTakeOffTime()
				&& !StaticData.EMPTY.equals(view.getTakeOffTime())) {
			view.setDepartDate(SignatureUtils.formatStringToDate(view.getTakeOffTime(), "yyyy-MM-dd"));
			List<ResponseView> responseViews = flightSerchBiz.searchFlight(view,StaticData.SERCH_URL,groupDataReceiver);
			context.put(ip+"rvs", responseViews);
		}
		return null;
	}
	
	/**
	 * 删除机票
	 * @return
	 */
	public String delete_reserveFlight(){

		boolean isok=false;
		//获得本机IP
		String ip = this.getIpAddr(ServletActionContext.getRequest());

		List<ResponseView> reserveViews=(List<ResponseView>) MemcachedUtil.get(ip + "reserveViews");
		
		ActionContext context = ActionContext.getContext();
		ResponseView responseView=(ResponseView)context.get("responseView");
		
		
		for (ResponseView rView : reserveViews) {
			if(true!=isok&&null!=rView&&null!=rView.getPrice()&&responseView.getPrice().toString().equals(rView.getPrice().toString())&&responseView.getFlightNo().equals(rView.getFlightNo())&&responseView.getFlightClass().equals(rView.getFlightClass())){
				reserveViews.remove(rView);
				if(MemcachedUtil.replace(ip + "reserveViews", reserveViews)){
					context.put("reserveViews", reserveViews);
					isok=true;
					return SUCCESS;
				}
			}
		}
		
		return isok==true?SUCCESS:NONE;
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
	

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		ReserveFlightAction.logger = logger;
	}

	public RequestView getView() {
		return view;
	}

	public void setView(RequestView view) {
		this.view = view;
	}

	public IFlightSerchBiz getFlightSerchBiz() {
		return flightSerchBiz;
	}

	public void setFlightSerchBiz(IFlightSerchBiz flightSerchBiz) {
		this.flightSerchBiz = flightSerchBiz;
	}

	public DataReceiver getGroupDataReceiver() {
		return groupDataReceiver;
	}

	public void setGroupDataReceiver(DataReceiver groupDataReceiver) {
		this.groupDataReceiver = groupDataReceiver;
	}
}
