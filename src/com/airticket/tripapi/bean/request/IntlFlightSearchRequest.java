package com.airticket.tripapi.bean.request;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * 国际航班预订
 * @author jujian
 *
 */
@XStreamAlias("IntlFlightSearchRequest")
public class IntlFlightSearchRequest {
	//行程类型：string类型；必填；单程（默认）OW，往返 RT，多程 MT
	@XStreamAlias("TripType") 
	private String tripType="OW";
	//乘客类型：string类型；必填；成人（默认）ADT，婴儿 INF，儿童 CHD
	@XStreamAlias("PassengerType")
	private String passengerType="ADT";
	//乘客数量
	@XStreamAlias("PassengerCount")
	private Integer passengerCount;
	//乘客资质：string类型；可空；所有 ALL，普通/成人 NOR，学生 STU，移民 EMI，海员 SEA，青年 YTH，劳工 LBR，老年人 SRC，探亲访友 VFR，军人 MIL，成人陪伴儿童 CNN
	@XStreamAlias("Eligibility")
	private String eligibility;
	//商旅客户编号
	@XStreamAlias("BusinessID")
	private String businessID;
	//商旅用户支出类型 默认: OWN自费
	@XStreamAlias("BusinessType")
	private String businessType="OWN";
	//航空公司二字码：string类型；可空；默认:所有航空公司
	@XStreamAlias("Airline")
	private String airline="";
	//舱位等级：string类型；必填；默认:Y(查询全部)，经济舱 Y，超经舱 S，公务舱 C，头等舱 F
	@XStreamAlias("ClassGrade")
	private String classGrade;
	//销售渠道：string类型；必填；网上（默认） Online，英文 English，人工 Manual，无线 Wireless，度假 Holiday，商旅Trade
	@XStreamAlias("SalesType")
	private String salesType="Online";
	//指定运价ID：string类型；可空
	@XStreamAlias("FareIds")
	private String fareIds="";
	//运价类型：string类型；必填；所有（默认） All ，最低价 LowestPrice， 直飞 Direct，套票 TicketSet ，Open程 Open，特惠 Special，推荐 Recommended
	@XStreamAlias("FareType") 
	private String fareType="All";
	//结果模式：string类型；必填；所有价格 （默认）All，航班最低价LowestPrice，航班更多价格MorePrice
	@XStreamAlias("ResultMode")
	private String resultMode="All";
	//排序字段：string类型；必填；价格 Price，起飞时间 DTime，到达时间 Atime
	@XStreamAlias("OrderBy")
	private String orderBy;
	//排序方向 ：string类型；必填；升序 Asc，降序 Desc
	@XStreamAlias("Direction")
	private String direction;
	//已选航班信息：string类型；可空； 查询下一程航班信息时必须带入的参数，例如：MU5124
	@XStreamAlias("ShoppingInfoID")
	private String shoppingInfoID="";
	
	//航段信息
	@XStreamAlias("segmentInfos")
	private List<SegmentInfo> segmentInfos;
	
	//选定航路信息，如有必要添加，具体字段参看下表Routing
	@XStreamAlias("Routings")
	private String routings="";

	/**
	 * 行程类型：string类型；必填；单程（默认）OW，往返 RT，多程 MT
	 * @return
	 */
	public String getTripType() {
		return tripType;
	}

	/**
	 * 行程类型：string类型；必填；单程（默认）OW，往返 RT，多程 MT
	 * @param tripType
	 */
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	/**
	 * 乘客类型：string类型；必填；成人（默认）ADT，婴儿 INF，儿童 CHD
	 * @return
	 */
	public String getPassengerType() {
		return passengerType;
	}

	/**
	 * 乘客类型：string类型；必填；成人（默认）ADT，婴儿 INF，儿童 CHD
	 * @param passengerType
	 */
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	/**
	 * 乘客数量
	 * @return
	 */
	public Integer getPassengerCount() {
		return passengerCount;
	}

	/**
	 * 乘客数量
	 * @param passengerCount
	 */
	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	/**
	 * 乘客资质：string类型；可空；所有 ALL，普通/成人 NOR，学生 STU，移民 EMI，海员 SEA，青年 YTH，劳工 LBR，老年人 SRC，探亲访友 VFR，军人 MIL，成人陪伴儿童 CNN
	 * @return
	 */
	public String getEligibility() {
		return eligibility;
	}

	/**
	 * 乘客资质：string类型；可空；所有 ALL，普通/成人 NOR，学生 STU，移民 EMI，海员 SEA，青年 YTH，劳工 LBR，老年人 SRC，探亲访友 VFR，军人 MIL，成人陪伴儿童 CNN
	 * @param eligibility
	 */
	public void setEligibility(String eligibility) {
		this.eligibility = eligibility;
	}

