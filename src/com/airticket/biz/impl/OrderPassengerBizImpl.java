package com.airticket.biz.impl;

import java.io.Serializable;
import java.util.List;

import com.airticket.bean.OrderPassenger;
import com.airticket.biz.OrderPassengerBiz;
import com.airticket.dao.OrderPassengerDao;


public class OrderPassengerBizImpl implements OrderPassengerBiz {
	
	private OrderPassengerDao orderPassengerDao;
	
	
	public Serializable saveByOrderPassenger(OrderPassenger orderPassenger) {
		
		Serializable id = null;
		if(null!=orderPassenger){
			id =orderPassengerDao.saveByOrderPassenger(orderPassenger);
		}
		return id;
	}

	public boolean deleteByOrderPassenger(OrderPassenger orderPassenger) {
		boolean isok=false;
		if(null!=orderPassenger){
			isok=orderPassengerDao.deleteByOrderPassenger(orderPassenger);
		}
		return isok;
	}

	public boolean updateByOrderPassenger(OrderPassenger orderPassenger) {
		boolean isok=false;
		if(null!=orderPassenger){
			isok=orderPassengerDao.updateByOrderPassenger(orderPassenger);
		}
		return isok;
	}

	
	public List<OrderPassenger> selectByOrderPassenger(OrderPassenger orderPassenger) {
		return orderPassengerDao.selectByOrderPassenger(orderPassenger);
	}

	
	//getter and setter

	public OrderPassengerDao getOrderPassengerDao() {
		return orderPassengerDao;
	}

	public void setOrderPassengerDao(OrderPassengerDao orderPassengerDao) {
		this.orderPassengerDao = orderPassengerDao;
	}

}
