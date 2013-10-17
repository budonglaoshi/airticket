package com.airticket.tripapi.bean.request;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ServiceUrl")
public class ServiceUrl {
	
	//国内机票查询
	public static final String OTA_FlightSearch = "http://openapi.ctrip.com/Flight/DomesticFlight/OTA_FlightSearch.asmx?wsdl";
	
	
	
	
}

