package com.airticket.biz.impl;

import java.util.List;

import com.airticket.bean.OrderRecord;
import com.airticket.biz.OrderRecordBiz;
import com.airticket.dao.OrderRecordDao;

public class OrderRecordBizImpl implements OrderRecordBiz {
	private OrderRecordDao orderRecordDao;

	public boolean saveByOrderRecord(OrderRecord orderRecord) {
		boolean isok=false;
		if(null!=orderRecord){
			String str=orderRecordDao.saveByOrderRecord(orderRecord).toString();
			if(!("").equals(str)){
				isok=true;
			}
				
			//("").equals(orderRecordDao.saveByOrderRecord(orderRecord).toString())?isok=false:isok=true;
		}
		return isok;
	}

	public boolean deleteByOrderRecord(OrderRecord orderRecord) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateByOrderRecord(OrderRecord orderRecord) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<OrderRecord> selectByOrderRecord(OrderRecord orderRecord) {
		// TODO Auto-generated method stub
		return null;
	}

	public OrderRecordDao getOrderRecordDao() {
		return orderRecordDao;
	}

	public void setOrderRecordDao(OrderRecordDao orderRecordDao) {
		this.orderRecordDao = orderRecordDao;
	}

}
