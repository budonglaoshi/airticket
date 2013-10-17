package com.airticket.dao;

import java.io.Serializable;
import java.util.List;

import com.airticket.bean.Order;

/**
 * 订单-订单信息接口
 * @author Administrator
 *
 */
public interface OrderDao {
	
	/**
	 * 新增订单信息
	 * @param order 订单信息对象 
	 * @return true/false结果
	 */
	public Serializable saveByOrder(Order order);
	
	/**
	 * 删除订单信息
	 * @param order 订单信息对象 
	 * @return true/false结果
	 */
	public boolean deleteByOrder(Order order);
	
	/**
	 * 修改订单信息
	 * @param order 订单信息对象 
	 * @return true/false结果
	 */
	public boolean updateByOrder(Order order);
	
	/**
	 * 查询订单信息
	 * @param order 订单信息对象 
	 * @return 响应对象集合
	 */
	public List<Order> selectByOrder(Order order);
	
	

	
}
