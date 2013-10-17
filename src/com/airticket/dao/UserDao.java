package com.airticket.dao;

import java.io.Serializable;
import java.util.List;

import com.airticket.bean.User;

/**
 * 用户信息接口
 * @author Administrator
 *
 */
public interface UserDao {
	
	/**
	 * 新增用户信息
	 * @param User 用户信息对象 
	 * @return true/false结果
	 */
	public Serializable saveByUser(User user);
	
	/**
	 * 删除用户信息
	 * @param User 用户信息对象 
	 * @return true/false结果
	 */
	public boolean deleteByUser(User user);
	
	/**
	 * 修改用户信息
	 * @param User 用户信息对象 
	 * @return true/false结果
	 */
	public boolean updateByUser(User user);
	
	/**
	 * 查询用户信息
	 * @param User 用户信息对象 
	 * @return 响应对象集合
	 */
	public List<User> selectByUser(User user);

	
}
