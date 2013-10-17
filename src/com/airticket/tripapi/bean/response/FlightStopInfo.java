package com.airticket.tripapi.bean.response;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("FlightStopInfo")
public class FlightStopInfo implements Serializable {

//	<ArriveTime>2013-11-01T10:50:00</ArriveTime>
//	<DepartTime>2013-11-01T11:40:00</DepartTime>
//	<StayInterval>50</StayInterval>
//	<StopCity>WXN</StopCity>
	@XStreamAlias("ArriveTime")
	private String arriveTime;
	@XStreamAlias("DepartTime")
	private String departTime;
	@XStreamAlias("StayInterval")
	private String stayInterval;
	@XStreamAlias("StopCity")
	private String stopCity;
	
	
	public String getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}
	public String getDepartTime() {
		return departTime;
	}
	public void setDepartTime(String departTime) {
		this.departTime = departTime;
	}
	public String getStayInterval() {
		return stayInterval;
	}
	public void setStayInterval(String stayInterval) {
		this.stayInterval = stayInterval;
	}
	public String getStopCity() {
		return stopCity;
	}
	public void setStopCity(String stopCity) {
		this.stopCity = stopCity;
	}
	
	
}
