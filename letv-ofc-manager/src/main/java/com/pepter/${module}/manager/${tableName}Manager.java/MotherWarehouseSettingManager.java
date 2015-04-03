package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.MotherWarehouseSetting;
import com.peter.pms.domain.query.MotherWarehouseSettingQuery;
import com.letv.common.utils.page.PageUtil;
/**
 * pmsManager接口
 * 
 * 自动生成
 * 
 */
public interface Manager {

    /**
     * 批量增加对象信息
     * 
     * @param MotherWarehouseSettingList
     * @return
     */
    public boolean insert(List<MotherWarehouseSetting> MotherWarehouseSettingList);

    /**
     * 单个增加对象信息
     * 
     * @param MotherWarehouseSetting
     * @return
     */
    public boolean insert(MotherWarehouseSetting motherWarehouseSetting);

    /**
     * 更新 对象信息
     * 
     * @param MotherWarehouseSetting
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(MotherWarehouseSetting motherWarehouseSetting);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingList(MotherWarehouseSettingQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListWithPage(MotherWarehouseSettingQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryMotherWarehouseSettingCount(MotherWarehouseSettingQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param MotherWarehouseSetting
     *            　
     * @return
     */
    public boolean delete(MotherWarehouseSetting motherWarehouseSetting);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public MotherWarehouseSetting getMotherWarehouseSettingById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param MotherWarehouseSettings
     *            MotherWarehouseSetting集合
     * @return
     */
    public boolean delete(MotherWarehouseSetting[] motherWarehouseSettings);

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
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListByOld(MotherWarehouseSettingQuery queryBean);
}
