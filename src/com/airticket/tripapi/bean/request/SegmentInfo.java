package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 航段信息
 * @author jujian
 *
 */
@XStreamAlias("SegmentInfo")
public class SegmentInfo {
	//出发城市码：string类型；必填
	@XStreamAlias("DCode")
	private String dCode;
	//到达城市码：string类型；必填
	@XStreamAlias("ACode")
	private String aCode; 
	//出发机场：string类型；可空
	@XStreamAlias("DAirport")
	private String dAirport="";
	//达到机场：string类型；可空
	@XStreamAlias("AAirport")
	private String aAirport="";
	//出发日期：DateTime类型；必填；格式2012-05-25T00:00:00
	@XStreamAlias("DDate")
	private String dDate;
	//起飞时间段：string类型；必填；目前必须为All，暂不用格式0000-2400
	@XStreamAlias("TimePeriod")
	private String timePeriod="All";
	
	/**
	 * 出发城市码：string类型；必填
	 * @return
	 */
	public String getdCode() {
		return dCode;
	}
	/**
	 * 出发城市码：string类型；必填
	 * @param dCode
	 */
	public void setdCode(String dCode) {
		this.dCode = dCode;
	}
	/**
	 * 到达城市码：string类型；必填
	 * @return
	 */
	public String getaCode() {
		return aCode;
	}
	/**
	 * 到达城市码：string类型；必填
	 * @param aCode
	 */
	public void setaCode(String aCode) {
		this.aCode = aCode;
	}
	/**
	 * 出发机场：string类型；可空
	 * @return
	 */
	public String getdAirport() {
		return dAirport;
	}
	/**
	 * 出发机场：string类型；可空
	 * @param dAirport
	 */
	public void setdAirport(String dAirport) {
		this.dAirport = dAirport;
	}
	/**
	 * 达到机场：string类型；可空
	 * @return
	 */
	public String getaAirport() {
		return aAirport;
	}
	/**
	 * 达到机场：string类型；可空
	 * @param aAirport
	 */
	public void setaAirport(String aAirport) {
		this.aAirport = aAirport;
	}
	/**
	 * 出发日期：DateTime类型；必填；格式2012-05-25T00:00:00
	 * @return
	 */
	public String getdDate() {
		return dDate;
	}
	/**
	 * 出发日期：DateTime类型；必填；格式2012-05-25T00:00:00
	 * @param dDate
	 */
	public void setdDate(String dDate) {
		this.dDate = dDate;
	}
	/**
	 * 起飞时间段：string类型；必填；目前必须为All，暂不用格式0000-2400
	 * @return
	 */
	public String getTimePeriod() {
		return timePeriod;
	}
	/**
	 * 起飞时间段：string类型；必填；目前必须为All，暂不用格式0000-2400
	 * @param timePeriod
	 */
	public void setTimePeriod(String timePeriod) {
		this.timePeriod = timePeriod;
	}
}
