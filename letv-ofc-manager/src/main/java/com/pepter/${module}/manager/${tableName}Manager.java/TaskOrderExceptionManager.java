package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.TaskOrderException;
import com.peter.pms.domain.query.TaskOrderExceptionQuery;
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
     * @param TaskOrderExceptionList
     * @return
     */
    public boolean insert(List<TaskOrderException> TaskOrderExceptionList);

    /**
     * 单个增加对象信息
     * 
     * @param TaskOrderException
     * @return
     */
    public boolean insert(TaskOrderException taskOrderException);

    /**
     * 更新 对象信息
     * 
     * @param TaskOrderException
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(TaskOrderException taskOrderException);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<TaskOrderException> queryTaskOrderExceptionList(TaskOrderExceptionQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<TaskOrderException> queryTaskOrderExceptionListWithPage(TaskOrderExceptionQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryTaskOrderExceptionCount(TaskOrderExceptionQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param TaskOrderException
     *            　
     * @return
     */
    public boolean delete(TaskOrderException taskOrderException);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public TaskOrderException getTaskOrderExceptionById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param TaskOrderExceptions
     *            TaskOrderException集合
     * @return
     */
    public boolean delete(TaskOrderException[] taskOrderExceptions);

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
    public List<TaskOrderException> queryTaskOrderExceptionListByOld(TaskOrderExceptionQuery queryBean);
}
