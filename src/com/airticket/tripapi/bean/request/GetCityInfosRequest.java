package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 城市查询
 * @author jujian
 *
 */
@XStreamAlias("GetCityInfosRequest")
public class GetCityInfosRequest {
	//城市Code：string类型；可空
	@XStreamAlias("CityCode")
	private String cityCode="";
	//城市ID：string类型；可空
	@XStreamAlias("CityId")
	private String cityId="";
	//城市中文名称：string类型；可空
	@XStreamAlias("CityName")
	private String cityName="";
	
	/**
	 * 城市Code：string类型；可空
	 * @return
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * 城市Code：string类型；可空
	 * @param cityCode
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * 城市ID：string类型；可空
	 * @return
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * 城市ID：string类型；可空
	 * @param cityId
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	/**
	 * 城市中文名称：string类型；可空
	 * @return
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 城市中文名称：string类型；可空
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
}
