package com.airticket.biz.impl;

import com.airticket.bean.OrderId;
import com.airticket.biz.OrderIdBiz;
import com.airticket.dao.OrderIdDao;
import com.airticket.dao.impl.OrderIdDaoImpl;

public class OrderIdBizImpl implements OrderIdBiz {
	private OrderIdDao dao=new OrderIdDaoImpl();

	public String getMajorKey() {
		String initial="";
		OrderId orderId=dao.getMajorKey();
		if(null!=orderId&&null!=orderId.getPresent()&&null!=orderId.getToplimit()&&orderId.getPresent()<orderId.getToplimit()){
			initial=String.valueOf((orderId.getPresent()+1));
			if(initial.length()<8){
				for (int i = 0; i < (8-initial.length()); i++) {
					initial="0"+initial;
				}
			}
			initial=orderId.getInitial()+initial;
		}
		return initial;
	}

	public boolean updateByOrderId() {
		boolean isok=false;
		OrderId orderId=dao.getMajorKey();
		if(null!=orderId&&null!=orderId.getPresent()&&null!=orderId.getToplimit()&&(orderId.getPresent()+1)<orderId.getToplimit()){
			orderId.setPresent(orderId.getPresent()+1);
			isok=dao.updateByOrderId(orderId);
		}
		return isok;
	}

}
