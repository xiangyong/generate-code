package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.TaskOrder;
import com.peter.pms.domain.query.TaskOrderQuery;
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
     * @param TaskOrderList
     * @return
     */
    public boolean insert(List<TaskOrder> TaskOrderList);

    /**
     * 单个增加对象信息
     * 
     * @param TaskOrder
     * @return
     */
    public boolean insert(TaskOrder taskOrder);

    /**
     * 更新 对象信息
     * 
     * @param TaskOrder
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TaskOrder taskOrder);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TaskOrder> queryTaskOrderList(TaskOrderQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<TaskOrder> queryTaskOrderListWithPage(TaskOrderQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTaskOrderCount(TaskOrderQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param TaskOrder
     *            　
     * @return
     */
    public boolean delete(TaskOrder taskOrder);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public TaskOrder getTaskOrderById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param TaskOrders
     *            TaskOrder集合
     * @return
     */
    public boolean delete(TaskOrder[] taskOrders);

    /**
     * 判断是否存在
     * 
     * @param TaskOrder
     * @return
     */
    public boolean exist(TaskOrder taskOrder);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<TaskOrder> queryTaskOrderListByOld(TaskOrderQuery queryBean);
}
