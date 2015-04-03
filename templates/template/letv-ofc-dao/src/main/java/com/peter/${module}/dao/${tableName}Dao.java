package com.peter.${module}.dao;

import java.util.List;

import com.peter.${module}.domain.${table.tableName};
import com.peter.${module}.domain.query.${table.tableName}Query;
/**
*
*@author 自动生成
*${table.tableName}
*${table.tableComment}
*/
public interface ${table.tableName}Dao {
    
    /**
     * 新增对象
     * 
     * @param ${table.tableName} 
     * @return
     */
    public boolean insert(${table.tableName} ${table.tableName?uncap_first});

    /**
     * 更新对象
     * 
     * @param ${table.tableName}
     * @return
     */
    public boolean update(${table.tableName} ${table.tableName?uncap_first});

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<${table.tableName}> query${table.tableName}List(${table.tableName}Query queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int query${table.tableName}Count(${table.tableName}Query queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<${table.tableName}> query${table.tableName}ListWithPage(${table.tableName}Query queryBean);

    /**
     * 删除记录
     * 
     * @param ${table.tableName}
     * @return
     */
    public boolean delete(${table.tableName} ${table.tableName?uncap_first});

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public ${table.tableName} get${table.tableName}ById(Long id);

    /**
     * 判断是否存在
     * 
     * @param ${table.tableName}
     * @return
     */
    public boolean exist(${table.tableName} ${table.tableName?uncap_first});

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<${table.tableName}> query${table.tableName}ListByOld(${table.tableName} queryBean);

}
