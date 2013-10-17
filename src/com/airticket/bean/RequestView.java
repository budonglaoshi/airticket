package com.airticket.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 发送页面数据
 * @author Administrator
 *
 */
@SuppressWarnings("serial")
public class RequestView implements Serializable {
	
	//出发城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	private String departCity;
	//达到城市：目前仅支持城市三字码 如北京：BJS,上海：SHA
	private String arriveCity;
	//航程类型S(单程)D(往返程)M(联程)
	private String searchType;
	//出发日期：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	private Date departDate;
	//返程时间：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	private Date returnDate;
	
	//最早起飞时间 2013-05-20T08:00:00
	private Date earliesDeaprtTime;
	//最晚起飞时间 2013-05-20T12:00:00
	private Date lastDepartTime;
	
	//航空公司二字码
	private String[] airlineDibitCode;
	//出发机场三字码 上海：SHA 或 PVG
	private String departPort;
	//到达机场三字码 北京：PEK 或 NAY
	private String arrivePort;
	//往返查询状态 ：0查询去程，1查询返程
	private Integer status=0;
	//是否为菜单提交
	private Boolean menuSubmit;
	//
	private String orderBy="Price";
	
	
	//查询航班号
	private String flightNo;
	//查询具体航班价格
	private BigDecimal price;
	//舱位等级
	private String flightClass;
	//航班起飞时间
	private String takeOffTime;
	
	
	//getter and setter
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
	 * 航程类型S(单程)D(往返程)M(联程)
	 * @return
	 */
	public String getSearchType() {
		return searchType;
	}
	/**
	 * 航程类型S(单程)D(往返程)M(联程)
	 * @param searchType
	 */
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	/**
	 * 出发日期：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	 * @return
	 */
	public Date getDepartDate() {
		return departDate;
	}
	/**
	 * 出发日期：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	 * @param departDate
	 */
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	/**
	 * 返程时间：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	 * @return
	 */
	public Date getReturnDate() {
		return returnDate;
	}
	/**
	 * 返程时间：yyyy-MM-dd （或yyyy-MM-ddThh:mm:ss）格式日期
	 * @param returnDate
	 */
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	/**
	 * 最早起飞时间 2013-05-20T08:00:00
	 * @return
	 */
	public Date getEarliesDeaprtTime() {
		return earliesDeaprtTime;
	}
	/**
	 * 最早起飞时间 2013-05-20T08:00:00
	 * @param earliesDeaprtTime
	 */
	public void setEarliesDeaprtTime(Date earliesDeaprtTime) {
		this.earliesDeaprtTime = earliesDeaprtTime;
	}
	/**
	 * 最晚起飞时间 2013-05-20T12:00:00
	 * @return
	 */
	public Date getLastDepartTime() {
		return lastDepartTime;
	}
	/**
	 * 最晚起飞时间 2013-05-20T12:00:00
	 * @param lastDepartTime
	 */
	public void setLastDepartTime(Date lastDepartTime) {
		this.lastDepartTime = lastDepartTime;
	}
	/**
	 * 航空公司二字码
	 * @return
	 */
	public String[] getAirlineDibitCode() {
		return airlineDibitCode;
	}
	/**
	 * 航空公司二字码
	 * @param airlineDibitCode
	 */
	public void setAirlineDibitCode(String[] airlineDibitCode) {
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
	 * 返查询状态 ：0查询去程，1查询返程
	 * @return
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 返查询状态 ：0查询去程，1查询返程
	 * @param status
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	/**
	 * 是否为菜单提交
	 * @return
	 */
	public Boolean getMenuSubmit() {
		return menuSubmit;
	}
	
	/**
	 *  是否为菜单提交
	 * @param menuSubmit
	 */
	public void setMenuSubmit(Boolean menuSubmit) {
		this.menuSubmit = menuSubmit;
	}
	
	
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getFlightClass() {
		return flightClass;
	}
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	public String getTakeOffTime() {
		return takeOffTime;
	}
	public void setTakeOffTime(String takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
}
