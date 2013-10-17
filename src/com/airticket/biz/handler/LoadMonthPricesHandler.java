package com.airticket.biz.handler;

import java.util.List;

import org.apache.log4j.Logger;

import com.airticket.adapter.DataReceiver;
import com.airticket.adapter.DataVisiter;
import com.airticket.bean.ResponseView;
import com.airticket.tripapi.bean.request.FlightSearchRequest;
import com.airticket.tripapi.bean.response.FlightSearchResponse;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;

public class LoadMonthPricesHandler implements Runnable {
	private static final Logger logger = Logger.getLogger(LoadMonthPricesHandler.class);
	
	private FlightSearchRequest request;
	private List<ResponseView> views;
	private DataReceiver receiver;
	public static Integer runCount=0;
	

	public LoadMonthPricesHandler(FlightSearchRequest request,
			List<ResponseView> views, DataReceiver receiver) {
		this.request = request;
		this.views = views;
		this.receiver = receiver;
	}

	public void run() {
		
		List<ResponseView> resviews = null;
		try {
			FlightSearchResponse responser = DataVisiter.sendData(request,FlightSearchResponse.class.getSimpleName(),FlightSearchResponse.class, StaticData.SERCH_URL);
			resviews = receiver.getResponseViewer(responser);
			views.add(resviews.get(0));
			logger.info(SignatureUtils.formatDateToString(resviews.get(0).getTakeOffTime(),"yyyy-MM-dd hh:mm:ss")+"航班数据加载完成......");
		} catch (Exception e) {
			e.printStackTrace();
		}
		runCount++;
	}

}
