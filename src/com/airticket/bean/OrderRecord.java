package com.airticket.bean;

import static javax.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * OrderRecord entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_order_record", catalog = "airticket")
public class OrderRecord implements Serializable {

	// Fields

	//订单操作记录ID
	private Integer recordid;
	//订单操作时间
	private Timestamp recordTime;
	//订单操作状态
	private Integer recordstatus;
	//订单操作备注
	private String comment;
	//订单ID
	private String orderid;
	//操作人ID
	private String userid;

	// Constructors

	/** default constructor */
	public OrderRecord() {
	}


	// Property accessors
	@Id
	@GenericGenerator(name="generator", strategy="increment") 
	@GeneratedValue(generator="generator")
    @Column(name="recordid", unique=true, nullable=false)
	public Integer getRecordid() {
		return this.recordid;
	}

	public void setRecordid(Integer recordid) {
		this.recordid = recordid;
	}

	@Column(name = "recordTime", nullable = false, length = 19)
	public Timestamp getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Timestamp recordTime) {
		this.recordTime = recordTime;
	}

	@Column(name = "comment", length = 200)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name = "orderid", nullable = false, length = 100)
	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	@Column(name = "userid", nullable = false, length = 100)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Column(name = "recordstatus", nullable = false, length = 10)
	public Integer getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(Integer recordstatus) {
		this.recordstatus = recordstatus;
	}

}