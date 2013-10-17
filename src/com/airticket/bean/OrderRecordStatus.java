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
 * OrderRecordStatus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "p1_order_record_status", catalog = "airticket")
public class OrderRecordStatus implements Serializable {

	// Fields

	private String statusid;
	private String statusName;

	// Constructors

	/** default constructor */
	public OrderRecordStatus() {
	}

	/** full constructor */
	public OrderRecordStatus(String statusid, String statusName) {
		this.statusid = statusid;
		this.statusName = statusName;
	}

	// Property accessors
	@SequenceGenerator(name="generator",sequenceName="seq_OrderRecordStatus")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
	@Column(name = "statusid", unique = true, nullable = false, length = 20)
	public String getStatusid() {
		return this.statusid;
	}

	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}

	@Column(name = "statusName", nullable = false, length = 20)
	public String getStatusName() {
		return this.statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}