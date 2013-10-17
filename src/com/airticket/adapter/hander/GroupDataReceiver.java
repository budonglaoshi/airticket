package com.airticket.adapter.hander;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import com.airticket.adapter.DataReceiver;
import com.airticket.bean.ResponseView;
import com.airticket.tripapi.bean.response.DomesticFlightData;
import com.airticket.tripapi.bean.response.DomesticFlightRoute;
import com.airticket.tripapi.bean.response.FlightSearchResponse;

/**
 * 机票分组接收器
 * @author Allen
 *
 */
public class GroupDataReceiver extends DataReceiver {

	@Override
	public List<ResponseView> getResponseViewer(FlightSearchResponse responser) {
		DomesticFlightRoute flightRoute = responser.getFlightRoutes().get(0);
		//分组数据
		List<DomesticFlightData> datas = this.lowerPriceDatas(flightRoute.getFlightsList());
		
		return super.groupData(flightRoute,datas);
	}

	
	/**
	 * 机票分类(数据来源为按价格升序排序)
	 * 
	 * @param flightDatas
	 * @return 分类完成的数据集合(按价格升序排序)
	 */
	private Map<String, Map<String, List<DomesticFlightData>>> groupData(
			List<DomesticFlightData> flightDatas) {

		// LinkedHashMap 保持原有的价格排序
		Map<String, Map<String, List<DomesticFlightData>>> datasMap = new LinkedHashMap<String, Map<String, List<DomesticFlightData>>>();
		// 筛选出航班号（先按航班号分组，再按仓位类型分组）
		for (DomesticFlightData data : flightDatas) {
			// 判断航班号是否已存在
			if (!datasMap.keySet().contains(data.getFlight())) {
				// 航班号集合
				datasMap.put(data.getFlight(),
						new LinkedHashMap<String, List<DomesticFlightData>>());
				// 三种仓位类型集合
				datasMap.get(data.getFlight()).put("Y",
						new ArrayList<DomesticFlightData>());
				datasMap.get(data.getFlight()).put("F",
						new ArrayList<DomesticFlightData>());
				datasMap.get(data.getFlight()).put("C",
						new ArrayList<DomesticFlightData>());
			} else {
				// 已存在的航班就加入集合中
				for (String key : datasMap.get(data.getFlight()).keySet()) {
					// 判断航班仓位类型
					if (key.equals(data.getFlightClass())) {
						datasMap.get(data.getFlight())
								.get(data.getFlightClass()).add(data);
					}
				}
			}
		}
		return datasMap;
	}

	/**
	 * 按照航空公司级仓位等级获取航班最低价集合
	 * 
	 * @param flightDatas
	 * @return
	 */
	private List<DomesticFlightData> lowerPriceDatas(
			List<DomesticFlightData> flightDatas) {

		Map<String, Map<String, List<DomesticFlightData>>> datasMap = this
				.groupData(flightDatas);

		List<DomesticFlightData> datas = new ArrayList<DomesticFlightData>();
		for (Map<String, List<DomesticFlightData>> dataMap : datasMap.values()) {
			for (List<DomesticFlightData> filterDatas : dataMap.values()) {
				if (null != filterDatas && 0 < filterDatas.size()) {
					// 应为源数据已经按照价格升序排序，所以集合第一个为最低价
					datas.add(filterDatas.get(0));
				}
			}
		}
		return datas;
	}

}
