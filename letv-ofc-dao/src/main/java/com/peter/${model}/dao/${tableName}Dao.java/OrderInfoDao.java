package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OrderInfo;
import com.peter.pms.domain.query.OrderInfoQuery;
/**
*
*@author 自动生成
*OrderInfo
*下发订单主表信息
*/
public interface OrderInfoDao {
    
    /**
     * 新增对象
     * 
     * @param OrderInfo 
     * @return
     */
    public boolean insert(OrderInfo orderInfo);

    /**
     * 更新对象
     * 
     * @param OrderInfo
     * @return
     */
    public boolean update(OrderInfo orderInfo);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderInfo> queryOrderInfoList(OrderInfoQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOrderInfoCount(OrderInfoQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderInfo> queryOrderInfoListWithPage(OrderInfoQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OrderInfo
     * @return
     */
    public boolean delete(OrderInfo orderInfo);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OrderInfo getOrderInfoById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OrderInfo
     * @return
     */
    public boolean exist(OrderInfo orderInfo);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OrderInfo> queryOrderInfoListByOld(OrderInfo queryBean);

}
