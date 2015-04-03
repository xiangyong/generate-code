package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OrderForcedIssued;
import com.peter.pms.domain.query.OrderForcedIssuedQuery;
/**
*
*@author 自动生成
*OrderForcedIssued
*
*/
public interface OrderForcedIssuedDao {
    
    /**
     * 新增对象
     * 
     * @param OrderForcedIssued 
     * @return
     */
    public boolean insert(OrderForcedIssued orderForcedIssued);

    /**
     * 更新对象
     * 
     * @param OrderForcedIssued
     * @return
     */
    public boolean update(OrderForcedIssued orderForcedIssued);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedList(OrderForcedIssuedQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOrderForcedIssuedCount(OrderForcedIssuedQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedListWithPage(OrderForcedIssuedQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OrderForcedIssued
     * @return
     */
    public boolean delete(OrderForcedIssued orderForcedIssued);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OrderForcedIssued getOrderForcedIssuedById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OrderForcedIssued
     * @return
     */
    public boolean exist(OrderForcedIssued orderForcedIssued);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedListByOld(OrderForcedIssued queryBean);

}
