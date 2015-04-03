package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.MotherWarehouseSetting;
import com.peter.pms.domain.query.MotherWarehouseSettingQuery;
/**
*
*@author 自动生成
*MotherWarehouseSetting
*
*/
public interface MotherWarehouseSettingDao {
    
    /**
     * 新增对象
     * 
     * @param MotherWarehouseSetting 
     * @return
     */
    public boolean insert(MotherWarehouseSetting motherWarehouseSetting);

    /**
     * 更新对象
     * 
     * @param MotherWarehouseSetting
     * @return
     */
    public boolean update(MotherWarehouseSetting motherWarehouseSetting);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingList(MotherWarehouseSettingQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryMotherWarehouseSettingCount(MotherWarehouseSettingQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListWithPage(MotherWarehouseSettingQuery queryBean);

    /**
     * 删除记录
     * 
     * @param MotherWarehouseSetting
     * @return
     */
    public boolean delete(MotherWarehouseSetting motherWarehouseSetting);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public MotherWarehouseSetting getMotherWarehouseSettingById(Long id);

    /**
     * 判断是否存在
     * 
     * @param MotherWarehouseSetting
     * @return
     */
    public boolean exist(MotherWarehouseSetting motherWarehouseSetting);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListByOld(MotherWarehouseSetting queryBean);

}
