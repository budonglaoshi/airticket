package com.airticket.dao;

import java.io.Serializable;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.airticket.bean.OrderPassenger;

/**
 * 
 * @author ALLEN
 *
 */
public class BaseDao extends HibernateDaoSupport {


	/**
	 * 生成查询hql
	 * @param clazz
	 * @param paramNames
	 * @return
	 */
	public String getSelectHQL(Class<?> clazz,String...paramNames){
		StringBuilder hql = new StringBuilder("from "+clazz.getSimpleName()+" "+clazz.getSimpleName()+" where 1=1 ");
		if(null!=paramNames&&0!=paramNames.length){
			for (String paramName : paramNames) {
				hql.append(" and "+clazz.getSimpleName()+"."+paramName+" =:"+paramName);
			}
		}
		return hql.toString();
	}
	
	
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
