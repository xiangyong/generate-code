package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.TaskOrder;
import com.peter.pms.domain.query.TaskOrderQuery;
/**
*
*@author 自动生成
*TaskOrder
*
*/
public interface TaskOrderDao {
    
    /**
     * 新增对象
     * 
     * @param TaskOrder 
     * @return
     */
    public boolean insert(TaskOrder taskOrder);

    /**
     * 更新对象
     * 
     * @param TaskOrder
     * @return
     */
    public boolean update(TaskOrder taskOrder);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TaskOrder> queryTaskOrderList(TaskOrderQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTaskOrderCount(TaskOrderQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TaskOrder> queryTaskOrderListWithPage(TaskOrderQuery queryBean);

    /**
     * 删除记录
     * 
     * @param TaskOrder
     * @return
     */
    public boolean delete(TaskOrder taskOrder);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public TaskOrder getTaskOrderById(Long id);

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
    public List<TaskOrder> queryTaskOrderListByOld(TaskOrder queryBean);

}
