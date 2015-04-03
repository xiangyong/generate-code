package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.OperateLog;
import com.peter.pms.domain.query.OperateLogQuery;
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
     * @param OperateLogList
     * @return
     */
    public boolean insert(List<OperateLog> OperateLogList);

    /**
     * 单个增加对象信息
     * 
     * @param OperateLog
     * @return
     */
    public boolean insert(OperateLog operateLog);

    /**
     * 更新 对象信息
     * 
     * @param OperateLog
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(OperateLog operateLog);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OperateLog> queryOperateLogList(OperateLogQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<OperateLog> queryOperateLogListWithPage(OperateLogQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryOperateLogCount(OperateLogQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param OperateLog
     *            　
     * @return
     */
    public boolean delete(OperateLog operateLog);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public OperateLog getOperateLogById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param OperateLogs
     *            OperateLog集合
     * @return
     */
    public boolean delete(OperateLog[] operateLogs);

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
    public List<OperateLog> queryOperateLogListByOld(OperateLogQuery queryBean);
}
