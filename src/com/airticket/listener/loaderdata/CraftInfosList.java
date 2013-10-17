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
 * 机型信息列表
 * @author jujian
 *
 */
@XStreamAlias("CraftInfosList")
public class CraftInfosList implements DataConfingLoader,Serializable {
	@XStreamOmitField
	private static final long serialVersionUID = 6723325878645333805L;
	//机型信息列表
	@XStreamImplicit(itemFieldName="CraftInfoEntity")
	private List<CraftInfoEntity> craftInfosList;

	/**
	 * 机型信息列表
	 * @return
	 */
	public List<CraftInfoEntity> getCraftInfosList() {
		return craftInfosList;
	}

	/**
	 * 机型信息列表
	 * @return
	 */
	public void setCraftInfosList(List<CraftInfoEntity> craftInfosList) {
		this.craftInfosList = craftInfosList;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.listener.DataConfingLoader#loading(java.util.List, javax.servlet.ServletContext)
	 */
	public void loading(ServletContext context) {
		String className = CraftInfosList.class.getSimpleName();
		context.log("正在加载"+className+".xml......");
		String xml = SignatureUtils.xmlToString(StaticData.XML_PATH+className+".xml");
		
		context.log("正在初始化"+className+"类......");
		CraftInfosList craftInfos = ServiceAdapter.xmlToBean(xml, CraftInfosList.class);
		
		context.log("初始化"+className+"类完成！......");
		
		context.log("开始加载初始数据......");
		Map<String, Object> craftInfoEntityMap = new HashMap<String, Object>();
		for (CraftInfoEntity craftInfoEntity : craftInfos.getCraftInfosList()) {
			craftInfoEntityMap.put(craftInfoEntity.getCraftType(),craftInfoEntity);
		}
		context.log("Loader开始加载"+className+"类数据......");
		StaticData.loaderDatas.put(className, craftInfoEntityMap);
		context.log("Loader 加载"+className+"类数据完成......");
		
	}
	
	
}
