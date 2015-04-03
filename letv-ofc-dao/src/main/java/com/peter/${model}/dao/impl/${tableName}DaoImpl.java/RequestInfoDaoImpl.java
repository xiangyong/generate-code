package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.RequestInfoDao;
import com.peter.pms.domain.RequestInfo;
import com.peter.pms.domain.query.RequestInfoQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*RequestInfo
*
*/
@Repository
public class RequestInfoDaoImpl extends BaseDao implements RequestInfoDao {
    /** namespace */
    private final String namespace = RequestInfoDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<RequestInfo> queryRequestInfoList(RequestInfoQuery queryBean) {
        return (List<RequestInfo>) queryForList(namespace +".queryRequestInfoList", queryBean);
    }

    public List<RequestInfo> queryRequestInfoListByOld(RequestInfoQuery queryBean) {
        return (List<RequestInfo>) queryForList(namespace +".queryRequestInfoListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(RequestInfo RequestInfo) {
        return insert(namespace +".insert", requestInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(RequestInfo requestInfo) {
        return update(namespace +".update", requestInfo);
    }

    /**
     * {@inheritDoc}
     */
    public int queryRequestInfoCount(RequestInfoQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryRequestInfoCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<RequestInfo> queryRequestInfoListWithPage(RequestInfoQuery queryBean) {
        return (List<RequestInfo>) queryForList(namespace +".queryRequestInfoListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(RequestInfo configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public RequestInfo getRequestInfoById(Long id) {
        return (RequestInfo) queryForObject(namespace +".getRequestInfoById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(RequestInfo requestInfo) {
        int count = (Integer) queryForObject(namespace +".exist", RequestInfo);
        return count > 0;
    }
}
