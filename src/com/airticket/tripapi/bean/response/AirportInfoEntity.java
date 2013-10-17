package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 机场信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("AirportInfoEntity")
public class AirportInfoEntity implements Serializable {
	// 机场代码
	@XStreamAlias("AirPort")
	private String airPort;
	// 机场中文名称
	@XStreamAlias("AirPortName")
	private String airPortName;
	// 机场英文名称
	@XStreamAlias("AirPortEName")
	private String airPortEName;
	// 机场名称简称
	@XStreamAlias("ShortName")
	private String shortName;
	// 机场所在城市ID
	@XStreamAlias("CityId")
	private String cityId;
	// 机场所在城市名称
	@XStreamAlias("CityName")
	private String cityName;
	
	/**
	 * 机场代码
	 * @return
	 */
	public String getAirPort() {
		return airPort;
	}
	/**
	 * 机场代码
	 * @param airPort
	 */
	public void setAirPort(String airPort) {
		this.airPort = airPort;
	}
	/**
	 * 机场中文名称
	 * @return
	 */
	public String getAirPortName() {
		return airPortName;
	}
	/**
	 * 机场中文名称
	 * @param airPortName
	 */
	public void setAirPortName(String airPortName) {
		this.airPortName = airPortName;
	}
	/**
	 * 机场英文名称
	 * @return
	 */
	public String getAirPortEName() {
		return airPortEName;
	}
	/**
	 * 机场英文名称
	 * @param airPortEName
	 */
	public void setAirPortEName(String airPortEName) {
		this.airPortEName = airPortEName;
	}
	/**
	 * 机场名称简称
	 * @return
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * 机场名称简称
	 * @param shortName
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * 机场所在城市ID
	 * @return
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * 机场所在城市ID
	 * @param cityId
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	/**
	 * 机场所在城市名称
	 * @return
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 机场所在城市名称
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
