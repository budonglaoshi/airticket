package com.airticket.biz;

import java.util.List;

import com.airticket.bean.OrderRecord;

/**
 * 订单操作记录接口
 * @author Administrator
 *
 */
public interface OrderRecordBiz {

	/**
	 * 新增订单操作记录
	 * @param order 订单操作记录对象 
	 * @return true/false结果
	 */
	public boolean saveByOrderRecord(OrderRecord orderRecord);
	
	/**
	 * 删除订单操作记录
	 * @param order 订单操作记录对象
	 * @return true/false结果
	 */
	public boolean deleteByOrderRecord(OrderRecord orderRecord);
	
	/**
	 * 修改订单操作记录
	 * @param order 订单操作记录对象
	 * @return true/false结果
	 */
	public boolean updateByOrderRecord(OrderRecord orderRecord);
	
	/**
	 * 查询订单操作记录
	 * @param order 订单操作记录对象 
	 * @return 响应对象集合
	 */
	public List<OrderRecord> selectByOrderRecord(OrderRecord orderRecord);
}
