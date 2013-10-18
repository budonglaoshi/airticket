package com.airticket.biz;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.airticket.adapter.DataReceiver;
import com.airticket.adapter.DataVisiter;
import com.airticket.bean.RequestView;
import com.airticket.bean.ResponseView;
import com.airticket.biz.IFlightSerchBiz;
import com.airticket.biz.handler.LoadMonthPricesHandler;
import com.airticket.tripapi.bean.request.FlightRoute;
import com.airticket.tripapi.bean.request.FlightSearchRequest;
import com.airticket.tripapi.bean.response.FlightSearchResponse;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;

/**
 * 
 * @author ALLENZHU
 * 
 */
public class FlightSerchBizImpl implements IFlightSerchBiz {

	private static Logger logger = Logger.getLogger(FlightSerchBizImpl.class);

	// 请求发送器
	private DataVisiter visiter;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.airticket.biz.IFlightSerchBiz#serchFlight(com.airticket.tripapi.bean
	 * .request.FlightSearchRequest, java.lang.String)
	 */
	public List<ResponseView> searchFlight(RequestView requestView, String url,
			DataReceiver receiver) {
		List<ResponseView> viewers = null;
		try {
			// 获得请求对象
			FlightSearchRequest requester = this.getRequester(requestView);
			// 发送请求 获得响应数据
			FlightSearchResponse responser = DataVisiter.sendData(requester,
					FlightSearchResponse.class.getSimpleName(),
					FlightSearchResponse.class, url);
			// 获得视图对象
			viewers = receiver.getResponseViewer(responser);

		} catch (Exception e) {
			logger.error("数据发送异常!");
			viewers = null;
		}
		return viewers;
	}

	/**
	 * 
	 * @param requestView
	 * @param url
	 * @param receiver
	 * @return
	 */
	public List<ResponseView> searchDaysFlight(Date[] days,
			RequestView requestView, String url, DataReceiver receiver) {
		List<ResponseView> viewers = new ArrayList<ResponseView>();
		try {
			synchronized (FlightSerchBizImpl.class) {
				for (Date date : days) {
					requestView.setDepartDate(date);
					FlightSearchRequest requester = this.getRequester(requestView);
					new Thread(new LoadMonthPricesHandler(requester, viewers,receiver)).start();
				}
			}
			while (viewers.size() < 3) {
				continue;
			}
		} catch (Exception e) {
			logger.error("数据发送异常!");
			viewers = null;
		}
		return viewers;
	}

	/**
	 * 请求数据组装
	 * 
	 * @param requestView
	 * @return
	 */
	private FlightSearchRequest getRequester(RequestView requestView) {
		// 数据组装
		FlightSearchRequest requester = new FlightSearchRequest();
		requester.setRoutes(new ArrayList<FlightRoute>());
		requester.setSearchType(requestView.getSearchType());
		FlightRoute route = new FlightRoute();
		
		route.setDepartCity(requestView.getDepartCity());
		route.setArriveCity(requestView.getArriveCity());
		String departDate = SignatureUtils.formatDateToString(requestView.getDepartDate(),"yyyy-MM-dd");
		route.setDepartDate(departDate);
		
		requester.setOrderBy(requestView.getOrderBy());
		route.setEarliestDepartTime(null!=requestView.getEarliesDeaprtTime()?SignatureUtils.formatDateToString(requestView.getEarliesDeaprtTime(),"yyyy-MM-dd'T'hh:mm:ss"):StaticData.T_DATA_DEFAULT);
		route.setLatestDepartTime(null!=requestView.getLastDepartTime()?SignatureUtils.formatDateToString(requestView.getLastDepartTime(),"yyyy-MM-dd'T'hh:mm:ss"):StaticData.T_DATA_DEFAULT);
		
		requester.getRoutes().add(route);
		
		return requester;
	}

	// getter and setter
	public DataVisiter getVisiter() {
		return visiter;
	}

	public void setVisiter(DataVisiter visiter) {
		this.visiter = visiter;
	}

}
