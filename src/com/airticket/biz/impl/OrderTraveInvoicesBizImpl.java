package com.airticket.biz.impl;

import java.io.Serializable;

import com.airticket.bean.OrderTravelInvoices;
import com.airticket.biz.OrderTraveInvoicesBiz;
import com.airticket.dao.OrderTravelInvoicesDao;

public class OrderTraveInvoicesBizImpl implements OrderTraveInvoicesBiz {

	private OrderTravelInvoicesDao orderTravelInvoicesDao; 
	
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.biz.OrderTraveInvoicesBiz#addOrderTraveInvoices(com.airticket.bean.OrderTravelInvoices)
	 */
	public Serializable addOrderTraveInvoices(OrderTravelInvoices travelInvoices) {
		Serializable id = null;
		if(null!=travelInvoices.getAddress()
				&&null!=travelInvoices.getCanton()
				&&null!=travelInvoices.getCity()
				&&null!=travelInvoices.getMobilePhone()
				&&null!=travelInvoices.getPostCode()
				&&null!=travelInvoices.getProvince()
				&&null!=travelInvoices.getReceiver()){
			
			id = orderTravelInvoicesDao.saveByOrderTravelInvoices(travelInvoices);
			
		}
		return id;
	}


	
	//getter and setter
	public OrderTravelInvoicesDao getOrderTravelInvoicesDao() {
		return orderTravelInvoicesDao;
	}


	public void setOrderTravelInvoicesDao(
			OrderTravelInvoicesDao orderTravelInvoicesDao) {
		this.orderTravelInvoicesDao = orderTravelInvoicesDao;
	}

}
