package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 航空路线
 * @author jujian
 *
 */
@XStreamAlias("FlightRoute")
public class FlightRoute {
	//出发城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	@XStreamAlias("DepartCity")
	private String departCity;
	//达到城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	@XStreamAlias("ArriveCity")
	private String arriveCity;
	//出发日期：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	@XStreamAlias("DepartDate")
	private String departDate;
	//航空公司二字码
	@XStreamAlias("AirlineDibitCode")
	private String airlineDibitCode;
	//出发机场三字码 上海：SHA 或 PVG
	@XStreamAlias("DepartPort")
	private String departPort;
	//到达机场三字码 北京：PEK 或 NAY
	@XStreamAlias("ArrivePort")
	private String arrivePort;
	//最早起飞时间 2013-05-20T08:00:00
	@XStreamAlias("EarliestDepartTime")
	private String earliestDepartTime;
	//最晚起飞时间 2013-05-20T12:00:00
	@XStreamAlias("LatestDepartTime")
	private String latestDepartTime;
	
	/**
	 * 出发城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	 * @return
	 */
	public String getDepartCity() {
		return departCity;
	}
	/**
	 * 出发城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	 * @param departCity
	 */
	public void setDepartCity(String departCity) {
		this.departCity = departCity;
	}
	/**
	 * 达到城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	 * @return
	 */
	public String getArriveCity() {
		return arriveCity;
	}
	/**
	 * 达到城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	 * @param arriveCity
	 */
	public void setArriveCity(String arriveCity) {
		this.arriveCity = arriveCity;
	}
	/**
	 * 出发日期：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	 * @return
	 */
	public String getDepartDate() {
		return departDate;
	}
	/**
	 * 出发日期：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	 * @param departDate
	 */
	public void setDepartDate(String departDate) {
		this.departDate = departDate;
	}
	/**
	 * 航空公司二字码
	 * @return
	 */
	public String getAirlineDibitCode() {
		return airlineDibitCode;
	}
	/**
	 * 航空公司二字码
	 * @param airlineDibitCode
	 */
	public void setAirlineDibitCode(String airlineDibitCode) {
		this.airlineDibitCode = airlineDibitCode;
	}
	/**
	 * 出发机场三字码 上海：SHA 或 PVG
	 * @return
	 */
	public String getDepartPort() {
		return departPort;
	}
	/**
	 * 出发机场三字码 上海：SHA 或 PVG
	 * @param departPort
	 */
	public void setDepartPort(String departPort) {
		this.departPort = departPort;
	}
	/**
	 * 到达机场三字码 北京：PEK 或 NAY
	 * @return
	 */
	public String getArrivePort() {
		return arrivePort;
	}
	/**
	 * 到达机场三字码 北京：PEK 或 NAY
	 * @param arrivePort
	 */
	public void setArrivePort(String arrivePort) {
		this.arrivePort = arrivePort;
	}
	/**
	 * 最早起飞时间 2013-05-20T08:00:00
	 * @return
	 */
	public String getEarliestDepartTime() {
		return earliestDepartTime;
	}
	/**
	 * 最早起飞时间 2013-05-20T08:00:00
	 * @param earliestDepartTime
	 */
	public void setEarliestDepartTime(String earliestDepartTime) {
		this.earliestDepartTime = earliestDepartTime;
	}
	/**
	 * 最晚起飞时间 2013-05-20T12:00:00
	 * @return
	 */
	public String getLatestDepartTime() {
		return latestDepartTime;
	}
	/**
	 * 最晚起飞时间 2013-05-20T12:00:00
	 * @param latestDepartTime
	 */
	public void setLatestDepartTime(String latestDepartTime) {
		this.latestDepartTime = latestDepartTime;
	}
	
}
