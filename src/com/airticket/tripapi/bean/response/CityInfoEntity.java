package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 城市信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("CityInfoEntity")
public class CityInfoEntity implements Serializable {
	// 城市Code
	@XStreamAlias("CityCode")
	private String cityCode;
	// 城市ID
	@XStreamAlias("CityId")
	private String cityId;
	// 城市中文名称
	@XStreamAlias("CityName")
	private String cityName;
	// 城市英文名称
	@XStreamAlias("CityName_En")
	private String cityName_En;
	// 隶属省市ID
	@XStreamAlias("ProvinceId")
	private String provinceId;
	// 所属国家ID
	@XStreamAlias("CountryId")
	private String countryId;
	// 所属国家中文名称
	@XStreamAlias("CountryCNName")
	private String countryCNName;
	// 是否出发城市
	@XStreamAlias("IsDCity")
	private String isDCity;
	// 是否到达城市
	@XStreamAlias("IsACity")
	private String isACity;
	// 是否送票城市
	@XStreamAlias("IsTCity")
	private String isTCity;
	// 是否国内城市
	@XStreamAlias("IsDomesticCity")
	private String isDomesticCity;
	
	/**
	 * 城市Code
	 * @return
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * 城市Code
	 * @param cityCode
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * 城市ID
	 * @return
	 */
	public String getCityId() {
		return cityId;
	}
	/**
	 * 城市ID
	 * @param cityId
	 */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	/**
	 * 城市中文名称
	 * @return
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 城市中文名称
	 * @param cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * 城市英文名称
	 * @return
	 */
	public String getCityName_En() {
		return cityName_En;
	}
	/**
	 * 城市英文名称
	 * @param cityName_En
	 */
	public void setCityName_En(String cityName_En) {
		this.cityName_En = cityName_En;
	}
	/**
	 * 隶属省市ID
	 * @return
	 */
	public String getProvinceId() {
		return provinceId;
	}
	/**
	 * 隶属省市ID
	 * @param provinceId
	 */
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	/**
	 * 所属国家ID
	 * @return
	 */
	public String getCountryId() {
		return countryId;
	}
	/**
	 * 所属国家ID
	 * @param countryId
	 */
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	/**
	 * 所属国家中文名称
	 * @return
	 */
	public String getCountryCNName() {
		return countryCNName;
	}
	/**
	 * 所属国家中文名称
	 * @param countryCNName
	 */
	public void setCountryCNName(String countryCNName) {
		this.countryCNName = countryCNName;
	}
	/**
	 * 是否出发城市
	 * @return
	 */
	public String getIsDCity() {
		return isDCity;
	}
	/**
	 * 是否出发城市
	 * @param isDCity
	 */
	public void setIsDCity(String isDCity) {
		this.isDCity = isDCity;
	}
	/**
	 * 是否到达城市
	 * @return
	 */
	public String getIsACity() {
		return isACity;
	}
	/**
	 * 是否到达城市
	 * @param isACity
	 */
	public void setIsACity(String isACity) {
		this.isACity = isACity;
	}
	/**
	 * 是否送票城市
	 * @return
	 */
	public String getIsTCity() {
		return isTCity;
	}
	/**
	 * 是否送票城市
	 * @param isTCity
	 */
	public void setIsTCity(String isTCity) {
		this.isTCity = isTCity;
	}
	/**
	 * 是否国内城市
	 * @return
	 */
	public String getIsDomesticCity() {
		return isDomesticCity;
	}
	/**
	 * 是否国内城市
	 * @param isDomesticCity
	 */
	public void setIsDomesticCity(String isDomesticCity) {
		this.isDomesticCity = isDomesticCity;
	}
	
	
}
