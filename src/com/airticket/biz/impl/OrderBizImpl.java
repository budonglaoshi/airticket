package com.airticket.biz.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.airticket.bean.Order;
import com.airticket.bean.OrderId;
import com.airticket.bean.OrderPassenger;
import com.airticket.bean.UntreatedOrder;
import com.airticket.biz.OrderBiz;
import com.airticket.dao.OrderDao;
import com.airticket.dao.OrderIdDao;
import com.airticket.dao.OrderPassengerDao;
import com.airticket.dao.OrderTravelInvoicesDao;
import com.airticket.util.StaticData;

public class OrderBizImpl implements OrderBiz {
	
	private OrderDao orderDao;
	private OrderIdDao orderIdDao;
	private OrderTravelInvoicesDao orderTravelInvoicesDao;
	private OrderPassengerDao orderPassengerDao;
	
	
	
	public Serializable saveByOrder(Order order) {
		Serializable id = null;
		if(null!=order){
			try {
				//获取当前单号
				OrderId orderId = orderIdDao.selectNewOrderId();
				if(null!=orderId){
					
					UntreatedOrder untreatedOrder = (UntreatedOrder)order;
					untreatedOrder.setOrderid(getId(orderId));
					//添加行程单
					id = orderTravelInvoicesDao.saveByOrderTravelInvoices(untreatedOrder.getOrderTravelInvoices());
					//添加乘客
					for (OrderPassenger passenger : untreatedOrder.getOrderPassengers()) {
						passenger.setOrderid(orderId.toString());
						id = orderPassengerDao.saveByOrderPassenger(passenger);
						if(null==id){
							throw new Exception();
						}
					}
					//添加订单
					id = orderDao.saveByOrder(untreatedOrder);
					if(null!=id){
						//更新单号
						orderIdDao.updateByOrderId(orderId);
					}
					
				}
			} catch (Exception e) {
				id = null;
				e.printStackTrace();
			}
		}
		return id;
	}
	
	
	//获取订单号
	private String getId(OrderId orderId){
		String key = StaticData.EMPTY;
		if(null!=orderId&&null!=orderId.getPresent()&&null!=orderId.getToplimit()&&orderId.getPresent()<orderId.getToplimit()){
			int present = orderId.getPresent();
			int toplimit = orderId.getToplimit();
			//当前值达到最大值时更行 亿位数字 和当前数字
			if(present==toplimit){
				orderId.setOrder_key(orderId.getOrder_key()+1);
				orderId.setInitial(StaticData.ORDERID_INDEX[orderId.getOrder_key()]);
				orderId.setPresent(10000);
			}else{
				orderId.setPresent(present+1);
			}
			key=String.valueOf(orderId.getPresent());
			if(key.length()<8){
				for (int i = 0,len=key.length(); i < (8-len); i++) {
					key="0"+key;
				}
			}
			key = orderId.getHead()+orderId.getInitial()+key;
		}
		return key;
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


	public OrderTravelInvoicesDao getOrderTravelInvoicesDao() {
		return orderTravelInvoicesDao;
	}


	public void setOrderTravelInvoicesDao(
			OrderTravelInvoicesDao orderTravelInvoicesDao) {
		this.orderTravelInvoicesDao = orderTravelInvoicesDao;
	}


	public OrderPassengerDao getOrderPassengerDao() {
		return orderPassengerDao;
	}


	public void setOrderPassengerDao(OrderPassengerDao orderPassengerDao) {
		this.orderPassengerDao = orderPassengerDao;
	}


}
