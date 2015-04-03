package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OrderIssuedRule;
import com.peter.pms.domain.enums.OrderIssuedRuleSatusEnum;
import com.peter.pms.domain.query.OrderIssuedRuleQuery;
import com.peter.pms.dao.OrderIssuedRuleDao;
import com.peter.pms.manager.OrderIssuedRuleManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OrderIssuedRuleManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OrderIssuedRuleManagerImpl extends BaseManager implements OrderIssuedRuleManager {

    private static final Log LOG = LogFactory.getLog(OrderIssuedRuleManagerImpl.class);
	
    @Autowired
    private OrderIssuedRuleDao OrderIssuedRuleDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OrderIssuedRule> OrderIssuedRuleList) {
        boolean resultFlag = false;
        if (null != OrderIssuedRuleList && OrderIssuedRuleList.size() > 0) {
            for (OrderIssuedRule OrderIssuedRule : OrderIssuedRuleList) {
                resultFlag = OrderIssuedRuleDao.insert(OrderIssuedRule);
                if (!resultFlag) {
                    throw new RuntimeException("批量新增表信息异常");
                }
            }
        }

        return resultFlag;
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OrderIssuedRule OrderIssuedRule) {
        return OrderIssuedRuleDao.insert(OrderIssuedRule);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OrderIssuedRule OrderIssuedRule) {
        return OrderIssuedRuleDao.update(OrderIssuedRule);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleList(OrderIssuedRuleQuery queryBean) {
        return OrderIssuedRuleDao.queryOrderIssuedRuleList(queryBean);
    }

    public List<OrderIssuedRule> queryOrderIssuedRuleListByOld(OrderIssuedRuleQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OrderIssuedRuleManagerImpl.getOrderIssuedRuleByOld  ERROR!para null");
            throw new IllegalArgumentException("OrderIssuedRuleManagerImpl.getOrderIssuedRuleByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OrderIssuedRuleSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OrderIssuedRuleDao.queryOrderIssuedRuleListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleListWithPage(OrderIssuedRuleQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OrderIssuedRuleQuery();
        }

        // 查询总数
        int totalItem = queryOrderIssuedRuleCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OrderIssuedRuleDao.queryOrderIssuedRuleListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderIssuedRuleCount(OrderIssuedRuleQuery queryBean) {
        return OrderIssuedRuleDao.queryOrderIssuedRuleCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderIssuedRule OrderIssuedRule) {
        return OrderIssuedRuleDao.delete(OrderIssuedRule);
    }

    /**
     * {@inheritDoc}
     */
    public OrderIssuedRule getOrderIssuedRuleById(Long id) {
        return OrderIssuedRuleDao.getOrderIssuedRuleById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OrderIssuedRule[] OrderIssuedRules) {
        boolean resultFlag = false;
        if (null != OrderIssuedRules && OrderIssuedRules.length > 0) {
            for (int i = 0; i < OrderIssuedRules.length; i++) {
                resultFlag = delete(OrderIssuedRules[i]);
                if (!resultFlag) {
                    throw new RuntimeException("批量删除表信息异常!");
                }
            }
        }

        return resultFlag;
    }

    /**
     * {@inheritDoc}
     */
    public boolean exist(OrderIssuedRule OrderIssuedRule) {
        return OrderIssuedRuleDao.exist(OrderIssuedRule);
    }
}
