package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.WorkType;
import com.peter.pms.domain.query.WorkTypeQuery;
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
     * @param WorkTypeList
     * @return
     */
    public boolean insert(List<WorkType> WorkTypeList);

    /**
     * 单个增加对象信息
     * 
     * @param WorkType
     * @return
     */
    public boolean insert(WorkType workType);

    /**
     * 更新 对象信息
     * 
     * @param WorkType
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(WorkType workType);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<WorkType> queryWorkTypeList(WorkTypeQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<WorkType> queryWorkTypeListWithPage(WorkTypeQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryWorkTypeCount(WorkTypeQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param WorkType
     *            　
     * @return
     */
    public boolean delete(WorkType workType);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public WorkType getWorkTypeById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param WorkTypes
     *            WorkType集合
     * @return
     */
    public boolean delete(WorkType[] workTypes);

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
    public List<WorkType> queryWorkTypeListByOld(WorkTypeQuery queryBean);
}
