package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.HisTaskOrder;
import com.peter.pms.domain.query.HisTaskOrderQuery;
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
     * @param HisTaskOrderList
     * @return
     */
    public boolean insert(List<HisTaskOrder> HisTaskOrderList);

    /**
     * 单个增加对象信息
     * 
     * @param HisTaskOrder
     * @return
     */
    public boolean insert(HisTaskOrder hisTaskOrder);

    /**
     * 更新 对象信息
     * 
     * @param HisTaskOrder
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(HisTaskOrder hisTaskOrder);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<HisTaskOrder> queryHisTaskOrderList(HisTaskOrderQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<HisTaskOrder> queryHisTaskOrderListWithPage(HisTaskOrderQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryHisTaskOrderCount(HisTaskOrderQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param HisTaskOrder
     *            　
     * @return
     */
    public boolean delete(HisTaskOrder hisTaskOrder);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public HisTaskOrder getHisTaskOrderById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param HisTaskOrders
     *            HisTaskOrder集合
     * @return
     */
    public boolean delete(HisTaskOrder[] hisTaskOrders);

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
    public List<HisTaskOrder> queryHisTaskOrderListByOld(HisTaskOrderQuery queryBean);
}
