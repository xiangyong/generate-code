package com.github.peter.wang.generate.service;

import com.github.peter.wang.generate.model.Table;

/**
 * 数据访问器
 * @author wangcanpei
 *
 */
public interface DataAccessor {
	//1、设置数据连接
	public void setConn();
	
	/**
	 * 获取table信息
	 * @return
	 */
	public Table getTable();
	
	
}
