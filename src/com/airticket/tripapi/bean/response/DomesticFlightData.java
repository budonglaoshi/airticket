package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 航程信息
 * 
 * @author jujian
 * 
 */
@XStreamAlias("DomesticFlightData")
public class DomesticFlightData implements Serializable {
	// 出发机场三字码
	@XStreamAlias("DepartCityCode")
	private String departCityCode;
	// 到达机场三字码
	@XStreamAlias("ArriveCityCode")
	private String arriveCityCode;
	// 起飞时间：yyyy-MM-ddThh:mm:ss
	@XStreamAlias("TakeOffTime")
	private String takeOffTime;
	// 抵达时间：yyyy-MM-ddThh:mm:ss
	@XStreamAlias("ArriveTime")
	private String arriveTime;
	// 航班号
	@XStreamAlias("Flight")
	private String flight;
	// 机型
	@XStreamAlias("CraftType")
	private String craftType;
	// 航空公司代码
	@XStreamAlias("AirlineCode")
	private String airlineCode;
	// 舱位等级：对应航班查询结果的FlightClass 字段
	@XStreamAlias("Class")
	private String flightClass;
	// 子舱位
	@XStreamAlias("SubClass")
	private String subClass;
	// 显示用舱位
	@XStreamAlias("DisplaySubclass")
	private String displaySubclass;
	// 航班扣率
	@XStreamAlias("Rate")
	private String rate;
	// 航班票价
	@XStreamAlias("Price")
	private BigDecimal price;
	// 标准价
	@XStreamAlias("StandardPrice")
	private BigDecimal standardPrice;
	// 儿童标准价
	@XStreamAlias("ChildStandardPrice")
	private BigDecimal childStandardPrice;
	// 婴儿标准价
	@XStreamAlias("BabyStandardPrice")
	private BigDecimal babyStandardPrice;
	// 餐食类型
	@XStreamAlias("MealType")
	private String mealType;
	// 成人税
	@XStreamAlias("AdultTax")
	private String adultTax;
	// 婴儿税
	@XStreamAlias("BabyTax")
	private String babyTax;
	// 儿童税
	@XStreamAlias("ChildTax")
	private String childTax;
	// 成人燃油费用
	@XStreamAlias("AdultOilFee")
	private BigDecimal adultOilFee;
	// 婴儿燃油费用
	@XStreamAlias("BabyOilFee")
	private BigDecimal babyOilFee;
	// 儿童燃油费用
	@XStreamAlias("ChildOilFee")
	private BigDecimal childOilFee;
	// 出发机场代码
	@XStreamAlias("DPortCode")
	private String dPortCode;
	// 抵达机场代码
	@XStreamAlias("APortCode")
	private String aPortCode;
	// 出发机场航站楼ID
	@XStreamAlias("DPortBuildingID")
	private String dPortBuildingID;
	// 到达机场航站楼ID
	@XStreamAlias("APortBuildingID")
	private String aPortBuildingID;
	// 经停次数
	@XStreamAlias("StopTimes")
	private Integer stopTimes;
	// 更标示
	@XStreamAlias("Nonrer")
	private String nonrer;
	// 转签标示
	@XStreamAlias("Nonend")
	private String nonend;
	// 退票标示
	@XStreamAlias("Nonref")
	private String nonref;
	// 更改说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	@XStreamAlias("Rernote")
	private String rernote;
	// 转签说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	@XStreamAlias("Endnote")
	private String endnote;
	// 退票说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	@XStreamAlias("Refnote")
	private String refnote;
	// 备注 （中文或英文）中文、英文 的显示取决于请求Header 节Culture 值
	@XStreamAlias("Remarks")
	private String remarks;
	// 票种,中文、英文 的显示取决于请求Header 节Culture 值
	@XStreamAlias("TicketType")
	private String ticketType;
	// 提前预定天数
	@XStreamAlias("BeforeFlyDate")
	private Integer beforeFlyDate;
	// 剩余票量Int32 中文、英文 的显示取决于请求Header 节Culture 值
	@XStreamAlias("Quantity")
	private Integer quantity;
	// 价格类型 NormalPrice ：普通,SingleTripPrice：提前预售特价,CZSpecialPrice：南航特价
	@XStreamAlias("PriceType")
	private String priceType;
	// 机票产品类型:Normal,YOUNGMAN,OLDMAN
	@XStreamAlias("ProductType")
	private String productType;
	// 机票产品来源:1携程机票频道,2共享平台,3两者共有,4直连产品
	@XStreamAlias("ProductSource")
	private String productSource;
	// 库存类型:FIX：定额 FAV：见舱
	@XStreamAlias("InventoryType")
	private String inventoryType;
	// 航程索引
	@XStreamAlias("RouteIndex")
	private String routeIndex;
	// 是否K位
	@XStreamAlias("NeedApplyString")
	private String needApplyString;
	// 推荐等级
	@XStreamAlias("Recommend")
	private String recommend;
	// 退票费公式ID
	@XStreamAlias("RefundFeeFormulaID")
	private String refundFeeFormulaID;
	// 是否可升舱
	@XStreamAlias("CanUpGrade")
	private String canUpGrade;
	// 是否可单独销售
	@XStreamAlias("CanSeparateSale")
	private String canSeparateSale;
	// 是否随订随售
	@XStreamAlias("CanNoDefer")
	private String canNoDefer;
	// 是否飞人航班
	@XStreamAlias("IsFlyMan")
	private String isFlyMan;
	// 是否政策限本地
	@XStreamAlias("OnlyOwnCity")
	private String onlyOwnCity;
	// 是否最低价
	@XStreamAlias("IsLowestPrice")
	private String isLowestPrice;
	// 是否南航最低价
	@XStreamAlias("IsLowestCZSpecialPrice")
	private String isLowestCZSpecialPrice;
	// 参考准点率
	@XStreamAlias("PunctualityRate")
	private String punctualityRate;
	// 政策ID
	@XStreamAlias("PolicyID")
	private String policyID;
	// 原政策可出票种:对应航班查询结果中的DeliverTicketType 字段
	@XStreamAlias("AllowCPType")
	private String allowCPType;
	// 是否超出邮寄时间
	@XStreamAlias("OutOfPostTime")
	private String outOfPostTime;
	// 是否在送票取票时间之外
	@XStreamAlias("OutOfSendGetTime")
	private String outOfSendGetTime;
	// 是否在柜台取票时间之外
	@XStreamAlias("OutOfAirlineCounterTime")
	private String outOfAirlineCounterTime;
	// 是否可邮寄
	@XStreamAlias("CanPost")
	private String canPost;
	// 是否可航空公司柜台取消
	@XStreamAlias("CanAirlineCounter")
	private String canAirlineCounter;
	// 是否可市内送票取票
	@XStreamAlias("CanSendGet")
	private String canSendGet;
	// 是否返现
	@XStreamAlias("IsRebate")
	private String isRebate;
	// 返现金额
	@XStreamAlias("RebateAmount")
	private BigDecimal rebateAmount;
	// <?>
	@XStreamAlias("RebateCPCity")
	private String rebateCPCity;
	
	
	@XStreamAlias("ApplyChild")
	private String applyChild;
	@XStreamAlias("CanPostCitiesCode")
	private String[] canPostCitiesCode;
	@XStreamAlias("CardTypeList")
	private String cardTypeList;
	@XStreamAlias("CreditCardTypeList")
	private String creditCardTypeList;
	@XStreamAlias("EICmd")
	private String eICmd;
	@XStreamAlias("LastUpdateTime")
	private String lastUpdateTime;
	@XStreamAlias("ForControString")
	private String forControString;
	@XStreamAlias("HasOverTime")
	private String hasOverTime;
	@XStreamAlias("IsForControl")
	private String isForControl;
	@XStreamAlias("IsSharedFlight")
	private String isSharedFlight;
	@XStreamAlias("IsStandardClass")
	private String isStandardClass;
	@XStreamAlias("Nextday")
	private String nextday;
	@XStreamAlias("PrepayTypeList")
	private String prepayTypeList;
	@XStreamAlias("Star")
	private String star;
	@XStreamAlias("PolicyCategory")
	private String policyCategory;
	@XStreamAlias("APortBuildingCheckInTime")
	private String aPortBuildingCheckInTime;
	@XStreamAlias("DPortBuildingCheckInTime")
	private String dPortBuildingCheckInTime;
	@XStreamAlias("PackageOptions")
	private String packageOptions;
	@XStreamAlias("InsuranceEntity")
	private String insuranceEntity;
	@XStreamAlias("PackageEntity")
	private String packageEntity;
	@XStreamAlias("StopInfos")
	private StopInfos stopInfos;


	
	
	
	
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
	 * 起飞时间：yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public String getTakeOffTime() {
		return takeOffTime;
	}
	/**
	 * 起飞时间：yyyy-MM-ddThh:mm:ss
	 * @param takeOffTime
	 */
	public void setTakeOffTime(String takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
	/**
	 * 抵达时间：yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public String getArriveTime() {
		return arriveTime;
	}
	/**
	 * 抵达时间：yyyy-MM-ddThh:mm:ss
	 * @param arriveTime
	 */
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}
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
	 * 机型
	 * @return
	 */
	public String getCraftType() {
		return craftType;
	}
	/**
	 * 机型
	 * @param craftType
	 */
	public void setCraftType(String craftType) {
		this.craftType = craftType;
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
	 * 子舱位
	 * @return
	 */
	public String getSubClass() {
		return subClass;
	}
	/**
	 * 子舱位
	 * @param subClass
	 */
	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}
	/**
	 * 显示用舱位
	 * @return
	 */
	public String getDisplaySubclass() {
		return displaySubclass;
	}
	/**
	 * 显示用舱位
	 * @param displaySubclass
	 */
	public void setDisplaySubclass(String displaySubclass) {
		this.displaySubclass = displaySubclass;
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
	 * 航班票价
	 * @return
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 航班票价
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
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
	 * 儿童标准价
	 * @return
	 */
	public BigDecimal getChildStandardPrice() {
		return childStandardPrice;
	}
	/**
	 * 儿童标准价
	 * @param childStandardPrice
	 */
	public void setChildStandardPrice(BigDecimal childStandardPrice) {
		this.childStandardPrice = childStandardPrice;
	}
	/**
	 * 婴儿标准价
	 * @return
	 */
	public BigDecimal getBabyStandardPrice() {
		return babyStandardPrice;
	}
	/**
	 * 婴儿标准价
	 * @param babyStandardPrice
	 */
	public void setBabyStandardPrice(BigDecimal babyStandardPrice) {
		this.babyStandardPrice = babyStandardPrice;
	}
	/**
	 *  餐食类型
	 * @return
	 */
	public String getMealType() {
		return mealType;
	}
	/**
	 *  餐食类型
	 * @param mealType
	 */
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	/**
	 * 成人税
	 * @return
	 */
	public String getAdultTax() {
		return adultTax;
	}
	/**
	 * 成人税
	 * @param adultTax
	 */
	public void setAdultTax(String adultTax) {
		this.adultTax = adultTax;
	}
	/**
	 * 婴儿税
	 * @return
	 */
	public String getBabyTax() {
		return babyTax;
	}
	/**
	 * 婴儿税
	 * @param babyTax
	 */
	public void setBabyTax(String babyTax) {
		this.babyTax = babyTax;
	}
	/**
	 * 儿童税
	 * @return
	 */
	public String getChildTax() {
		return childTax;
	}
	/**
	 * 儿童税
	 * @param childTax
	 */
	public void setChildTax(String childTax) {
		this.childTax = childTax;
	}
	/**
	 * 成人燃油费用
	 * @return
	 */
	public BigDecimal getAdultOilFee() {
		return adultOilFee;
	}
	/**
	 * 成人燃油费用
	 * @param adultOilFee
	 */
	public void setAdultOilFee(BigDecimal adultOilFee) {
		this.adultOilFee = adultOilFee;
	}
	/**
	 * 婴儿燃油费用
	 * @return
	 */
	public BigDecimal getBabyOilFee() {
		return babyOilFee;
	}
	/**
	 * 婴儿燃油费用
	 * @param babyOilFee
	 */
	public void setBabyOilFee(BigDecimal babyOilFee) {
		this.babyOilFee = babyOilFee;
	}
	/**
	 * 儿童燃油费用
	 * @return
	 */
	public BigDecimal getChildOilFee() {
		return childOilFee;
	}
	/**
	 * 儿童燃油费用
	 * @param childOilFee
	 */
	public void setChildOilFee(BigDecimal childOilFee) {
		this.childOilFee = childOilFee;
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
	 * 抵达机场代码
	 * @return
	 */
	public String getaPortCode() {
		return aPortCode;
	}
	/**
	 * 抵达机场代码
	 * @param aPortCode
	 */
	public void setaPortCode(String aPortCode) {
		this.aPortCode = aPortCode;
	}
	/**
	 * 出发机场航站楼ID
	 * @return
	 */
	public String getdPortBuildingID() {
		return dPortBuildingID;
	}
	/**
	 * 出发机场航站楼ID
	 * @param dPortBuildingID
	 */
	public void setdPortBuildingID(String dPortBuildingID) {
		this.dPortBuildingID = dPortBuildingID;
	}
	/**
	 * 到达机场航站楼ID
	 * @return
	 */
	public String getaPortBuildingID() {
		return aPortBuildingID;
	}
	/**
	 * 到达机场航站楼ID
	 * @param aPortBuildingID
	 */
	public void setaPortBuildingID(String aPortBuildingID) {
		this.aPortBuildingID = aPortBuildingID;
	}
	/**
	 * 经停次数
	 * @return
	 */
	public Integer getStopTimes() {
		return stopTimes;
	}
	/**
	 * 经停次数
	 * @param stopTimes
	 */
	public void setStopTimes(Integer stopTimes) {
		this.stopTimes = stopTimes;
	}
	/**
	 * 更标示
	 * @return
	 */
	public String getNonrer() {
		return nonrer;
	}
	/**
	 * 更标示
	 * @param nonrer
	 */
	public void setNonrer(String nonrer) {
		this.nonrer = nonrer;
	}
	/**
	 * 转签标示
	 * @return
	 */
	public String getNonend() {
		return nonend;
	}
	/**
	 * 转签标示
	 * @param nonend
	 */
	public void setNonend(String nonend) {
		this.nonend = nonend;
	}
	/**
	 * 退票标示
	 * @return
	 */
	public String getNonref() {
		return nonref;
	}
	/**
	 * 退票标示
	 * @param nonref
	 */
	public void setNonref(String nonref) {
		this.nonref = nonref;
	}
	/**
	 * 更改说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @return
	 */
	public String getRernote() {
		return rernote;
	}
	/**
	 * 更改说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @param rernote
	 */
	public void setRernote(String rernote) {
		this.rernote = rernote;
	}
	/**
	 * 转签说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @return
	 */
	public String getEndnote() {
		return endnote;
	}
	/**
	 * 转签说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @param endnote
	 */
	public void setEndnote(String endnote) {
		this.endnote = endnote;
	}
	/**
	 * 退票说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @return
	 */
	public String getRefnote() {
		return refnote;
	}
	/**
	 * 退票说明 （中文 或 英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @param refnote
	 */
	public void setRefnote(String refnote) {
		this.refnote = refnote;
	}
	/**
	 * 备注 （中文或英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @return
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 备注 （中文或英文）中文、英文 的显示取决于请求Header 节Culture 值
	 * @param remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 票种,中文、英文 的显示取决于请求Header 节Culture 值
	 * @return
	 */
	public String getTicketType() {
		return ticketType;
	}
	/**
	 * 票种,中文、英文 的显示取决于请求Header 节Culture 值
	 * @param ticketType
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	/**
	 * 提前预定天数
	 * @return
	 */
	public Integer getBeforeFlyDate() {
		return beforeFlyDate;
	}
	/**
	 * 提前预定天数
	 * @param beforeFlyDate
	 */
	public void setBeforeFlyDate(Integer beforeFlyDate) {
		this.beforeFlyDate = beforeFlyDate;
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
	 * 价格类型 NormalPrice ：普通,SingleTripPrice：提前预售特价,CZSpecialPrice：南航特价
	 * @return
	 */
	public String getPriceType() {
		return priceType;
	}
	/**
	 * 价格类型 NormalPrice ：普通,SingleTripPrice：提前预售特价,CZSpecialPrice：南航特价
	 * @param priceType
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	/**
	 * 机票产品类型:Normal,YOUNGMAN,OLDMAN
	 * @return
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * 机票产品类型:Normal,YOUNGMAN,OLDMAN
	 * @param productType
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * 机票产品来源:1携程机票频道,2共享平台,3两者共有,4直连产品
	 * @return
	 */
	public String getProductSource() {
		return productSource;
	}
	/**
	 * 机票产品来源:1携程机票频道,2共享平台,3两者共有,4直连产品
	 * @param productSource
	 */
	public void setProductSource(String productSource) {
		this.productSource = productSource;
	}
	/**
	 * 库存类型:FIX：定额 FAV：见舱
	 * @return
	 */
	public String getInventoryType() {
		return inventoryType;
	}
	/**
	 * 库存类型:FIX：定额 FAV：见舱
	 * @param inventoryType
	 */
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	/**
	 * 航程索引
	 * @return
	 */
	public String getRouteIndex() {
		return routeIndex;
	}
	/**
	 * 航程索引
	 * @param routeIndex
	 */
	public void setRouteIndex(String routeIndex) {
		this.routeIndex = routeIndex;
	}
	/**
	 * 是否K位
	 * @return
	 */
	public String getNeedApplyString() {
		return needApplyString;
	}
	/**
	 * 是否K位
	 * @param needApplyString
	 */
	public void setNeedApplyString(String needApplyString) {
		this.needApplyString = needApplyString;
	}
	/**
	 * 推荐等级
	 * @return
	 */
	public String getRecommend() {
		return recommend;
	}
	/**
	 * 推荐等级
	 * @param recommend
	 */
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}
	/**
	 * 退票费公式ID
	 * @return
	 */
	public String getRefundFeeFormulaID() {
		return refundFeeFormulaID;
	}
	/**
	 * 退票费公式ID
	 * @param refundFeeFormulaID
	 */
	public void setRefundFeeFormulaID(String refundFeeFormulaID) {
		this.refundFeeFormulaID = refundFeeFormulaID;
	}
	/**
	 * 是否可升舱
	 * @return
	 */
	public String getCanUpGrade() {
		return canUpGrade;
	}
	/**
	 * 是否可升舱
	 * @param canUpGrade
	 */
	public void setCanUpGrade(String canUpGrade) {
		this.canUpGrade = canUpGrade;
	}
	/**
	 * 是否可单独销售
	 * @return
	 */
	public String getCanSeparateSale() {
		return canSeparateSale;
	}
	/**
	 * 是否可单独销售
	 * @param canSeparateSale
	 */
	public void setCanSeparateSale(String canSeparateSale) {
		this.canSeparateSale = canSeparateSale;
	}
	/**
	 * 是否随订随售
	 * @return
	 */
	public String getCanNoDefer() {
		return canNoDefer;
	}
	/**
	 * 是否随订随售
	 * @param canNoDefer
	 */
	public void setCanNoDefer(String canNoDefer) {
		this.canNoDefer = canNoDefer;
	}
	/**
	 * 是否飞人航班
	 * @return
	 */
	public String getIsFlyMan() {
		return isFlyMan;
	}
	/**
	 * 是否飞人航班
	 * @param isFlyMan
	 */
	public void setIsFlyMan(String isFlyMan) {
		this.isFlyMan = isFlyMan;
	}
	/**
	 * 是否政策限本地
	 * @return
	 */
	public String getOnlyOwnCity() {
		return onlyOwnCity;
	}
	/**
	 * 是否政策限本地
	 * @param onlyOwnCity
	 */
	public void setOnlyOwnCity(String onlyOwnCity) {
		this.onlyOwnCity = onlyOwnCity;
	}
	/**
	 * 是否最低价
	 * @return
	 */
	public String getIsLowestPrice() {
		return isLowestPrice;
	}
	/**
	 * 是否最低价
	 * @param isLowestPrice
	 */
	public void setIsLowestPrice(String isLowestPrice) {
		this.isLowestPrice = isLowestPrice;
	}
	/**
	 * 是否南航最低价
	 * @return
	 */
	public String getIsLowestCZSpecialPrice() {
		return isLowestCZSpecialPrice;
	}
	/**
	 * 是否南航最低价
	 * @param isLowestCZSpecialPrice
	 */
	public void setIsLowestCZSpecialPrice(String isLowestCZSpecialPrice) {
		this.isLowestCZSpecialPrice = isLowestCZSpecialPrice;
	}
	/**
	 * 参考准点率
	 * @return
	 */
	public String getPunctualityRate() {
		return punctualityRate;
	}
	/**
	 * 参考准点率
	 * @param punctualityRate
	 */
	public void setPunctualityRate(String punctualityRate) {
		this.punctualityRate = punctualityRate;
	}
	/**
	 * 政策ID
	 * @return
	 */
	public String getPolicyID() {
		return policyID;
	}
	/**
	 * 政策ID
	 * @param policyID
	 */
	public void setPolicyID(String policyID) {
		this.policyID = policyID;
	}
	/**
	 * 原政策可出票种:对应航班查询结果中的DeliverTicketType 字段
	 * @return
	 */
	public String getAllowCPType() {
		return allowCPType;
	}
	/**
	 * 原政策可出票种:对应航班查询结果中的DeliverTicketType 字段
	 * @param allowCPType
	 */
	public void setAllowCPType(String allowCPType) {
		this.allowCPType = allowCPType;
	}
	/**
	 *  是否超出邮寄时间
	 * @return
	 */
	public String getOutOfPostTime() {
		return outOfPostTime;
	}
	/**
	 *  是否超出邮寄时间
	 * @param outOfPostTime
	 */
	public void setOutOfPostTime(String outOfPostTime) {
		this.outOfPostTime = outOfPostTime;
	}
	/**
	 * 是否在送票取票时间之外
	 * @return
	 */
	public String getOutOfSendGetTime() {
		return outOfSendGetTime;
	}
	/**
	 * 是否在送票取票时间之外
	 * @param outOfSendGetTime
	 */
	public void setOutOfSendGetTime(String outOfSendGetTime) {
		this.outOfSendGetTime = outOfSendGetTime;
	}
	/**
	 * 是否在柜台取票时间之外
	 * @return
	 */
	public String getOutOfAirlineCounterTime() {
		return outOfAirlineCounterTime;
	}
	/**
	 * 是否在柜台取票时间之外
	 * @param outOfAirlineCounterTime
	 */
	public void setOutOfAirlineCounterTime(String outOfAirlineCounterTime) {
		this.outOfAirlineCounterTime = outOfAirlineCounterTime;
	}
	/**
	 * 是否可邮寄
	 * @return
	 */
	public String getCanPost() {
		return canPost;
	}
	/**
	 * 是否可邮寄
	 * @param canPost
	 */
	public void setCanPost(String canPost) {
		this.canPost = canPost;
	}
	/**
	 * 是否可航空公司柜台取消
	 * @return
	 */
	public String getCanAirlineCounter() {
		return canAirlineCounter;
	}
	/**
	 * 是否可航空公司柜台取消
	 * @param canAirlineCounter
	 */
	public void setCanAirlineCounter(String canAirlineCounter) {
		this.canAirlineCounter = canAirlineCounter;
	}
	/**
	 * 是否可市内送票取票
	 * @return
	 */
	public String getCanSendGet() {
		return canSendGet;
	}
	/**
	 * 是否可市内送票取票
	 * @param canSendGet
	 */
	public void setCanSendGet(String canSendGet) {
		this.canSendGet = canSendGet;
	}
	/**
	 * 是否返现
	 * @return
	 */
	public String getIsRebate() {
		return isRebate;
	}
	/**
	 * 是否返现
	 * @param isRebate
	 */
	public void setIsRebate(String isRebate) {
		this.isRebate = isRebate;
	}
	/**
	 * 返现金额
	 * @return
	 */
	public BigDecimal getRebateAmount() {
		return rebateAmount;
	}
	/**
	 * 返现金额
	 * @param rebateAmount
	 */
	public void setRebateAmount(BigDecimal rebateAmount) {
		this.rebateAmount = rebateAmount;
	}
	/**
	 * <?>
	 * @return
	 */
	public String getRebateCPCity() {
		return rebateCPCity;
	}
	/**
	 * <?>
	 * @param rebateCPCity
	 */
	public void setRebateCPCity(String rebateCPCity) {
		this.rebateCPCity = rebateCPCity;
	}
	public String getApplyChild() {
		return applyChild;
	}
	public void setApplyChild(String applyChild) {
		this.applyChild = applyChild;
	}
	public String[] getCanPostCitiesCode() {
		return canPostCitiesCode;
	}
	public void setCanPostCitiesCode(String[] canPostCitiesCode) {
		this.canPostCitiesCode = canPostCitiesCode;
	}
	public String getCardTypeList() {
		return cardTypeList;
	}
	public void setCardTypeList(String cardTypeList) {
		this.cardTypeList = cardTypeList;
	}
	public String getCreditCardTypeList() {
		return creditCardTypeList;
	}
	public void setCreditCardTypeList(String creditCardTypeList) {
		this.creditCardTypeList = creditCardTypeList;
	}
	public String geteICmd() {
		return eICmd;
	}
	public void seteICmd(String eICmd) {
		this.eICmd = eICmd;
	}
	public String getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public String getForControString() {
		return forControString;
	}
	public void setForControString(String forControString) {
		this.forControString = forControString;
	}
	public String getHasOverTime() {
		return hasOverTime;
	}
	public void setHasOverTime(String hasOverTime) {
		this.hasOverTime = hasOverTime;
	}
	public String getIsForControl() {
		return isForControl;
	}
	public void setIsForControl(String isForControl) {
		this.isForControl = isForControl;
	}
	public String getIsSharedFlight() {
		return isSharedFlight;
	}
	public void setIsSharedFlight(String isSharedFlight) {
		this.isSharedFlight = isSharedFlight;
	}
	public String getIsStandardClass() {
		return isStandardClass;
	}
	public void setIsStandardClass(String isStandardClass) {
		this.isStandardClass = isStandardClass;
	}
	public String getNextday() {
		return nextday;
	}
	public void setNextday(String nextday) {
		this.nextday = nextday;
	}
	public String getPrepayTypeList() {
		return prepayTypeList;
	}
	public void setPrepayTypeList(String prepayTypeList) {
		this.prepayTypeList = prepayTypeList;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getPolicyCategory() {
		return policyCategory;
	}
	public void setPolicyCategory(String policyCategory) {
		this.policyCategory = policyCategory;
	}
	public String getaPortBuildingCheckInTime() {
		return aPortBuildingCheckInTime;
	}
	public void setaPortBuildingCheckInTime(String aPortBuildingCheckInTime) {
		this.aPortBuildingCheckInTime = aPortBuildingCheckInTime;
	}
	public String getdPortBuildingCheckInTime() {
		return dPortBuildingCheckInTime;
	}
	public void setdPortBuildingCheckInTime(String dPortBuildingCheckInTime) {
		this.dPortBuildingCheckInTime = dPortBuildingCheckInTime;
	}
	public String getPackageOptions() {
		return packageOptions;
	}
	public void setPackageOptions(String packageOptions) {
		this.packageOptions = packageOptions;
	}
	public String getInsuranceEntity() {
		return insuranceEntity;
	}
	public void setInsuranceEntity(String insuranceEntity) {
		this.insuranceEntity = insuranceEntity;
	}
	public String getPackageEntity() {
		return packageEntity;
	}
	public void setPackageEntity(String packageEntity) {
		this.packageEntity = packageEntity;
	}
	public StopInfos getStopInfos() {
		return stopInfos;
	}
	public void setStopInfos(StopInfos stopInfos) {
		this.stopInfos = stopInfos;
	}
	
}