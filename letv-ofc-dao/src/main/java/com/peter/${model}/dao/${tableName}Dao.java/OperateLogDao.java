package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OperateLog;
import com.peter.pms.domain.query.OperateLogQuery;
/**
*
*@author 自动生成
*OperateLog
*
*/
public interface OperateLogDao {
    
    /**
     * 新增对象
     * 
     * @param OperateLog 
     * @return
     */
    public boolean insert(OperateLog operateLog);

    /**
     * 更新对象
     * 
     * @param OperateLog
     * @return
     */
    public boolean update(OperateLog operateLog);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OperateLog> queryOperateLogList(OperateLogQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOperateLogCount(OperateLogQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OperateLog> queryOperateLogListWithPage(OperateLogQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OperateLog
     * @return
     */
    public boolean delete(OperateLog operateLog);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OperateLog getOperateLogById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OperateLog
     * @return
     */
    public boolean exist(OperateLog operateLog);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OperateLog> queryOperateLogListByOld(OperateLog queryBean);

}
