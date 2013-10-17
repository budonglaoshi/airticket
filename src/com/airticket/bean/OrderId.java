package com.airticket.bean;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * OrderIdId entity. @author MyEclipse Persistence Tools
 */

@Entity
@Table(name = "p1_order_id", catalog = "airticket")
public class OrderId implements java.io.Serializable {

	// Fields
	private String id;
	private Integer index;
	private String initial;
	private Integer toplimit;
	private Integer present;

	// Constructors

	/** default constructor */
	public OrderId() {
	}

	
	// Property accessors

	@Column(name = "initial", nullable = false, length = 20)
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

	@SequenceGenerator(name="generator")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")
	@Column(name = "id", nullable = false, length = 10)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="index",nullable = false,length = 10)
	public Integer getIndex() {
		return index;
	}


	public void setIndex(Integer index) {
		this.index = index;
	}

}