package com.airticket.tripapi.bean.request;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 对方收款添加信用卡信息，通过支付API收款则此实体可为空
 * 
 * @author jujian
 * 
 */
@XStreamAlias("CreditCardInfo")
public class CreditCardInfo {
	// 信用卡信息编号：Int类型；可空；此字段为0,每次支付新增信用卡信息到数据库，同时接口返回CardInfoID
	@XStreamAlias("CardInfoID")
	private String cardInfoID;
	// 信用卡卡种：Int类型；必填
	@XStreamAlias("CreditCardType")
	private Integer creditCardType;
	// 信用卡卡号：String类型；必填，使用信用卡加密
	@XStreamAlias("CreditCardNumber")
	private String creditCardNumber;
	// 有效日期：String类型；必填，yyyyMM（年4位+月2位）使用信用卡加密
	@XStreamAlias("Validity")
	private String validity;
	// 卡号前六位数：String类型；必填，使用信用卡加密
	@XStreamAlias("CardBin")
	private String cardBin;
	// 持卡人：String类型；必填，使用信用卡加密
	@XStreamAlias("CardHolder")
	private String cardHolder;
	// 持卡人证件类型：Int类型；必填，须默认0使用信用卡加密
	@XStreamAlias("IdCardType")
	private String idCardType = "0";
	// 持卡人证件号：String类型；必填，使用信用卡加密
	@XStreamAlias("IdNumber")
	private String idNumber;
	// 检查码：String类型；必填，使用信用卡加密
	@XStreamAlias("CVV2No")
	private String cVV2No;
	// 支付通协议号/手机支付手机号：String类型；必填
	@XStreamAlias("AgreementCode")
	private String agreementCode;
	// <!-- -->
	@XStreamAlias("Eid")
	private String eid;
	// 备注：String类型；可空
	@XStreamAlias("Remark")
	private String remark = "";
	// 持卡人是否登机人：Bool类型；可空
	@XStreamAlias("IsClient")
	private String isClient = "";
	// 外卡支付手续费：Decimal类型；可空，须默认0
	@XStreamAlias("CCardPayFee")
	private BigDecimal cCardPayFee = BigDecimal.valueOf(0);
	// 外卡支付手续费率：Decimal类型；可空，须默认0
	@XStreamAlias("CCardPayFeeRate")
	private BigDecimal cCardPayFeeRate = BigDecimal.valueOf(0);
	// 外币额的偏移量：Int类型；可空
	@XStreamAlias("Exponent")
	private Integer exponent;
	// DCC外币汇率原始串：String类型；可空
	@XStreamAlias("ExchangeRate")
	private String exchangeRate = "";
	// DCC 外币金额原始串：String类型；可空
	@XStreamAlias("FAmount")
	private String fAmount = "";
	
