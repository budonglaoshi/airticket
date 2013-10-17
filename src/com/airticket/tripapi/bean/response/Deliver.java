package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 配送信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("Deliver")
public class Deliver implements Serializable {
	// 配送方式
	@XStreamAlias("DeliverTypeName")
	private String deliverTypeName;
	// 配送时间
	@XStreamAlias("DeliverTime")
	private String deliverTime;
	// 订单地址
	@XStreamAlias("DeliverAddress")
	private String deliverAddress;
	// 配送城市
	@XStreamAlias("DeliverCity")
	private String deliverCity;
	// 配送区域
	@XStreamAlias("DeliverDistricts")
	private String deliverDistricts;
	// 配送费
	@XStreamAlias("DeliverFee")
	private BigDecimal deliverFee;
	// 支付方式
	@XStreamAlias("PrePayType")
	private String prePayType;
	// 支付方式名称
	@XStreamAlias("PrepayTypeName")
	private String prepayTypeName;
	// 联系人姓名
	@XStreamAlias("ContactName")
	private String contactName;
	// 联系人电话号码
	@XStreamAlias("ContactPhone")
	private String contactPhone;
	// 联系人手机号码
	@XStreamAlias("ContactMobile")
	private String contactMobile;
	// 联系人Email
	@XStreamAlias("ContactEmail")
	private String contactEmail;
	// 最早送票时间
	@XStreamAlias("SendTicketETime")
	private String sendTicketETime;
	// 最晚送票时间
	@XStreamAlias("SendTicketLTime")
	private String sendTicketLTime;
	// 配送方式
	@XStreamAlias("GetTicketWay")
	private String getTicketWay;
	
	/**
	 * 配送方式
	 * @return
	 */
	public String getDeliverTypeName() {
		return deliverTypeName;
	}
	/**
	 * 配送方式
	 * @param deliverTypeName
	 */
	public void setDeliverTypeName(String deliverTypeName) {
		this.deliverTypeName = deliverTypeName;
	}
	/**
	 * 配送时间
	 * @return
	 */
	public String getDeliverTime() {
		return deliverTime;
	}
	/**
	 * 配送时间
	 * @param deliverTime
	 */
	public void setDeliverTime(String deliverTime) {
		this.deliverTime = deliverTime;
	}
	/**
	 * 订单地址
	 * @return
	 */
	public String getDeliverAddress() {
		return deliverAddress;
	}
	/**
	 * 订单地址
	 * @param deliverAddress
	 */
	public void setDeliverAddress(String deliverAddress) {
		this.deliverAddress = deliverAddress;
	}
	/**
	 * 配送城市
	 * @return
	 */
	public String getDeliverCity() {
		return deliverCity;
	}
	/**
	 * 配送城市
	 * @param deliverCity
	 */
	public void setDeliverCity(String deliverCity) {
		this.deliverCity = deliverCity;
	}
	/**
	 * 配送区域
	 * @return
	 */
	public String getDeliverDistricts() {
		return deliverDistricts;
	}
	/**
	 * 配送区域
	 * @param deliverDistricts
	 */
	public void setDeliverDistricts(String deliverDistricts) {
		this.deliverDistricts = deliverDistricts;
	}
	/**
	 * 配送费
	 * @return
	 */
	public BigDecimal getDeliverFee() {
		return deliverFee;
	}
	/**
	 * 配送费
	 * @param deliverFee
	 */
	public void setDeliverFee(BigDecimal deliverFee) {
		this.deliverFee = deliverFee;
	}
	/**
	 * 支付方式
	 * @return
	 */
	public String getPrePayType() {
		return prePayType;
	}
	/**
	 * 支付方式
	 * @param prePayType
	 */
	public void setPrePayType(String prePayType) {
		this.prePayType = prePayType;
	}
	/**
	 * 支付方式名称
	 * @return
	 */
	public String getPrepayTypeName() {
		return prepayTypeName;
	}
	/**
	 * 支付方式名称
	 * @param prepayTypeName
	 */
	public void setPrepayTypeName(String prepayTypeName) {
		this.prepayTypeName = prepayTypeName;
	}
	/**
	 * 联系人姓名
	 * @return
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * 联系人姓名
	 * @param contactName
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * 联系人电话号码
	 * @return
	 */
	public String getContactPhone() {
		return contactPhone;
	}
	/**
	 * 联系人电话号码
	 * @param contactPhone
	 */
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	/**
	 * 联系人手机号码
	 * @return
	 */
	public String getContactMobile() {
		return contactMobile;
	}
	/**
	 * 联系人手机号码
	 * @param contactMobile
	 */
	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
	/**
	 * 联系人Email
	 * @return
	 */
	public String getContactEmail() {
		return contactEmail;
	}
	/**
	 * 联系人Email
	 * @param contactEmail
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	/**
	 *  最早送票时间
	 * @return
	 */
	public String getSendTicketETime() {
		return sendTicketETime;
	}
	/**
	 *  最早送票时间
	 * @param sendTicketETime
	 */
	public void setSendTicketETime(String sendTicketETime) {
		this.sendTicketETime = sendTicketETime;
	}
	/**
	 * 最晚送票时间
	 * @return
	 */
	public String getSendTicketLTime() {
		return sendTicketLTime;
	}
	/**
	 * 最晚送票时间
	 * @param sendTicketLTime
	 */
	public void setSendTicketLTime(String sendTicketLTime) {
		this.sendTicketLTime = sendTicketLTime;
	}
	/**
	 * 配送方式
	 * @return
	 */
	public String getGetTicketWay() {
		return getTicketWay;
	}
	/**
	 * 配送方式
	 * @param getTicketWay
	 */
	public void setGetTicketWay(String getTicketWay) {
		this.getTicketWay = getTicketWay;
	}
}
