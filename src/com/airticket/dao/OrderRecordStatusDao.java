package com.airticket.dao;

import java.io.Serializable;
import java.util.List;

import com.airticket.bean.OrderRecordStatus;

/**
 * 订单操作状态接口
 * @author Administrator
 *
 */
public interface OrderRecordStatusDao {
	
	/**
	 * 新增订单操作状态
	 * @param order 订单操作状态对象 
	 * @return true/false结果
	 */
	public Serializable saveByOrderRecordStatus(OrderRecordStatus orderRecordStatus);
	
	/**
	 * 删除订单操作状态
	 * @param order 订单操作状态对象
	 * @return true/false结果
	 */
	public boolean deleteByOrderRecordStatus(OrderRecordStatus orderRecordStatus);
	
	/**
	 * 修改订单操作状态
	 * @param order 订单操作状态对象
	 * @return true/false结果
	 */
	public boolean updateByOrderRecordStatus(OrderRecordStatus orderRecordStatus);
	
	/**
	 * 查询订单操作状态
	 * @param order 订单操作状态对象 
	 * @return 响应对象集合
	 */
	public List<OrderRecordStatus> selectByOrderRecordStatus(OrderRecordStatus orderRecordStatus);
}
