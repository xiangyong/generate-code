package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.WorkType;
import com.peter.pms.domain.enums.WorkTypeSatusEnum;
import com.peter.pms.domain.query.WorkTypeQuery;
import com.peter.pms.dao.WorkTypeDao;
import com.peter.pms.manager.WorkTypeManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * WorkTypeManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class WorkTypeManagerImpl extends BaseManager implements WorkTypeManager {

    private static final Log LOG = LogFactory.getLog(WorkTypeManagerImpl.class);
	
    @Autowired
    private WorkTypeDao WorkTypeDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<WorkType> WorkTypeList) {
        boolean resultFlag = false;
        if (null != WorkTypeList && WorkTypeList.size() > 0) {
            for (WorkType WorkType : WorkTypeList) {
                resultFlag = WorkTypeDao.insert(WorkType);
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
    public boolean insert(WorkType WorkType) {
        return WorkTypeDao.insert(WorkType);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final WorkType WorkType) {
        return WorkTypeDao.update(WorkType);
    }

    /**
     * {@inheritDoc}
     */
    public List<WorkType> queryWorkTypeList(WorkTypeQuery queryBean) {
        return WorkTypeDao.queryWorkTypeList(queryBean);
    }

    public List<WorkType> queryWorkTypeListByOld(WorkTypeQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("WorkTypeManagerImpl.getWorkTypeByOld  ERROR!para null");
            throw new IllegalArgumentException("WorkTypeManagerImpl.getWorkTypeByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(WorkTypeSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return WorkTypeDao.queryWorkTypeListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<WorkType> queryWorkTypeListWithPage(WorkTypeQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new WorkTypeQuery();
        }

        // 查询总数
        int totalItem = queryWorkTypeCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return WorkTypeDao.queryWorkTypeListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryWorkTypeCount(WorkTypeQuery queryBean) {
        return WorkTypeDao.queryWorkTypeCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(WorkType WorkType) {
        return WorkTypeDao.delete(WorkType);
    }

    /**
     * {@inheritDoc}
     */
    public WorkType getWorkTypeById(Long id) {
        return WorkTypeDao.getWorkTypeById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final WorkType[] WorkTypes) {
        boolean resultFlag = false;
        if (null != WorkTypes && WorkTypes.length > 0) {
            for (int i = 0; i < WorkTypes.length; i++) {
                resultFlag = delete(WorkTypes[i]);
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
    public boolean exist(WorkType WorkType) {
        return WorkTypeDao.exist(WorkType);
    }
}
