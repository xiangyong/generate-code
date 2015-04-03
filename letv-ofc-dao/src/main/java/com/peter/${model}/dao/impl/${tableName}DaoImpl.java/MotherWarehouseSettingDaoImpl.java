package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.MotherWarehouseSettingDao;
import com.peter.pms.domain.MotherWarehouseSetting;
import com.peter.pms.domain.query.MotherWarehouseSettingQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*MotherWarehouseSetting
*
*/
@Repository
public class MotherWarehouseSettingDaoImpl extends BaseDao implements MotherWarehouseSettingDao {
    /** namespace */
    private final String namespace = MotherWarehouseSettingDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingList(MotherWarehouseSettingQuery queryBean) {
        return (List<MotherWarehouseSetting>) queryForList(namespace +".queryMotherWarehouseSettingList", queryBean);
    }

    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListByOld(MotherWarehouseSettingQuery queryBean) {
        return (List<MotherWarehouseSetting>) queryForList(namespace +".queryMotherWarehouseSettingListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(MotherWarehouseSetting MotherWarehouseSetting) {
        return insert(namespace +".insert", motherWarehouseSetting);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(MotherWarehouseSetting motherWarehouseSetting) {
        return update(namespace +".update", motherWarehouseSetting);
    }

    /**
     * {@inheritDoc}
     */
    public int queryMotherWarehouseSettingCount(MotherWarehouseSettingQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryMotherWarehouseSettingCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListWithPage(MotherWarehouseSettingQuery queryBean) {
        return (List<MotherWarehouseSetting>) queryForList(namespace +".queryMotherWarehouseSettingListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(MotherWarehouseSetting configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public MotherWarehouseSetting getMotherWarehouseSettingById(Long id) {
        return (MotherWarehouseSetting) queryForObject(namespace +".getMotherWarehouseSettingById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(MotherWarehouseSetting motherWarehouseSetting) {
        int count = (Integer) queryForObject(namespace +".exist", MotherWarehouseSetting);
        return count > 0;
    }
}
