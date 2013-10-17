package com.airticket.biz.impl;

import java.io.Serializable;
import java.util.List;

import com.airticket.bean.Order;
import com.airticket.bean.UntreatedOrder;
import com.airticket.biz.OrderBiz;
import com.airticket.dao.OrderDao;
import com.airticket.dao.OrderIdDao;
import com.airticket.dao.impl.OrderDaoImpl;
import com.airticket.util.StaticData;

public class OrderBizImpl implements OrderBiz {
	
	private OrderDao orderDao;
	private OrderIdDao orderIdDao;
	
	public boolean saveByOrder(Order order) {
		boolean isok=false;
		if(null!=order){
			try {
				String key = orderIdDao.getMajorKey();
				if(null!=key&&!key.equals(StaticData.EMPTY)){
					UntreatedOrder untreatedOrder = (UntreatedOrder)order;
					untreatedOrder.setOrderid(key);
					Serializable id = orderDao.saveByOrder(order).toString();
					if(null!=id){
						isok  =true;
					}
				}
			} catch (Exception e) {
				isok = false;
				e.printStackTrace();
			}
		}
		return isok;
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

	
	
	
	//getter and setter
	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public OrderIdDao getOrderIdDao() {
		return orderIdDao;
	}

	public void setOrderIdDao(OrderIdDao orderIdDao) {
		this.orderIdDao = orderIdDao;
	}

}
