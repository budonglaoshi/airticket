package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 配送联系人
 * @author jujian
 *
 */
@XStreamAlias("DeliverInfo")
public class DeliverInfo {
	//配送方式：PJS,PJN
	@XStreamAlias("DeliveryType")
	private String deliveryType;
	//送票城市ID
	@XStreamAlias("SendTicketCityID")
	private String sendTicketCityID;
	//订单备注
	@XStreamAlias("OrderRemark")
	private String orderRemark;
	
	//邮寄行程单-邮寄信息实体
	@XStreamAlias("pjs")
	private PJS pjs;

	/**
	 * 配送方式：PJS,PJN
	 * @return
	 */
	public String getDeliveryType() {
		return deliveryType;
	}

	/**
	 * 配送方式：PJS,PJN
	 * @param deliveryType
	 */
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	/**
	 * 送票城市ID
	 * @return
	 */
	public String getSendTicketCityID() {
		return sendTicketCityID;
	}
	
	/**
	 * 送票城市ID
	 * @param sendTicketCityID
	 */
	public void setSendTicketCityID(String sendTicketCityID) {
		this.sendTicketCityID = sendTicketCityID;
	}

	/**
	 * 订单备注
	 * @return
	 */
	public String getOrderRemark() {
		return orderRemark;
	}

	/**
	 * 订单备注
	 * @param orderRemark
	 */
	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	/**
	 * 邮寄行程单-邮寄信息实体
	 * @return
	 */
	public PJS getPjs() {
		return pjs;
	}

	/**
	 * 邮寄行程单-邮寄信息实体
	 * @param pjs
	 */
	public void setPjs(PJS pjs) {
		this.pjs = pjs;
	}

}
