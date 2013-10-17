package com.airticket.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.airticket.bean.OrderRecordStatus;
import com.airticket.dao.BaseDao;
import com.airticket.dao.OrderRecordStatusDao;

public class OrderRecordStatusDaoImpl extends BaseDao implements OrderRecordStatusDao {

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordStatusDao#saveByOrderRecordStatus(com.airticket.bean.OrderRecordStatus)
	 */
	public Serializable saveByOrderRecordStatus(OrderRecordStatus orderRecordStatus) {
		Serializable id = null;
		try {
			id = this.insert(orderRecordStatus);
		} catch (Exception e) {
			id = null;
			this.logger.error(e.getMessage(), e);
		}
		return id;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordStatusDao#deleteByOrderRecordStatus(com.airticket.bean.OrderRecordStatus)
	 */
	public boolean deleteByOrderRecordStatus(OrderRecordStatus orderRecordStatus) {
		boolean isOk = false;
		try {
			this.delete(orderRecordStatus);
			isOk = true;
		} catch (Exception e) {
			isOk = false;
			this.logger.error(e.getMessage(), e);
		}
		return isOk;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordStatusDao#updateByOrderRecordStatus(com.airticket.bean.OrderRecordStatus)
	 */
	public boolean updateByOrderRecordStatus(OrderRecordStatus orderRecordStatus) {
		boolean isOk = false;
		try {
			this.update(orderRecordStatus);
			isOk = true;
		} catch (Exception e) {
			isOk = false;
			this.logger.error(e.getMessage(), e);
		}
		return isOk;
	}

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordStatusDao#selectByOrderRecordStatus(com.airticket.bean.OrderRecordStatus)
	 */
	public List<OrderRecordStatus> selectByOrderRecordStatus(OrderRecordStatus orderRecordStatus) {
		String hql="";
		List<OrderRecordStatus> recordStatus = null;
		try {
			Query query = this.queryInfo(hql, recordStatus);
			if(null!=query){
				recordStatus = query.list();
			}
		} catch (Exception e) {
			recordStatus = null;
			this.logger.error(e.getMessage(), e);
		}
		return recordStatus;
	}
	
}
