package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.HisTaskOrderDao;
import com.peter.pms.domain.HisTaskOrder;
import com.peter.pms.domain.query.HisTaskOrderQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*HisTaskOrder
*
*/
@Repository
public class HisTaskOrderDaoImpl extends BaseDao implements HisTaskOrderDao {
    /** namespace */
    private final String namespace = HisTaskOrderDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<HisTaskOrder> queryHisTaskOrderList(HisTaskOrderQuery queryBean) {
        return (List<HisTaskOrder>) queryForList(namespace +".queryHisTaskOrderList", queryBean);
    }

    public List<HisTaskOrder> queryHisTaskOrderListByOld(HisTaskOrderQuery queryBean) {
        return (List<HisTaskOrder>) queryForList(namespace +".queryHisTaskOrderListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(HisTaskOrder HisTaskOrder) {
        return insert(namespace +".insert", hisTaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(HisTaskOrder hisTaskOrder) {
        return update(namespace +".update", hisTaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public int queryHisTaskOrderCount(HisTaskOrderQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryHisTaskOrderCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<HisTaskOrder> queryHisTaskOrderListWithPage(HisTaskOrderQuery queryBean) {
        return (List<HisTaskOrder>) queryForList(namespace +".queryHisTaskOrderListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(HisTaskOrder configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public HisTaskOrder getHisTaskOrderById(Long id) {
        return (HisTaskOrder) queryForObject(namespace +".getHisTaskOrderById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(HisTaskOrder hisTaskOrder) {
        int count = (Integer) queryForObject(namespace +".exist", HisTaskOrder);
        return count > 0;
    }
}
