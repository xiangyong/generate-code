package com.github.peter.wang.generate.service;

import java.util.List;

import com.github.peter.wang.generate.model.Table;
import com.github.peter.wang.generate.model.TableConfig;



/**
 * 解析，把文件或者数据库信息，解析成能使用的Table数据
 * @author wangcanpei
 *
 */
public interface Parse {
	  /**
     * 
     * 转换表结构
     * 
     * @param config
     *            表结构配置
     * @return 转换结果
     * @throws Exception
     */
    List<Table> parse(TableConfig config) throws Exception;
}
