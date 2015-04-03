package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.HisTaskOrder;
import com.peter.pms.domain.query.HisTaskOrderQuery;
/**
*
*@author 自动生成
*HisTaskOrder
*
*/
public interface HisTaskOrderDao {
    
    /**
     * 新增对象
     * 
     * @param HisTaskOrder 
     * @return
     */
    public boolean insert(HisTaskOrder hisTaskOrder);

    /**
     * 更新对象
     * 
     * @param HisTaskOrder
     * @return
     */
    public boolean update(HisTaskOrder hisTaskOrder);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<HisTaskOrder> queryHisTaskOrderList(HisTaskOrderQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryHisTaskOrderCount(HisTaskOrderQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<HisTaskOrder> queryHisTaskOrderListWithPage(HisTaskOrderQuery queryBean);

    /**
     * 删除记录
     * 
     * @param HisTaskOrder
     * @return
     */
    public boolean delete(HisTaskOrder hisTaskOrder);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public HisTaskOrder getHisTaskOrderById(Long id);

    /**
     * 判断是否存在
     * 
     * @param HisTaskOrder
     * @return
     */
    public boolean exist(HisTaskOrder hisTaskOrder);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<HisTaskOrder> queryHisTaskOrderListByOld(HisTaskOrder queryBean);

}
