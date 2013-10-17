package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("PriceTypeOptions")
public class PriceTypeOptions {

	//产品价格类型筛选选项 NormalPrice：普通政策，SingleTripPrice: 提前预售特价
	@XStreamAlias("LocalString")
	private String localString;

	/**
	 * 产品价格类型筛选选项 NormalPrice：普通政策，SingleTripPrice: 提前预售特价
	 * @return
	 */
	public String getLocalString() {
		return localString;
	}

	/**
	 * 产品价格类型筛选选项 NormalPrice：普通政策，SingleTripPrice: 提前预售特价
	 * @param localString
	 */
	public void setLocalString(String localString) {
		this.localString = localString;
	}

}
