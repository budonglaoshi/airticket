package com.airticket.dao;


import com.airticket.bean.OrderId;

public interface OrderIdDao {
	
	/*
	 * 新增订单信息
	 * @param orderId 订单Id对象 
	 * @return true/false结果
	 *
	public Serializable saveByOrderId(OrderId orderId);/
	
	/**
	 * 删除订单信息
	 * @param orderId 订单Id对象 
	 * @return true/false结果
	 *
	public boolean deleteByOrderId(OrderId orderId);*/
	
	/**
	 * 修改订单信息
	 * @param orderId 订单Id对象 
	 * @return true/false结果
	 */
	public boolean updateByOrderId(OrderId orderId);
	
	/**
	 * 查询订单主键
	 * @return 主键
	 */
	public OrderId selectNewOrderId();
	
	

	
}
