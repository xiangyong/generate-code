package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.HisTaskOrder;
import com.peter.pms.domain.enums.HisTaskOrderSatusEnum;
import com.peter.pms.domain.query.HisTaskOrderQuery;
import com.peter.pms.dao.HisTaskOrderDao;
import com.peter.pms.manager.HisTaskOrderManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * HisTaskOrderManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class HisTaskOrderManagerImpl extends BaseManager implements HisTaskOrderManager {

    private static final Log LOG = LogFactory.getLog(HisTaskOrderManagerImpl.class);
	
    @Autowired
    private HisTaskOrderDao HisTaskOrderDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<HisTaskOrder> HisTaskOrderList) {
        boolean resultFlag = false;
        if (null != HisTaskOrderList && HisTaskOrderList.size() > 0) {
            for (HisTaskOrder HisTaskOrder : HisTaskOrderList) {
                resultFlag = HisTaskOrderDao.insert(HisTaskOrder);
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
    public boolean insert(HisTaskOrder HisTaskOrder) {
        return HisTaskOrderDao.insert(HisTaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final HisTaskOrder HisTaskOrder) {
        return HisTaskOrderDao.update(HisTaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public List<HisTaskOrder> queryHisTaskOrderList(HisTaskOrderQuery queryBean) {
        return HisTaskOrderDao.queryHisTaskOrderList(queryBean);
    }

    public List<HisTaskOrder> queryHisTaskOrderListByOld(HisTaskOrderQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("HisTaskOrderManagerImpl.getHisTaskOrderByOld  ERROR!para null");
            throw new IllegalArgumentException("HisTaskOrderManagerImpl.getHisTaskOrderByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(HisTaskOrderSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return HisTaskOrderDao.queryHisTaskOrderListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<HisTaskOrder> queryHisTaskOrderListWithPage(HisTaskOrderQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new HisTaskOrderQuery();
        }

        // 查询总数
        int totalItem = queryHisTaskOrderCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return HisTaskOrderDao.queryHisTaskOrderListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryHisTaskOrderCount(HisTaskOrderQuery queryBean) {
        return HisTaskOrderDao.queryHisTaskOrderCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(HisTaskOrder HisTaskOrder) {
        return HisTaskOrderDao.delete(HisTaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public HisTaskOrder getHisTaskOrderById(Long id) {
        return HisTaskOrderDao.getHisTaskOrderById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final HisTaskOrder[] HisTaskOrders) {
        boolean resultFlag = false;
        if (null != HisTaskOrders && HisTaskOrders.length > 0) {
            for (int i = 0; i < HisTaskOrders.length; i++) {
                resultFlag = delete(HisTaskOrders[i]);
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
    public boolean exist(HisTaskOrder HisTaskOrder) {
        return HisTaskOrderDao.exist(HisTaskOrder);
    }
}
