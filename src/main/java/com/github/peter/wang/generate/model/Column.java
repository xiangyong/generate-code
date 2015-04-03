package com.github.peter.wang.generate.model;

import com.github.peter.wang.generate.utils.GenerateStringUtils;
import com.github.peter.wang.generate.utils.JavaDataType;

/**
 * 用来存储列的属性，用来生成对象的属性信息
 * @author wangcanpei
 *
 */
public class Column {


	
	/**
	 * 字段类型
	 */
	private String columnType;
	
	/**
	 *字段说明 
	 */
	private String columnComment;
	
	/**
	 * 列名，就是数据库里的原始名称
	 */
	private String columnCode;
	
	/**
	 * 是否主键
	 */
	private String columnKey;

	/**
	 * 
	 * @return
	 */
	public String getColumnName() {
		return GenerateStringUtils.getColumnName(columnCode);
	}

	

	public String getColumnType() {
		String type=columnType;
		int index=columnType.indexOf("(");
		if(index>-1){
			type=columnType.substring(0,index);
		}
		
		return JavaDataType.forType(type);
	}

	public void setColumnType(String columnType) {
		this.columnType=columnType;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}

	public String getColumnCode() {
		return columnCode;
	}

	public void setColumnCode(String columnCode) {
		this.columnCode = columnCode;
	}

	public String getColumnKey() {
		return columnKey;
	}

	public void setColumnKey(String columnKey) {
		this.columnKey = columnKey;
	}
	
	
	
}
