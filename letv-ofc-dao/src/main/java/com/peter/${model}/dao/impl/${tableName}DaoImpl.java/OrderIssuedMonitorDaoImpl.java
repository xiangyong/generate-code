package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OrderIssuedMonitorDao;
import com.peter.pms.domain.OrderIssuedMonitor;
import com.peter.pms.domain.query.OrderIssuedMonitorQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OrderIssuedMonitor
*订单寻源监控表
*/
@Repository
public class OrderIssuedMonitorDaoImpl extends BaseDao implements OrderIssuedMonitorDao {
    /** namespace */
    private final String namespace = OrderIssuedMonitorDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedMonitor> queryOrderIssuedMonitorList(OrderIssuedMonitorQuery queryBean) {
        return (List<OrderIssuedMonitor>) queryForList(namespace +".queryOrderIssuedMonitorList", queryBean);
    }

    public List<OrderIssuedMonitor> queryOrderIssuedMonitorListByOld(OrderIssuedMonitorQuery queryBean) {
        return (List<OrderIssuedMonitor>) queryForList(namespace +".queryOrderIssuedMonitorListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OrderIssuedMonitor OrderIssuedMonitor) {
        return insert(namespace +".insert", orderIssuedMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OrderIssuedMonitor orderIssuedMonitor) {
        return update(namespace +".update", orderIssuedMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderIssuedMonitorCount(OrderIssuedMonitorQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOrderIssuedMonitorCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedMonitor> queryOrderIssuedMonitorListWithPage(OrderIssuedMonitorQuery queryBean) {
        return (List<OrderIssuedMonitor>) queryForList(namespace +".queryOrderIssuedMonitorListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderIssuedMonitor configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OrderIssuedMonitor getOrderIssuedMonitorById(Long id) {
        return (OrderIssuedMonitor) queryForObject(namespace +".getOrderIssuedMonitorById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OrderIssuedMonitor orderIssuedMonitor) {
        int count = (Integer) queryForObject(namespace +".exist", OrderIssuedMonitor);
        return count > 0;
    }
}
