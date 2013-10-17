package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单详情
 * 
 * @author jujian
 * 
 */
@XStreamAlias("FltViewOrderRequest")
public class FltViewOrderRequest {
	// 用户ID ：String类型；必填
	@XStreamAlias("UserID")
	private String userID;
	// 订单号列表
	@XStreamAlias("OrderID")
	private String[] orderID;
	
	/**
	 * 用户ID ：String类型；必填
	 * @return
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * 用户ID ：String类型；必填
	 * @param userID
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	/**
	 * 订单号列表
	 * @return
	 */
	public String[] getOrderID() {
		return orderID;
	}
	/**
	 * 订单号列表
	 * @param orderID
	 */
	public void setOrderID(String[] orderID) {
		this.orderID = orderID;
	}
	
	
}
