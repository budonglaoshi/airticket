package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * 航程列表信息
 * @author jujian
 *
 */
@XStreamAlias("DomesticFlightRoute")
public class DomesticFlightRoute implements Serializable {
	//符合条件的航班数量
	@XStreamAlias("RecordCount")
	private Integer recordCount;
	//排序条件
	@XStreamAlias("OrderBy")
	private String orderBy;
	//排序顺序
	@XStreamAlias("Direction")
	private String direction;
	
	//航程列表
	@XStreamAlias("FlightsList")
	private List<DomesticFlightData> flightsList;

	/**
	 * 符合条件的航班数量
	 * @return
	 */
	public Integer getRecordCount() {
		return recordCount;
	}

	/**
	 * 符合条件的航班数量
	 * @param recordCount
	 */
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}

	/**
	 * 排序条件
	 * @return
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * 排序条件
	 * @param orderBy
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	/**
	 * 排序顺序
	 * @return
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * 排序顺序
	 * @param direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * 航程列表
	 * @return
	 */
	public List<DomesticFlightData> getFlightsList() {
		return flightsList;
	}

	/**
	 * 航程列表
	 * @param flightsList
	 */
	public void setFlightsList(List<DomesticFlightData> flightsList) {
		this.flightsList = flightsList;
	}
}
