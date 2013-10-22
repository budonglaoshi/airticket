package com.airticket.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.airticket.bean.Order;
import com.airticket.dao.BaseDao;
import com.airticket.dao.OrderDao;

public class OrderDaoImpl extends BaseDao implements OrderDao {

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderDao#saveByOrder(com.airticket.bean.Order)
	 */
	public Serializable saveByOrder(Order order) {
		Serializable id=null;
		try {
			id = this.insert(order);
			return id; 
		} catch (Exception e) {
			id = null;
			e.printStackTrace();
		}
		return id;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderDao#deleteByOrder(com.airticket.bean.Order)
	 */
	public boolean deleteByOrder(Order order) {
		boolean isOk = false;
		try {
			this.delete(order);
			isOk= true;
		} catch (Exception e) {
			isOk = false;
			e.printStackTrace();
		}
		return isOk;
	}

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderDao#updateByOrder(com.airticket.bean.Order)
	 */
	public boolean updateByOrder(Order order) {
		boolean isOk = false;
		try {
			this.update(order);
			isOk= true;
		} catch (Exception e) {
			isOk = false;
			e.printStackTrace();
		}
		return isOk;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderDao#selectByOrder(com.airticket.bean.Order)
	 */
	public List<Order> selectByOrder(Order order,String... paramNames) {
		String hql = this.getSelectHQL(order.getClass(), paramNames);
		List<Order> orders = null;
		try {
			Query query = this.queryInfo(hql.toString(),order);
			if(null!=query){
				orders = query.list();
			}
		} catch (Exception e) {
			orders = null;
			e.printStackTrace();
		}
		return orders;
	}
	

}
