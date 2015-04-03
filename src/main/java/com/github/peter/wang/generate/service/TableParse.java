package com.github.peter.wang.generate.service;

import java.util.List;

import com.github.peter.wang.generate.model.Table;
import com.github.peter.wang.generate.model.TableConfig;
import com.github.peter.wang.generate.utils.AnalysisDBUtils;

/**
 * 通过数据库来获取Table数据
 * @author wangcanpei
 *
 */
public class TableParse implements Parse{

	/**
	 * 生成table信息
	 */
	public List<Table> parse(TableConfig config) throws Exception {
		
		AnalysisDBUtils.createConnection(config.getConnstr(), config.getUserName(), config.getPassword());
		List<Table> tableList=AnalysisDBUtils.readDB(config.getDBName());
		AnalysisDBUtils.readTables(tableList);
		return tableList;
		
	}

}
