package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 自行收取信用卡信息
 * @author jujian
 *
 */
@XStreamAlias("FltSaveOrderResponse")
public class FltSaveOrderResponse implements Serializable {
	// 提交结果
	@XStreamAlias("Result")
	private String result;
	// 提交结果提示
	@XStreamAlias("ResultMsg")
	private String resultMsg;
	// 临时订单号，若为通过支付API付款则返回临时订单号，等待跳转支付API完成支付后自动提交
	@XStreamAlias("TempOrderID")
	private String tempOrderID;
	// 正式订单号，若为自行收取信用卡，则返回正式订单号
	@XStreamAlias("OrderID")
	private int orderID;
	
	/**
	 * 提交结果
	 * @return
	 */
	public String getResult() {
		return result;
	}
	/**
	 * 提交结果
	 * @param result
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * 提交结果提示
	 * @return
	 */
	public String getResultMsg() {
		return resultMsg;
	}
	/**
	 * 提交结果提示
	 * @param resultMsg
	 */
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	/**
	 * 临时订单号，若为通过支付API付款则返回临时订单号，等待跳转支付API完成支付后自动提交
	 * @return
	 */
	public String getTempOrderID() {
		return tempOrderID;
	}
	/**
	 * 临时订单号，若为通过支付API付款则返回临时订单号，等待跳转支付API完成支付后自动提交
	 * @param tempOrderID
	 */
	public void setTempOrderID(String tempOrderID) {
		this.tempOrderID = tempOrderID;
	}
	/**
	 * 正式订单号，若为自行收取信用卡，则返回正式订单号
	 * @return
	 */
	public int getOrderID() {
		return orderID;
	}
	/**
	 * 正式订单号，若为自行收取信用卡，则返回正式订单号
	 * @param orderID
	 */
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	
	
}
