package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单详情返回体
 * @author jujian
 *
 */
@XStreamAlias("FltViewOrderResponse")
public class FltViewOrderResponse implements Serializable {
	//结果
	@XStreamAlias("Result")
	private String result;
	//提示信息
	@XStreamAlias("ResultMessage")
	private String resultMessage;
	
	//订单信息详情
	@XStreamAlias("OrdersInfo")
	private List<OrderInfo> ordersInfo;
	
	//<?>失败的命令
	@XStreamAlias("FailedOrder")
	private String[] failedOrder;

	/**
	 * 结果
	 * @return
	 */
	public String getResult() {
		return result;
	}

	/**
	 * 结果
	 * @param result
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * 提示信息
	 * @return
	 */
	public String getResultMessage() {
		return resultMessage;
	}

	/**
	 * 提示信息
	 * @param resultMessage
	 */
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	/**
	 * 订单信息详情
	 * @return
	 */
	public List<OrderInfo> getOrdersInfo() {
		return ordersInfo;
	}

	/**
	 * 订单信息详情
	 * @param ordersInfo
	 */
	public void setOrdersInfo(List<OrderInfo> ordersInfo) {
		this.ordersInfo = ordersInfo;
	}

	/**
	 * <?>失败的命令
	 * @return
	 */
	public String[] getFailedOrder() {
		return failedOrder;
	}

	/**
	 * <?>失败的命令
	 * @param failedOrder
	 */
	public void setFailedOrder(String[] failedOrder) {
		this.failedOrder = failedOrder;
	}
	

}
