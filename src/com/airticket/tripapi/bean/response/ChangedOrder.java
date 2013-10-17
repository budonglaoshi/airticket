package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 订单变更信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("ChangedOrder")
public class ChangedOrder implements Serializable {
	// 订单号
	@XStreamAlias("OrderID")
	private String orderID;
	// 订单时间
	@XStreamAlias("CreatedTime")
	private String createdTime;
	// 最后修改时间
	@XStreamAlias("LastestChangedTime")
	private String lastestChangedTime;
	// 订单当前状态：W-未处理，P-处理中，S-已成交，C-已取消，R-全部退票，T-部分退票，U-未提交
	@XStreamAlias("OrderStatus")
	private String orderStatus;
	
	/**
	 * 订单号
	 * @return
	 */
	public String getOrderID() {
		return orderID;
	}
	/**
	 * 订单号
	 * @param orderID
	 */
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	/**
	 *  订单时间
	 * @return
	 */
	public String getCreatedTime() {
		return createdTime;
	}
	/**
	 *  订单时间
	 * @param createdTime
	 */
	public void setCreatedTime(String createdTime) {
		this.createdTime = createdTime;
	}
	/**
	 * 最后修改时间
	 * @return
	 */
	public String getLastestChangedTime() {
		return lastestChangedTime;
	}
	/**
	 * 最后修改时间
	 * @param lastestChangedTime
	 */
	public void setLastestChangedTime(String lastestChangedTime) {
		this.lastestChangedTime = lastestChangedTime;
	}
	/**
	 * 订单当前状态：W-未处理，P-处理中，S-已成交，C-已取消，R-全部退票，T-部分退票，U-未提交
	 * @return
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 订单当前状态：W-未处理，P-处理中，S-已成交，C-已取消，R-全部退票，T-部分退票，U-未提交
	 * @param orderStatus
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
}