	/**
	 * 商旅客户编号
	 * @return
	 */
	public String getBusinessID() {
		return businessID;
	}

	/**
	 * 商旅客户编号
	 * @param businessID
	 */
	public void setBusinessID(String businessID) {
		this.businessID = businessID;
	}

	/**
	 * 商旅用户支出类型 默认: OWN自费
	 * @return
	 */
	public String getBusinessType() {
		return businessType;
	}

	/**
	 * 商旅用户支出类型 默认: OWN自费
	 * @param businessType
	 */
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	/**
	 * 航空公司二字码：string类型；可空；默认:所有航空公司
	 * @return
	 */
	public String getAirline() {
		return airline;
	}

	/**
	 * 航空公司二字码：string类型；可空；默认:所有航空公司
	 * @param airline
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	}

	/**
	 * 舱位等级：string类型；必填；默认:Y(查询全部)，经济舱 Y，超经舱 S，公务舱 C，头等舱 F
	 * @return
	 */
	public String getClassGrade() {
		return classGrade;
	}

	/**
	 * 舱位等级：string类型；必填；默认:Y(查询全部)，经济舱 Y，超经舱 S，公务舱 C，头等舱 F
	 * @param classGrade
	 */
	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}

	/**
	 * 销售渠道：string类型；必填；网上（默认） Online，英文 English，人工 Manual，无线 Wireless，度假 Holiday，商旅Trade
	 * @return
	 */
	public String getSalesType() {
		return salesType;
	}

	/**
	 * 销售渠道：string类型；必填；网上（默认） Online，英文 English，人工 Manual，无线 Wireless，度假 Holiday，商旅Trade
	 * @param salesType
	 */
	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}

	/**
	 * 指定运价ID：string类型；可空
	 * @return
	 */
	public String getFareIds() {
		return fareIds;
	}

	/**
	 * 指定运价ID：string类型；可空
	 * @param fareIds
	 */
	public void setFareIds(String fareIds) {
		this.fareIds = fareIds;
	}

	/**
	 * 运价类型：string类型；必填；所有（默认） All ，最低价 LowestPrice， 直飞 Direct，套票 TicketSet ，Open程 Open，特惠 Special，推荐 Recommended
	 * @return
	 */
	public String getFareType() {
		return fareType;
	}

	/**
	 * 运价类型：string类型；必填；所有（默认） All ，最低价 LowestPrice， 直飞 Direct，套票 TicketSet ，Open程 Open，特惠 Special，推荐 Recommended
	 * @param fareType
	 */
	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	/**
	 * 结果模式：string类型；必填；所有价格 （默认）All，航班最低价LowestPrice，航班更多价格MorePrice
	 * @return
	 */
	public String getResultMode() {
		return resultMode;
	}

	/**
	 * 结果模式：string类型；必填；所有价格 （默认）All，航班最低价LowestPrice，航班更多价格MorePrice
	 * @param resultMode
	 */
	public void setResultMode(String resultMode) {
		this.resultMode = resultMode;
	}

	/**
	 * 排序字段：string类型；必填；价格 Price，起飞时间 DTime，到达时间 Atime
	 * @return
	 */
	public String getOrderBy() {
		return orderBy;
	}

	/**
	 * 排序字段：string类型；必填；价格 Price，起飞时间 DTime，到达时间 Atime
	 * @param orderBy
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	/**
	 * 排序方向 ：string类型；必填；升序 Asc，降序 Desc
	 * @return
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * 排序方向 ：string类型；必填；升序 Asc，降序 Desc
	 * @param direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * 已选航班信息：string类型；可空； 查询下一程航班信息时必须带入的参数，例如：MU5124
	 * @return
	 */
	public String getShoppingInfoID() {
		return shoppingInfoID;
	}

	/**
	 * 已选航班信息：string类型；可空； 查询下一程航班信息时必须带入的参数，例如：MU5124
	 * @param shoppingInfoID
	 */
	public void setShoppingInfoID(String shoppingInfoID) {
		this.shoppingInfoID = shoppingInfoID;
	}

	/**
	 * 航段信息
	 * @return
	 */
	public List<SegmentInfo> getSegmentInfos() {
		return segmentInfos;
	}

	/**
	 * 航段信息
	 * @param segmentInfos
	 */
	public void setSegmentInfos(List<SegmentInfo> segmentInfos) {
		this.segmentInfos = segmentInfos;
	}

	/**
	 * 选定航路信息，如有必要添加，具体字段参看下表Routing
	 * @return
	 */
	public String getRoutings() {
		return routings;
	}

	/**
	 * 选定航路信息，如有必要添加，具体字段参看下表Routing
	 * @param routings
	 */
	public void setRoutings(String routings) {
		this.routings = routings;
	}
}
