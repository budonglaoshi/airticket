package com.airticket.dao.impl;

import org.hibernate.Query;

import com.airticket.bean.OrderId;
import com.airticket.dao.BaseDao;
import com.airticket.dao.OrderIdDao;

public class OrderIdDaoImpl extends BaseDao implements OrderIdDao {

	public boolean updateByOrderId(OrderId orderId) {
		boolean isOk = false;
		try {
			this.update(orderId);
			isOk= true;
		} catch (Exception e) {
			isOk = false;
			e.printStackTrace();
		}
		return isOk;
	}

	public OrderId getMajorKey(){
		String hql = "from OrderId";
		OrderId orderId=null;
		try {
			Query query = this.queryInfo(hql, null);
			if(null!=query){
				orderId = (OrderId)query.list().get(0);
			}
		} catch (Exception e) {
			orderId = null;
			e.printStackTrace();
		}
		return orderId;
	}
}
