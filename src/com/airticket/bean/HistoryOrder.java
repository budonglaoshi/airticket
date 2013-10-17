package com.airticket.bean;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * HistoryOrder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_history_order", catalog = "airticket")
public class HistoryOrder extends Order implements Serializable {


	// Constructors

	/** default constructor */
	public HistoryOrder() {
	}



	// Property accessors
	@Id
	@Column(name = "orderid", unique = true, nullable = false, length = 20)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "departCityCode", nullable = false, length = 20)
	public String getDepartCityCode() {
		return this.departCityCode;
	}

	public void setDepartCityCode(String departCityCode) {
		this.departCityCode = departCityCode;
	}

	@Column(name = "arriveCityCode", nullable = false, length = 20)
	public String getArriveCityCode() {
		return this.arriveCityCode;
	}

	public void setArriveCityCode(String arriveCityCode) {
		this.arriveCityCode = arriveCityCode;
	}

	@Column(name = "departCityName", nullable = false, length = 20)
	public String getDepartCityName() {
		return this.departCityName;
	}

	public void setDepartCityName(String departCityName) {
		this.departCityName = departCityName;
	}

	@Column(name = "arriveCityName", nullable = false, length = 20)
	public String getArriveCityName() {
		return this.arriveCityName;
	}

	public void setArriveCityName(String arriveCityName) {
		this.arriveCityName = arriveCityName;
	}

	@Column(name = "takeOffTime", nullable = false, length = 19)
	public Timestamp getTakeOffTime() {
		return this.takeOffTime;
	}

	public void setTakeOffTime(Timestamp takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	@Column(name = "arriveTime", nullable = false, length = 19)
	public Timestamp getArriveTime() {
		return this.arriveTime;
	}

	public void setArriveTime(Timestamp arriveTime) {
		this.arriveTime = arriveTime;
	}

	@Column(name = "craftType", nullable = false, length = 20)
	public String getCraftType() {
		return this.craftType;
	}

	public void setCraftType(String craftType) {
		this.craftType = craftType;
	}

	@Column(name = "airlineCode", nullable = false, length = 20)
	public String getAirlineCode() {
		return this.airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	@Column(name = "airlineName", nullable = false, length = 20)
	public String getAirlineName() {
		return this.airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "statusid", nullable = false, length = 1)
	public String getStatusid() {
		return this.statusid;
	}

	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}

	@Column(name = "contactName", nullable = false, length = 20)
	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name = "mobilePhone", nullable = false, length = 20)
	public String getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	@Column(name = "contactEMail", length = 20)
	public String getContactEmail() {
		return this.contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

}
