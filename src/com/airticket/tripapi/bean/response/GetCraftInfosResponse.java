package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 机型信息返回体
 * @author jujian
 *
 */
@XStreamAlias("GetCraftInfosResponse")
public class GetCraftInfosResponse implements Serializable {
	//记录数
	@XStreamAlias("RecordCount")
	private Integer recordCount;
	//飞机信息列表
	@XStreamAlias("CraftInfosList")
	private List<CraftInfoEntity> craftInfosList;
	
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
	 * 飞机信息列表
	 * @return
	 */
	public List<CraftInfoEntity> getCraftInfosList() {
		return craftInfosList;
	}
	/**
	 * 飞机信息列表
	 * @param craftInfosList
	 */
	public void setCraftInfosList(List<CraftInfoEntity> craftInfosList) {
		this.craftInfosList = craftInfosList;
	}
	
	
}
