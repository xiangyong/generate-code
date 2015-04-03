package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.TaskOrderExceptionDao;
import com.peter.pms.domain.TaskOrderException;
import com.peter.pms.domain.query.TaskOrderExceptionQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*TaskOrderException
*
*/
@Repository
public class TaskOrderExceptionDaoImpl extends BaseDao implements TaskOrderExceptionDao {
    /** namespace */
    private final String namespace = TaskOrderExceptionDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<TaskOrderException> queryTaskOrderExceptionList(TaskOrderExceptionQuery queryBean) {
        return (List<TaskOrderException>) queryForList(namespace +".queryTaskOrderExceptionList", queryBean);
    }

    public List<TaskOrderException> queryTaskOrderExceptionListByOld(TaskOrderExceptionQuery queryBean) {
        return (List<TaskOrderException>) queryForList(namespace +".queryTaskOrderExceptionListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(TaskOrderException TaskOrderException) {
        return insert(namespace +".insert", taskOrderException);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(TaskOrderException taskOrderException) {
        return update(namespace +".update", taskOrderException);
    }

    /**
     * {@inheritDoc}
     */
    public int queryTaskOrderExceptionCount(TaskOrderExceptionQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryTaskOrderExceptionCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<TaskOrderException> queryTaskOrderExceptionListWithPage(TaskOrderExceptionQuery queryBean) {
        return (List<TaskOrderException>) queryForList(namespace +".queryTaskOrderExceptionListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(TaskOrderException configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public TaskOrderException getTaskOrderExceptionById(Long id) {
        return (TaskOrderException) queryForObject(namespace +".getTaskOrderExceptionById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(TaskOrderException taskOrderException) {
        int count = (Integer) queryForObject(namespace +".exist", TaskOrderException);
        return count > 0;
    }
}
