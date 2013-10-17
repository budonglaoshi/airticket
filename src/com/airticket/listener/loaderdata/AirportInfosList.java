package com.airticket.listener.loaderdata;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import com.airticket.adapter.ServiceAdapter;
import com.airticket.listener.DataConfingLoader;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * 机场信息列表
 * @author jujian
 *
 */
@XStreamAlias("AirportInfosList")
public class AirportInfosList implements DataConfingLoader,Serializable {
	
	@XStreamOmitField
	private static final long serialVersionUID = -2559422653336616463L;
	//机场信息列表
	@XStreamImplicit(itemFieldName="AirportInfoEntity")
	private List<AirportInfoEntity> airportInfosList;

	/**
	 * 机场信息列表
	 * @return
	 */
	public List<AirportInfoEntity> getAirportInfosList() {
		return airportInfosList;
	}

	/**
	 * 机场信息列表
	 * @return
	 */
	public void setAirportInfosList(List<AirportInfoEntity> airportInfosList) {
		this.airportInfosList = airportInfosList;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.listener.DataConfingLoader#loading(java.util.List, javax.servlet.ServletContext)
	 */
	public void loading(ServletContext context) {
		String className = AirportInfosList.class.getSimpleName();
		context.log("正在加载"+className+".xml......");
		String xml = SignatureUtils.xmlToString(StaticData.XML_PATH+className+".xml");
		
		context.log("正在初始化"+className+"类......");
		AirportInfosList airportInfos = ServiceAdapter.xmlToBean(xml, AirportInfosList.class);
		
		context.log("初始化"+className+"类完成！......");
		
		context.log("开始加载初始数据......");
		Map<String, Object> AirportInfosMap = new HashMap<String, Object>();
		for (AirportInfoEntity airportInfoEntity : airportInfos.getAirportInfosList()) {
			AirportInfosMap.put(airportInfoEntity.getAirPort(),airportInfoEntity);
		}
		context.log("Loader开始加载"+className+"类数据......");
		StaticData.loaderDatas.put(className, AirportInfosMap);
		context.log("Loader 加载"+className+"类数据完成......");
		
	}
	
}
