package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.math.BigDecimal;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 航班信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("OrderFlight")
public class OrderFlight implements Serializable {
	// 航班
	@XStreamAlias("Flight")
	private String flight;
	// 航空公司代码
	@XStreamAlias("AirlineCode")
	private String airlineCode;
	// 航空公司中文名称
	@XStreamAlias("AirLineName")
	private String airLineName;
	// 出发城市ID
	@XStreamAlias("DCityID")
	private String dCityID;
	// 出发城市代码
	@XStreamAlias("DCityCode")
	private String dCityCode;
	// 出发城市名称
	@XStreamAlias("DCityName")
	private String dCityName;
	// 到达城市ID
	@XStreamAlias("ACityID")
	private String aCityID;
	// 到达城市代码
	@XStreamAlias("ACityCode")
	private String aCityCode;
	// 到达城市名称
	@XStreamAlias("ACityName")
	private String aCityName;
	// 出发机场代码
	@XStreamAlias("DPortCode")
	private String dPortCode;
	// 出发机场名称
	@XStreamAlias("DPortName")
	private String dPortName;
	// 到达机场代码
	@XStreamAlias("APortCode")
	private String aPortCode;
	// 到达机场名称
	@XStreamAlias("APortName")
	private String aPortName;
	// 起飞时间
	@XStreamAlias("TakeOffTime")
	private String takeOffTime;
	// 抵达时间
	@XStreamAlias("ArrivalTime")
	private String arrivalTime;
	// 舱位
	@XStreamAlias("Class")
	private String flightClass;
	// 舱位名称
	@XStreamAlias("ClassName")
	private String className;
	// 乘客年龄类型：ADU（成人）/CHI（儿童）/ BAB（婴儿）
	@XStreamAlias("AgeType")
	private String ageType;
	// 机票更改标识
	@XStreamAlias("NonRer")
	private String nonRer;
	// 机票更改说明
	@XStreamAlias("RerNotes")
	private String rerNotes;
	// 机票退票标识
	@XStreamAlias("NonRef")
	private String nonRef;
	// 机票退票说明
	@XStreamAlias("RefNotes")
	private String refNotes;
	// 机票转签标识
	@XStreamAlias("NonEnd")
	private String nonEnd;
	// 机票转签说明
	@XStreamAlias("EndNotes")
	private String endNotes;
	// 备注
	@XStreamAlias("Remark")
	private String remark;
	// 价格
	@XStreamAlias("Price")
	private BigDecimal price;
	// 扣率
	@XStreamAlias("PriceRate")
	private String priceRate;
	// 机建税
	@XStreamAlias("Tax")
	private String tax;
	// 燃油费
	@XStreamAlias("OilFee")
	private BigDecimal oilFee;
	// 金额
	@XStreamAlias("Amount")
	private BigDecimal amount;
	// 标准价
	@XStreamAlias("StandardPrice")
	private BigDecimal standardPrice;
	// 票种名称
	@XStreamAlias("TicketTypeName")
	private String ticketTypeName;
	// 序号
	@XStreamAlias("Sequence")
	private String sequence;
	// 是否有机场航站楼信息
	@XStreamAlias("HasAirportBuildingInformation")
	private String hasAirportBuildingInformation;
	// 是否有地面程
	@XStreamAlias("IsSurface")
	private String isSurface;
	// 登机时间
	@XStreamAlias("CheckInTime")
	private String checkInTime;
	// 机型，参见静态文件-机型信息
	@XStreamAlias("CraftType")
	private String craftType;
	// 服务费
	@XStreamAlias("ServerFee")
	private BigDecimal serverFee;
	// 出发机场航站楼信息
	@XStreamAlias("departAirport")
	private DepartAirport departAirport;
	
	// 到达机场航站楼信息
	@XStreamAlias("arriveAirport")
	private ArriveAirport arriveAirport;

	/**
	 * 航班
	 * @return
	 */
	public String getFlight() {
		return flight;
	}

	/**
	 * 航班
	 * @param flight
	 */
	public void setFlight(String flight) {
		this.flight = flight;
	}

	/**
	 * 航空公司代码
	 * @return
	 */
	public String getAirlineCode() {
		return airlineCode;
	}

	/**
	 * 航空公司代码
	 * @param airlineCode
	 */
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
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
	 * 出发城市ID
	 * @return
	 */
	public String getDCityID() {
		return dCityID;
	}

	/**
	 * 出发城市ID
	 * @param dCityID
	 */
	public void setDCityID(String dCityID) {
		this.dCityID = dCityID;
	}

