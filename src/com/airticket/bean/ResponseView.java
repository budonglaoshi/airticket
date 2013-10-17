package com.airticket.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.airticket.listener.loaderdata.AirlineInfoEntity;
import com.airticket.listener.loaderdata.AirportInfoEntity;
import com.airticket.listener.loaderdata.CityDetail;
import com.airticket.listener.loaderdata.CraftInfoEntity;

/**
 * 返回页面数据
 * @author Administrator
 *
 */
public class ResponseView implements Serializable{
	
	//航空公司信息
	private AirlineInfoEntity airlineInfo;
	
	//出发机场信息
	private AirportInfoEntity depAirportInfo;
	//达到机场信息
	private AirportInfoEntity arrAirportInfo;
	
	//出发城市信息
	private CityDetail depCityDetail;
	//达到城市信息
	private CityDetail arrCityDetail;
	
	//飞机信息
	private CraftInfoEntity craftInfo;
	
	
	
	//符合条件的航班数量
	private Integer recordCount;
	//最低价(根据是否为最低价 和 航班票价 取值)
	private BigDecimal lowerPrice;
	//票价
	private BigDecimal price;
	// 起飞时间：yyyy-MM-ddThh:mm:ss
	private Date takeOffTime;
	// 抵达时间：yyyy-MM-ddThh:mm:ss
	private Date arriveTime;
	//飞行时间
	private Double flyTime;
	// 航班号
	private String flightNo;
	// 机型
	private String carftType;
	// 航空公司代码
	private String airLineCode;
	// 出发机场三字码
	private String departCityCode;
	// 到达机场三字码
	private String arriveCityCode;
	//餐食类型
	private String mealType;
	//出发机场名称（ 出发机场航站楼ID 查询）
	private String depaerAPortName;
	//到达机场名称（到达机场航站楼ID 查询）
	private String arriveAPortName;
	// 航班扣率
	private String rate;
	// 舱位等级：对应航班查询结果的FlightClass 字段
	private String flightClass;
	
	// 舱位等级中文名字
	private String flightClassName;
	
	// 剩余票量Int32 中文、英文 的显示取决于请求Header 节Culture 值
	private Integer quantity;
	
	// 标准价
	private BigDecimal standardPrice;
	// 儿童标准价
	private BigDecimal childStandardPrice;
	// 婴儿标准价
	private BigDecimal babyStandardPrice;
	
