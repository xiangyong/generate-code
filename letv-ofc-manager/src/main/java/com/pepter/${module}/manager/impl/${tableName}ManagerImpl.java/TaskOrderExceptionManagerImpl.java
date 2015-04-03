package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.TaskOrderException;
import com.peter.pms.domain.enums.TaskOrderExceptionSatusEnum;
import com.peter.pms.domain.query.TaskOrderExceptionQuery;
import com.peter.pms.dao.TaskOrderExceptionDao;
import com.peter.pms.manager.TaskOrderExceptionManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TaskOrderExceptionManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class TaskOrderExceptionManagerImpl extends BaseManager implements TaskOrderExceptionManager {

    private static final Log LOG = LogFactory.getLog(TaskOrderExceptionManagerImpl.class);
	
    @Autowired
    private TaskOrderExceptionDao TaskOrderExceptionDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<TaskOrderException> TaskOrderExceptionList) {
        boolean resultFlag = false;
        if (null != TaskOrderExceptionList && TaskOrderExceptionList.size() > 0) {
            for (TaskOrderException TaskOrderException : TaskOrderExceptionList) {
                resultFlag = TaskOrderExceptionDao.insert(TaskOrderException);
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
    public boolean insert(TaskOrderException TaskOrderException) {
        return TaskOrderExceptionDao.insert(TaskOrderException);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final TaskOrderException TaskOrderException) {
        return TaskOrderExceptionDao.update(TaskOrderException);
    }

    /**
     * {@inheritDoc}
     */
    public List<TaskOrderException> queryTaskOrderExceptionList(TaskOrderExceptionQuery queryBean) {
        return TaskOrderExceptionDao.queryTaskOrderExceptionList(queryBean);
    }

    public List<TaskOrderException> queryTaskOrderExceptionListByOld(TaskOrderExceptionQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("TaskOrderExceptionManagerImpl.getTaskOrderExceptionByOld  ERROR!para null");
            throw new IllegalArgumentException("TaskOrderExceptionManagerImpl.getTaskOrderExceptionByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(TaskOrderExceptionSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return TaskOrderExceptionDao.queryTaskOrderExceptionListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<TaskOrderException> queryTaskOrderExceptionListWithPage(TaskOrderExceptionQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new TaskOrderExceptionQuery();
        }

        // 查询总数
        int totalItem = queryTaskOrderExceptionCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return TaskOrderExceptionDao.queryTaskOrderExceptionListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryTaskOrderExceptionCount(TaskOrderExceptionQuery queryBean) {
        return TaskOrderExceptionDao.queryTaskOrderExceptionCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(TaskOrderException TaskOrderException) {
        return TaskOrderExceptionDao.delete(TaskOrderException);
    }

    /**
     * {@inheritDoc}
     */
    public TaskOrderException getTaskOrderExceptionById(Long id) {
        return TaskOrderExceptionDao.getTaskOrderExceptionById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final TaskOrderException[] TaskOrderExceptions) {
        boolean resultFlag = false;
        if (null != TaskOrderExceptions && TaskOrderExceptions.length > 0) {
            for (int i = 0; i < TaskOrderExceptions.length; i++) {
                resultFlag = delete(TaskOrderExceptions[i]);
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
    public boolean exist(TaskOrderException TaskOrderException) {
        return TaskOrderExceptionDao.exist(TaskOrderException);
    }
}
