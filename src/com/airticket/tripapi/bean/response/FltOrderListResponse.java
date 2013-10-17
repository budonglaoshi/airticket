package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单列表返回体
 * @author jujian
 *
 */
@XStreamAlias("FltOrderListResponse")
public class FltOrderListResponse implements Serializable{
	//订单列表
	@XStreamAlias("OrderList")
	private List<FltOrder> orderList;

	/**
	 * 订单列表
	 * @return
	 */
	public List<FltOrder> getOrderList() {
		return orderList;
	}

	/**
	 * 订单列表
	 * @param orderList
	 */
	public void setOrderList(List<FltOrder> orderList) {
		this.orderList = orderList;
	}

	
}
