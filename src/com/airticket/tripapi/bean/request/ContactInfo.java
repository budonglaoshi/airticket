package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 订单联系人
 * @author jujian
 *
 */
@XStreamAlias("ContactInfo")
public class ContactInfo {
	//联系人姓名：string类型；必填
	@XStreamAlias("ContactName")
	private String contactName;
	//联系人确认方式：string类型；必填；电话确认TEL，邮件确认EML
	@XStreamAlias("ConfirmOption")
	private String confirmOption;
	//联系手机号码(国内) ：string类型；必填
	@XStreamAlias("MobilePhone")
	private String mobilePhone;
	//联系电话：string类型；必填
	@XStreamAlias("ContactTel")
	private String contactTel;
	//境外手机号码：string类型；可空
	@XStreamAlias("ForeignMobile")
	private String foreignMobile="";
	//境外手机前缀：string类型；可空
	@XStreamAlias("MobileCountryFix")
	private String mobileCountryFix="";
	//联系邮件地址：string类型；必填
	@XStreamAlias("ContactEMail")
	private String contactEMail;
	//联系传真号码：string类型；可空
	@XStreamAlias("ContactFax")
	private String contactFax="";
	
	/**
	 * 联系人姓名：string类型；必填
	 * @return
	 */
	public String getContactName() {
		return contactName;
	}
	/**
	 * 联系人姓名：string类型；必填
	 * @param contactName
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	/**
	 * 联系人确认方式：string类型；必填；电话确认TEL，邮件确认EML
	 * @return
	 */
	public String getConfirmOption() {
		return confirmOption;
	}
	/**
	 * 联系人确认方式：string类型；必填；电话确认TEL，邮件确认EML
	 * @param confirmOption
	 */
	public void setConfirmOption(String confirmOption) {
		this.confirmOption = confirmOption;
	}
	/**
	 * 联系手机号码(国内) ：string类型；必填
	 * @return
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}
	/**
	 * 联系手机号码(国内) ：string类型；必填
	 * @param mobilePhone
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	/**
	 * 联系电话：string类型；必填
	 * @return
	 */
	public String getContactTel() {
		return contactTel;
	}
	/**
	 * 联系电话：string类型；必填
	 * @param contactTel
	 */
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	/**
	 * 境外手机号码：string类型；可空
	 * @return
	 */
	public String getForeignMobile() {
		return foreignMobile;
	}
	/**
	 * 境外手机号码：string类型；可空
	 * @param foreignMobile
	 */
	public void setForeignMobile(String foreignMobile) {
		this.foreignMobile = foreignMobile;
	}
	/**
	 * 境外手机前缀：string类型；可空
	 * @return
	 */
	public String getMobileCountryFix() {
		return mobileCountryFix;
	}
	/**
	 * 境外手机前缀：string类型；可空
	 * @param mobileCountryFix
	 */
	public void setMobileCountryFix(String mobileCountryFix) {
		this.mobileCountryFix = mobileCountryFix;
	}
	/**
	 * 联系邮件地址：string类型；必填
	 * @return
	 */
	public String getContactEMail() {
		return contactEMail;
	}
	/**
	 * 联系邮件地址：string类型；必填
	 * @param contactEMail
	 */
	public void setContactEMail(String contactEMail) {
		this.contactEMail = contactEMail;
	}
	/**
	 * 联系传真号码：string类型；可空
	 * @return
	 */
	public String getContactFax() {
		return contactFax;
	}
	/**
	 * 联系传真号码：string类型；可空
	 * @param contactFax
	 */
	public void setContactFax(String contactFax) {
		this.contactFax = contactFax;
	}
}
