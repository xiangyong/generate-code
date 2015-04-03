﻿package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.OrderForcedIssued;
import com.peter.pms.domain.query.OrderForcedIssuedQuery;
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
     * @param OrderForcedIssuedList
     * @return
     */
    public boolean insert(List<OrderForcedIssued> OrderForcedIssuedList);

    /**
     * 单个增加对象信息
     * 
     * @param OrderForcedIssued
     * @return
     */
    public boolean insert(OrderForcedIssued orderForcedIssued);

    /**
     * 更新 对象信息
     * 
     * @param OrderForcedIssued
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(OrderForcedIssued orderForcedIssued);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedList(OrderForcedIssuedQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<OrderForcedIssued> queryOrderForcedIssuedListWithPage(OrderForcedIssuedQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryOrderForcedIssuedCount(OrderForcedIssuedQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderForcedIssued
     *            　
     * @return
     */
    public boolean delete(OrderForcedIssued orderForcedIssued);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public OrderForcedIssued getOrderForcedIssuedById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderForcedIssueds
     *            OrderForcedIssued集合
     * @return
     */
    public boolean delete(OrderForcedIssued[] orderForcedIssueds);

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
    public List<OrderForcedIssued> queryOrderForcedIssuedListByOld(OrderForcedIssuedQuery queryBean);
}
