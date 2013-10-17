package com.airticket.adapter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import com.airticket.util.ConfigData;
import com.airticket.util.SignatureUtils;

/**
 * 数据访问器
 * @author Administrator
 *
 */
public class DataVisiter {

	// Http请求静态信息
	private static ArrayList<HttpRequestProperty> StaticHttpRequestProperty = LoadStaticHttpRequestProperties();
	//数据适配器
	private static ServiceAdapter adapter;
	
	

	/**
	 * 发送请求数据
	 * 
	 * @param requestContent
	 * @param urlString
	 * @param paraName
	 * @return
	 */
	private  static  String SendRequestToUrl(String requestContent,String urlString, String paraName) {
		InputStream errorStream = null;
		HttpURLConnection httpCon = null;
		try {
			// wsdl 地址
			URL url = new URL(urlString);
			String content = XMLToString(requestContent);
			// 读取xml模版
			String soapMessage = AddSoapShell(content);
			httpCon = (HttpURLConnection) url.openConnection();
			httpCon.setRequestMethod("POST");
			
//			httpCon.setConnectTimeout(1000*60*60*3);
//			httpCon.setReadTimeout(1000*60*60*3);
			
			httpCon.setDoOutput(true);
			httpCon.setDoInput(true);
			for (int i = 0; i < StaticHttpRequestProperty.size(); i++) {
				httpCon.setRequestProperty(StaticHttpRequestProperty.get(i)
						.getName(), StaticHttpRequestProperty.get(i).getValue());
			}
			httpCon.setRequestProperty("Content-Length",
					String.valueOf(soapMessage.length()));

			OutputStream outputStream = httpCon.getOutputStream();
			outputStream.write(soapMessage.getBytes("UTF-8"));
			outputStream.close();
			
			
			
			InputStream inputStream = httpCon.getInputStream();
			// String encoding = httpCon.getRequestProperty("Accept-Encoding");
			BufferedReader br = null;
			// httpCon.getResponseMessage();
			if (httpCon.getRequestProperty("Accept-Encoding") != null) {
				try {
					GZIPInputStream gzipStream = new GZIPInputStream(
							inputStream);
					br = new BufferedReader(new InputStreamReader(gzipStream,
							"UTF-8"));
				} catch (IOException e) {
					br = new BufferedReader(new InputStreamReader(inputStream,
							"UTF-8"));
				}
			} else {
				br = new BufferedReader(new InputStreamReader(inputStream,
						"UTF-8"));
			}
			StringBuffer result = new StringBuffer();
			String line = null;

			while ((line = br.readLine()) != null) {
				result.append(line);
			}

			return StringToXML(RemoveSoapShell(result.toString()));

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			errorStream = httpCon.getErrorStream();
			if (errorStream != null) {
				String errorMessage = null;
				String line = null;
				BufferedReader br = new BufferedReader(new InputStreamReader(
						errorStream));
				try {
					while ((line = br.readLine()) != null) {
						errorMessage += line;
					}
					return errorMessage;
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
			try {
				errorStream.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (SdkSystemException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (httpCon != null) {
				httpCon.disconnect();
			}
		}

		return "";
	}

	/**
	 * 组装请求xml
	 * 
	 * @param body
	 * @return
	 */
	private static String createRequestXml(String body) {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append("<Request><Header AllianceID=\"");
			sb.append(ConfigData.AllianceId);
			sb.append("\" SID=\"");
			sb.append(ConfigData.SId);
			sb.append("\" TimeStamp=\"");
			long timestamp = SignatureUtils.GetTimeStamp();
			sb.append(timestamp);
			sb.append("\" Signature=\"");

			String signature = SignatureUtils.CalculationSignature(timestamp
					+ "", ConfigData.AllianceId, ConfigData.SecretKey,
					ConfigData.SId, ConfigData.RequestType);
			sb.append(signature);
			sb.append("\" RequestType=\"");
			sb.append(ConfigData.RequestType);
			sb.append("\"/>");
			sb.append(body);
			sb.append("</Request>");
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
		return sb.toString();
	}

	/**
	 * 将Soap外壳添加到请求体上
	 * 
	 * @param patameterValue
	 * @return
	 * @throws Exception
	 */
	private static String AddSoapShell(String patameterValue) throws Exception {
		BufferedReader bufferedReader = null;
		try {
			InputStream in = ServiceAdapter.class
					.getResourceAsStream("/RequestSOAPTemplate.xml");
			bufferedReader = new BufferedReader(new InputStreamReader(in));
			String text = bufferedReader.readLine();
			StringBuilder soapShellStringBuilder = new StringBuilder();
			while (text != null) {
				soapShellStringBuilder.append(text);
				text = bufferedReader.readLine();
			}
			String result = soapShellStringBuilder.toString();
			return result.replaceAll("string", patameterValue);
		} catch (FileNotFoundException e) {
			throw new SdkSystemException("无法找到请求模板文件");
		} catch (IOException e) {
			throw new SdkSystemException("无法读取请求模板文件");
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
				}
			}
		}
	}

	/**
	 * 删除Soap外壳信息
	 * 
	 * @param source
	 * @return
	 */
	private static String RemoveSoapShell(String source) {
		String result = "";
		int indexElementBegin = source.indexOf("<RequestResult>");
		int indexElementEnd = source.indexOf("</RequestResult>");
		if (indexElementBegin > 0 && indexElementEnd > 0) {
			result = source.substring(
					indexElementBegin + "<RequestResult>".length(),
					indexElementEnd);
		}
		return result;
	}

	/**
	 * 将xml文档转换为可传输的字符串
	 * 
	 * @param source
	 * @return
	 */
	private static String XMLToString(String source) {
		String result = source.replaceAll("<", "&lt;");
		result = result.replaceAll(">", "&gt;");
		return result;
	}

	/**
	 * 将返回的字符串转换为可反序列化XML文本
	 * 
	 * @param source
	 * @return
	 */
	private static String StringToXML(String source) {
		String result = source.replaceAll("&lt;", "<");
		result = result.replaceAll("&gt;", ">");
		return result;
	}

	/**
	 * 加载静态信息
	 * 
	 * @return
	 */
	private static ArrayList<HttpRequestProperty> LoadStaticHttpRequestProperties() {

		ArrayList<HttpRequestProperty> staticHttpRequestProperty = new ArrayList<HttpRequestProperty>();
		// staticHttpRequestProperty.add(new HttpRequestProperty("Host",
		// "crmint.dev.sh.ctriptravel.com"));
		staticHttpRequestProperty.add(new HttpRequestProperty("Content-Type",
				"text/xml; charset=UTF-8"));
		staticHttpRequestProperty.add(new HttpRequestProperty("SOAPAction",
				"http://ctrip.com/Request"));
		staticHttpRequestProperty.add(new HttpRequestProperty(
				"Accept-Encoding", "gzip, deflate"));
		return staticHttpRequestProperty;
	}

	
	
	/**
	 *	发送请求接收数据（内部包含数据转换）
	 * @param res  请求对象
	 * @param req 响应对象
	 * @param url 请求地址
	 * @param requestType 请求类型
	 * @return
	 * @throws IllegalAccessException 
	 * @throws  
	 */
	public static <T> T sendData(Object requester,String requesterName,Class<T> responser,String url) throws Exception{
		T resObj = null;
		try {
			String requestBody = adapter.beanToXml(requester);
			String requestXml = createRequestXml(requestBody);
			//System.out.println(requestXml);
			String responseXml = SendRequestToUrl(requestXml, url, "requestXML");
			//System.out.println(responseXml);
			String response = adapter.getXmlBody(responseXml, requesterName);
			resObj = adapter.xmlToBean(response,responser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resObj;
	}
	
	

	
	
	
}
