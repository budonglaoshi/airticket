package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单详情订单信息列表
 * @author jujian
 *
 */
@XStreamAlias("OrderInfo")
public class OrderInfo implements Serializable {
	//订单基本信息
	@XStreamAlias("basicOrderInfo")
	private BasicOrderInfo basicOrderInfo;
	
	//航班信息列表
	@XStreamAlias("Flights")
	private List<OrderFlight> flights;
	
	//乘客信息列表
	@XStreamAlias("Passengers")
	private List<OrderPassenger> passengers;
	
	//配送信息
	@XStreamAlias("deliver")
	private Deliver deliver;
	
	//经停信息
	@XStreamAlias("StopsInfo")
	private String stopsInfo;
	
	//提示信息
	@XStreamAlias("prompts")
	private String[] prompts;
	
	/**
	 * 订单基本信息
	 * @return
	 */
	public BasicOrderInfo getBasicOrderInfo() {
		return basicOrderInfo;
	}
	/**
	 * 订单基本信息s
	 * @param basicOrderInfo
	 */
	public void setBasicOrderInfo(BasicOrderInfo basicOrderInfo) {
		this.basicOrderInfo = basicOrderInfo;
	}
	/**
	 * 航班信息列表
	 * @return
	 */
	public List<OrderFlight> getFlights() {
		return flights;
	}
	/**
	 * 航班信息列表
	 * @param flights
	 */
	public void setFlights(List<OrderFlight> flights) {
		this.flights = flights;
	}
	/**
	 * 乘客信息列表
	 * @return
	 */
	public List<OrderPassenger> getPassengers() {
		return passengers;
	}
	/**
	 * 乘客信息列表
	 * @param passengers
	 */
	public void setPassengers(List<OrderPassenger> passengers) {
		this.passengers = passengers;
	}
	/**
	 * 配送信息
	 * @return
	 */
	public Deliver getDeliver() {
		return deliver;
	}
	/**
	 * 配送信息
	 * @param deliver
	 */
	public void setDeliver(Deliver deliver) {
		this.deliver = deliver;
	}
	/**
	 * 经停信息
	 * @return
	 */
	public String getStopsInfo() {
		return stopsInfo;
	}
	/**
	 * 经停信息
	 * @param stopsInfo
	 */
	public void setStopsInfo(String stopsInfo) {
		this.stopsInfo = stopsInfo;
	}
	/**
	 * 提示信息
	 * @return
	 */
	public String[] getPrompts() {
		return prompts;
	}
	/**
	 * 提示信息
	 * @param prompts
	 */
	public void setPrompts(String[] prompts) {
		this.prompts = prompts;
	}

}
