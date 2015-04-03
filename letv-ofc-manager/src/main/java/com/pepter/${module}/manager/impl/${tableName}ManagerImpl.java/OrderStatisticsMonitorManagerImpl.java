package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OrderStatisticsMonitor;
import com.peter.pms.domain.enums.OrderStatisticsMonitorSatusEnum;
import com.peter.pms.domain.query.OrderStatisticsMonitorQuery;
import com.peter.pms.dao.OrderStatisticsMonitorDao;
import com.peter.pms.manager.OrderStatisticsMonitorManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OrderStatisticsMonitorManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OrderStatisticsMonitorManagerImpl extends BaseManager implements OrderStatisticsMonitorManager {

    private static final Log LOG = LogFactory.getLog(OrderStatisticsMonitorManagerImpl.class);
	
    @Autowired
    private OrderStatisticsMonitorDao OrderStatisticsMonitorDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OrderStatisticsMonitor> OrderStatisticsMonitorList) {
        boolean resultFlag = false;
        if (null != OrderStatisticsMonitorList && OrderStatisticsMonitorList.size() > 0) {
            for (OrderStatisticsMonitor OrderStatisticsMonitor : OrderStatisticsMonitorList) {
                resultFlag = OrderStatisticsMonitorDao.insert(OrderStatisticsMonitor);
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
    public boolean insert(OrderStatisticsMonitor OrderStatisticsMonitor) {
        return OrderStatisticsMonitorDao.insert(OrderStatisticsMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OrderStatisticsMonitor OrderStatisticsMonitor) {
        return OrderStatisticsMonitorDao.update(OrderStatisticsMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorList(OrderStatisticsMonitorQuery queryBean) {
        return OrderStatisticsMonitorDao.queryOrderStatisticsMonitorList(queryBean);
    }

    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorListByOld(OrderStatisticsMonitorQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OrderStatisticsMonitorManagerImpl.getOrderStatisticsMonitorByOld  ERROR!para null");
            throw new IllegalArgumentException("OrderStatisticsMonitorManagerImpl.getOrderStatisticsMonitorByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OrderStatisticsMonitorSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OrderStatisticsMonitorDao.queryOrderStatisticsMonitorListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorListWithPage(OrderStatisticsMonitorQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OrderStatisticsMonitorQuery();
        }

        // 查询总数
        int totalItem = queryOrderStatisticsMonitorCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OrderStatisticsMonitorDao.queryOrderStatisticsMonitorListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderStatisticsMonitorCount(OrderStatisticsMonitorQuery queryBean) {
        return OrderStatisticsMonitorDao.queryOrderStatisticsMonitorCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderStatisticsMonitor OrderStatisticsMonitor) {
        return OrderStatisticsMonitorDao.delete(OrderStatisticsMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public OrderStatisticsMonitor getOrderStatisticsMonitorById(Long id) {
        return OrderStatisticsMonitorDao.getOrderStatisticsMonitorById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OrderStatisticsMonitor[] OrderStatisticsMonitors) {
        boolean resultFlag = false;
        if (null != OrderStatisticsMonitors && OrderStatisticsMonitors.length > 0) {
            for (int i = 0; i < OrderStatisticsMonitors.length; i++) {
                resultFlag = delete(OrderStatisticsMonitors[i]);
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
    public boolean exist(OrderStatisticsMonitor OrderStatisticsMonitor) {
        return OrderStatisticsMonitorDao.exist(OrderStatisticsMonitor);
    }
}