	/**
	 * 获取符合条件的航班数量
	 * @return
	 */
	public Integer getRecordCount() {
		return recordCount;
	}
	/**
	 * 设置符合条件的航班数量
	 * @param recordCount
	 */
	public void setRecordCount(Integer recordCount) {
		this.recordCount = recordCount;
	}
	/**
	 * 最低价(根据是否为最低价 和 航班票价 取值)
	 * @return
	 */
	public BigDecimal getLowerPrice() {
		return lowerPrice;
	}
	/**
	 * 最低价(根据是否为最低价 和 航班票价 取值)
	 * @param lowerPrice
	 */
	public void setLowerPrice(BigDecimal lowerPrice) {
		this.lowerPrice = lowerPrice;
	}
	/**
	 * 票价
	 * @return
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 票价
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 起飞时间：yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public Date getTakeOffTime() {
		return takeOffTime;
	}
	/**
	 * 起飞时间：yyyy-MM-ddThh:mm:ss
	 * @param takeOffTime
	 */
	public void setTakeOffTime(Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
	/**
	 * 抵达时间：yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public Date getArriveTime() {
		return arriveTime;
	}
	/**
	 *  抵达时间：yyyy-MM-ddThh:mm:ss
	 * @param arriveTime
	 */
	public void setArriveTime(Date arriveTime) {
		this.arriveTime = arriveTime;
	}
	/**
	 *  设置飞行时间
	 * @return
	 */
	public Double getFlyTime() {
		return flyTime;
	}
	/**
	 * 设置飞行时间
	 * @param flyTime 飞行时间
	 */
	public void setFlyTime(Double flyTime) {
		this.flyTime = flyTime;
	}
	/**
	 * 航班号
	 * @return
	 */
	public String getFlightNo() {
		return flightNo;
	}
	/**
	 *  航班号
	 * @param flightNo
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	
	/**
	 * 机型
	 * @return
	 */
	public String getCarftType() {
		return carftType;
	}
	/**
	 *  机型
	 * @param carftType
	 */
	public void setCarftType(String carftType) {
		this.carftType = carftType;
	}
	/**
	 *  航空公司代码
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
	 * 出发机场三字码
	 * @return
	 */
	public String getDepartCityCode() {
		return departCityCode;
	}
	/**
	 * 出发机场三字码
	 * @param departCityCode
	 */
	public void setDepartCityCode(String departCityCode) {
		this.departCityCode = departCityCode;
	}
	/**
	 * 到达机场三字码
	 * @return
	 */
	public String getArriveCityCode() {
		return arriveCityCode;
	}
	/**
	 * 到达机场三字码
	 * @param arriveCityCode
	 */
	public void setArriveCityCode(String arriveCityCode) {
		this.arriveCityCode = arriveCityCode;
	}
	/**
	 * 餐食类型
	 * @return
	 */
	public String getMealType() {
		return mealType;
	}
	/**
	 * 餐食类型
	 * @param mealType
	 */
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	
	/**
	 * 出发机场名称（ 出发机场航站楼ID 查询）
	 * @return
	 */
	public String getDepaerAPortName() {
		return depaerAPortName;
	}
	/**
	 * 出发机场名称（ 出发机场航站楼ID 查询）
	 * @param depaerAPortName
	 */
	public void setDepaerAPortName(String depaerAPortName) {
		this.depaerAPortName = depaerAPortName;
	}
	/**
	 * 到达机场名称（到达机场航站楼ID 查询）
	 * @return
	 */
	public String getArriveAPortName() {
		return arriveAPortName;
	}
	/**
	 * 到达机场名称（到达机场航站楼ID 查询）
	 * @param arriveAPortName
	 */
	public void setArriveAPortName(String arriveAPortName) {
		this.arriveAPortName = arriveAPortName;
	}
	/**
	 * 航班扣率
	 * @return
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * 航班扣率
	 * @param rate
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	/**
	 * 舱位等级：对应航班查询结果的FlightClass 字段
	 * @return
	 */
	public String getFlightClass() {
		return flightClass;
	}
	
	/**
	 * 舱位等级：对应航班查询结果的FlightClass 字段
	 * @param flightClass
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	/**
	 * 剩余票量Int32 中文、英文 的显示取决于请求Header 节Culture 值
	 * @return
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 剩余票量Int32 中文、英文 的显示取决于请求Header 节Culture 值
	 * @param quantity
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * 航空公司信息
	 * @return
	 */
	public AirlineInfoEntity getAirlineInfo() {
		return airlineInfo;
	}
	/**
	 * 航空公司信息
	 * @return
	 */
	public void setAirlineInfo(AirlineInfoEntity airlineInfo) {
		this.airlineInfo = airlineInfo;
	}
	/**
	 * 飞机信息
	 * @return
	 */
	public CraftInfoEntity getCraftInfo() {
		return craftInfo;
	}
	/**
	 * 飞机信息
	 * @return
	 */
	public void setCraftInfo(CraftInfoEntity craftInfo) {
		this.craftInfo = craftInfo;
	}
	/**
	 * 出发机场信息
	 * @return
	 */
	public AirportInfoEntity getDepAirportInfo() {
		return depAirportInfo;
	}
	/**
	 * 出发机场信息
	 * @return
	 */
	public void setDepAirportInfo(AirportInfoEntity depAirportInfo) {
		this.depAirportInfo = depAirportInfo;
	}
	/**
	 * 达到机场信息
	 * @return
	 */
	public AirportInfoEntity getArrAirportInfo() {
		return arrAirportInfo;
	}
	/**
	 * 达到机场信息
	 * @return
	 */
	public void setArrAirportInfo(AirportInfoEntity arrAirportInfo) {
		this.arrAirportInfo = arrAirportInfo;
	}
	/**
	 * 出发城市信息
	 * @return
	 */
	public CityDetail getDepCityDetail() {
		return depCityDetail;
	}
	/**
	 * 出发城市信息
	 * @param depCityDetail
	 */
	public void setDepCityDetail(CityDetail depCityDetail) {
		this.depCityDetail = depCityDetail;
	}
	/**
	 * 达到城市信息
	 * @return
	 */
	public CityDetail getArrCityDetail() {
		return arrCityDetail;
	}
	/**
	 * 到达城市信息
	 * @param arrCityDetail
	 */
	public void setArrCityDetail(CityDetail arrCityDetail) {
		this.arrCityDetail = arrCityDetail;
	}

	public String getFlightClassName() {
		return flightClassName;
	}
	public void setFlightClassName(String flightClassName) {
		this.flightClassName = flightClassName;
	}
	public BigDecimal getStandardPrice() {
		return standardPrice;
	}
	public void setStandardPrice(BigDecimal standardPrice) {
		this.standardPrice = standardPrice;
	}
	public BigDecimal getChildStandardPrice() {
		return childStandardPrice;
	}
	public void setChildStandardPrice(BigDecimal childStandardPrice) {
		this.childStandardPrice = childStandardPrice;
	}
	public BigDecimal getBabyStandardPrice() {
		return babyStandardPrice;
	}
	public void setBabyStandardPrice(BigDecimal babyStandardPrice) {
		this.babyStandardPrice = babyStandardPrice;
	}
	
}
