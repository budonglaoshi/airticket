package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单变更返回体
 * @author jujian
 *
 */
@XStreamAlias("GetStatusChangedOrdersResponse")
public class GetStatusChangedOrdersResponse  implements Serializable{
	//订单数量
	@XStreamAlias("RecordCount")
	private Integer recordCount;

	//订单变更列表
	@XStreamAlias("Orders")
	private List<ChangedOrder> orders;

	/**
	 * 订单数量
	 * @return
	 */
	public Integer getRecordCount() {
		return recordCount;
	}

	/**
	 * 订单数量
	 * @param recordCount
	 */
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	/**
	 * 订单变更列表
	 * @return
	 */
	public List<ChangedOrder> getOrders() {
		return orders;
	}

	/**
	 * 订单变更列表
	 * @param orders
	 */
	public void setOrders(List<ChangedOrder> orders) {
		this.orders = orders;
	}
	

}
