package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author jujian
 *
 */
@XStreamAlias("GetAirlineInfosRequest")
public class GetAirlineInfosRequest {
	//航空公司二字码：string类型；可空；为空时查询全部信息
	@XStreamAlias("AirLine")
	private String airLine;

	/**
	 * 航空公司二字码：string类型；可空；为空时查询全部信息
	 * @return
	 */
	public String getAirLine() {
		return airLine;
	}

	/**
	 * 航空公司二字码：string类型；可空；为空时查询全部信息
	 * @param airLine
	 */
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
}
