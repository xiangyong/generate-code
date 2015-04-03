package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OrderIssuedRuleDao;
import com.peter.pms.domain.OrderIssuedRule;
import com.peter.pms.domain.query.OrderIssuedRuleQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OrderIssuedRule
*
*/
@Repository
public class OrderIssuedRuleDaoImpl extends BaseDao implements OrderIssuedRuleDao {
    /** namespace */
    private final String namespace = OrderIssuedRuleDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleList(OrderIssuedRuleQuery queryBean) {
        return (List<OrderIssuedRule>) queryForList(namespace +".queryOrderIssuedRuleList", queryBean);
    }

    public List<OrderIssuedRule> queryOrderIssuedRuleListByOld(OrderIssuedRuleQuery queryBean) {
        return (List<OrderIssuedRule>) queryForList(namespace +".queryOrderIssuedRuleListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OrderIssuedRule OrderIssuedRule) {
        return insert(namespace +".insert", orderIssuedRule);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OrderIssuedRule orderIssuedRule) {
        return update(namespace +".update", orderIssuedRule);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderIssuedRuleCount(OrderIssuedRuleQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOrderIssuedRuleCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleListWithPage(OrderIssuedRuleQuery queryBean) {
        return (List<OrderIssuedRule>) queryForList(namespace +".queryOrderIssuedRuleListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderIssuedRule configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OrderIssuedRule getOrderIssuedRuleById(Long id) {
        return (OrderIssuedRule) queryForObject(namespace +".getOrderIssuedRuleById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OrderIssuedRule orderIssuedRule) {
        int count = (Integer) queryForObject(namespace +".exist", OrderIssuedRule);
        return count > 0;
    }
}
