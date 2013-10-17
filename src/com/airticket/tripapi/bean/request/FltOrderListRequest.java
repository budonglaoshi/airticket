package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单列表
 * @author jujian
 *
 */
@XStreamAlias("FltOrderListRequest")
public class FltOrderListRequest {
	// 用户ID：String类型；必填
	@XStreamAlias("Uid")
	private String uid;
	// 出行时间段开始：DateTime类型；可空
	@XStreamAlias("EffectDate")
	private String effectDate;
	// 出行时间段结束：DateTime类型；可空
	@XStreamAlias("ExpiryDate")
	private String expiryDate;
	// 订单号：Int类型；可空；不指定时输入0
	@XStreamAlias("OrderID")
	private Integer orderID=0;
	// 订单状态：Int类型；0全部订单，8未提交，1未处理，2 处理状态，3已成交，4已取消，5全部退票，6部分退票
	@XStreamAlias("OrderStatus")
	private Integer orderStatus;
	// 数量：Int类型；必填，不指定时输入0
	@XStreamAlias("TopCount")
	private Integer topCount;
	// 订单类型：String类型；可空；D：国内机票订单；I：国际机票订单；空：全部
	@XStreamAlias("OrderType")
	private String orderType;
	
	/**
	 * 用户ID：String类型；必填
	 * @return
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * 用户ID：String类型；必填
	 * @param uid
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * 出行时间段开始：DateTime类型；可空
	 * @return
	 */
	public String getEffectDate() {
		return effectDate;
	}
	/**
	 * 出行时间段开始：DateTime类型；可空
	 * @param effectDate
	 */
	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}
	/**
	 * 出行时间段结束：DateTime类型；可空
	 * @return
	 */
	public String getExpiryDate() {
		return expiryDate;
	}
	/**
	 * 出行时间段结束：DateTime类型；可空
	 * @param expiryDate
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * 订单号：Int类型；可空；不指定时输入0
	 * @return
	 */
	public Integer getOrderID() {
		return orderID;
	}
	/**
	 * 订单号：Int类型；可空；不指定时输入0
	 * @param orderID
	 */
	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}
	/**
	 * 订单状态：Int类型；0全部订单，8未提交，1未处理，2 处理状态，3已成交，4已取消，5全部退票，6部分退票
	 * @return
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 订单状态：Int类型；0全部订单，8未提交，1未处理，2 处理状态，3已成交，4已取消，5全部退票，6部分退票
	 * @param orderStatus
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 数量：Int类型；必填，不指定时输入0
	 * @return
	 */
	public Integer getTopCount() {
		return topCount;
	}
	/**
	 * 数量：Int类型；必填，不指定时输入0
	 * @param topCount
	 */
	public void setTopCount(Integer topCount) {
		this.topCount = topCount;
	}
	/**
	 * 订单类型：String类型；可空；D：国内机票订单；I：国际机票订单；空：全部
	 * @return
	 */
	public String getOrderType() {
		return orderType;
	}
	/**
	 * 订单类型：String类型；可空；D：国内机票订单；I：国际机票订单；空：全部
	 * @param orderType
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
}
