package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OrderInfoDao;
import com.peter.pms.domain.OrderInfo;
import com.peter.pms.domain.query.OrderInfoQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OrderInfo
*下发订单主表信息
*/
@Repository
public class OrderInfoDaoImpl extends BaseDao implements OrderInfoDao {
    /** namespace */
    private final String namespace = OrderInfoDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OrderInfo> queryOrderInfoList(OrderInfoQuery queryBean) {
        return (List<OrderInfo>) queryForList(namespace +".queryOrderInfoList", queryBean);
    }

    public List<OrderInfo> queryOrderInfoListByOld(OrderInfoQuery queryBean) {
        return (List<OrderInfo>) queryForList(namespace +".queryOrderInfoListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OrderInfo OrderInfo) {
        return insert(namespace +".insert", orderInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OrderInfo orderInfo) {
        return update(namespace +".update", orderInfo);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderInfoCount(OrderInfoQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOrderInfoCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderInfo> queryOrderInfoListWithPage(OrderInfoQuery queryBean) {
        return (List<OrderInfo>) queryForList(namespace +".queryOrderInfoListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderInfo configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OrderInfo getOrderInfoById(Long id) {
        return (OrderInfo) queryForObject(namespace +".getOrderInfoById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OrderInfo orderInfo) {
        int count = (Integer) queryForObject(namespace +".exist", OrderInfo);
        return count > 0;
    }
}
