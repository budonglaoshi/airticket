package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票订单变更
 * @author jujian
 *
 */
@XStreamAlias("GetStatusChangedOrdersRequest")
public class GetStatusChangedOrdersRequest {
	//检查变更时间：DateTime类型；必填；返回这个时间之后的状态发生变更的订单集合，日期必须在当前日期30天前以内
	@XStreamAlias("ChangedTime")
	private String changedTime;

	/**
	 * 检查变更时间：DateTime类型；必填；返回这个时间之后的状态发生变更的订单集合，日期必须在当前日期30天前以内
	 * @return
	 */
	public String getChangedTime() {
		return changedTime;
	}

	/**
	 * 检查变更时间：DateTime类型；必填；返回这个时间之后的状态发生变更的订单集合，日期必须在当前日期30天前以内
	 * @param changedTime
	 */
	public void setChangedTime(String changedTime) {
		this.changedTime = changedTime;
	}
	


}
