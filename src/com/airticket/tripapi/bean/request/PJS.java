package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 邮寄行程单-邮寄信息实体
 * @author jujian
 *
 */
@XStreamAlias("PJS")
public class PJS {
	//收件人
	@XStreamAlias("Receiver")
	private String receiver;
	//省
	@XStreamAlias("Province")
    private String rrovince;
	//市
	@XStreamAlias("City")
    private String city;
	//区
	@XStreamAlias("Canton")
    private String canton;
	//详细地址
	@XStreamAlias("Address")
    private String address;
	//邮编
	@XStreamAlias("PostCode")
    private String postCode;
	
	/**
	 * 收件人
	 * @return
	 */
	public String getReceiver() {
		return receiver;
	}
	/**
	 * 收件人
	 * @param receiver
	 */
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	/**
	 * 省
	 * @return
	 */
	public String getRrovince() {
		return rrovince;
	}
	/**
	 * 省
	 * @param rrovince
	 */
	public void setRrovince(String rrovince) {
		this.rrovince = rrovince;
	}
	/**
	 * 市
	 * @return
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 市
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 区
	 * @return
	 */
	public String getCanton() {
		return canton;
	}
	/**
	 * 区
	 * @param canton
	 */
	public void setCanton(String canton) {
		this.canton = canton;
	}
	/**
	 * 详细地址
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 详细地址
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 邮编
	 * @return
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * 邮编
	 * @param postCode
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
    
}
