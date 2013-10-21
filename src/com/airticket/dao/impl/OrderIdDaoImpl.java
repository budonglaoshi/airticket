package com.airticket.dao.impl;

import org.hibernate.Query;
import com.airticket.bean.OrderId;
import com.airticket.dao.BaseDao;
import com.airticket.dao.OrderIdDao;
import com.airticket.util.StaticData;

public class OrderIdDaoImpl extends BaseDao implements OrderIdDao {

	public boolean updateByOrderId(OrderId orderId) {
		boolean isOk = false;
		try {
			if(null!=orderId&&null!=orderId.getPresent()&&null!=orderId.getToplimit()&&(orderId.getPresent()+1)<orderId.getToplimit()){
				this.update(orderId);
			}
			
		} catch (Exception e) {
			isOk = false;
			e.printStackTrace();
		}
		return isOk;
	}

	
	public OrderId selectNewOrderId(){
		String hql = "from OrderId";
		OrderId orderId=null;
		try {
			Query query = this.queryInfo(hql, null);
			if(null!=query){
				orderId = (OrderId)query.uniqueResult();
			}
		} catch (Exception e) {
			orderId=null;
			e.printStackTrace();
		}
		return orderId;
	}
	
}
