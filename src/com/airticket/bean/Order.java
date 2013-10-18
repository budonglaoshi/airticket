package com.airticket.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

/**
 * 机票订单
 * @author Administrator
 *
 */
public abstract class Order implements Serializable {
	//订单ID
	public String orderid;
	//出发城市三字码
	public String departCityCode;
	//达到城市三字码
	public String arriveCityCode;
	//出发城市中文名称
	public String departCityName;
	//达到城市中文名称
	public String arriveCityName;
	//出发时间
	public Timestamp takeOffTime;
	//达到时间
	public Timestamp arriveTime;
	//机型
	public String craftType;
	//航空公司代码
	public String airlineCode;
	//航空公司中文名称
	public String airlineName;
	//机票订单总价格
	public Double price;
	//订单状态
	public Integer statusid;
	//联系人姓名
	public String contactName;
	//联系人电话
	public String mobilePhone;
	//联系人邮箱
	public String contactEmail;
	
	public OrderTravelInvoices orderTravelInvoices;
	
	Set<OrderPassenger> orderPassengers;
	
	//public Integer travelinvoicesid;
}
