package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 航班信息
 * @author jujian
 *
 */
@XStreamAlias("FlightInfoRequest")
public class FlightInfoRequest {
	//出发城市ID：Int类型；必填
	@XStreamAlias("DepartCityID")
	private Integer departCityID;
	//达到城市ID：Int类型；必填
	@XStreamAlias("ArriveCityID")
	private Integer arriveCityID;
	//出发机场三字码：string类型；必填；如北京：PEK 或 NAY
	@XStreamAlias("DPortCode")
	private String dPortCode;
	//到达机场三字码：string类型；必填；如北京：PEK 或 NAY 
	@XStreamAlias("APortCode")
	private String aPortCode;
	//航空公司代码：string类型；必填
	@XStreamAlias("AirlineCode")
	private String airlineCode;
	//航班号：string类型；必填
	@XStreamAlias("Flight")
	private String flight;
	//舱位等级：string类型；必填；对应航班查询结果的FlightClass 字段：Y 经济舱，C 公务舱，F 头等舱
	@XStreamAlias("Class")
	private String flightClass;
	//子舱位：string类型；必填
	@XStreamAlias("SubClass")
	private String subClass;
	//起飞时间：DateTime类型；必填；yyyy-MM-ddThh:mm:ss
	@XStreamAlias("TakeOffTime")
	private String takeOffTime;
	//抵达时间：DateTime类型；必填；yyyy-MM-ddThh:mm:ss
	@XStreamAlias("ArrivalTime")
	private String arrivalTime;
	//航班扣率：Decimal类型；必填
	@XStreamAlias("Rate")
	private String rate;
	//航班票价：Int类型；必填；儿童，婴儿 订单请传对应航班相应票价
	@XStreamAlias("Price")
	private Integer price;
	//税：Int类型；必填；儿童，婴儿 订单请传对应航班相应税
	@XStreamAlias("Tax")
	private Integer tax;
	//燃油费：Float类型；必填；儿童，婴儿订单请传对应航班相应燃油费用
	@XStreamAlias("OilFee")
	private String oilFee;
	//机票更改标识：string类型；必填
	@XStreamAlias("NonRer")
	private String nonRer;
	//机票退票标识：string类型；必填
	@XStreamAlias("NonRef")
	private String nonRef;
	//机票签转标识：string类型；必填
	@XStreamAlias("NonEnd")
	private String nonEnd;
	//机票更改说明：string类型；必填
	@XStreamAlias("RerNote")
	private String rerNote;
	//机票退票说明：string类型；必填
	@XStreamAlias("RefNote")
	private String refNote;
	//机票签转说明：string类型；必填
	@XStreamAlias("EndNote")
	private String endNote;
	//机票备注信息：string类型；必填
	@XStreamAlias("Remark")
	private String remark;
	//是否K位价：string类型；必填
	@XStreamAlias("NeedAppl")
	private String needAppl;
	//推荐等级：Int类型；必填
	@XStreamAlias("Recommend")
	private Integer recommend;
	//是否可邮寄：string类型；必填
	@XStreamAlias("Canpost")
	private String canpost;
	//机型：string类型；必填
	@XStreamAlias("CraftType")
	private String craftType;
	//剩余座位数：Int类型；必填
	@XStreamAlias("Quantity")
	private Integer quantity;
	//退票费计算公式ID：Int类型；必填
	@XStreamAlias("RefundFeeFormulaID")
	private Integer refundFeeFormulaID;
	//是否可升舱：string类型；必填
	@XStreamAlias("UpGrade")
	private String upGrade;
	//可出票种：string类型；必填
	@XStreamAlias("TicketType")
	private String ticketType;
	//原政策可出票种：string类型；必填；对应航班查询结果中的DeliverTicketType 字段
	@XStreamAlias("AllowCPType")
	private String allowCPType;
	//产品类型：string类型；必填；Normal，YOUNGMAN ，OLDMAN
	@XStreamAlias("ProductType")
	private String productType;
	//产品来源：string类型；必填；两程航班必填1：大系统，2：共享平台，3：兼有两程时，只有一程是共享平台不可预订
	@XStreamAlias("ProductSource")
	private String productSource;
	//库存类型：string类型；必填；两程航班必填FIX:定额 FAV :见舱 两程时一程见舱一程定额不可预定
	@XStreamAlias("InventoryType")
	private String inventoryType;
	//价格类型：string类型；必填；NormalPrice ：普通,SingleTripPrice：提前预售特价,CZSpecialPrice：南航特价
	@XStreamAlias("PriceType")
	private String priceType;
	//是否政策限本地
	@XStreamAlias("Onlyowncity")
	private String onlyowncity;
	//是否可以单独销售
	@XStreamAlias("CanSeparateSale")
	private String canSeparateSale;
	//航程索引：string类型；必填
	@XStreamAlias("RouteIndex")
	private String routeIndex;
	
