package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 机型信息查询
 * @author jujian
 *
 */
@XStreamAlias("GetCraftInfosRequest")
public class GetCraftInfosRequest {
	//机型代码：string类型；可空；当为空时查询全部信息
	@XStreamAlias("CraftType")
	private String craftType="";

	/**
	 * 机型代码：string类型；可空；当为空时查询全部信息
	 * @return
	 */
	public String getCraftType() {
		return craftType;
	}

	/**
	 * 机型代码：string类型；可空；当为空时查询全部信息
	 * @param craftType
	 */
	public void setCraftType(String craftType) {
		this.craftType = craftType;
	}

	

}
