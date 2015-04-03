package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OrderStatisticsMonitor;
import com.peter.pms.domain.query.OrderStatisticsMonitorQuery;
/**
*
*@author 自动生成
*OrderStatisticsMonitor
*订单统计监控表
*/
public interface OrderStatisticsMonitorDao {
    
    /**
     * 新增对象
     * 
     * @param OrderStatisticsMonitor 
     * @return
     */
    public boolean insert(OrderStatisticsMonitor orderStatisticsMonitor);

    /**
     * 更新对象
     * 
     * @param OrderStatisticsMonitor
     * @return
     */
    public boolean update(OrderStatisticsMonitor orderStatisticsMonitor);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorList(OrderStatisticsMonitorQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOrderStatisticsMonitorCount(OrderStatisticsMonitorQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorListWithPage(OrderStatisticsMonitorQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OrderStatisticsMonitor
     * @return
     */
    public boolean delete(OrderStatisticsMonitor orderStatisticsMonitor);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OrderStatisticsMonitor getOrderStatisticsMonitorById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OrderStatisticsMonitor
     * @return
     */
    public boolean exist(OrderStatisticsMonitor orderStatisticsMonitor);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OrderStatisticsMonitor> queryOrderStatisticsMonitorListByOld(OrderStatisticsMonitor queryBean);

}
