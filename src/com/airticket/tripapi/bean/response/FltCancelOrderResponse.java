package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票取消订单返回体
 * 
 * @author jujian
 * 
 */
@XStreamAlias("FltCancelOrderResponse")
public class FltCancelOrderResponse implements Serializable{
	// 取消结果：true成功，false失败
	@XStreamAlias("Result")
	private String result;
	// 提示信息
	@XStreamAlias("Message")
	private String message;
	
	/**
	 * 取消结果：true成功，false失败
	 * @return
	 */
	public String getResult() {
		return result;
	}
	/**
	 * 取消结果：true成功，false失败
	 * @param result
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * 提示信息
	 * @return
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * 提示信息
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
