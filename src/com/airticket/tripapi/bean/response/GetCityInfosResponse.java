package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 城市查询返回体
 * @author jujian
 *
 */
@XStreamAlias("GetCityInfosResponse")
public class GetCityInfosResponse implements Serializable {
	//记录数
	@XStreamAlias("RecordCount")
	private Integer recordCount;
	
	//城市信息列表
	@XStreamAlias("CityInfosList")
	private List<CityInfoEntity> cityInfosList;

	/**
	 * 记录数
	 * @return
	 */
	public Integer getRecordCount() {
		return recordCount;
	}

	/**
	 * 记录数
	 * @param recordCount
	 */
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	/**
	 * 城市信息列表
	 * @return
	 */
	public List<CityInfoEntity> getCityInfosList() {
		return cityInfosList;
	}

	/**
	 * 城市信息列表
	 * @param cityInfosList
	 */
	public void setCityInfosList(List<CityInfoEntity> cityInfosList) {
		this.cityInfosList = cityInfosList;
	}

	
}
