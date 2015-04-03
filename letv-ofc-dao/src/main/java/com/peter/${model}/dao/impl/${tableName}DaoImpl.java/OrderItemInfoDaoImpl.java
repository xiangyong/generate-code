package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OrderItemInfoDao;
import com.peter.pms.domain.OrderItemInfo;
import com.peter.pms.domain.query.OrderItemInfoQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OrderItemInfo
*下发订单商品明细
*/
@Repository
public class OrderItemInfoDaoImpl extends BaseDao implements OrderItemInfoDao {
    /** namespace */
    private final String namespace = OrderItemInfoDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OrderItemInfo> queryOrderItemInfoList(OrderItemInfoQuery queryBean) {
        return (List<OrderItemInfo>) queryForList(namespace +".queryOrderItemInfoList", queryBean);
    }

    public List<OrderItemInfo> queryOrderItemInfoListByOld(OrderItemInfoQuery queryBean) {
        return (List<OrderItemInfo>) queryForList(namespace +".queryOrderItemInfoListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OrderItemInfo OrderItemInfo) {
        return insert(namespace +".insert", orderItemInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OrderItemInfo orderItemInfo) {
        return update(namespace +".update", orderItemInfo);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderItemInfoCount(OrderItemInfoQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOrderItemInfoCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderItemInfo> queryOrderItemInfoListWithPage(OrderItemInfoQuery queryBean) {
        return (List<OrderItemInfo>) queryForList(namespace +".queryOrderItemInfoListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderItemInfo configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OrderItemInfo getOrderItemInfoById(Long id) {
        return (OrderItemInfo) queryForObject(namespace +".getOrderItemInfoById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OrderItemInfo orderItemInfo) {
        int count = (Integer) queryForObject(namespace +".exist", OrderItemInfo);
        return count > 0;
    }
}
