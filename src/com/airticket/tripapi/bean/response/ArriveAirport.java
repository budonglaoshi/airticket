package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 到达机场航站楼信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("ArriveAirport")
public class ArriveAirport implements Serializable {
	// 地址
	@XStreamAlias("Address")
	private String address;
	// 机场代码
	@XStreamAlias("AirportCode")
	private String airportCode;
	// 所在城市代码
	@XStreamAlias("CityCode")
	private String cityCode;
	// 所在城市ID
	@XStreamAlias("CityID")
	private String cityID;
	// 机场航站楼ID
	@XStreamAlias("ID")
	private String iD;
	// 航站楼名称
	@XStreamAlias("Name")
	private String name;
	// 航站楼简称
	@XStreamAlias("Shortname")
	private String shortname;
	// 短信名称
	@XStreamAlias("SMSName")
	private String sMSName;
	
	/**
	 * 地址
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 地址
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 机场代码
	 * @return
	 */
	public String getAirportCode() {
		return airportCode;
	}
	/**
	 * 机场代码
	 * @param airportCode
	 */
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	/**
	 * 所在城市代码
	 * @return
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * 所在城市代码
	 * @param cityCode
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * 所在城市ID
	 * @return
	 */
	public String getCityID() {
		return cityID;
	}
	/**
	 * 所在城市ID
	 * @param cityID
	 */
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}
	/**
	 * 机场航站楼ID
	 * @return
	 */
	public String getiD() {
		return iD;
	}
	/**
	 * 机场航站楼ID
	 * @param iD
	 */
	public void setiD(String iD) {
		this.iD = iD;
	}
	/**
	 * 航站楼名称
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * 航站楼名称
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 航站楼简称
	 * @return
	 */
	public String getShortname() {
		return shortname;
	}
	/**
	 * 航站楼简称
	 * @param shortname
	 */
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	/**
	 * 短信名称
	 * @return
	 */
	public String getsMSName() {
		return sMSName;
	}
	/**
	 * 短信名称
	 * @param sMSName
	 */
	public void setsMSName(String sMSName) {
		this.sMSName = sMSName;
	}
	
}
