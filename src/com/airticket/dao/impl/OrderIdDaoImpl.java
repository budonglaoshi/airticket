package com.airticket.dao.impl;

import java.io.Serializable;

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
				orderId.setPresent(orderId.getPresent()+1);
				this.update(orderId);
				isOk= true;
			}
			
		} catch (Exception e) {
			isOk = false;
			e.printStackTrace();
		}
		return isOk;
	}

	
	public String getMajorKey(){
		
		String hql = "from OrderId";
		OrderId orderId=null;
		String key = StaticData.EMPTY;
		try {
			Query query = this.queryInfo(hql, null);
			if(null!=query){
				orderId = (OrderId)query.uniqueResult();
				if(null!=orderId&&null!=orderId.getPresent()&&null!=orderId.getToplimit()&&orderId.getPresent()<orderId.getToplimit()){
					
					
					int present = orderId.getPresent();
					int toplimit = orderId.getToplimit();
					
					//当前值达到最大值时更行 亿位数字 和当前数字
					if(present==toplimit){
						orderId.setIndex(orderId.getIndex()+1);
						orderId.setInitial(StaticData.ORDERID_INDEX[orderId.getIndex()]);
						orderId.setPresent(10000);
					}else{
						orderId.setPresent(present+1);
					}
					
					key=String.valueOf(orderId.getPresent());
					if(key.length()<8){
						for (int i = 0,len=key.length(); i < (8-len); i++) {
							key="0"+key;
						}
					}
					
					key=orderId.getId()+orderId.getInitial()+key;
				}
			}
		} catch (Exception e) {
			key = StaticData.EMPTY;
			e.printStackTrace();
		}
		return key;
	}

	
	
	
}