	/**
	 * 出发城市代码
	 * @return
	 */
	public String getDCityCode() {
		return dCityCode;
	}

	/**
	 * 出发城市代码
	 * @param dCityCode
	 */
	public void setDCityCode(String dCityCode) {
		this.dCityCode = dCityCode;
	}

	/**
	 * 出发城市名称
	 * @return
	 */
	public String getDCityName() {
		return dCityName;
	}

	/**
	 * 出发城市名称
	 * @param dCityName
	 */
	public void setDCityName(String dCityName) {
		this.dCityName = dCityName;
	}

	/**
	 * 到达城市ID
	 * @return
	 */
	public String getACityID() {
		return aCityID;
	}

	/**
	 * 到达城市ID
	 * @param aCityID
	 */
	public void setACityID(String aCityID) {
		this.aCityID = aCityID;
	}

	/**
	 * 出发城市代码
	 * @return
	 */
	public String getdCityCode() {
		return dCityCode;
	}

	/**
	 * 出发城市代码
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
	 * 到达城市ID
	 * @return
	 */
	public String getaCityID() {
		return aCityID;
	}

	/**
	 * 到达城市ID
	 * @param aCityID
	 */
	public void setaCityID(String aCityID) {
		this.aCityID = aCityID;
	}

	/**
	 * 到达城市代码
	 * @return
	 */
	public String getaCityCode() {
		return aCityCode;
	}

	/**
	 * 到达城市代码
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
	 * 出发机场代码
	 * @return
	 */
	public String getdPortCode() {
		return dPortCode;
	}

	/**
	 * 出发机场代码
	 * @param dPortCode
	 */
	public void setdPortCode(String dPortCode) {
		this.dPortCode = dPortCode;
	}

	/**
	 * 出发机场名称
	 * @return
	 */
	public String getdPortName() {
		return dPortName;
	}

	/**
	 * 出发机场名称
	 * @param dPortName
	 */
	public void setdPortName(String dPortName) {
		this.dPortName = dPortName;
	}

	/**
	 * 到达机场代码
	 * @return
	 */
	public String getaPortCode() {
		return aPortCode;
	}

	/**
	 * 到达机场代码
	 * @param aPortCode
	 */
	public void setaPortCode(String aPortCode) {
		this.aPortCode = aPortCode;
	}

	/**
	 * 到达机场名称
	 * @return
	 */
	public String getaPortName() {
		return aPortName;
	}

	/**
	 * 到达机场名称
	 * @param aPortName
	 */
	public void setaPortName(String aPortName) {
		this.aPortName = aPortName;
	}

	/**
	 * 起飞时间
	 * @return
	 */
	public String getTakeOffTime() {
		return takeOffTime;
	}

