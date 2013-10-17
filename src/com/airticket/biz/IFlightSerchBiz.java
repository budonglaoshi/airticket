package com.airticket.biz;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.airticket.adapter.DataReceiver;
import com.airticket.bean.RequestView;
import com.airticket.bean.ResponseView;
import com.airticket.tripapi.bean.request.FlightSearchRequest;
import com.airticket.tripapi.bean.response.FlightSearchResponse;


/**
 * 机票查询接口
 * @author ALLENZHU
 *
 */
public interface IFlightSerchBiz {
	
	/**
	 * 机票查询
	 * @param requester 请求对象
	 * @param url 请求地址
	 * @param params 缓存条件
	 * @param receiver 接收�?
	 * @return 响应对象集合 
	 */
	public List<ResponseView> searchFlight(RequestView requester,String url,DataReceiver receiver);
	
	/**
	 * 
	 * @param requestView
	 * @param url
	 * @param receiver
	 * @return
	 */
	public List<ResponseView> searchDaysFlight(Date[] days,RequestView requestView, String url,DataReceiver receiver);
	
	
	
	
	
}
