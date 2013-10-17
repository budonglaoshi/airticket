package com.airticket.bean;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * OrderTravelInvoices entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_order_travelinvoices", catalog = "airticket")
public class OrderTravelInvoices implements Serializable {

	// Fields

	//旅游发票ID
	private String travelinvoicesid;
	//收件人
	private String receiver;
	//联系方式
	private String mobilePhone;
	//省名称
	private String province;
	//市名称
	private String city;
	//区名称
	private String canton;
	//详细地址
	private String address;
	//邮政编码
	private String postCode;
	//订单ID
	private String orderid;
	//联系人ID
	private String passengerid;

	// Constructors

	/** default constructor */
	public OrderTravelInvoices() {
	}
	
	// Property accessors
	@SequenceGenerator(name="generator",sequenceName="seq_OrderTravelInvoices")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
	@Column(name = "travelinvoicesid", unique = true, nullable = false, length = 20)
	public String getTravelinvoicesid() {
		return this.travelinvoicesid;
	}

	public void setTravelinvoicesid(String travelinvoicesid) {
		this.travelinvoicesid = travelinvoicesid;
	}

	@Column(name = "receiver", nullable = false, length = 20)
	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Column(name = "province", nullable = false, length = 20)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "city", nullable = false, length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "canton", nullable = false, length = 20)
	public String getCanton() {
		return this.canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	@Column(name = "address", nullable = false, length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "postCode", nullable = false, length = 20)
	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	@Column(name = "orderid", nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "passengerid", nullable = false, length = 20)
	public String getPassengerid() {
		return this.passengerid;
	}

	public void setPassengerid(String passengerid) {
		this.passengerid = passengerid;
	}

	@Column(name = "mobilePhone", nullable = false, length = 20)
	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

}