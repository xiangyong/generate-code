package com.peter.${module}.manager;

import java.util.List;

import com.peter.${module}.domain.${table.tableName};
import com.peter.${module}.domain.query.${table.tableName}Query;
import com.letv.common.utils.page.PageUtil;
/**
 * ${module}Manager接口
 * 
 * 自动生成
 * 
 */
public interface Manager {

    /**
     * 批量增加对象信息
     * 
     * @param ${table.tableName}List
     * @return
     */
    public boolean insert(List<${table.tableName}> ${table.tableName}List);

    /**
     * 单个增加对象信息
     * 
     * @param ${table.tableName}
     * @return
     */
    public boolean insert(${table.tableName} ${table.tableName?uncap_first});

    /**
     * 更新 对象信息
     * 
     * @param ${table.tableName}
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(${table.tableName} ${table.tableName?uncap_first});

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<${table.tableName}> query${table.tableName}List(${table.tableName}Query queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<${table.tableName}> query${table.tableName}ListWithPage(${table.tableName}Query queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int query${table.tableName}Count(${table.tableName}Query queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param ${table.tableName}
     *            　
     * @return
     */
    public boolean delete(${table.tableName} ${table.tableName?uncap_first});

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public ${table.tableName} get${table.tableName}ById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param ${table.tableName}s
     *            ${table.tableName}集合
     * @return
     */
    public boolean delete(${table.tableName}[] ${table.tableName?uncap_first}s);

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
    public List<${table.tableName}> query${table.tableName}ListByOld(${table.tableName}Query queryBean);
}
