package com.airticket.tripapi.bean.request;

import java.math.BigDecimal;
import java.util.List;

import com.airticket.tripapi.bean.request.ContactInfo;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票生成订单
 * @author jujian
 *
 */
@XStreamAlias("FltSaveOrderRequest")
public class FltSaveOrderRequest {
	//用户ID：string类型；必填
	@XStreamAlias("UID")
	private String uID;
	//订单类型：string类型；必填；ADU（成人），CHI（儿童）， BAB（婴儿）
	@XStreamAlias("OrderType")
	private String orderType;
	//订单金额：Decimal 类型；必填
	@XStreamAlias("Amount")
	private BigDecimal amount;
	//订单处理描述：string类型；必填
	@XStreamAlias("ProcessDesc")
	private String processDesc;
	
	//航班信息列表
	@XStreamAlias("FlightInfoList")
	private List<FlightInfoRequest> flightInfoList;
	
	//乘机人列表
	@XStreamAlias("PassengerList")
	private List<PassengerRequest> passengerList;
	
	//订单联系人
	@XStreamAlias("contactInfo")
	private ContactInfo contactInfo;
	
	//支付信息
	@XStreamAlias("payInfo")
	private PayInfo payInfo;

	/**
	 * 用户ID：string类型；必填
	 * @return
	 */
	public String getuID() {
		return uID;
	}

	/**
	 * 用户ID：string类型；必填
	 * @param uID
	 */
	public void setuID(String uID) {
		this.uID = uID;
	}

	/**
	 * 订单类型：string类型；必填；ADU（成人），CHI（儿童）， BAB（婴儿）
	 * @return
	 */
	public String getOrderType() {
		return orderType;
	}
	
	/**
	 * 订单类型：string类型；必填；ADU（成人），CHI（儿童）， BAB（婴儿）
	 * @param orderType
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * 订单金额：Decimal 类型；必填
	 * @return
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 订单金额：Decimal 类型；必填
	 * @param amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * 订单处理描述：string类型；必填
	 * @return
	 */
	public String getProcessDesc() {
		return processDesc;
	}
	
	/**
	 * 订单处理描述：string类型；必填
	 * @param processDesc
	 */
	public void setProcessDesc(String processDesc) {
		this.processDesc = processDesc;
	}

	/**
	 * 航班信息列表
	 * @return
	 */
	public List<FlightInfoRequest> getFlightInfoList() {
		return flightInfoList;
	}

	/**
	 * 航班信息列表
	 * @param flightInfoList
	 */
	public void setFlightInfoList(List<FlightInfoRequest> flightInfoList) {
		this.flightInfoList = flightInfoList;
	}

	/**
	 * 乘机人列表
	 * @return
	 */
	public List<PassengerRequest> getPassengerList() {
		return passengerList;
	}

	/**
	 * 乘机人列表
	 * @param passengerList
	 */
	public void setPassengerList(List<PassengerRequest> passengerList) {
		this.passengerList = passengerList;
	}

	/**
	 * 订单联系人
	 * @return
	 */
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	/**
	 * 订单联系人
	 * @param contactInfo
	 */
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * 支付信息
	 * @return
	 */
	public PayInfo getPayInfo() {
		return payInfo;
	}

	/**
	 * 支付信息
	 * @param payInfo
	 */
	public void setPayInfo(PayInfo payInfo) {
		this.payInfo = payInfo;
	}
}
