package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OperateLogDao;
import com.peter.pms.domain.OperateLog;
import com.peter.pms.domain.query.OperateLogQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OperateLog
*
*/
@Repository
public class OperateLogDaoImpl extends BaseDao implements OperateLogDao {
    /** namespace */
    private final String namespace = OperateLogDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OperateLog> queryOperateLogList(OperateLogQuery queryBean) {
        return (List<OperateLog>) queryForList(namespace +".queryOperateLogList", queryBean);
    }

    public List<OperateLog> queryOperateLogListByOld(OperateLogQuery queryBean) {
        return (List<OperateLog>) queryForList(namespace +".queryOperateLogListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OperateLog OperateLog) {
        return insert(namespace +".insert", operateLog);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OperateLog operateLog) {
        return update(namespace +".update", operateLog);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOperateLogCount(OperateLogQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOperateLogCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OperateLog> queryOperateLogListWithPage(OperateLogQuery queryBean) {
        return (List<OperateLog>) queryForList(namespace +".queryOperateLogListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OperateLog configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OperateLog getOperateLogById(Long id) {
        return (OperateLog) queryForObject(namespace +".getOperateLogById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OperateLog operateLog) {
        int count = (Integer) queryForObject(namespace +".exist", OperateLog);
        return count > 0;
    }
}
