package test;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import net.sf.ehcache.CacheManager;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonBeanProcessor;
import net.sf.json.processors.JsonValueProcessor;

public class TripThread {
	
	Logger logger = Logger.getLogger(TripThread.class);
	
	
	public TripThread(){
		for (int i = 0; i < poolSize; i++) {
			threadPool.add(new Thread(handler));
		}
	}
	
	
	//线程池
	private List<Thread> threadPool = new ArrayList<Thread>();
	
	// 线程池容量
	private static Integer poolSize = 100;
	// 线程池增量
//	private static Integer poolUpCount = 10;
	//线程事件类
	private static Runnable handler;
	
	public static void setHandler(Runnable run){
		handler = run;
	}
	
	

	

	/**
	 * 设置线程池初始化线程数量
	 * 
	 * @param size
	 */
	public static void setPoolSize(int size) {
		if(size>0){
			poolSize = size;
		}
		
	}

	/**
	 * 设置线程池线程数量的增量（即线程不够时增加几个线程）
	 * 
	 * @param count
	 */
//	public static void setPoolUpCount(int count) {
//		if(count>=(poolSize/2)&&count<=poolSize){
//			poolUpCount = count;
//		}
//	}

	/**
	 * 设置线程池线程数量
	 * 
	 * @param count
	 */
	public void setThreadCount(int count) {
		threadPool.clear();
		for (int i = 0; i < count; i++) {
			threadPool.add(new Thread(handler));
		}

	}

	
	/*
	 * NEW 至今尚未启动的线程处于这种状态。 RUNNABLE 正在 Java 虚拟机中执行的线程处于这种状态。 BLOCKED
	 * 受阻塞并等待某个监视器锁的线程处于这种状态。 WAITING 无限期地等待另一个线程来执行某一特定操作的线程处于这种状态。
	 * TIMED_WAITING 等待另一个线程来执行取决于指定等待时间的操作的线程处于这种状态。 TERMINATED 已退出的线程处于这种状态。
	 */

	public Thread getFreeThread() {
		for (int i=0,len=threadPool.size();i<len;i++) {
			Thread thread = threadPool.get(i);
			//是否为未启动的线程
			if (thread.getState() == State.NEW) {
				return thread;
			}
			//线程是否已退出,如果退出就将其释放
			if(thread.getState()==State.TERMINATED){
				thread = new Thread(handler);
				threadPool.set(i,thread);
			}
		}
		
		return getFreeThread();
	}
	
	public static CacheManager singletonManager = CacheManager.create();
	
	
//	public static void main(String[] args) {
//	
//	}
	
}
