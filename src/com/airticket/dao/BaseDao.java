package com.airticket.dao;

import java.io.Serializable;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 
 * @author ALLEN
 *
 */
public class BaseDao extends HibernateDaoSupport {


	
	/**
	 * 查询
	 * @param hql 
	 * @param param  封装好查询参数的实体
	 * @return query查询对象交给具体的dao处理
	 * @throws Exception
	 */
	public Query queryInfo(String hql,Object param) throws Exception{
		Query query = null;
		if(null!=hql){
			query = this.getSession().createQuery(hql);
			if(null!=param){
				query.setProperties(param);
			}
		}
		return query;
	}
	
	/**
	 * 插入
	 * @param param  要插入信息的实体
	 * 事务交由Spring管理
	 * @return
	 */
	public Serializable insert(Object param) throws Exception{
		Serializable id = null;
		if(null!=param){
			id = this.getSession().save(param);
		}
		return id;
	}
	
	
	/**
	 * 更新
	 * @param param 
	 * @throws Exception
	 */
	public void update(Object param) throws Exception{
		if(null!=param){
			this.getSession().update(param);
		}
	}
	
	
	
	/**
	 * 删除
	 * @param param 
	 * @throws Exception
	 */
	public void delete(Object param) throws Exception{
		if(null!=param){
			this.getSession().delete(param);
		}
		
	}
	
}
