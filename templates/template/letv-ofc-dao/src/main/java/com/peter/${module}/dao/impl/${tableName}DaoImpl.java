package com.peter.${module}.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.${module}.dao.${table.tableName}Dao;
import com.peter.${module}.domain.${table.tableName};
import com.peter.${module}.domain.query.${table.tableName}Query;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*${table.tableName}
*${table.tableComment}
*/
@Repository
public class ${table.tableName}DaoImpl extends BaseDao implements ${table.tableName}Dao {
    /** namespace */
    private final String namespace = ${table.tableName}DaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<${table.tableName}> query${table.tableName}List(${table.tableName}Query queryBean) {
        return (List<${table.tableName}>) queryForList(namespace +".query${table.tableName}List", queryBean);
    }

    public List<${table.tableName}> query${table.tableName}ListByOld(${table.tableName}Query queryBean) {
        return (List<${table.tableName}>) queryForList(namespace +".query${table.tableName}ListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(${table.tableName} ${table.tableName}) {
        return insert(namespace +".insert", ${table.tableName?uncap_first});
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(${table.tableName} ${table.tableName?uncap_first}) {
        return update(namespace +".update", ${table.tableName?uncap_first});
    }

    /**
     * {@inheritDoc}
     */
    public int query${table.tableName}Count(${table.tableName}Query queryBean) {
        return (Integer) queryForObject(namespace +".query${table.tableName}Count", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<${table.tableName}> query${table.tableName}ListWithPage(${table.tableName}Query queryBean) {
        return (List<${table.tableName}>) queryForList(namespace +".query${table.tableName}ListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(${table.tableName} configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public ${table.tableName} get${table.tableName}ById(Long id) {
        return (${table.tableName}) queryForObject(namespace +".get${table.tableName}ById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(${table.tableName} ${table.tableName?uncap_first}) {
        int count = (Integer) queryForObject(namespace +".exist", ${table.tableName});
        return count > 0;
    }
}
