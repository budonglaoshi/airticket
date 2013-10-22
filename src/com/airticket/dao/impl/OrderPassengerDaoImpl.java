package com.airticket.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.airticket.bean.OrderPassenger;
import com.airticket.dao.BaseDao;
import com.airticket.dao.OrderPassengerDao;

public class OrderPassengerDaoImpl extends BaseDao implements OrderPassengerDao {

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderPassengerDao#saveByOrderPassenger(com.airticket.bean.OrderPassenger)
	 */
	public Serializable saveByOrderPassenger(OrderPassenger orderPassenger) {
		Serializable id = null;
		try {
			id = this.insert(orderPassenger);
		} catch (Exception e) {
			id = null;
			e.printStackTrace();
		}
		return id;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderPassengerDao#deleteByOrderPassenger(com.airticket.bean.OrderPassenger)
	 */
	public boolean deleteByOrderPassenger(OrderPassenger orderPassenger) {
		boolean isOk = false;
		try {
			this.delete(orderPassenger);
			isOk = true;
		} catch (Exception e) {
			isOk = false;
			e.printStackTrace();
		}
		return isOk;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderPassengerDao#updateByOrderPassenger(com.airticket.bean.OrderPassenger)
	 */
	public boolean updateByOrderPassenger(OrderPassenger orderPassenger) {
		boolean isOk = false;
		try {
			this.update(orderPassenger);
			isOk = true;
		} catch (Exception e) {
			isOk = false;
			e.printStackTrace();
		}
		return isOk;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderPassengerDao#selectByOrderPassenger(com.airticket.bean.OrderPassenger)
	 */
	public List<OrderPassenger> selectByOrderPassenger(OrderPassenger orderPassenger,String... paramNames) {
		List<OrderPassenger> passengers = null;
		String hql = this.getSelectHQL(OrderPassenger.class, paramNames);
		try {
			Query query = this.queryInfo(hql.toString(), orderPassenger);
			if(null!=query){
				passengers = query.list();
			}
		} catch (Exception e) {
			passengers = null;
			e.printStackTrace();
		}
		return passengers;
	}
	
	
	
}	
