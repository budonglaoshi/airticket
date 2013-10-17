package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 机场航站楼信息
 * @author jujian
 *
 */
@XStreamAlias("DepartAirport")
public class DepartAirport implements Serializable {
	//所在城市ID 
	@XStreamAlias("CityID")
	private String cityID;
	//机场航站楼ID 
	@XStreamAlias("ID")
	private String iD;
	
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
	
	
}
