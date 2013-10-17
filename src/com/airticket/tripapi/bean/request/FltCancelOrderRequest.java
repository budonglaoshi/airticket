package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票取消订单
 * 
 * @author jujian
 * 
 */
@XStreamAlias("FltCancelOrderRequest")
public class FltCancelOrderRequest {
	// 用户ID ：String类型；必填
	@XStreamAlias("UserID")
	private String userID;
	// 订单号列表：Int类型；必填
	@XStreamAlias("OrderID")
	private int[] orderID;
	
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
	 * 订单号列表：Int类型；必填
	 * @return
	 */
	public int[] getOrderID() {
		return orderID;
	}
	/**
	 * 订单号列表：Int类型；必填
	 * @param orderID
	 */
	public void setOrderID(int[] orderID) {
		this.orderID = orderID;
	}	
	
	
}
