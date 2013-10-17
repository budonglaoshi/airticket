package com.airticket.adapter;

//import org.dom4j.Document;
//import org.dom4j.DocumentException;
//import org.dom4j.DocumentHelper;

import org.apache.log4j.Logger;

import com.airticket.util.StaticData;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class ServiceAdapter {

	public static Logger logger = Logger.getLogger(ServiceAdapter.class);
	
	/**
	 * 将实体映射成xml
	 * 
	 * @param obj
	 * @return
	 */
	public static String beanToXml(Object obj) {
		XStream xStream = new XStream();
		xStream.processAnnotations(obj.getClass());
		return xStream.toXML(obj);
	}

	/**
	 * 将xml反转为实体
	 * 
	 * @param xml
	 * @param clazz
	 * @return
	 */
	public static <T> T xmlToBean(String xml, Class<T> clazz) {
		XStream xStream = new XStream(new DomDriver());
		xStream.processAnnotations(clazz);
		xStream.autodetectAnnotations(true);
		return (T) xStream.fromXML(xml);
	}

	/**
	 * 获得响应xml主体
	 * 
	 * @param xml
	 * @param rootName
	 * @return
	 */
	public static String getXmlBody(String xml, String rootName) {
		String xmlBody = StaticData.EMPTY;
		try {
			String[] eles = xml.split(rootName);
			xmlBody = StaticData.START_TAG + rootName + eles[1] + rootName + StaticData.END_TAG;
		} catch (Exception e) {
			logger.error(xmlBody+"响应数据异常！无法进行数据分割。");
			e.printStackTrace();
		}
		return xmlBody;
	}

	

}
