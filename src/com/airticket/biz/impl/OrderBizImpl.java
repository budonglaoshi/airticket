package com.airticket.biz.impl;

import java.util.List;

import com.airticket.bean.Order;
import com.airticket.biz.OrderBiz;
import com.airticket.dao.OrderDao;
import com.airticket.dao.impl.OrderDaoImpl;

public class OrderBizImpl implements OrderBiz {
	private OrderDao orderDao=new OrderDaoImpl();
	
	public boolean saveByOrder(Order order) {
		String str="";
		if(null!=order){
			str = orderDao.saveByOrder(order).toString();
		}
		return ("").equals(str)?false:true;
	}

	public boolean deleteByOrder(Order order) {
		boolean isok=false;
		if(null!=order){
			orderDao.deleteByOrder(order);
		}
		return isok;
	}

	public boolean updateByOrder(Order order) {
		boolean isok=false;
		if(null!=order){
			orderDao.updateByOrder(order);
		}
		return isok;
	}

	public List<Order> selectByOrder(Order order) {
		return orderDao.selectByOrder(order);
	}

}
