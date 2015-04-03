package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.EqualGoodsDao;
import com.peter.pms.domain.EqualGoods;
import com.peter.pms.domain.query.EqualGoodsQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*EqualGoods
*
*/
@Repository
public class EqualGoodsDaoImpl extends BaseDao implements EqualGoodsDao {
    /** namespace */
    private final String namespace = EqualGoodsDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<EqualGoods> queryEqualGoodsList(EqualGoodsQuery queryBean) {
        return (List<EqualGoods>) queryForList(namespace +".queryEqualGoodsList", queryBean);
    }

    public List<EqualGoods> queryEqualGoodsListByOld(EqualGoodsQuery queryBean) {
        return (List<EqualGoods>) queryForList(namespace +".queryEqualGoodsListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(EqualGoods EqualGoods) {
        return insert(namespace +".insert", equalGoods);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(EqualGoods equalGoods) {
        return update(namespace +".update", equalGoods);
    }

    /**
     * {@inheritDoc}
     */
    public int queryEqualGoodsCount(EqualGoodsQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryEqualGoodsCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<EqualGoods> queryEqualGoodsListWithPage(EqualGoodsQuery queryBean) {
        return (List<EqualGoods>) queryForList(namespace +".queryEqualGoodsListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(EqualGoods configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public EqualGoods getEqualGoodsById(Long id) {
        return (EqualGoods) queryForObject(namespace +".getEqualGoodsById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(EqualGoods equalGoods) {
        int count = (Integer) queryForObject(namespace +".exist", EqualGoods);
        return count > 0;
    }
}
