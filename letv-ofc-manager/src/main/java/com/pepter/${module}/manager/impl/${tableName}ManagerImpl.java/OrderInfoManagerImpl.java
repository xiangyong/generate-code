package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OrderInfo;
import com.peter.pms.domain.enums.OrderInfoSatusEnum;
import com.peter.pms.domain.query.OrderInfoQuery;
import com.peter.pms.dao.OrderInfoDao;
import com.peter.pms.manager.OrderInfoManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OrderInfoManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OrderInfoManagerImpl extends BaseManager implements OrderInfoManager {

    private static final Log LOG = LogFactory.getLog(OrderInfoManagerImpl.class);
	
    @Autowired
    private OrderInfoDao OrderInfoDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OrderInfo> OrderInfoList) {
        boolean resultFlag = false;
        if (null != OrderInfoList && OrderInfoList.size() > 0) {
            for (OrderInfo OrderInfo : OrderInfoList) {
                resultFlag = OrderInfoDao.insert(OrderInfo);
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
    public boolean insert(OrderInfo OrderInfo) {
        return OrderInfoDao.insert(OrderInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OrderInfo OrderInfo) {
        return OrderInfoDao.update(OrderInfo);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderInfo> queryOrderInfoList(OrderInfoQuery queryBean) {
        return OrderInfoDao.queryOrderInfoList(queryBean);
    }

    public List<OrderInfo> queryOrderInfoListByOld(OrderInfoQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OrderInfoManagerImpl.getOrderInfoByOld  ERROR!para null");
            throw new IllegalArgumentException("OrderInfoManagerImpl.getOrderInfoByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OrderInfoSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OrderInfoDao.queryOrderInfoListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderInfo> queryOrderInfoListWithPage(OrderInfoQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OrderInfoQuery();
        }

        // 查询总数
        int totalItem = queryOrderInfoCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OrderInfoDao.queryOrderInfoListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderInfoCount(OrderInfoQuery queryBean) {
        return OrderInfoDao.queryOrderInfoCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderInfo OrderInfo) {
        return OrderInfoDao.delete(OrderInfo);
    }

    /**
     * {@inheritDoc}
     */
    public OrderInfo getOrderInfoById(Long id) {
        return OrderInfoDao.getOrderInfoById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OrderInfo[] OrderInfos) {
        boolean resultFlag = false;
        if (null != OrderInfos && OrderInfos.length > 0) {
            for (int i = 0; i < OrderInfos.length; i++) {
                resultFlag = delete(OrderInfos[i]);
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
    public boolean exist(OrderInfo OrderInfo) {
        return OrderInfoDao.exist(OrderInfo);
    }
}
