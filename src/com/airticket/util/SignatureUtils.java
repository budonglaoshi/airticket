package com.airticket.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.airticket.listener.DataConfigLoaderListener;

public class SignatureUtils {

	/**
	 * 获得时间戳
	 * 
	 * @return 时间秒数
	 */
	public static long GetTimeStamp() {
		return System.currentTimeMillis() / 1000;
	}
	/**
	 * Date转String
	 * @param date
	 * @param 日期字符串
	 * @return
	 */
	public static String formatDateToString(Date date,String type) {
		String dateStr=StaticData.EMPTY;
		if(null!=date){
			SimpleDateFormat sdf = new SimpleDateFormat(type);
			 dateStr = sdf.format(date);
		}
		return dateStr;
	}
	
	/**
	 * String转Date
	 * @param 日期字符串
	 * @param Date格式
	 * @return
	 */
	public static Date formatStringToDate(String dateStr,String type) {
		if(null!=dateStr&&!StaticData.EMPTY.equals(dateStr)){
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(type);
				return sdf.parse(dateStr);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
	/**
	 * 
	 * @param calendar
	 * @return
	 */
	public static Date getToday(Calendar calendar){
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DAY_OF_MONTH);
		StringBuilder today = new StringBuilder(year+"-");
		if(month<10){
			today.append("0"+month+"-");
		}else{
			today.append(month+"-");
		}
		
		if(date<10){
			today.append("0"+date);
		}else{
			today.append(date);
		}
		Date todDate = formatStringToDate(today.toString(),"yyyy-MM-dd");
		return todDate;
	}
	
	/**
	 * 
	 * @return
	 */
	public static Date[] getDays(int count){
		Date[] days = new Date[count];
		Calendar calendar = Calendar.getInstance();
		days[0] = getToday(calendar);
		for (int i=1;i<count;i++) {
			calendar.add(Calendar.DAY_OF_MONTH,1);
			days[i] = getToday(calendar);
		}
		return days;
	}
	
	
	
	// 获得签名
	public static String CalculationSignature(String timeStamp,
			String allianceID, String secretKey, String sid, String requestType)
			throws NoSuchAlgorithmException, Exception {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(timeStamp);

		if (Integer.parseInt(allianceID) > 0) {
			stringBuilder.append(allianceID);
		}

		if (secretKey != null && !secretKey.equals("")) {
			String sectetKeyMD5 = MD5Encoding(secretKey).toUpperCase();
			stringBuilder.append(sectetKeyMD5);
		} else {
			throw new Exception("SecretKey should not be null or empty!");
		}

		if (Integer.parseInt(sid) > 0) {
			stringBuilder.append(sid);
		}

		if (requestType != null && !requestType.trim().equals("")) {
			stringBuilder.append(requestType);
		}

		String result = stringBuilder.toString();
		String signature = "";
		try {
			signature = MD5Encoding(result).toUpperCase();
		} catch (NoSuchAlgorithmException e) {

		}
		return signature;
	}

	/**
	 * MD5加密
	 * 
	 * @param source
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	private static String MD5Encoding(String source)
			throws NoSuchAlgorithmException {
		MessageDigest mdInst = MessageDigest.getInstance("MD5");
		byte[] input = source.getBytes();
		mdInst.update(input);
		byte[] output = mdInst.digest();

		int i = 0;

		StringBuffer buf = new StringBuffer("");

		for (int offset = 0; offset < output.length; offset++) {
			i = output[offset];

			if (i < 0) {
				i += 256;
			}

			if (i < 16) {
				buf.append("0");
			}

			buf.append(Integer.toHexString(i));
		}
		return buf.toString();
	}
	
	/**
	 * xml文件转化字符串
	 * @param xmlPath
	 * @return
	 */
	public static String xmlToString(String xmlPath) {
		StringBuilder sb = new StringBuilder();
		InputStream is = DataConfigLoaderListener.class
				.getResourceAsStream(xmlPath);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		try {
			String text = reader.readLine();
			while (null != text) {
				sb.append(text);
				text = reader.readLine();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	

}