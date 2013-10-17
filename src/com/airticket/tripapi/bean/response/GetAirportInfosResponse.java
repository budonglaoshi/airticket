package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 机场查询返回体
 * @author jujian
 *
 */
@XStreamAlias("GetAirportInfosResponse")
public class GetAirportInfosResponse implements Serializable {
	//记录数
	@XStreamAlias("RecordCount")
	private Integer recordCount;
	
	//机场信息列表
	@XStreamAlias("AirportInfosList")
	private List<AirportInfoEntity> airportInfosList;

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
	 * 机场信息列表
	 * @return
	 */
	public List<AirportInfoEntity> getAirportInfosList() {
		return airportInfosList;
	}

	/**
	 * 机场信息列表
	 * @param airportInfosList
	 */
	public void setAirportInfosList(List<AirportInfoEntity> airportInfosList) {
		this.airportInfosList = airportInfosList;
	}
	

}