	/**
	 * 信用卡信息编号：Int类型；可空；此字段为0,每次支付新增信用卡信息到数据库，同时接口返回CardInfoID
	 * @return
	 */
	public String getCardInfoID() {
		return cardInfoID;
	}
	/**
	 * 信用卡信息编号：Int类型；可空；此字段为0,每次支付新增信用卡信息到数据库，同时接口返回CardInfoID
	 * @param cardInfoID
	 */
	public void setCardInfoID(String cardInfoID) {
		this.cardInfoID = cardInfoID;
	}
	/**
	 * 信用卡卡种：Int类型；必填
	 * @return
	 */
	public Integer getCreditCardType() {
		return creditCardType;
	}
	/**
	 * 信用卡卡种：Int类型；必填
	 * @param creditCardType
	 */
	public void setCreditCardType(Integer creditCardType) {
		this.creditCardType = creditCardType;
	}
	/**
	 * 信用卡卡号：String类型；必填，使用信用卡加密
	 * @return
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	/**
	 * 信用卡卡号：String类型；必填，使用信用卡加密
	 * @param creditCardNumber
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	/**
	 * 有效日期：String类型；必填，yyyyMM（年4位+月2位）使用信用卡加密
	 * @return
	 */
	public String getValidity() {
		return validity;
	}
	/**
	 * 有效日期：String类型；必填，yyyyMM（年4位+月2位）使用信用卡加密
	 * @param validity
	 */
	public void setValidity(String validity) {
		this.validity = validity;
	}
	/**
	 * 卡号前六位数：String类型；必填，使用信用卡加密
	 * @return
	 */
	public String getCardBin() {
		return cardBin;
	}
	/**
	 * 卡号前六位数：String类型；必填，使用信用卡加密
	 * @param cardBin
	 */
	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}
	/**
	 * 持卡人：String类型；必填，使用信用卡加密
	 * @return
	 */
	public String getCardHolder() {
		return cardHolder;
	}
	/**
	 * 持卡人：String类型；必填，使用信用卡加密
	 * @param cardHolder
	 */
	public void setCardHolder(String cardHolder) {
		this.cardHolder = cardHolder;
	}
	/**
	 * 持卡人证件类型：Int类型；必填，须默认0使用信用卡加密
	 * @return
	 */
	public String getIdCardType() {
		return idCardType;
	}
	/**
	 * 持卡人证件类型：Int类型；必填，须默认0使用信用卡加密
	 * @param idCardType
	 */
	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}
	/**
	 * 持卡人证件号：String类型；必填，使用信用卡加密
	 * @return
	 */
	public String getIdNumber() {
		return idNumber;
	}
	/**
	 * 持卡人证件号：String类型；必填，使用信用卡加密
	 * @param idNumber
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	/**
	 * 检查码：String类型；必填，使用信用卡加密
	 * @return
	 */
	public String getcVV2No() {
		return cVV2No;
	}
	/**
	 * 检查码：String类型；必填，使用信用卡加密
	 * @param cVV2No
	 */
	public void setcVV2No(String cVV2No) {
		this.cVV2No = cVV2No;
	}
	/**
	 * 支付通协议号/手机支付手机号：String类型；必填
	 * @return
	 */
	public String getAgreementCode() {
		return agreementCode;
	}
	/**
	 * 支付通协议号/手机支付手机号：String类型；必填
	 * @param agreementCode
	 */
	public void setAgreementCode(String agreementCode) {
		this.agreementCode = agreementCode;
	}
	/**
	 * <!-- -->
	 * @return
	 */
	public String getEid() {
		return eid;
	}
	/**
	 * <!-- -->
	 * @param eid
	 */
	public void setEid(String eid) {
		this.eid = eid;
	}
	/**
	 * 备注：String类型；可空
	 * @return
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 备注：String类型；可空
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 持卡人是否登机人：Bool类型；可空
	 * @return
	 */
	public String getIsClient() {
		return isClient;
	}
	/**
	 * 持卡人是否登机人：Bool类型；可空
	 * @param isClient
	 */
	public void setIsClient(String isClient) {
		this.isClient = isClient;
	}
	/**
	 * 外卡支付手续费：Decimal类型；可空，须默认0
	 * @return
	 */
	public BigDecimal getcCardPayFee() {
		return cCardPayFee;
	}
	/**
	 * 外卡支付手续费：Decimal类型；可空，须默认0
	 * @param cCardPayFee
	 */
	public void setcCardPayFee(BigDecimal cCardPayFee) {
		this.cCardPayFee = cCardPayFee;
	}
	/**
	 * 外卡支付手续费率：Decimal类型；可空，须默认0
	 * @return
	 */
	public BigDecimal getcCardPayFeeRate() {
		return cCardPayFeeRate;
	}
	/**
	 * 外卡支付手续费率：Decimal类型；可空，须默认0
	 * @param cCardPayFeeRate
	 */
	public void setcCardPayFeeRate(BigDecimal cCardPayFeeRate) {
		this.cCardPayFeeRate = cCardPayFeeRate;
	}
	/**
	 * 外币额的偏移量：Int类型；可空
	 * @return
	 */
	public Integer getExponent() {
		return exponent;
	}
	/**
	 * 外币额的偏移量：Int类型；可空
	 * @param exponent
	 */
	public void setExponent(Integer exponent) {
		this.exponent = exponent;
	}
	/**
	 * DCC外币汇率原始串：String类型；可空
	 * @return
	 */
	public String getExchangeRate() {
		return exchangeRate;
	}
	/**
	 * DCC外币汇率原始串：String类型；可空
	 * @param exchangeRate
	 */
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	/**
	 * DCC 外币金额原始串：String类型；可空
	 * @return
	 */
	public String getfAmount() {
		return fAmount;
	}
	/**
	 * DCC 外币金额原始串：String类型；可空
	 * @param fAmount
	 */
	public void setfAmount(String fAmount) {
		this.fAmount = fAmount;
	}

}
