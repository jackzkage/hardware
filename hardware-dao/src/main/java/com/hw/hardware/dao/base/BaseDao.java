package com.hw.hardware.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * dao基类<实体,主键>
 * @author cfish
 * @since 2013-09-09
 */
public interface BaseDao<T,KEY extends Serializable> {

	/**
	 * 添加对象
	 * @param t
	 * @return 影响条数
	 */
	int insertEntry(T...t);
	
	/**
	 * 添加对象并设置ID到对象上(需开启事务)
	 * @param t
	 * @return 影响条数
	 */
	int insertEntryCreateId(T t);
	
	/**
	 * 保存对象
	 * @param t
	 * @return 对象主键
	 */
	KEY save(T t);
	
	/**
	 * 更新对象
	 * @param t
	 * @return
	 */
	T update(T t);
	
	/**
	 * 删除对象,主键
	 * @param key
	 * @return 影响条数
	 */
	int deleteByKey(KEY...key);
	
	/**
	 * 删除对象,条件
	 * @param condtion
	 * @return 影响条数
	 */
	int deleteByKey(T condtion);
	
	/**
	 * 更新对象,条件主键ID
	 * @param t
	 * @return 影响条数
	 */
	int updateByKey(T t);

	/**
	 * 查询对象,条件主键
	 * @param key
	 * @return
	 */
	T selectEntry(KEY key);
	
	/**
	 * 查询对象,条件主键数组
	 * @param key
	 * @return
	 */
	List<T> selectEntryList(KEY...key);
	
	/**
	 * 查询对象,只要不为NULL与空则为条件
	 * @param t
	 * @return
	 */
	List<T> selectEntryList(T t);

	/**
	 * 查询对象总数
	 * @param t
	 * @return
	 */
	Integer selectEntryListCount(T t);
}
