package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OrderItemInfo;
import com.peter.pms.domain.query.OrderItemInfoQuery;
/**
*
*@author 自动生成
*OrderItemInfo
*下发订单商品明细
*/
public interface OrderItemInfoDao {
    
    /**
     * 新增对象
     * 
     * @param OrderItemInfo 
     * @return
     */
    public boolean insert(OrderItemInfo orderItemInfo);

    /**
     * 更新对象
     * 
     * @param OrderItemInfo
     * @return
     */
    public boolean update(OrderItemInfo orderItemInfo);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderItemInfo> queryOrderItemInfoList(OrderItemInfoQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOrderItemInfoCount(OrderItemInfoQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderItemInfo> queryOrderItemInfoListWithPage(OrderItemInfoQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OrderItemInfo
     * @return
     */
    public boolean delete(OrderItemInfo orderItemInfo);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OrderItemInfo getOrderItemInfoById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OrderItemInfo
     * @return
     */
    public boolean exist(OrderItemInfo orderItemInfo);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OrderItemInfo> queryOrderItemInfoListByOld(OrderItemInfo queryBean);

}
