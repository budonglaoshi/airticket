package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 支付信息
 * @author jujian
 *
 */
@XStreamAlias("PayInfo")
public class PayInfo {
	//指定支付
	@XStreamAlias("PrePayType")
	private String prePayType;
	//第三方支付
	@XStreamAlias("thirdPayInfo")
	private ThirdPayInfo thirdPayInfo;
	//信用卡信息
	@XStreamAlias("creditCardInfo")
	private CreditCardInfo creditCardInfo;
	
	/**
	 * 指定支付
	 * @return
	 */
	public ThirdPayInfo getThirdPayInfo() {
		return thirdPayInfo;
	}
	/**
	 * 指定支付
	 * @param thirdPayInfo
	 */
	public void setThirdPayInfo(ThirdPayInfo thirdPayInfo) {
		this.thirdPayInfo = thirdPayInfo;
	}
	/**
	 * 第三方支付
	 * @return
	 */
	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}
	/**
	 * 第三方支付
	 * @param creditCardInfo
	 */
	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}
	/**
	 * 信用卡信息
	 * @return
	 */
	public String getPrePayType() {
		return prePayType;
	}
	/**
	 * 信用卡信息
	 * @param prePayType
	 */
	public void setPrePayType(String prePayType) {
		this.prePayType = prePayType;
	}
	
}
