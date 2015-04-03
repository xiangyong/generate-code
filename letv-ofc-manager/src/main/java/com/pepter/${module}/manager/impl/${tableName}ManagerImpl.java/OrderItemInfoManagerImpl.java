package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OrderItemInfo;
import com.peter.pms.domain.enums.OrderItemInfoSatusEnum;
import com.peter.pms.domain.query.OrderItemInfoQuery;
import com.peter.pms.dao.OrderItemInfoDao;
import com.peter.pms.manager.OrderItemInfoManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OrderItemInfoManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OrderItemInfoManagerImpl extends BaseManager implements OrderItemInfoManager {

    private static final Log LOG = LogFactory.getLog(OrderItemInfoManagerImpl.class);
	
    @Autowired
    private OrderItemInfoDao OrderItemInfoDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OrderItemInfo> OrderItemInfoList) {
        boolean resultFlag = false;
        if (null != OrderItemInfoList && OrderItemInfoList.size() > 0) {
            for (OrderItemInfo OrderItemInfo : OrderItemInfoList) {
                resultFlag = OrderItemInfoDao.insert(OrderItemInfo);
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
    public boolean insert(OrderItemInfo OrderItemInfo) {
        return OrderItemInfoDao.insert(OrderItemInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OrderItemInfo OrderItemInfo) {
        return OrderItemInfoDao.update(OrderItemInfo);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderItemInfo> queryOrderItemInfoList(OrderItemInfoQuery queryBean) {
        return OrderItemInfoDao.queryOrderItemInfoList(queryBean);
    }

    public List<OrderItemInfo> queryOrderItemInfoListByOld(OrderItemInfoQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OrderItemInfoManagerImpl.getOrderItemInfoByOld  ERROR!para null");
            throw new IllegalArgumentException("OrderItemInfoManagerImpl.getOrderItemInfoByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OrderItemInfoSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OrderItemInfoDao.queryOrderItemInfoListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderItemInfo> queryOrderItemInfoListWithPage(OrderItemInfoQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OrderItemInfoQuery();
        }

        // 查询总数
        int totalItem = queryOrderItemInfoCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OrderItemInfoDao.queryOrderItemInfoListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderItemInfoCount(OrderItemInfoQuery queryBean) {
        return OrderItemInfoDao.queryOrderItemInfoCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderItemInfo OrderItemInfo) {
        return OrderItemInfoDao.delete(OrderItemInfo);
    }

    /**
     * {@inheritDoc}
     */
    public OrderItemInfo getOrderItemInfoById(Long id) {
        return OrderItemInfoDao.getOrderItemInfoById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OrderItemInfo[] OrderItemInfos) {
        boolean resultFlag = false;
        if (null != OrderItemInfos && OrderItemInfos.length > 0) {
            for (int i = 0; i < OrderItemInfos.length; i++) {
                resultFlag = delete(OrderItemInfos[i]);
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
    public boolean exist(OrderItemInfo OrderItemInfo) {
        return OrderItemInfoDao.exist(OrderItemInfo);
    }
}