	/**
	 * 出发城市ID：Int类型；必填
	 * @return
	 */
	public Integer getDepartCityID() {
		return departCityID;
	}
	/**
	 * 出发城市ID：Int类型；必填
	 * @param departCityID
	 */
	public void setDepartCityID(Integer departCityID) {
		this.departCityID = departCityID;
	}
	
	/**
	 * 达到城市ID：Int类型；必填
	 * @return
	 */
	public Integer getArriveCityID() {
		return arriveCityID;
	}
	/**
	 * 达到城市ID：Int类型；必填
	 * @param arriveCityID
	 */
	public void setArriveCityID(Integer arriveCityID) {
		this.arriveCityID = arriveCityID;
	}
	/**
	 * 出发机场三字码：string类型；必填；如北京：PEK 或 NAY
	 * @return
	 */
	public String getdPortCode() {
		return dPortCode;
	}
	/**
	 * 出发机场三字码：string类型；必填；如北京：PEK 或 NAY
	 * @param dPortCode
	 */
	public void setdPortCode(String dPortCode) {
		this.dPortCode = dPortCode;
	}
	/**
	 * 到达机场三字码：string类型；必填；如北京：PEK 或 NAY 
	 * @return
	 */
	public String getaPortCode() {
		return aPortCode;
	}
	/**
	 * 到达机场三字码：string类型；必填；如北京：PEK 或 NAY 
	 * @param aPortCode
	 */
	public void setaPortCode(String aPortCode) {
		this.aPortCode = aPortCode;
	}
	/**
	 * 航空公司代码：string类型；必填
	 * @return
	 */
	public String getAirlineCode() {
		return airlineCode;
	}
	/**
	 * 航空公司代码：string类型；必填
	 * @param airlineCode
	 */
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	/**
	 * 航班号：string类型；必填
	 * @return
	 */
	public String getFlight() {
		return flight;
	}
	/**
	 * 航班号：string类型；必填
	 * @param flight
	 */
	public void setFlight(String flight) {
		this.flight = flight;
	}
	/**
	 * 舱位等级：string类型；必填；对应航班查询结果的FlightClass 字段：Y 经济舱，C 公务舱，F 头等舱
	 * @return
	 */
	public String getFlightClass() {
		return flightClass;
	}
	/**
	 * 舱位等级：string类型；必填；对应航班查询结果的FlightClass 字段：Y 经济舱，C 公务舱，F 头等舱
	 * @param flightClass
	 */
	public void setFlightClass(String flightClass) {
		this.flightClass = flightClass;
	}
	/**
	 * 子舱位：string类型；必填
	 * @return
	 */
	public String getSubClass() {
		return subClass;
	}
	/**
	 * 子舱位：string类型；必填
	 * @param subClass
	 */
	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}
	/**
	 * 起飞时间：DateTime类型；必填；yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public String getTakeOffTime() {
		return takeOffTime;
	}
	/**
	 * 起飞时间：DateTime类型；必填；yyyy-MM-ddThh:mm:ss
	 * @param takeOffTime
	 */
	public void setTakeOffTime(String takeOffTime) {
		this.takeOffTime = takeOffTime;
	}
	/**
	 * 抵达时间：DateTime类型；必填；yyyy-MM-ddThh:mm:ss
	 * @return
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * 抵达时间：DateTime类型；必填；yyyy-MM-ddThh:mm:ss
	 * @param arrivalTime
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * 航班扣率：Decimal类型；必填
	 * @return
	 */
	public String getRate() {
		return rate;
	}
	/**
	 * 航班扣率：Decimal类型；必填
	 * @param rate
	 */
	public void setRate(String rate) {
		this.rate = rate;
	}
	/**
	 * 航班票价：Int类型；必填；儿童，婴儿 订单请传对应航班相应票价
	 * @return
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * 航班票价：Int类型；必填；儿童，婴儿 订单请传对应航班相应票价
	 * @param price
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * 税：Int类型；必填；儿童，婴儿 订单请传对应航班相应税
	 * @return
	 */
	public Integer getTax() {
		return tax;
	}
	/**
	 * 税：Int类型；必填；儿童，婴儿 订单请传对应航班相应税
	 * @param tax
	 */
	public void setTax(Integer tax) {
		this.tax = tax;
	}
	/**
	 * 燃油费：Float类型；必填；儿童，婴儿订单请传对应航班相应燃油费用
	 * @return
	 */
	public String getOilFee() {
		return oilFee;
	}
	/**
	 * 燃油费：Float类型；必填；儿童，婴儿订单请传对应航班相应燃油费用
	 * @param oilFee
	 */
	public void setOilFee(String oilFee) {
		this.oilFee = oilFee;
	}
	/**
	 * 机票更改标识：string类型；必填
	 * @return
	 */
	public String getNonRer() {
		return nonRer;
	}
	/**
	 * 机票更改标识：string类型；必填
	 * @param nonRer
	 */
	public void setNonRer(String nonRer) {
		this.nonRer = nonRer;
	}
	/**
	 * 机票退票标识：string类型；必填
	 * @return
	 */
	public String getNonRef() {
		return nonRef;
	}
	/**
	 * 机票退票标识：string类型；必填
	 * @param nonRef
	 */
	public void setNonRef(String nonRef) {
		this.nonRef = nonRef;
	}
	/**
	 * 机票签转标识：string类型；必填
	 * @return
	 */
	public String getNonEnd() {
		return nonEnd;
	}
	/**
	 * 机票签转标识：string类型；必填
	 * @param nonEnd
	 */
	public void setNonEnd(String nonEnd) {
		this.nonEnd = nonEnd;
	}
	/**
	 * 机票更改说明：string类型；必填
	 * @return
	 */
	public String getRerNote() {
		return rerNote;
	}
	/**
	 * 机票更改说明：string类型；必填
	 * @param rerNote
	 */
	public void setRerNote(String rerNote) {
		this.rerNote = rerNote;
	}
	/**
	 * 机票退票说明：string类型；必填
	 * @return
	 */
	public String getRefNote() {
		return refNote;
	}
	/**
	 * 机票退票说明：string类型；必填
	 * @param refNote
	 */
	public void setRefNote(String refNote) {
		this.refNote = refNote;
	}
	/**
	 * 机票签转说明：string类型；必填
	 * @return
	 */
	public String getEndNote() {
		return endNote;
	}
	/**
	 * 机票签转说明：string类型；必填
	 * @param endNote
	 */
	public void setEndNote(String endNote) {
		this.endNote = endNote;
	}
	/**
	 * 机票备注信息：string类型；必填
	 * @return
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 机票备注信息：string类型；必填
	 * @param remark
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 是否K位价：string类型；必填
	 * @return
	 */
	public String getNeedAppl() {
		return needAppl;
	}
	/**
	 * 是否K位价：string类型；必填
	 * @param needAppl
	 */
	public void setNeedAppl(String needAppl) {
		this.needAppl = needAppl;
	}
	/**
	 * 推荐等级：Int类型；必填
	 * @return
	 */
	public Integer getRecommend() {
		return recommend;
	}
	/**
	 * 推荐等级：Int类型；必填
	 * @param recommend
	 */
	public void setRecommend(Integer recommend) {
		this.recommend = recommend;
	}
	/**
	 * 是否可邮寄：string类型；必填
	 * @return
	 */
	public String getCanpost() {
		return canpost;
	}
	/**
	 * 是否可邮寄：string类型；必填
	 * @param canpost
	 */
	public void setCanpost(String canpost) {
		this.canpost = canpost;
	}
	/**
	 * 机型：string类型；必填
	 * @return
	 */
	public String getCraftType() {
		return craftType;
	}
	/**
	 * 机型：string类型；必填
	 * @param craftType
	 */
	public void setCraftType(String craftType) {
		this.craftType = craftType;
	}
	/**
	 * 剩余座位数：Int类型；必填
	 * @return
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 剩余座位数：Int类型；必填
	 * @param quantity
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * 退票费计算公式ID：Int类型；必填
	 * @return
	 */
	public Integer getRefundFeeFormulaID() {
		return refundFeeFormulaID;
	}
	/**
	 * 退票费计算公式ID：Int类型；必填
	 * @param refundFeeFormulaID
	 */
	public void setRefundFeeFormulaID(Integer refundFeeFormulaID) {
		this.refundFeeFormulaID = refundFeeFormulaID;
	}
	/**
	 * 是否可升舱：string类型；必填
	 * @return
	 */
	public String getUpGrade() {
		return upGrade;
	}
	/**
	 * 是否可升舱：string类型；必填
	 * @param upGrade
	 */
	public void setUpGrade(String upGrade) {
		this.upGrade = upGrade;
	}
	/**
	 * 可出票种：string类型；必填
	 * @return
	 */
	public String getTicketType() {
		return ticketType;
	}
	/**
	 * 可出票种：string类型；必填
	 * @param ticketType
	 */
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	/**
	 * 原政策可出票种：string类型；必填；对应航班查询结果中的DeliverTicketType 字段
	 * @return
	 */
	public String getAllowCPType() {
		return allowCPType;
	}
	/**
	 * 原政策可出票种：string类型；必填；对应航班查询结果中的DeliverTicketType 字段
	 * @param allowCPType
	 */
	public void setAllowCPType(String allowCPType) {
		this.allowCPType = allowCPType;
	}
	/**
	 * 产品类型：string类型；必填；Normal，YOUNGMAN ，OLDMAN
	 * @return
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * 产品类型：string类型；必填；Normal，YOUNGMAN ，OLDMAN
	 * @param productType
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * 产品来源：string类型；必填；两程航班必填1：大系统，2：共享平台，3：兼有两程时，只有一程是共享平台不可预订
	 * @return
	 */
	public String getProductSource() {
		return productSource;
	}
	/**
	 * 产品来源：string类型；必填；两程航班必填1：大系统，2：共享平台，3：兼有两程时，只有一程是共享平台不可预订
	 * @param productSource
	 */
	public void setProductSource(String productSource) {
		this.productSource = productSource;
	}
	/**
	 * 库存类型：string类型；必填；两程航班必填FIX:定额 FAV :见舱 两程时一程见舱一程定额不可预定
	 * @return
	 */
	public String getInventoryType() {
		return inventoryType;
	}
	/**
	 * 库存类型：string类型；必填；两程航班必填FIX:定额 FAV :见舱 两程时一程见舱一程定额不可预定
	 * @param inventoryType
	 */
	public void setInventoryType(String inventoryType) {
		this.inventoryType = inventoryType;
	}
	/**
	 * 价格类型：string类型；必填；NormalPrice ：普通,SingleTripPrice：提前预售特价,CZSpecialPrice：南航特价
	 * @return
	 */
	public String getPriceType() {
		return priceType;
	}
	/**
	 * 价格类型：string类型；必填；NormalPrice ：普通,SingleTripPrice：提前预售特价,CZSpecialPrice：南航特价
	 * @param priceType
	 */
	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}
	/**
	 * 是否政策限本地
	 * @return
	 */
	public String getOnlyowncity() {
		return onlyowncity;
	}
	/**
	 * 是否政策限本地
	 * @param onlyowncity
	 */
	public void setOnlyowncity(String onlyowncity) {
		this.onlyowncity = onlyowncity;
	}
	/**
	 * 是否可以单独销售
	 * @return
	 */
	public String getCanSeparateSale() {
		return canSeparateSale;
	}
	/**
	 * 是否可以单独销售
	 * @param canSeparateSale
	 */
	public void setCanSeparateSale(String canSeparateSale) {
		this.canSeparateSale = canSeparateSale;
	}
	/**
	 * 航程索引：string类型；必填
	 * @return
	 */
	public String getRouteIndex() {
		return routeIndex;
	}
	/**
	 * 航程索引：string类型；必填
	 * @param routeIndex
	 */
	public void setRouteIndex(String routeIndex) {
		this.routeIndex = routeIndex;
	}
	
	
}
