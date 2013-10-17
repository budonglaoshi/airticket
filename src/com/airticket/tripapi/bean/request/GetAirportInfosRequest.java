package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 机场查询
 * @author jujian
 *
 */
@XStreamAlias("GetAirportInfosRequest")
public class GetAirportInfosRequest {
	//机场三字码：string类型；可空；为空时查询全部机场信息
	@XStreamAlias("AirportCode")
	private String airportCode;

	/**
	 * 机场三字码：string类型；可空；为空时查询全部机场信息
	 * @return
	 */
	public String getAirportCode() {
		return airportCode;
	}

	/**
	 * 机场三字码：string类型；可空；为空时查询全部机场信息
	 * @param airportCode
	 */
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
}
