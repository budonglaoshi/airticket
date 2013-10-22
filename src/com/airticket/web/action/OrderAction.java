package com.airticket.web.action;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.airticket.adapter.DataReceiver;
import com.airticket.bean.Order;
import com.airticket.bean.OrderPassenger;
import com.airticket.bean.OrderTravelInvoices;
import com.airticket.bean.RequestView;
import com.airticket.bean.UntreatedOrder;
import com.airticket.biz.IFlightSerchBiz;
import com.airticket.biz.OrderBiz;
import com.airticket.biz.OrderPassengerBiz;
import com.airticket.biz.OrderTraveInvoicesBiz;
import com.airticket.util.JsonUtil;
import com.airticket.util.StaticData;
import com.google.gson.reflect.TypeToken;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class OrderAction extends ActionSupport {

	private static Logger logger = Logger.getLogger(OrderAction.class);

	private IFlightSerchBiz flightSerchBiz;
	private DataReceiver groupDataReceiver;
	private OrderBiz orderBiz;
	
	private String passenger_json;
	private String order_json;
	private String invoices_json;
	
	private UntreatedOrder order;
	private RequestView view;
	
	public String save_order(){
		// 将json字符串转换为对象
        try {
        	
        	//正常流程
        	// 未处理订单JSON转换对象
        	UntreatedOrder untreatedOrder=JsonUtil.jsonToBeanDateSerializer(order_json, UntreatedOrder.class, "yyyy-MM-dd hh:mm:ss");
        	//乘机人信息JSON转换对象
        	List<OrderPassenger> orderPassengers=(List<OrderPassenger>)JsonUtil.jsonToList(passenger_json,new TypeToken<List<OrderPassenger>>(){}.getType());
        	OrderTravelInvoices orderTravelInvoices = null;
        	//判断是否邮寄行程单
        	if (null!=invoices_json&&!StaticData.EMPTY.equals(invoices_json)) {
        		//行程单信息JSON转换对象
            	orderTravelInvoices=(OrderTravelInvoices)JsonUtil.jsonToBean(invoices_json, OrderTravelInvoices.class);
            	untreatedOrder.setOrderTravelInvoices(orderTravelInvoices);
        	}
        	untreatedOrder.setOrderPassengers(new HashSet<OrderPassenger>(orderPassengers));
        	untreatedOrder.setOrderDate(new Timestamp(new Date().getTime()));
        	//添加订单
        	Serializable orderId = orderBiz.saveByOrder(untreatedOrder);
        	//
        	if(null!=orderId){
        		ActionContext.getContext().put("untreatedOrder", untreatedOrder);
        		ActionContext.getContext().put("orderPassengers",orderPassengers);
        		return SUCCESS;
        	}
        	
        	
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
        return NONE;
	}
	
	
	public String userOrders(){
		if(null!=order&&!StaticData.EMPTY.equals(order.mobilePhone)){
			List<Order> orders = orderBiz.selectUserOrders(order);
			if(null!=orders&&0!=orders.size()){
				ActionContext.getContext().put("orders", orders);
			}
		}
		return SUCCESS;
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
	

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		OrderAction.logger = logger;
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
	public String getOrder_json() {
		return order_json;
	}

	public void setOrder_json(String order_json) {
		this.order_json = order_json;
	}

	public String getPassenger_json() {
		return passenger_json;
	}

	public void setPassenger_json(String passenger_json) {
		this.passenger_json = passenger_json;
	}

	public String getInvoices_json() {
		return invoices_json;
	}

	public void setInvoices_json(String invoices_json) {
		this.invoices_json = invoices_json;
	}

	public OrderBiz getOrderBiz() {
		return orderBiz;
	}

	public void setOrderBiz(OrderBiz orderBiz) {
		this.orderBiz = orderBiz;
	}


	public UntreatedOrder getOrder() {
		return order;
	}
	public void setOrder(UntreatedOrder order) {
		this.order = order;
	}


	public RequestView getView() {
		return view;
	}


	public void setView(RequestView view) {
		this.view = view;
	}

}
