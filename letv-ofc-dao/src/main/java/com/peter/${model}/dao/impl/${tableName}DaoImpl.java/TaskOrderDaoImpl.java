package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.TaskOrderDao;
import com.peter.pms.domain.TaskOrder;
import com.peter.pms.domain.query.TaskOrderQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*TaskOrder
*
*/
@Repository
public class TaskOrderDaoImpl extends BaseDao implements TaskOrderDao {
    /** namespace */
    private final String namespace = TaskOrderDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<TaskOrder> queryTaskOrderList(TaskOrderQuery queryBean) {
        return (List<TaskOrder>) queryForList(namespace +".queryTaskOrderList", queryBean);
    }

    public List<TaskOrder> queryTaskOrderListByOld(TaskOrderQuery queryBean) {
        return (List<TaskOrder>) queryForList(namespace +".queryTaskOrderListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(TaskOrder TaskOrder) {
        return insert(namespace +".insert", taskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(TaskOrder taskOrder) {
        return update(namespace +".update", taskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public int queryTaskOrderCount(TaskOrderQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryTaskOrderCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<TaskOrder> queryTaskOrderListWithPage(TaskOrderQuery queryBean) {
        return (List<TaskOrder>) queryForList(namespace +".queryTaskOrderListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(TaskOrder configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public TaskOrder getTaskOrderById(Long id) {
        return (TaskOrder) queryForObject(namespace +".getTaskOrderById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(TaskOrder taskOrder) {
        int count = (Integer) queryForObject(namespace +".exist", TaskOrder);
        return count > 0;
    }
}
