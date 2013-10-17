package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 乘机人信息
 * @author jujian
 *
 */
@XStreamAlias("PassengerRequest")
public class PassengerRequest {
	//乘机人姓名：string类型；必填
	@XStreamAlias("PassengerName")
	private String passengerName;
	//乘机人出生日期：DateTime类型；必填；yyyy-MM-dd
	@XStreamAlias("BirthDay")
	private String birthDay;
	//证件类型ID：Int类型；必填：1身份证，2护照，4军人证，7回乡证，8台胞证，10港澳通行证，11国际海员证，20外国人永久居留证，25户口簿，27出生证明，99其它
	@XStreamAlias("PassportTypeID")
	private Integer passportTypeID;
	//证件号码：string类型；必填
	@XStreamAlias("PassportNo")
	private String passportNo;
	//乘机人联系电话：string类型；必填
	@XStreamAlias("ContactTelephone")
	private String contactTelephone;
	//乘机人性别：string类型；必填
	@XStreamAlias("Gender")
	private String gender;
	//国家代码：string类型；必填
	@XStreamAlias("NationalityCode")
	private String nationalityCode;
	
	/**
	 * 乘机人姓名：string类型；必填
	 * @return
	 */
	public String getPassengerName() {
		return passengerName;
	}
	/**
	 * 乘机人姓名：string类型；必填
	 * @param passengerName
	 */
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	/**
	 * 乘机人出生日期：DateTime类型；必填；yyyy-MM-dd
	 * @return
	 */
	public String getBirthDay() {
		return birthDay;
	}
	/**
	 * 乘机人出生日期：DateTime类型；必填；yyyy-MM-dd
	 * @param birthDay
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	/**
	 * 证件类型ID：Int类型；必填：1身份证，2护照，4军人证，7回乡证，8台胞证，10港澳通行证，11国际海员证，20外国人永久居留证，25户口簿，27出生证明，99其它
	 * @return
	 */
	public Integer getPassportTypeID() {
		return passportTypeID;
	}
	/**
	 * 证件类型ID：Int类型；必填：1身份证，2护照，4军人证，7回乡证，8台胞证，10港澳通行证，11国际海员证，20外国人永久居留证，25户口簿，27出生证明，99其它
	 * @param passportTypeID
	 */
	public void setPassportTypeID(Integer passportTypeID) {
		this.passportTypeID = passportTypeID;
	}
	/**
	 * 证件号码：string类型；必填
	 * @return
	 */
	public String getPassportNo() {
		return passportNo;
	}
	/**
	 * 证件号码：string类型；必填
	 * @param passportNo
	 */
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	/**
	 * 乘机人联系电话：string类型；必填
	 * @return
	 */
	public String getContactTelephone() {
		return contactTelephone;
	}
	/**
	 * 乘机人联系电话：string类型；必填
	 * @param contactTelephone
	 */
	public void setContactTelephone(String contactTelephone) {
		this.contactTelephone = contactTelephone;
	}
	/**
	 * 乘机人性别：string类型；必填
	 * @return
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 乘机人性别：string类型；必填
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 国家代码：string类型；必填
	 * @return
	 */
	public String getNationalityCode() {
		return nationalityCode;
	}
	/**
	 * 国家代码：string类型；必填
	 * @param nationalityCode
	 */
	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}
	
}	
