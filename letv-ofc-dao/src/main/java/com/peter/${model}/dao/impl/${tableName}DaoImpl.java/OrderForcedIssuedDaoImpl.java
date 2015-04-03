package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OrderForcedIssuedDao;
import com.peter.pms.domain.OrderForcedIssued;
import com.peter.pms.domain.query.OrderForcedIssuedQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OrderForcedIssued
*
*/
@Repository
public class OrderForcedIssuedDaoImpl extends BaseDao implements OrderForcedIssuedDao {
    /** namespace */
    private final String namespace = OrderForcedIssuedDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedList(OrderForcedIssuedQuery queryBean) {
        return (List<OrderForcedIssued>) queryForList(namespace +".queryOrderForcedIssuedList", queryBean);
    }

    public List<OrderForcedIssued> queryOrderForcedIssuedListByOld(OrderForcedIssuedQuery queryBean) {
        return (List<OrderForcedIssued>) queryForList(namespace +".queryOrderForcedIssuedListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OrderForcedIssued OrderForcedIssued) {
        return insert(namespace +".insert", orderForcedIssued);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OrderForcedIssued orderForcedIssued) {
        return update(namespace +".update", orderForcedIssued);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderForcedIssuedCount(OrderForcedIssuedQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOrderForcedIssuedCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedListWithPage(OrderForcedIssuedQuery queryBean) {
        return (List<OrderForcedIssued>) queryForList(namespace +".queryOrderForcedIssuedListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderForcedIssued configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OrderForcedIssued getOrderForcedIssuedById(Long id) {
        return (OrderForcedIssued) queryForObject(namespace +".getOrderForcedIssuedById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OrderForcedIssued orderForcedIssued) {
        int count = (Integer) queryForObject(namespace +".exist", OrderForcedIssued);
        return count > 0;
    }
}
