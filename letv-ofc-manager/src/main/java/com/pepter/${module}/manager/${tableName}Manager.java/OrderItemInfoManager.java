package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.OrderItemInfo;
import com.peter.pms.domain.query.OrderItemInfoQuery;
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
     * @param OrderItemInfoList
     * @return
     */
    public boolean insert(List<OrderItemInfo> OrderItemInfoList);

    /**
     * 单个增加对象信息
     * 
     * @param OrderItemInfo
     * @return
     */
    public boolean insert(OrderItemInfo orderItemInfo);

    /**
     * 更新 对象信息
     * 
     * @param OrderItemInfo
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(OrderItemInfo orderItemInfo);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderItemInfo> queryOrderItemInfoList(OrderItemInfoQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<OrderItemInfo> queryOrderItemInfoListWithPage(OrderItemInfoQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryOrderItemInfoCount(OrderItemInfoQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderItemInfo
     *            　
     * @return
     */
    public boolean delete(OrderItemInfo orderItemInfo);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public OrderItemInfo getOrderItemInfoById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderItemInfos
     *            OrderItemInfo集合
     * @return
     */
    public boolean delete(OrderItemInfo[] orderItemInfos);

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
    public List<OrderItemInfo> queryOrderItemInfoListByOld(OrderItemInfoQuery queryBean);
}
