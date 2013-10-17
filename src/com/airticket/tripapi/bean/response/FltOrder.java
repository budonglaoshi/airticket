package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单信息
 * @author jujian
 *
 */
@XStreamAlias("FltOrder")
public class FltOrder implements Serializable {
	//航班信息列表
	@XStreamAlias("OrderFlights")
	private List<OrderListFlight> orderFlights;

	/**
	 * 航班信息列表
	 * @return
	 */
	public List<OrderListFlight> getOrderFlights() {
		return orderFlights;
	}

	/**
	 * 航班信息列表
	 * @param orderFlights
	 */
	public void setOrderFlights(List<OrderListFlight> orderFlights) {
		this.orderFlights = orderFlights;
	}
	
	
}
