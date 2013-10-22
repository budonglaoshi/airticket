package com.airticket.dao;

import java.io.Serializable;
import java.util.List;

import com.airticket.bean.OrderPassenger;

/**
 * 订单-乘机人信息接口
 * @author Administrator
 *
 */
public interface OrderPassengerDao {
	
	/**
	 * 新增乘机人信息
	 * @param orderPassenger 乘机人信息对象 
	 * @return true/false结果
	 */
	public Serializable saveByOrderPassenger(OrderPassenger orderPassenger);

	/**
	 * 删除乘机人信息
	 * @param orderPassenger 乘机人信息对象 
	 * @return true/false结果
	 */
	public boolean deleteByOrderPassenger(OrderPassenger orderPassenger);
	
	/**
	 * 修改乘机人信息
	 * @param orderPassenger 乘机人信息对象 
	 * @return true/false结果
	 */
	public boolean updateByOrderPassenger(OrderPassenger orderPassenger);
	
	/**
	 * 查询乘机人信息
	 * @param orderPassenger 乘机人信息对象
	 * @return 响应对象集合
	 */
	public List<OrderPassenger> selectByOrderPassenger(OrderPassenger orderPassenger,String... paramNames);
}
