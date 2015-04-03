package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OrderForcedIssued;
import com.peter.pms.domain.enums.OrderForcedIssuedSatusEnum;
import com.peter.pms.domain.query.OrderForcedIssuedQuery;
import com.peter.pms.dao.OrderForcedIssuedDao;
import com.peter.pms.manager.OrderForcedIssuedManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OrderForcedIssuedManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OrderForcedIssuedManagerImpl extends BaseManager implements OrderForcedIssuedManager {

    private static final Log LOG = LogFactory.getLog(OrderForcedIssuedManagerImpl.class);
	
    @Autowired
    private OrderForcedIssuedDao OrderForcedIssuedDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OrderForcedIssued> OrderForcedIssuedList) {
        boolean resultFlag = false;
        if (null != OrderForcedIssuedList && OrderForcedIssuedList.size() > 0) {
            for (OrderForcedIssued OrderForcedIssued : OrderForcedIssuedList) {
                resultFlag = OrderForcedIssuedDao.insert(OrderForcedIssued);
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
    public boolean insert(OrderForcedIssued OrderForcedIssued) {
        return OrderForcedIssuedDao.insert(OrderForcedIssued);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OrderForcedIssued OrderForcedIssued) {
        return OrderForcedIssuedDao.update(OrderForcedIssued);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedList(OrderForcedIssuedQuery queryBean) {
        return OrderForcedIssuedDao.queryOrderForcedIssuedList(queryBean);
    }

    public List<OrderForcedIssued> queryOrderForcedIssuedListByOld(OrderForcedIssuedQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OrderForcedIssuedManagerImpl.getOrderForcedIssuedByOld  ERROR!para null");
            throw new IllegalArgumentException("OrderForcedIssuedManagerImpl.getOrderForcedIssuedByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OrderForcedIssuedSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OrderForcedIssuedDao.queryOrderForcedIssuedListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedListWithPage(OrderForcedIssuedQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OrderForcedIssuedQuery();
        }

        // 查询总数
        int totalItem = queryOrderForcedIssuedCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OrderForcedIssuedDao.queryOrderForcedIssuedListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderForcedIssuedCount(OrderForcedIssuedQuery queryBean) {
        return OrderForcedIssuedDao.queryOrderForcedIssuedCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderForcedIssued OrderForcedIssued) {
        return OrderForcedIssuedDao.delete(OrderForcedIssued);
    }

    /**
     * {@inheritDoc}
     */
    public OrderForcedIssued getOrderForcedIssuedById(Long id) {
        return OrderForcedIssuedDao.getOrderForcedIssuedById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OrderForcedIssued[] OrderForcedIssueds) {
        boolean resultFlag = false;
        if (null != OrderForcedIssueds && OrderForcedIssueds.length > 0) {
            for (int i = 0; i < OrderForcedIssueds.length; i++) {
                resultFlag = delete(OrderForcedIssueds[i]);
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
    public boolean exist(OrderForcedIssued OrderForcedIssued) {
        return OrderForcedIssuedDao.exist(OrderForcedIssued);
    }
}
