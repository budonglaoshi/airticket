package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 航班信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("OrderListFlight")
public class OrderListFlight implements Serializable{
	// 航班号
	@XStreamAlias("Flight")
	private String flight;
	// 出发城市三字码，如北京：BJS,上海：SHA
	@XStreamAlias("DCityCode")
	private String dCityCode;
	// 出发城市名称
	@XStreamAlias("DCityName")
	private String dCityName;
	// 出发机场三字码，如上海：SHA 或 PVG
	@XStreamAlias("DPortCode")
	private String dPortCode;
	// 到达城市三字码，如北京：BJS,上海：SHA
	@XStreamAlias("ACityCode")
	private String aCityCode;
	// 到达城市名称
	@XStreamAlias("ACityName")
	private String aCityName;
	// 到达机场三字码，如北京：PEK 或 NAY
	@XStreamAlias("APortCode")
	private String aPortCode;
	// 起飞时间，格式yyyy-MM-ddThh:mm:ss
	@XStreamAlias("TakeOffTime")
	private String takeOffTime;
	// 到达时间，格式yyyy-MM-ddThh:mm:ss
	@XStreamAlias("ArrivalTime")
	private String arrivalTime;
	// 航程索引
	@XStreamAlias("Sequence")
	private String sequence;
	
	/**
	 * 航班号
	 * @return
	 */
	public String getFlight() {
		return flight;
	}
	/**
	 * 航班号
	 * @param flight
	 */
	public void setFlight(String flight) {
		this.flight = flight;
	}
	/**
	 * 出发城市三字码，如北京：BJS,上海：SHA
	 * @return
	 */
	public String getdCityCode() {
		return dCityCode;
	}
	/**
	 * 出发城市三字码，如北京：BJS,上海：SHA
	 * @param dCityCode
	 */
	public void setdCityCode(String dCityCode) {
		this.dCityCode = dCityCode;
	}
	/**
	 * 出发城市名称
	 * @return
	 */
	public String getdCityName() {
		return dCityName;
	}
	/**
	 * 出发城市名称
	 * @param dCityName
	 */
	public void setdCityName(String dCityName) {
		this.dCityName = dCityName;
	}
	/**
	 * 出发机场三字码，如上海：SHA 或 PVGs
	 * @return
	 */
	public String getdPortCode() {
		return dPortCode;
	}
	/**
	 * 出发机场三字码，如上海：SHA 或 PVG
	 * @param dPortCode
	 */
	public void setdPortCode(String dPortCode) {
		this.dPortCode = dPortCode;
	}
	/**
	 * 到达城市三字码，如北京：BJS,上海：SHA
	 * @return
	 */
	public String getaCityCode() {
		return aCityCode;
	}
	/**
	 * 到达城市三字码，如北京：BJS,上海：SHA
	 * @param aCityCode
	 */
	public void setaCityCode(String aCityCode) {
		this.aCityCode = aCityCode;
	}
	/**
	 * 到达城市名称
	 * @return
	 */
	public String getaCityName() {
		return aCityName;
	}
	/**
	 * 到达城市名称
	 * @param aCityName
	 */
	public void setaCityName(String aCityName) {
		this.aCityName = aCityName;
	}
	/**
	 * 到达机场三字码，如北京：PEK 或 NAY
	 * @return
	 */
	public String getaPortCode() {
		return aPortCode;
	}
	/**
	 * 到达机场三字码，如北京：PEK 或 NAY
	 * @param aPortCode
	 */
	public void setaPortCode(String aPortCode) {
		this.aPortCode = aPortCode;
	}
	/**
	 * 起飞时间，格式yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public String getTakeOffTime() {
		return takeOffTime;
	}
	/**
	 * 起飞时间，格式yyyy-MM-ddThh:mm:ss
	 * @param takeOffTime
	 */
	public void setTakeOffTime(String takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
	/**
	 * 到达时间，格式yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * 到达时间，格式yyyy-MM-ddThh:mm:ss
	 * @param arrivalTime
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * 航程索引
	 * @return
	 */
	public String getSequence() {
		return sequence;
	}
	/**
	 * 航程索引
	 * @param sequence
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
}
