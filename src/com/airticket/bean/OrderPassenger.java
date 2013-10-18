package com.airticket.bean;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * OrderPassenger entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_order_passenger", catalog = "airticket")
public class OrderPassenger implements Serializable {

	// Fields
	
	//乘机人ID
	private Integer passengerid;
	//乘机人姓名
	private String passengerName;
	//乘机人年龄
	private String passengerType;
	//证件类型
	private String cardTypeName;
	//证件号码
	private String cardTypeNumber;
	//舱位等级
	private String flightClass;
	//舱位等级中文名称
	private String flightClassName;
	//保险金额
	private Double insurance;
	//机票单价
	private Double price;
	//机票订单ID
	private String orderid;

	// Constructors

	/** default constructor */
	public OrderPassenger() {
	}


	// Property accessors
	@Id
	@GenericGenerator(name="generator", strategy="increment") 
	@GeneratedValue(generator="generator")
    @Column(name="passengerid", unique=true, nullable=false)
	public Integer getPassengerid() {
		return this.passengerid;
	}

	public void setPassengerid(Integer passengerid) {
		this.passengerid = passengerid;
	}

	@Column(name = "passengerName", nullable = false, length = 20)
	public String getPassengerName() {
		return this.passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	@Column(name = "passengerType", nullable = false)
	public String getPassengerType() {
		return this.passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	@Column(name = "cardTypeName", nullable = false, length = 20)
	public String getCardTypeName() {
		return this.cardTypeName;
	}

	public void setCardTypeName(String cardTypeName) {
		this.cardTypeName = cardTypeName;
	}

	@Column(name = "cardTypeNumber", nullable = false, length = 20)
	public String getCardTypeNumber() {
		return this.cardTypeNumber;
	}

	public void setCardTypeNumber(String cardTypeNumber) {
		this.cardTypeNumber = cardTypeNumber;
	}

	@Column(name = "flightClass", nullable = false, length = 20)
	public String getFlightClass() {
		return this.flightClass;
	}

	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	@Column(name = "flightClassName", nullable = false, length = 20)
	public String getFlightClassName() {
		return this.flightClassName;
	}

	public void setFlightClassName(String flightClassName) {
		this.flightClassName = flightClassName;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 2)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "orderid", nullable = false, length = 100)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "insurance", nullable = false, precision = 22, scale = 0)
	public Double getInsurance() {
		return insurance;
	}

	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}

}