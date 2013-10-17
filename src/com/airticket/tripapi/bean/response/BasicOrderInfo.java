package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 订单基本信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("BasicOrderInfo")
public class BasicOrderInfo implements Serializable{
	// 订单时间
	@XStreamAlias("OrderDate")
	private String orderDate;
	// 订单号
	@XStreamAlias("OrderID")
	private String orderID;
	// 订单描述
	@XStreamAlias("OrderDesc")
	private String orderDesc;
	// 订单状态：W-未处理，P-处理中，S-已成交，C-已取消，R-全部退票，T-部分退票，U-未提交
	@XStreamAlias("OrderStatus")
	private String orderStatus;
	// 订单金额
	@XStreamAlias("Amount")
	private BigDecimal amount;
	// 电子券/游票支付金额
	@XStreamAlias("Emoney")
	private BigDecimal emoney;
	// 实际金额
	@XStreamAlias("ActualAmount")
	private BigDecimal actualAmount;
	// 信用卡支付费
	@XStreamAlias("CCardPayFee")
	private BigDecimal cCardPayFee;
	// 服务费
	@XStreamAlias("ServerFee")
	private BigDecimal serverFee;
	// 订单处理状态
	@XStreamAlias("ProcessStatus")
	private String processStatus;
	// 送票费
	@XStreamAlias("SendTicketFee")
	private BigDecimal sendTicketFee;
	// 航程类型：S单程，M联程，D往返
	@XStreamAlias("FlightWay")
	private String flightWay;
	// 送票城市ID，参见静态文件-国内城市
	@XStreamAlias("SendTicketCity")
	private String sendTicketCity;
	// 取票方式
	@XStreamAlias("GetTicketWay")
	private String getTicketWay;
	// 电子账户
	@XStreamAlias("EAccountAmount")
	private String eAccountAmount;
	// 人数
	@XStreamAlias("Persons")
	private Integer persons;
	// 保险费
	@XStreamAlias("InsuranceFee")
	private BigDecimal insuranceFee;
	// 是否英文
	@XStreamAlias("IsEnglish")
	private String isEnglish;
	// 订单分类：D国内机票，I国际机票
	@XStreamAlias("FlightOrderClassA")
	private String flightOrderClassA;
	
	
	/**
	 * 订单时间
	 * @return
	 */
	public String getOrderDate() {
		return orderDate;
	}
	/**
	 * 订单时间
	 * @param orderDate
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
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
	 * 订单描述
	 * @return
	 */
	public String getOrderDesc() {
		return orderDesc;
	}
	/**
	 * 订单描述
	 * @param orderDesc
	 */
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	/**
	 * 订单状态：W-未处理，P-处理中，S-已成交，C-已取消，R-全部退票，T-部分退票，U-未提交
	 * @return
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 订单状态：W-未处理，P-处理中，S-已成交，C-已取消，R-全部退票，T-部分退票，U-未提交
	 * @param orderStatus
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 订单金额
	 * @return
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * 订单金额
	 * @param amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * 电子券/游票支付金额
	 * @return
	 */
	public BigDecimal getEmoney() {
		return emoney;
	}
	/**
	 * 电子券/游票支付金额
	 * @param emoney
	 */
	public void setEmoney(BigDecimal emoney) {
		this.emoney = emoney;
	}
	/**
	 * 实际金额
	 * @return
	 */
	public BigDecimal getActualAmount() {
		return actualAmount;
	}
	/**
	 * 实际金额
	 * @param actualAmount
	 */
	public void setActualAmount(BigDecimal actualAmount) {
		this.actualAmount = actualAmount;
	}
	/**
	 * 信用卡支付费
	 * @return
	 */
	public BigDecimal getcCardPayFee() {
		return cCardPayFee;
	}
	/**
	 * 信用卡支付费
	 * @param cCardPayFee
	 */
	public void setcCardPayFee(BigDecimal cCardPayFee) {
		this.cCardPayFee = cCardPayFee;
	}
	/**
	 * 服务费
	 * @return
	 */
	public BigDecimal getServerFee() {
		return serverFee;
	}
	/**
	 * 服务费
	 * @param serverFee
	 */
	public void setServerFee(BigDecimal serverFee) {
		this.serverFee = serverFee;
	}
	/**
	 * 订单处理状态
	 * @return
	 */
	public String getProcessStatus() {
		return processStatus;
	}
	/**
	 * 订单处理状态
	 * @param processStatus
	 */
	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}
	/**
	 * 送票费
	 * @return
	 */
	public BigDecimal getSendTicketFee() {
		return sendTicketFee;
	}
	/**
	 * 送票费
	 * @param sendTicketFee
	 */
	public void setSendTicketFee(BigDecimal sendTicketFee) {
		this.sendTicketFee = sendTicketFee;
	}
	/**
	 * 航程类型：S单程，M联程，D往返
	 * @return
	 */
	public String getFlightWay() {
		return flightWay;
	}
	/**
	 * 航程类型：S单程，M联程，D往返
	 * @param flightWay
	 */
	public void setFlightWay(String flightWay) {
		this.flightWay = flightWay;
	}
	/**
	 * 送票城市ID，参见静态文件-国内城市
	 * @return
	 */
	public String getSendTicketCity() {
		return sendTicketCity;
	}
	/**
	 * 送票城市ID，参见静态文件-国内城市
	 * @param sendTicketCity
	 */
	public void setSendTicketCity(String sendTicketCity) {
		this.sendTicketCity = sendTicketCity;
	}
	/**
	 * 取票方式
	 * @return
	 */
	public String getGetTicketWay() {
		return getTicketWay;
	}
	/**
	 * 取票方式
	 * @param getTicketWay
	 */
	public void setGetTicketWay(String getTicketWay) {
		this.getTicketWay = getTicketWay;
	}
	/**
	 * 电子账户
	 * @return
	 */
	public String geteAccountAmount() {
		return eAccountAmount;
	}
	/**
	 * 电子账户
	 * @param eAccountAmount
	 */
	public void seteAccountAmount(String eAccountAmount) {
		this.eAccountAmount = eAccountAmount;
	}
	/**
	 * 人数
	 * @return
	 */
	public Integer getPersons() {
		return persons;
	}
	/**
	 * 人数
	 * @param persons
	 */
	public void setPersons(Integer persons) {
		this.persons = persons;
	}
	/**
	 * 保险费
	 * @return
	 */
	public BigDecimal getInsuranceFee() {
		return insuranceFee;
	}
	/**
	 * 保险费
	 * @param insuranceFee
	 */
	public void setInsuranceFee(BigDecimal insuranceFee) {
		this.insuranceFee = insuranceFee;
	}
	/**
	 * 是否英文
	 * @return
	 */
	public String getIsEnglish() {
		return isEnglish;
	}
	/**
	 * 是否英文
	 * @param isEnglish
	 */
	public void setIsEnglish(String isEnglish) {
		this.isEnglish = isEnglish;
	}
	/**
	 * 订单分类：D国内机票，I国际机票
	 * @return
	 */
	public String getFlightOrderClassA() {
		return flightOrderClassA;
	}
	/**
	 * 订单分类：D国内机票，I国际机票
	 * @param flightOrderClassA
	 */
	public void setFlightOrderClassA(String flightOrderClassA) {
		this.flightOrderClassA = flightOrderClassA;
	}
}
