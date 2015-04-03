package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.WorkTypeDao;
import com.peter.pms.domain.WorkType;
import com.peter.pms.domain.query.WorkTypeQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*WorkType
*
*/
@Repository
public class WorkTypeDaoImpl extends BaseDao implements WorkTypeDao {
    /** namespace */
    private final String namespace = WorkTypeDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<WorkType> queryWorkTypeList(WorkTypeQuery queryBean) {
        return (List<WorkType>) queryForList(namespace +".queryWorkTypeList", queryBean);
    }

    public List<WorkType> queryWorkTypeListByOld(WorkTypeQuery queryBean) {
        return (List<WorkType>) queryForList(namespace +".queryWorkTypeListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(WorkType WorkType) {
        return insert(namespace +".insert", workType);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(WorkType workType) {
        return update(namespace +".update", workType);
    }

    /**
     * {@inheritDoc}
     */
    public int queryWorkTypeCount(WorkTypeQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryWorkTypeCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<WorkType> queryWorkTypeListWithPage(WorkTypeQuery queryBean) {
        return (List<WorkType>) queryForList(namespace +".queryWorkTypeListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(WorkType configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public WorkType getWorkTypeById(Long id) {
        return (WorkType) queryForObject(namespace +".getWorkTypeById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(WorkType workType) {
        int count = (Integer) queryForObject(namespace +".exist", WorkType);
        return count > 0;
    }
}
