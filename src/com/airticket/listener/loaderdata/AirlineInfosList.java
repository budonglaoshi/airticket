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
 * 航空公司信息列表
 * @author jujian
 *
 */
@XStreamAlias("AirlineInfosList")
public class AirlineInfosList implements DataConfingLoader,Serializable {
	
	@XStreamOmitField
	private static final long serialVersionUID = 8221510622961331020L;
	//航空公司信息列表
	@XStreamImplicit(itemFieldName="AirlineInfoEntity")
	private List<AirlineInfoEntity> airlineInfosList;

	/**
	 * 航空公司信息列表
	 * @return
	 */
	public List<AirlineInfoEntity> getAirlineInfosList() {
		return airlineInfosList;
	}

	/**
	 * 航空公司信息列表
	 * @param airlineInfosList
	 */
	public void setAirlineInfosList(List<AirlineInfoEntity> airlineInfosList) {
		this.airlineInfosList = airlineInfosList;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.listener.DataConfingLoader#loading(java.util.List, javax.servlet.ServletContext)
	 */
	public void loading(ServletContext context) {
		String className = AirlineInfosList.class.getSimpleName();
		context.log("正在加载"+className+".xml......");
		String xml = SignatureUtils.xmlToString(StaticData.XML_PATH+className+".xml");
		
		context.log("正在初始化"+className+"类......");
		AirlineInfosList airlineInfos = ServiceAdapter.xmlToBean(xml, AirlineInfosList.class);
		
		context.log("初始化"+className+"类完成！......");
		
		context.log("开始加载初始数据......");
		Map<String, Object> airlineInfosMap = new HashMap<String, Object>();
		for (AirlineInfoEntity airlineInfo : airlineInfos.getAirlineInfosList()) {
			airlineInfosMap.put(airlineInfo.getAirLine(),airlineInfo);
		}
		context.log("Loader开始加载"+className+"类数据......");
		StaticData.loaderDatas.put(className, airlineInfosMap);
		context.log("Loader 加载"+className+"类数据完成......");
	}
	
}
