package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 航空公司信息返回体
 * @author jujian
 *
 */
@XStreamAlias("GetAirlineInfosResponse")
public class GetAirlineInfosResponse implements Serializable {
	//记录数
	@XStreamAlias("RecordCount")
	private Integer recordCount;
    //航空公司信息列表
	@XStreamAlias("AirlineInfosList")
	private List<AirlineInfoEntity> airlineInfosList;
	
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
	 * 航空公司信息列表
	 * @return
	 */
	public List<AirlineInfoEntity> getAirlineInfosList() {
		return airlineInfosList;
	}
	/**
	 * 航空公司信息列表
	 * @param airlineInfosList
	 */
	public void setAirlineInfosList(List<AirlineInfoEntity> airlineInfosList) {
		this.airlineInfosList = airlineInfosList;
	}
	
	
	
}
