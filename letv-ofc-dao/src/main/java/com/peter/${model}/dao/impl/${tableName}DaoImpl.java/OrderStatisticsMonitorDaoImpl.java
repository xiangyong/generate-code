package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OrderStatisticsMonitorDao;
import com.peter.pms.domain.OrderStatisticsMonitor;
import com.peter.pms.domain.query.OrderStatisticsMonitorQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OrderStatisticsMonitor
*订单统计监控表
*/
@Repository
public class OrderStatisticsMonitorDaoImpl extends BaseDao implements OrderStatisticsMonitorDao {
    /** namespace */
    private final String namespace = OrderStatisticsMonitorDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorList(OrderStatisticsMonitorQuery queryBean) {
        return (List<OrderStatisticsMonitor>) queryForList(namespace +".queryOrderStatisticsMonitorList", queryBean);
    }

    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorListByOld(OrderStatisticsMonitorQuery queryBean) {
        return (List<OrderStatisticsMonitor>) queryForList(namespace +".queryOrderStatisticsMonitorListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OrderStatisticsMonitor OrderStatisticsMonitor) {
        return insert(namespace +".insert", orderStatisticsMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OrderStatisticsMonitor orderStatisticsMonitor) {
        return update(namespace +".update", orderStatisticsMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderStatisticsMonitorCount(OrderStatisticsMonitorQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOrderStatisticsMonitorCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorListWithPage(OrderStatisticsMonitorQuery queryBean) {
        return (List<OrderStatisticsMonitor>) queryForList(namespace +".queryOrderStatisticsMonitorListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderStatisticsMonitor configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OrderStatisticsMonitor getOrderStatisticsMonitorById(Long id) {
        return (OrderStatisticsMonitor) queryForObject(namespace +".getOrderStatisticsMonitorById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OrderStatisticsMonitor orderStatisticsMonitor) {
        int count = (Integer) queryForObject(namespace +".exist", OrderStatisticsMonitor);
        return count > 0;
    }
}
