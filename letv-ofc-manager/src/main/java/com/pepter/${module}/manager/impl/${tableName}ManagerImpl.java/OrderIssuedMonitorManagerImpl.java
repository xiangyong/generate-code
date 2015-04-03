package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OrderIssuedMonitor;
import com.peter.pms.domain.enums.OrderIssuedMonitorSatusEnum;
import com.peter.pms.domain.query.OrderIssuedMonitorQuery;
import com.peter.pms.dao.OrderIssuedMonitorDao;
import com.peter.pms.manager.OrderIssuedMonitorManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OrderIssuedMonitorManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OrderIssuedMonitorManagerImpl extends BaseManager implements OrderIssuedMonitorManager {

    private static final Log LOG = LogFactory.getLog(OrderIssuedMonitorManagerImpl.class);
	
    @Autowired
    private OrderIssuedMonitorDao OrderIssuedMonitorDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OrderIssuedMonitor> OrderIssuedMonitorList) {
        boolean resultFlag = false;
        if (null != OrderIssuedMonitorList && OrderIssuedMonitorList.size() > 0) {
            for (OrderIssuedMonitor OrderIssuedMonitor : OrderIssuedMonitorList) {
                resultFlag = OrderIssuedMonitorDao.insert(OrderIssuedMonitor);
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
    public boolean insert(OrderIssuedMonitor OrderIssuedMonitor) {
        return OrderIssuedMonitorDao.insert(OrderIssuedMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OrderIssuedMonitor OrderIssuedMonitor) {
        return OrderIssuedMonitorDao.update(OrderIssuedMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedMonitor> queryOrderIssuedMonitorList(OrderIssuedMonitorQuery queryBean) {
        return OrderIssuedMonitorDao.queryOrderIssuedMonitorList(queryBean);
    }

    public List<OrderIssuedMonitor> queryOrderIssuedMonitorListByOld(OrderIssuedMonitorQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OrderIssuedMonitorManagerImpl.getOrderIssuedMonitorByOld  ERROR!para null");
            throw new IllegalArgumentException("OrderIssuedMonitorManagerImpl.getOrderIssuedMonitorByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OrderIssuedMonitorSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OrderIssuedMonitorDao.queryOrderIssuedMonitorListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OrderIssuedMonitor> queryOrderIssuedMonitorListWithPage(OrderIssuedMonitorQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OrderIssuedMonitorQuery();
        }

        // 查询总数
        int totalItem = queryOrderIssuedMonitorCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OrderIssuedMonitorDao.queryOrderIssuedMonitorListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOrderIssuedMonitorCount(OrderIssuedMonitorQuery queryBean) {
        return OrderIssuedMonitorDao.queryOrderIssuedMonitorCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OrderIssuedMonitor OrderIssuedMonitor) {
        return OrderIssuedMonitorDao.delete(OrderIssuedMonitor);
    }

    /**
     * {@inheritDoc}
     */
    public OrderIssuedMonitor getOrderIssuedMonitorById(Long id) {
        return OrderIssuedMonitorDao.getOrderIssuedMonitorById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OrderIssuedMonitor[] OrderIssuedMonitors) {
        boolean resultFlag = false;
        if (null != OrderIssuedMonitors && OrderIssuedMonitors.length > 0) {
            for (int i = 0; i < OrderIssuedMonitors.length; i++) {
                resultFlag = delete(OrderIssuedMonitors[i]);
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
    public boolean exist(OrderIssuedMonitor OrderIssuedMonitor) {
        return OrderIssuedMonitorDao.exist(OrderIssuedMonitor);
    }
}
