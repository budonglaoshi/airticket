package com.airticket.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;

import com.airticket.bean.OrderRecord;
import com.airticket.dao.BaseDao;
import com.airticket.dao.OrderRecordDao;

public class OrderRecordDaoImpl extends BaseDao implements OrderRecordDao {

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordDao#saveByOrderRecord(com.airticket.bean.OrderRecord)
	 */
	public Serializable saveByOrderRecord(OrderRecord orderRecord) {
		Serializable id = null;
		try {
			if(null!=orderRecord){
				id = this.insert(orderRecord);
			}
		} catch (Exception e) {
			id=null;
			this.logger.error(e.getMessage(), e);
		}
		return id;
	}
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordDao#deleteByOrderRecord(com.airticket.bean.OrderRecord)
	 */
	public boolean deleteByOrderRecord(OrderRecord orderRecord) {
		boolean isOk = false;
		try {
			if(null!=orderRecord){
				this.delete(orderRecord);
				isOk = true;
			}
		} catch (Exception e) {
			isOk = false;
			this.logger.error(e.getMessage(), e);
		}
		return isOk;
	}

	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordDao#updateByOrderRecord(com.airticket.bean.OrderRecord)
	 */
	public boolean updateByOrderRecord(OrderRecord orderRecord) {
		boolean isOk  =false;
		try {
			if(null!=orderRecord){
				this.update(orderRecord);
				isOk = true;
			}
		} catch (Exception e) {
			isOk = false;
			this.logger.error(e.getMessage(),e);
		}
		return isOk;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.airticket.dao.OrderRecordDao#selectByOrderRecord(com.airticket.bean.OrderRecord)
	 */
	public List<OrderRecord> selectByOrderRecord(OrderRecord orderRecord) {
		String hql = "from OrderRecord";
		List<OrderRecord> records = null;
		try {
			Query query = this.queryInfo(hql, orderRecord);
			if(null!=query){
				records = query.list();
			}
		} catch (Exception e) {
			records = null;
			this.logger.error(e.getMessage(), e);
		}
		return records;
	}

	
	
	
}
