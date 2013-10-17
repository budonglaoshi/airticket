package com.airticket.listener;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsDateJsonBeanProcessor;

import com.airticket.adapter.DataReceiver;
import com.airticket.adapter.hander.EachLowerPriceReceiver;
import com.airticket.bean.RequestView;
import com.airticket.bean.ResponseView;
import com.airticket.biz.FlightSerchBizImpl;
import com.airticket.biz.IFlightSerchBiz;
import com.airticket.listener.loaderdata.AirlineInfosList;
import com.airticket.listener.loaderdata.AirportInfosList;
import com.airticket.listener.loaderdata.CityDetails;
import com.airticket.listener.loaderdata.CraftInfosList;
import com.airticket.util.MemcachedUtil;
import com.airticket.util.SignatureUtils;
import com.airticket.util.StaticData;
import com.danga.MemCached.MemCachedClient;

public class DataConfigLoaderListener implements ServletContextListener {

	
	public void contextDestroyed(ServletContextEvent sce) {
		StaticData.loaderDatas = null;
	}

	public void contextInitialized(ServletContextEvent sce) {

		ServletContext context = sce.getServletContext();
		//
		DataConfingLoader loader = new AirlineInfosList();
		loader.loading(context);
		//
		loader = new AirportInfosList();
		loader.loading(context);
		//
		loader = new CityDetails();
		loader.loading(context);
		//
		loader = new CraftInfosList();
		loader.loading(context);

		StaticData.flightClassNames.put("Y", "经济舱");
		StaticData.flightClassNames.put("F", "头等舱");
		StaticData.flightClassNames.put("C", "公务舱");

		Timer lineTimer = new Timer(true);
		timerHandler handler = new timerHandler(context);
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_MONTH, 1);
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH) + 1;
		int day = calendar.get(calendar.DAY_OF_MONTH);
		String dateStr = year + "-" + month + "-" + day + " 02:00:00";
		Date date = SignatureUtils.formatStringToDate(dateStr,"yyyy-MM-dd hh:mm:ss");
		//24*60*60*1000
		lineTimer.schedule(handler,date,24*60*60*1000);
	}

	class timerHandler extends TimerTask {

		private ServletContext context;
		private Properties prop;

		public timerHandler(ServletContext context) {
			this.context = context;
		}

		@Override
		public void run() {
			context.log("定时器启动.....");
			loadAllLineDatas();
		}

		public boolean loadAllLineDatas() {
			context.log("加载曲线图，日历价格表 路线数据......");
			context.log("----加载配置......");
			InputStream is = DataConfigLoaderListener.class.getResourceAsStream("/linedatas.properties");
			prop = new Properties();
			try {
				prop.load(is);
				context.log("----加载配置完成......");
				context.log("----缓存数据......");
				IFlightSerchBiz biz = new FlightSerchBizImpl();
				DataReceiver receiver = new EachLowerPriceReceiver();
				for (Object key : prop.keySet()) {
					String value = String.valueOf(prop.get(key));
					String[] values = value.split(",");
					for (String val : values) {
						RequestView view = new RequestView();
						view.setDepartCity(String.valueOf(key));
						view.setArriveCity(val);
						Date[] days = SignatureUtils.get30Days();
						context.log("----加载"+key +"-"+ val+"数据......");
						long start = System.currentTimeMillis();
						
						List<ResponseView> views = biz.searchDaysFlight(days, view,StaticData.SERCH_URL,receiver);
						ResponseView rview = null;
						if(null!=views){
							// 按照日期排序
							for (int i = 0; i < views.size(); i++) {
								for (int j = 0; j < views.size() - i - 1; j++) {
									Date neDate = views.get(j).getTakeOffTime();
									Date beDate = views.get(j + 1).getTakeOffTime();
									if (beDate.getTime() < neDate.getTime()) {
										rview = views.get(j);
										views.set(j, views.get(j + 1));
										views.set(j + 1, rview);
									}
								}
							}

							JsonConfig config = new JsonConfig();
							config.setIgnoreDefaultExcludes(true);
							// 日期设为js兼容格式
							config.registerJsonBeanProcessor(Date.class,
									new JsDateJsonBeanProcessor());
							config.setExcludes(StaticData.FILTER_JSON_STR);
							String msg = JSONArray.fromObject(views, config).toString();
							MemcachedUtil.delete(key + val);
							MemcachedUtil.add(key + val, msg);
							
							long end = System.currentTimeMillis();
							context.log("----"+key +"-"+ val+"数据缓存完成,用时"+(end-start)/1000+"秒......");
						}
					}
				}
				context.log("加载完成......");
			} catch (IOException e) {
				context.log("加载失败!" + e.getMessage(), e);
				prop.clear();
			}

			return false;
		}

	}

}
