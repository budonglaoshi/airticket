package com.airticket.dao;

import java.io.Serializable;
import java.util.List;
import com.airticket.bean.OrderTravelInvoices;

/**
 * 旅游发票接口
 * @author Administrator
 *
 */
public interface OrderTravelInvoicesDao {
	
	/**
	 * 新增旅游发票
	 * @param order 旅游发票对象 
	 * @return true/false结果
	 */
	public Serializable saveByOrderTravelInvoices(OrderTravelInvoicesDao orderTravelInvoices);
	
	/**
	 * 删除旅游发票
	 * @param order 旅游发票对象 
	 * @return true/false结果
	 */
	public boolean deleteByOrderTravelInvoices(OrderTravelInvoicesDao orderTravelInvoices);
	
	/**
	 * 修改旅游发票
	 * @param order 旅游发票对象 
	 * @return true/false结果
	 */
	public boolean updateByOrderTravelInvoices(OrderTravelInvoicesDao orderTravelInvoices);
	
	/**
	 * 查询旅游发票
	 * @param order 旅游发票对象 
	 * @return 响应对象集合
	 */
	public List<OrderTravelInvoices> selectByOrderTravelInvoices(OrderTravelInvoices orderTravelInvoices);
}
