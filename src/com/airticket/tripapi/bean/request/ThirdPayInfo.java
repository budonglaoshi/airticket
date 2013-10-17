package com.airticket.tripapi.bean.request;

import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 第三方支付
 * @author jujian
 *
 */
@XStreamAlias("ThirdPayInfo")
public class ThirdPayInfo {
	//账户
	@XStreamAlias("Account")
	private String account;
	//金额合计
	@XStreamAlias("Amount")
	private BigDecimal amount;
	//支付ID
	@XStreamAlias("Pid")
	private String pid;
	//支付单号
	@XStreamAlias("RefNo")
	private String refNo;
	
	/**
	 * 账户
	 * @return
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * 账户
	 * @param account
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 金额合计
	 * @return
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * 金额合计
	 * @param amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * 支付ID
	 * @return
	 */
	public String getPid() {
		return pid;
	}
	/**
	 * 支付ID
	 * @param pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}
	/**
	 * 支付单号
	 * @return
	 */
	public String getRefNo() {
		return refNo;
	}
	/**
	 * 支付单号
	 * @param refNo
	 */
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	
}
