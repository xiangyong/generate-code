package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.TaskOrder;
import com.peter.pms.domain.enums.TaskOrderSatusEnum;
import com.peter.pms.domain.query.TaskOrderQuery;
import com.peter.pms.dao.TaskOrderDao;
import com.peter.pms.manager.TaskOrderManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TaskOrderManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class TaskOrderManagerImpl extends BaseManager implements TaskOrderManager {

    private static final Log LOG = LogFactory.getLog(TaskOrderManagerImpl.class);
	
    @Autowired
    private TaskOrderDao TaskOrderDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<TaskOrder> TaskOrderList) {
        boolean resultFlag = false;
        if (null != TaskOrderList && TaskOrderList.size() > 0) {
            for (TaskOrder TaskOrder : TaskOrderList) {
                resultFlag = TaskOrderDao.insert(TaskOrder);
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
    public boolean insert(TaskOrder TaskOrder) {
        return TaskOrderDao.insert(TaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final TaskOrder TaskOrder) {
        return TaskOrderDao.update(TaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public List<TaskOrder> queryTaskOrderList(TaskOrderQuery queryBean) {
        return TaskOrderDao.queryTaskOrderList(queryBean);
    }

    public List<TaskOrder> queryTaskOrderListByOld(TaskOrderQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("TaskOrderManagerImpl.getTaskOrderByOld  ERROR!para null");
            throw new IllegalArgumentException("TaskOrderManagerImpl.getTaskOrderByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(TaskOrderSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return TaskOrderDao.queryTaskOrderListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<TaskOrder> queryTaskOrderListWithPage(TaskOrderQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new TaskOrderQuery();
        }

        // 查询总数
        int totalItem = queryTaskOrderCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return TaskOrderDao.queryTaskOrderListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryTaskOrderCount(TaskOrderQuery queryBean) {
        return TaskOrderDao.queryTaskOrderCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(TaskOrder TaskOrder) {
        return TaskOrderDao.delete(TaskOrder);
    }

    /**
     * {@inheritDoc}
     */
    public TaskOrder getTaskOrderById(Long id) {
        return TaskOrderDao.getTaskOrderById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final TaskOrder[] TaskOrders) {
        boolean resultFlag = false;
        if (null != TaskOrders && TaskOrders.length > 0) {
            for (int i = 0; i < TaskOrders.length; i++) {
                resultFlag = delete(TaskOrders[i]);
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
    public boolean exist(TaskOrder TaskOrder) {
        return TaskOrderDao.exist(TaskOrder);
    }
}
