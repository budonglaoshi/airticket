package com.airticket.dao.impl;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import com.airticket.bean.OrderTravelInvoices;
import com.airticket.dao.BaseDao;
import com.airticket.dao.OrderTravelInvoicesDao;

public class OrderTravelInvoicesDaoImpl extends BaseDao implements OrderTravelInvoicesDao {

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderTravelInvoicesDao#saveByOrderTravelInvoices(com.airticket.dao.OrderTravelInvoicesDao)
	 */
	public Serializable saveByOrderTravelInvoices(OrderTravelInvoicesDao orderTravelInvoices) {
		Serializable id = null;
		try {
			id = this.insert(orderTravelInvoices);
		} catch (Exception e) {
			id=null;
			this.logger.error(e.getMessage(), e);
		}
		return id;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderTravelInvoicesDao#deleteByOrderTravelInvoices(com.airticket.dao.OrderTravelInvoicesDao)
	 */
	public boolean deleteByOrderTravelInvoices(
			OrderTravelInvoicesDao orderTravelInvoices) {
		boolean isOk = false;
		try {
			this.delete(orderTravelInvoices);
			isOk = true;
		} catch (Exception e) {
			isOk = false;
			this.logger.error(e.getMessage(), e);
		}
		return isOk;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderTravelInvoicesDao#updateByOrderTravelInvoices(com.airticket.dao.OrderTravelInvoicesDao)
	 */
	public boolean updateByOrderTravelInvoices(
			OrderTravelInvoicesDao orderTravelInvoices) {
		boolean isOk = false;
		try {
			this.update(orderTravelInvoices);
			isOk=true;
		} catch (Exception e) {
			isOk=false;
			this.logger.error(e.getMessage(), e);
		}
		return isOk;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderTravelInvoicesDao#selectByOrderTravelInvoices(com.airticket.dao.OrderTravelInvoicesDao)
	 */
	public List<OrderTravelInvoices> selectByOrderTravelInvoices(OrderTravelInvoices orderTravelInvoices) {
		String hql = "";
		List<OrderTravelInvoices> invoices = null;
		try {
			Query query = this.queryInfo(hql, orderTravelInvoices);
			if(null!=query){
				invoices = query.list();
			}
		} catch (Exception e) {
			invoices = null;
			this.logger.error(e.getMessage(), e);
		}
		return invoices;
	}

}
