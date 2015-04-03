package com.github.peter.wang.generate.model;

import java.util.List;

import com.github.peter.wang.generate.utils.GenerateStringUtils;

public class Table {
	

	
	/**
	 * 表的说明
	 */
	private String tableComment;
	
	/**
	 * 字段列表
	 */
	private List<Column> columnList;
	
	/**
	 * table在数据库里的名字
	 */
	private String tableCode;

	/**
	 * 返回首字母大写，遇到"_"把下个字母大写
	 * @return
	 */
	public String getTableName() {
		return GenerateStringUtils.getClassName(tableCode);
	}

	
	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}

	public List<Column> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<Column> columnList) {
		this.columnList = columnList;
	}

	public String getTableCode() {
		return tableCode;
	}

	public void setTableCode(String tableCode) {
		this.tableCode = tableCode;
	}
	
	
	
}
