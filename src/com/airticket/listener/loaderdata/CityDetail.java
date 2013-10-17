package com.airticket.listener.loaderdata;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * 城市信息
 * @author Administrator
 *
 */
@XStreamAlias("CityDetail")
public class CityDetail implements Serializable {
	

	@XStreamOmitField							 
	private static final long serialVersionUID = 439195644050973189L;
	//城市三字码
	@XStreamAlias("CityCode")
	private String cityCode="";
	//城市ID
	@XStreamAlias("City")
	private String city="";
	//城市中文名字
	@XStreamAlias("CityName")
	private String cityName="";
	//城市英文名字
	@XStreamAlias("CityEName")
	private String cityEName="";
	//国家ID
	@XStreamAlias("Country")
	private String country="";
	//省份ID
	@XStreamAlias("Province")
	private String province="";
	//机场三字码（NAY,PEK）
	@XStreamAlias("Airport")
	private String airport="";
	
	/**
	 * 城市三字码
	 * @return
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * 城市三字码
	 * @return
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * 城市ID
	 * @return
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 城市ID
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 城市中文名字
	 * @return
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 城市中文名字
	 * @return
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * 城市英文名字
	 * @return
	 */
	public String getCityEName() {
		return cityEName;
	}
	/**
	 * 城市英文名字
	 * @param cityEName
	 */
	public void setCityEName(String cityEName) {
		this.cityEName = cityEName;
	}
	/**
	 * 国家ID
	 * @return
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 国家ID
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 省份ID
	 * @param country
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 省份ID
	 * @param country
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 机场三字码（NAY,PEK）
	 * @return
	 */
	public String getAirport() {
		return airport;
	}
	/**
	 * 机场三字码（NAY,PEK）
	 * @param airport
	 */
	public void setAirport(String airport) {
		this.airport = airport;
	}
	
	
}
