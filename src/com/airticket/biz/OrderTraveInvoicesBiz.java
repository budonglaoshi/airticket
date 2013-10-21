package com.airticket.biz;

import java.io.Serializable;

import com.airticket.bean.OrderTravelInvoices;

public interface OrderTraveInvoicesBiz {
	
	/**
	 * 
	 * @param travelInvoices
	 * @return
	 */
	public Serializable addOrderTraveInvoices(OrderTravelInvoices travelInvoices);
	
}
