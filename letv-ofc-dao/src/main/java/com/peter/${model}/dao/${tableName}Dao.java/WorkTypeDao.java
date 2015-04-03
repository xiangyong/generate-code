package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.WorkType;
import com.peter.pms.domain.query.WorkTypeQuery;
/**
*
*@author 自动生成
*WorkType
*
*/
public interface WorkTypeDao {
    
    /**
     * 新增对象
     * 
     * @param WorkType 
     * @return
     */
    public boolean insert(WorkType workType);

    /**
     * 更新对象
     * 
     * @param WorkType
     * @return
     */
    public boolean update(WorkType workType);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<WorkType> queryWorkTypeList(WorkTypeQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryWorkTypeCount(WorkTypeQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<WorkType> queryWorkTypeListWithPage(WorkTypeQuery queryBean);

    /**
     * 删除记录
     * 
     * @param WorkType
     * @return
     */
    public boolean delete(WorkType workType);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public WorkType getWorkTypeById(Long id);

    /**
     * 判断是否存在
     * 
     * @param WorkType
     * @return
     */
    public boolean exist(WorkType workType);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<WorkType> queryWorkTypeListByOld(WorkType queryBean);

}
