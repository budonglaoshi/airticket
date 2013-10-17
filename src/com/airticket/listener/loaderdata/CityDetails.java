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

/**
 * 国内城市信息列表
 * @author Administrator
 *
 */
@XStreamAlias("CityDetails")
public class CityDetails implements DataConfingLoader,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2114086703779092345L;
	//国内城市信息列表
	@XStreamImplicit(itemFieldName="CityDetail")
	private List<CityDetail> cityDetails;

	/**
	 * 国内城市信息列表
	 * @return
	 */
	public List<CityDetail> getCityDetails() {
		return cityDetails;
	}

	/**
	 * 国内城市信息列表
	 * @return
	 */
	public void setCityDetails(List<CityDetail> cityDetails) {
		this.cityDetails = cityDetails;
	}

	/*
	 * (non-Javadoc)
	 * @see com.airticket.listener.DataConfingLoader#loading(java.util.List, javax.servlet.ServletContext)
	 */
	public void loading(ServletContext context) {
		String className = CityDetails.class.getSimpleName();
		context.log("正在加载"+className+".xml......");
		String xml = SignatureUtils.xmlToString(StaticData.XML_PATH+className+".xml");
		
		context.log("正在初始化"+className+"类......");
		CityDetails cityDetails = ServiceAdapter.xmlToBean(xml, CityDetails.class);
		
		context.log("初始化"+className+"类完成！......");
		
		context.log("开始加载初始数据......");
		Map<String, Object> cityDetailsMap = new HashMap<String, Object>();
		for (CityDetail city : cityDetails.getCityDetails()) {
			cityDetailsMap.put(city.getCityCode(),city);
		}
		context.log("Loader开始加载"+className+"类数据......");
		StaticData.loaderDatas.put(className, cityDetailsMap);
		context.log("Loader 加载"+className+"类数据完成......");
		
	}
}
