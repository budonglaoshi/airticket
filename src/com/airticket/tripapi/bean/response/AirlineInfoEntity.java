package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * 航空 公司信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("AirlineInfoEntity")
public class AirlineInfoEntity implements Serializable {
	
	@XStreamOmitField
	private static final long serialVersionUID = 1L;
	// 航空公司二字码
	@XStreamAlias("AirLine")
	private String airLine;
	// 航空公司代码
	@XStreamAlias("AirLineCode")
	private String airLineCode;
	// 航空公司中文名称
	@XStreamAlias("AirLineName")
	private String airLineName;
	// 航空公司英文名称
	@XStreamAlias("AirLineEName")
	private String airLineEName;
	// 航空公司简称
	@XStreamAlias("ShortName")
	private String shortName;
	// 所属航空集团ID号
	@XStreamAlias("GroupId")
	private String groupId;
	// 所属航空集团名称
	@XStreamAlias("GroupName")
	private String groupName;
	// 航班退改签政策适用的严格类型：NOR，SPC，HGH
	@XStreamAlias("StrictType")
	private String strictType;
	// 国内段是否启用价格保护，即是否要求联程的总价不低于国内段航线经济舱全票价之和
	@XStreamAlias("AddonPriceProtected")
	private String addonPriceProtected;
	// 是否支持AirPlus
	@XStreamAlias("IsSupportAirPlus")
	private String isSupportAirPlus;
	// Online值机URL
	@XStreamAlias("OnlineCheckinUrl")
	private String onlineCheckinUrl;
	
	/**
	 * 航空公司二字码
	 * @return
	 */
	public String getAirLine() {
		return airLine;
	}
	/**
	 * 航空公司二字码
	 * @param airLine
	 */
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
	/**
	 * 航空公司代码
	 * @return
	 */
	public String getAirLineCode() {
		return airLineCode;
	}
	/**
	 * 航空公司代码
	 * @param airLineCode
	 */
	public void setAirLineCode(String airLineCode) {
		this.airLineCode = airLineCode;
	}
	/**
	 * 航空公司中文名称
	 * @return
	 */
	public String getAirLineName() {
		return airLineName;
	}
	/**
	 * 航空公司中文名称
	 * @param airLineName
	 */
	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}
	/**
	 * 航空公司英文名称
	 * @return
	 */
	public String getAirLineEName() {
		return airLineEName;
	}
	/**
	 * 航空公司英文名称
	 * @param airLineEName
	 */
	public void setAirLineEName(String airLineEName) {
		this.airLineEName = airLineEName;
	}
	/**
	 * 航空公司简称
	 * @return
	 */
	public String getShortName() {
		return shortName;
	}
	/**
	 * 航空公司简称
	 * @param shortName
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	/**
	 * 所属航空集团ID号
	 * @return
	 */
	public String getGroupId() {
		return groupId;
	}
	/**
	 * 所属航空集团ID号
	 * @param groupId
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	/**
	 * 所属航空集团名称
	 * @return
	 */
	public String getGroupName() {
		return groupName;
	}
	/**
	 * 所属航空集团名称
	 * @param groupName
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * 航班退改签政策适用的严格类型：NOR，SPC，HGH
	 * @return
	 */
	public String getStrictType() {
		return strictType;
	}
	/**
	 * 航班退改签政策适用的严格类型：NOR，SPC，HGH
	 * @param strictType
	 */
	public void setStrictType(String strictType) {
		this.strictType = strictType;
	}
	/**
	 * 国内段是否启用价格保护，即是否要求联程的总价不低于国内段航线经济舱全票价之和
	 * @return
	 */
	public String getAddonPriceProtected() {
		return addonPriceProtected;
	}
	/**
	 * 国内段是否启用价格保护，即是否要求联程的总价不低于国内段航线经济舱全票价之和
	 * @param addonPriceProtected
	 */
	public void setAddonPriceProtected(String addonPriceProtected) {
		this.addonPriceProtected = addonPriceProtected;
	}
	/**
	 * 是否支持AirPlus
	 * @return
	 */
	public String getIsSupportAirPlus() {
		return isSupportAirPlus;
	}
	/**
	 * 是否支持AirPlus
	 * @param isSupportAirPlus
	 */
	public void setIsSupportAirPlus(String isSupportAirPlus) {
		this.isSupportAirPlus = isSupportAirPlus;
	}
	/**
	 * Online值机URL
	 * @return
	 */
	public String getOnlineCheckinUrl() {
		return onlineCheckinUrl;
	}
	/**
	 * Online值机URL
	 * @param onlineCheckinUrl
	 */
	public void setOnlineCheckinUrl(String onlineCheckinUrl) {
		this.onlineCheckinUrl = onlineCheckinUrl;
	}
	
	
}
