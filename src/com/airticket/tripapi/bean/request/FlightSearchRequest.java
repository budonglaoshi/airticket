package com.airticket.tripapi.bean.request;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内航班预订
 * @author jujian
 *
 */
@XStreamAlias("FlightSearchRequest")
public class FlightSearchRequest {
	//航程类型S(单程)D(往返程)M(联程)
	@XStreamAlias("SearchType")
	private String searchType;
	//线路信息
	@XStreamAlias("Routes")
	private List<FlightRoute> routes=new ArrayList<FlightRoute>();
	//送票城市三字码
	@XStreamAlias("SendTicketCity")
	private String sendTicketCity;
	//是否返回简单响应
	@XStreamAlias("IsSimpleResponse")
	private String isSimpleResponse="true";
	//是否只返回每个航班最低价记录
	@XStreamAlias("IsLowestPrice")
	private String isLowestPrice="false";
	//产品价格类型筛选选项NormalPrice：普通政策，SingleTripPrice: 提前预售特价
	@XStreamAlias("PriceTypeOptions")
	private String[] priceTypeOptions=new String[]{"NormalPrice"};
	//产品类型筛选选项 Normal：普通，YoungMan:青年特价，OldMan:老年特价
	@XStreamAlias("ProductTypeOptions")
	private String productTypeOptions="Normal";
	//响应排序方式 DepartTime/TakeOffTime：起飞时间排序（舱位按价格次之），Price:按价格排序（时间次之），Rate:折扣优先（时间次之）,LowPrice: 低价单一排序
	@XStreamAlias("OrderBy")
	private String orderBy="Price";
	//响应排序方向 ASC:升序，Desc:降序
	@XStreamAlias("Direction")
	private String direction="ASC";
	
	/**
	 * 航程类型S(单程)D(往返程)M(联程)
	 * @return
	 */
	public String getSearchType() {
		return searchType;
	}
	/**
	 * 航程类型S(单程)D(往返程)M(联程)
	 * @return
	 */
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	/**
	 * 线路信息
	 * @return
	 */
	public List<FlightRoute> getRoutes() {
		return routes;
	}
	/**
	 * 线路信息
	 * @return
	 */
	public void setRoutes(List<FlightRoute> routes) {
		this.routes = routes;
	}
	/**
	 * 送票城市三字码
	 * @return
	 */
	public String getSendTicketCity() {
		return sendTicketCity;
	}
	/**
	 * 送票城市三字码
	 * @return
	 */
	public void setSendTicketCity(String sendTicketCity) {
		this.sendTicketCity = sendTicketCity;
	}
	/**
	 * 是否返回简单响应
	 * @return
	 */
	public String getIsSimpleResponse() {
		return isSimpleResponse;
	}
	/**
	 * 是否返回简单响应
	 * @return
	 */
	public void setIsSimpleResponse(String isSimpleResponse) {
		this.isSimpleResponse = isSimpleResponse;
	}
	/**
	 * 是否只返回每个航班最低价记录
	 * @return
	 */
	public String getIsLowestPrice() {
		return isLowestPrice;
	}
	/**
	 * 是否只返回每个航班最低价记录
	 * @param isLowestPrice
	 */
	public void setIsLowestPrice(String isLowestPrice) {
		this.isLowestPrice = isLowestPrice;
	}
	/**
	 * 产品价格类型筛选选项NormalPrice：普通政策，SingleTripPrice: 提前预售特价
	 * @return
	 */
	public String[] getPriceTypeOptions() {
		return priceTypeOptions;
	}
	/**
	 * 产品价格类型筛选选项NormalPrice：普通政策，SingleTripPrice: 提前预售特价
	 * @param priceTypeOptions
	 */
	public void setPriceTypeOptions(String[] priceTypeOptions) {
		this.priceTypeOptions = priceTypeOptions;
	}
	/**
	 * 产品类型筛选选项 Normal：普通，YoungMan:青年特价，OldMan:老年特价
	 * @return
	 */
	public String getProductTypeOptions() {
		return productTypeOptions;
	}
	/**
	 * 产品类型筛选选项 Normal：普通，YoungMan:青年特价，OldMan:老年特价
	 * @param productTypeOptions
	 */
	public void setProductTypeOptions(String productTypeOptions) {
		this.productTypeOptions = productTypeOptions;
	}
	/**
	 * 响应排序方式 DepartTime/TakeOffTime：起飞时间排序（舱位按价格次之），Price:按价格排序（时间次之），Rate:折扣优先（时间次之）,LowPrice: 低价单一排序
	 * @return
	 */
	public String getOrderBy() {
		return orderBy;
	}
	/**
	 * 响应排序方式 DepartTime/TakeOffTime：起飞时间排序（舱位按价格次之），Price:按价格排序（时间次之），Rate:折扣优先（时间次之）,LowPrice: 低价单一排序
	 * @param orderBy
	 */
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	/**
	 * 响应排序方向 ASC:升序，Desc:降序
	 * @return
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * 响应排序方向 ASC:升序，Desc:降序
	 * @param direction
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
}
