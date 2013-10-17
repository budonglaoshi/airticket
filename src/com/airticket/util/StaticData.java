package com.airticket.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StaticData {
	public static final String EMPTY = "";
	public static final String START_TAG = "<";
	public static final String END_TAG = ">";
	public static final String SERCH_URL = "http://openapi.ctrip.com/Flight/DomesticFlight/OTA_FlightSearch.asmx?wsdl";
	public static final String XML_PATH = "/com/airticket/listener/loaderdata/";
	public static final String T_DATA_DEFAULT = "0001-01-01T00:00:00";
	
	public static final String[] FILTER_JSON_STR = new String[]{"craftInfo","airlineInfo","depAirportInfo","arrAirportInfo",
		"recordCount","lowerPrice","arriveTime","flyTime","flightNo","carftType","airLineCode",
		"departCityCode","arriveCityCode","mealType","rate","flightClass","quantity","class"};
	
	public static final String[] ORDERID_INDEX=new String[]{"A","B","C","D","E","F","G","H","I","G","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	//
	public static Map<String,Map<String, Object>> loaderDatas = new HashMap<String,Map<String,Object>>();
	
	//仓位等级key为代码，value为名称
	public static Map<String, String> flightClassNames = new HashMap<String, String>();
	
}