	/**
	 * 起飞时间
	 * @param takeOffTime
	 */
	public void setTakeOffTime(String takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	/**
	 * 抵达时间
	 * @return
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * 抵达时间
	 * @param arrivalTime
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * 舱位
	 * @return
	 */
	public String getFlightClass() {
		return flightClass;
	}

	/**
	 * 舱位
	 * @param flightClass
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}

	/**
	 * 舱位名称
	 * @return
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * 舱位名称
	 * @param className
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * 乘客年龄类型：ADU（成人）/CHI（儿童）/ BAB（婴儿）
	 * @return
	 */
	public String getAgeType() {
		return ageType;
	}

	/**
	 * 乘客年龄类型：ADU（成人）/CHI（儿童）/ BAB（婴儿）
	 * @param ageType
	 */
	public void setAgeType(String ageType) {
		this.ageType = ageType;
	}

	/**
	 * 机票更改标识
	 * @return
	 */
	public String getNonRer() {
		return nonRer;
	}

	/**
	 * 机票更改标识
	 * @param nonRer
	 */
	public void setNonRer(String nonRer) {
		this.nonRer = nonRer;
	}

	/**
	 * 机票更改说明
	 * @return
	 */
	public String getRerNotes() {
		return rerNotes;
	}

	/**
	 * 机票更改说明
	 * @param rerNotes
	 */
	public void setRerNotes(String rerNotes) {
		this.rerNotes = rerNotes;
	}

	/**
	 * 机票退票标识
	 * @return
	 */
	public String getNonRef() {
		return nonRef;
	}

	/**
	 * 机票退票标识
	 * @param nonRef
	 */
	public void setNonRef(String nonRef) {
		this.nonRef = nonRef;
	}

	/**
	 * 机票退票说明
	 * @return
	 */
	public String getRefNotes() {
		return refNotes;
	}

	/**
	 * 机票退票说明
	 * @param refNotes
	 */
	public void setRefNotes(String refNotes) {
		this.refNotes = refNotes;
	}

	/**
	 * 机票转签标识
	 * @return
	 */
	public String getNonEnd() {
		return nonEnd;
	}

	/**
	 * 机票转签标识
	 * @param nonEnd
	 */
	public void setNonEnd(String nonEnd) {
		this.nonEnd = nonEnd;
	}

	/**
	 * 机票转签说明
	 * @return
	 */
	public String getEndNotes() {
		return endNotes;
	}

	/**
	 * 机票转签说明
	 * @param endNotes
	 */
	public void setEndNotes(String endNotes) {
		this.endNotes = endNotes;
	}
	
	/**
	 * 备注
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * 备注
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 价格
	 * @return
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 价格
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 扣率
	 * @return
	 */
	public String getPriceRate() {
		return priceRate;
	}

	/**
	 * 扣率
	 * @param priceRate
	 */
	public void setPriceRate(String priceRate) {
		this.priceRate = priceRate;
	}

	/**
	 * 机建税
	 * @return
	 */
	public String getTax() {
		return tax;
	}

	/**
	 * 机建税
	 * @param tax
	 */
	public void setTax(String tax) {
		this.tax = tax;
	}

	/**
	 * 燃油费
	 * @return
	 */
	public BigDecimal getOilFee() {
		return oilFee;
	}

	/**
	 * 燃油费
	 * @param oilFee
	 */
	public void setOilFee(BigDecimal oilFee) {
		this.oilFee = oilFee;
	}

	/**
	 * 金额
	 * @return
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 金额
	 * @param amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * 标准价
	 * @return
	 */
	public BigDecimal getStandardPrice() {
		return standardPrice;
	}

	/**
	 * 标准价
	 * @param standardPrice
	 */
	public void setStandardPrice(BigDecimal standardPrice) {
		this.standardPrice = standardPrice;
	}

	/**
	 * 票种名称
	 * @return
	 */
	public String getTicketTypeName() {
		return ticketTypeName;
	}

	/**
	 * 票种名称
	 * @param ticketTypeName
	 */
	public void setTicketTypeName(String ticketTypeName) {
		this.ticketTypeName = ticketTypeName;
	}

	/**
	 * 序号
	 * @return
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * 序号
	 * @param sequence
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	/**
	 * 是否有机场航站楼信息
	 * @return
	 */
	public String getHasAirportBuildingInformation() {
		return hasAirportBuildingInformation;
	}

	/**
	 * 是否有机场航站楼信息
	 * @param hasAirportBuildingInformation
	 */
	public void setHasAirportBuildingInformation(
			String hasAirportBuildingInformation) {
		this.hasAirportBuildingInformation = hasAirportBuildingInformation;
	}

	/**
	 * 是否有地面程
	 * @return
	 */
	public String getIsSurface() {
		return isSurface;
	}

	/**
	 * 是否有地面程
	 * @param isSurface
	 */
	public void setIsSurface(String isSurface) {
		this.isSurface = isSurface;
	}

	/**
	 * 登机时间
	 * @return
	 */
	public String getCheckInTime() {
		return checkInTime;
	}

	/**
	 * 登机时间
	 * @param checkInTime
	 */
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	/**
	 * 机型，参见静态文件-机型信息
	 * @return
	 */
	public String getCraftType() {
		return craftType;
	}

	/**
	 * 机型，参见静态文件-机型信息
	 * @param craftType
	 */
	public void setCraftType(String craftType) {
		this.craftType = craftType;
	}

	/**
	 * 服务费
	 * @return
	 */
	public BigDecimal getServerFee() {
		return serverFee;
	}

	/**
	 * 服务费
	 * @param serverFee
	 */
	public void setServerFee(BigDecimal serverFee) {
		this.serverFee = serverFee;
	}

	/**
	 * 出发机场航站楼信息
	 * @return
	 */
	public DepartAirport getDepartAirport() {
		return departAirport;
	}

	/**
	 * 出发机场航站楼信息
	 * @param departAirport
	 */
	public void setDepartAirport(DepartAirport departAirport) {
		this.departAirport = departAirport;
	}

	/**
	 * 到达机场航站楼信息
	 * @return
	 */
	public ArriveAirport getArriveAirport() {
		return arriveAirport;
	}

	/**
	 * 到达机场航站楼信息
	 * @param arriveAirport
	 */
	public void setArriveAirport(ArriveAirport arriveAirport) {
		this.arriveAirport = arriveAirport;
	}
}
