package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.OrderInfo;
import com.peter.pms.domain.query.OrderInfoQuery;
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
     * @param OrderInfoList
     * @return
     */
    public boolean insert(List<OrderInfo> OrderInfoList);

    /**
     * 单个增加对象信息
     * 
     * @param OrderInfo
     * @return
     */
    public boolean insert(OrderInfo orderInfo);

    /**
     * 更新 对象信息
     * 
     * @param OrderInfo
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(OrderInfo orderInfo);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderInfo> queryOrderInfoList(OrderInfoQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<OrderInfo> queryOrderInfoListWithPage(OrderInfoQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryOrderInfoCount(OrderInfoQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderInfo
     *            　
     * @return
     */
    public boolean delete(OrderInfo orderInfo);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public OrderInfo getOrderInfoById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderInfos
     *            OrderInfo集合
     * @return
     */
    public boolean delete(OrderInfo[] orderInfos);

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
    public List<OrderInfo> queryOrderInfoListByOld(OrderInfoQuery queryBean);
}
