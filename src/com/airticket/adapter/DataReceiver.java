package com.airticket.adapter;

import java.util.ArrayList;
import java.util.List;

import com.airticket.bean.ResponseView;
import com.airticket.listener.loaderdata.AirlineInfoEntity;
import com.airticket.listener.loaderdata.AirportInfoEntity;
import com.airticket.listener.loaderdata.CityDetail;
import com.airticket.listener.loaderdata.CraftInfoEntity;
import com.airticket.tripapi.bean.response.DomesticFlightData;
import com.airticket.tripapi.bean.response.DomesticFlightRoute;
import com.airticket.tripapi.bean.response.FlightSearchResponse;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;

/**
 * 默认数据接收器
 * @author ALLEN
 *
 */
public abstract class DataReceiver {

	/**
	 * 获取响应视图
	 * 
	 * @param responser
	 * @return
	 */
	public List<ResponseView> getResponseViewer(FlightSearchResponse responser) {
		DomesticFlightRoute flightRoute = responser.getFlightRoutes().get(0);
		return groupData(flightRoute, flightRoute.getFlightsList());
	}

	
	/**
	 * 视图数据组装
	 * @param flightRoute
	 * @param datas
	 * @return
	 */
	protected List<ResponseView> groupData(DomesticFlightRoute flightRoute,List<DomesticFlightData> datas) {
		
		List<ResponseView> views = new ArrayList<ResponseView>();
		for (DomesticFlightData data : datas) {
			ResponseView view = new ResponseView();
			view.setRecordCount(flightRoute.getRecordCount());
			
			view.setAirlineInfo((AirlineInfoEntity) StaticData.loaderDatas.get("AirlineInfosList").get(data.getAirlineCode()));
			view.setArrAirportInfo((AirportInfoEntity) StaticData.loaderDatas.get("AirportInfosList").get(data.getaPortCode()));
			view.setDepAirportInfo((AirportInfoEntity) StaticData.loaderDatas.get("AirportInfosList").get(data.getdPortCode()));
			
			view.setArrCityDetail((CityDetail) StaticData.loaderDatas.get("CityDetails").get(data.getArriveCityCode()));
			view.setDepCityDetail((CityDetail) StaticData.loaderDatas.get("CityDetails").get(data.getDepartCityCode()));
			
			view.setCraftInfo((CraftInfoEntity) StaticData.loaderDatas.get("CraftInfosList").get(data.getCraftType()));
			view.setTakeOffTime(SignatureUtils.formatStringToDate(data.getTakeOffTime(),"yyyy-MM-dd'T'hh:mm:ss"));

			view.setArriveTime(SignatureUtils.formatStringToDate(data.getArriveTime(),"yyyy-MM-dd'T'hh:mm:ss"));
			
			view.setPrice(data.getPrice());
			view.setRate(data.getRate());
			view.setFlightClass(data.getFlightClass());
			view.setFlightClassName(StaticData.flightClassNames.get(data.getFlightClass()));
			
			view.setQuantity(data.getQuantity());

			view.setFlightNo(data.getFlight());
			
			view.setStandardPrice(data.getStandardPrice());
			view.setChildStandardPrice(data.getChildStandardPrice());
			view.setBabyStandardPrice(data.getBabyStandardPrice());
			
			view.setMealType(data.getMealType());

			if (null != view.getCraftInfo() && null != view.getAirlineInfo()
					&& null != view.getArrAirportInfo()
					&& null != view.getDepAirportInfo()
					&& null != view.getArrCityDetail()
					&& null != view.getDepCityDetail()) {
				views.add(view);
			}
		}
		
		return views;

	}

}
