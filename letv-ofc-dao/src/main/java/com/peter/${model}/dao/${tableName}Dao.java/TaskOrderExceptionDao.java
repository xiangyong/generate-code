package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.TaskOrderException;
import com.peter.pms.domain.query.TaskOrderExceptionQuery;
/**
*
*@author 自动生成
*TaskOrderException
*
*/
public interface TaskOrderExceptionDao {
    
    /**
     * 新增对象
     * 
     * @param TaskOrderException 
     * @return
     */
    public boolean insert(TaskOrderException taskOrderException);

    /**
     * 更新对象
     * 
     * @param TaskOrderException
     * @return
     */
    public boolean update(TaskOrderException taskOrderException);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TaskOrderException> queryTaskOrderExceptionList(TaskOrderExceptionQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryTaskOrderExceptionCount(TaskOrderExceptionQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TaskOrderException> queryTaskOrderExceptionListWithPage(TaskOrderExceptionQuery queryBean);

    /**
     * 删除记录
     * 
     * @param TaskOrderException
     * @return
     */
    public boolean delete(TaskOrderException taskOrderException);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public TaskOrderException getTaskOrderExceptionById(Long id);

    /**
     * 判断是否存在
     * 
     * @param TaskOrderException
     * @return
     */
    public boolean exist(TaskOrderException taskOrderException);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<TaskOrderException> queryTaskOrderExceptionListByOld(TaskOrderException queryBean);

}
