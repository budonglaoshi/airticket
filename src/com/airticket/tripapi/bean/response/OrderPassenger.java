package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 乘客信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("OrderPassenger")
public class OrderPassenger implements Serializable {
	// 乘机人姓名
	@XStreamAlias("PassengerName")
	private String passengerName;
	// 乘机人出生日期
	@XStreamAlias("Birthday")
	private String birthday;
	// 乘机人性别
	@XStreamAlias("Gender")
	private String gender;
	// 国籍代码
	@XStreamAlias("NationalityCode")
	private String nationalityCode;
	// 国家名称
	@XStreamAlias("NationalityName")
	private String nationalityName;
	// 证件名称
	@XStreamAlias("CardTypeName")
	private String cardTypeName;
	// 证件号码
	@XStreamAlias("CardTypeNumber")
	private String cardTypeNumber;
	// 乘机人姓名拼音
	@XStreamAlias("PassengerNamePY")
	private String passengerNamePY;
	// 证件有效期
	@XStreamAlias("CardValid")
	private String cardValid;
	// 携程员工填写
	@XStreamAlias("CorpEid")
	private String corpEid;
	
	/**
	 * 乘机人姓名
	 * @return
	 */
	public String getPassengerName() {
		return passengerName;
	}
	/**
	 * 乘机人姓名
	 * @param passengerName
	 */
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	/**
	 * 乘机人出生日期
	 * @return
	 */
	public String getBirthday() {
		return birthday;
	}
	/**
	 * 乘机人出生日期
	 * @param birthday
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	/**
	 * 乘机人性别
	 * @return
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 乘机人性别
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 国籍代码
	 * @return
	 */
	public String getNationalityCode() {
		return nationalityCode;
	}
	/**
	 * 国籍代码
	 * @param nationalityCode
	 */
	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}
	/**
	 * 国家名称
	 * @return
	 */
	public String getNationalityName() {
		return nationalityName;
	}
	/**
	 * 国家名称
	 * @param nationalityName
	 */
	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}
	/**
	 * 证件名称
	 * @return
	 */
	public String getCardTypeName() {
		return cardTypeName;
	}
	/**
	 * 证件名称
	 * @param cardTypeName
	 */
	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}
	/**
	 * 证件号码
	 * @return
	 */
	public String getCardTypeNumber() {
		return cardTypeNumber;
	}
	/**
	 * 证件号码
	 * @param cardTypeNumber
	 */
	public void setCardTypeNumber(String cardTypeNumber) {
		this.cardTypeNumber = cardTypeNumber;
	}
	/**
	 * 乘机人姓名拼音
	 * @return
	 */
	public String getPassengerNamePY() {
		return passengerNamePY;
	}
	/**
	 * 乘机人姓名拼音
	 * @param passengerNamePY
	 */
	public void setPassengerNamePY(String passengerNamePY) {
		this.passengerNamePY = passengerNamePY;
	}
	/**
	 * 证件有效期
	 * @return
	 */
	public String getCardValid() {
		return cardValid;
	}
	/**
	 * 证件有效期
	 * @param cardValid
	 */
	public void setCardValid(String cardValid) {
		this.cardValid = cardValid;
	}
	/**
	 *  携程员工填写
	 * @return
	 */
	public String getCorpEid() {
		return corpEid;
	}
	/**
	 *  携程员工填写
	 * @param corpEid
	 */
	public void setCorpEid(String corpEid) {
		this.corpEid = corpEid;
	}
	
}
