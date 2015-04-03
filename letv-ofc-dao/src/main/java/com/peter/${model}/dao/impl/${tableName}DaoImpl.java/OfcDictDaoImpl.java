package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.OfcDictDao;
import com.peter.pms.domain.OfcDict;
import com.peter.pms.domain.query.OfcDictQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*OfcDict
*
*/
@Repository
public class OfcDictDaoImpl extends BaseDao implements OfcDictDao {
    /** namespace */
    private final String namespace = OfcDictDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<OfcDict> queryOfcDictList(OfcDictQuery queryBean) {
        return (List<OfcDict>) queryForList(namespace +".queryOfcDictList", queryBean);
    }

    public List<OfcDict> queryOfcDictListByOld(OfcDictQuery queryBean) {
        return (List<OfcDict>) queryForList(namespace +".queryOfcDictListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(OfcDict OfcDict) {
        return insert(namespace +".insert", ofcDict);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(OfcDict ofcDict) {
        return update(namespace +".update", ofcDict);
    }

    /**
     * {@inheritDoc}
     */
    public int queryOfcDictCount(OfcDictQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryOfcDictCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<OfcDict> queryOfcDictListWithPage(OfcDictQuery queryBean) {
        return (List<OfcDict>) queryForList(namespace +".queryOfcDictListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OfcDict configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public OfcDict getOfcDictById(Long id) {
        return (OfcDict) queryForObject(namespace +".getOfcDictById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(OfcDict ofcDict) {
        int count = (Integer) queryForObject(namespace +".exist", OfcDict);
        return count > 0;
    }
}
