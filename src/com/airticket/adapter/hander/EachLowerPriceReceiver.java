package com.airticket.adapter.hander;

import java.util.ArrayList;
import java.util.List;

import com.airticket.adapter.DataReceiver;
import com.airticket.bean.ResponseView;
import com.airticket.tripapi.bean.response.DomesticFlightData;
import com.airticket.tripapi.bean.response.DomesticFlightRoute;
import com.airticket.tripapi.bean.response.FlightSearchResponse;

/**
 * 获取30天内最低价接收器
 * @author ALLEN
 *
 */
public class EachLowerPriceReceiver extends DataReceiver {
	
	@Override
	public List<ResponseView> getResponseViewer(FlightSearchResponse responser) {
		if(null!=responser.getFlightRoutes()&&0!=responser.getFlightRoutes().size()){
			DomesticFlightRoute flightRoute = responser.getFlightRoutes().get(0);
			//
			List<DomesticFlightData> flightDatas = todayLowerPrices(flightRoute.getFlightsList());
			return super.groupData(flightRoute, flightDatas);
		}
		
		return new ArrayList<ResponseView>();
	}
	
	/**
	 * 
	 * @param datas
	 * @return
	 */
	private List<DomesticFlightData> todayLowerPrices(List<DomesticFlightData> datas){
		return datas;
	}
 	
	
}
