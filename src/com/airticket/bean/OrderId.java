package com.airticket.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrderIdId entity. @author MyEclipse Persistence Tools
 */

@Entity
@Table(name = "p1_order_id", catalog = "airticket")
public class OrderId implements Serializable {

	// Fields
	private String head;
	private Integer order_key;
	private String initial;
	private Integer toplimit;
	private Integer present;
	
	// Constructors

	/** default constructor */
	public OrderId() {
	}

	
	// Property accessors

	@Column(name = "initial", nullable = false, length = 100)
	public String getInitial() {
		return this.initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	
	@Column(name = "toplimit", nullable = false)
	public Integer getToplimit() {
		return this.toplimit;
	}

	public void setToplimit(Integer toplimit) {
		this.toplimit = toplimit;
	}

	@Column(name = "present", nullable = false)
	public Integer getPresent() {
		return this.present;
	}

	public void setPresent(Integer present) {
		this.present = present;
	}
	

	@Id
	@Column(name = "order_key", nullable = false)
	public Integer getOrder_key() {
		return order_key;
	}


	public void setOrder_key(Integer order_key) {
		this.order_key = order_key;
	}

	@Column(name="head",nullable = false,length = 100)
	public String getHead() {
		return head;
	}


	public void setHead(String head) {
		this.head = head;
	}

}