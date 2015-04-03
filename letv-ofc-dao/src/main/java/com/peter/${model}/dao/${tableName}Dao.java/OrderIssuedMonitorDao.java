package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OrderIssuedMonitor;
import com.peter.pms.domain.query.OrderIssuedMonitorQuery;
/**
*
*@author 自动生成
*OrderIssuedMonitor
*订单寻源监控表
*/
public interface OrderIssuedMonitorDao {
    
    /**
     * 新增对象
     * 
     * @param OrderIssuedMonitor 
     * @return
     */
    public boolean insert(OrderIssuedMonitor orderIssuedMonitor);

    /**
     * 更新对象
     * 
     * @param OrderIssuedMonitor
     * @return
     */
    public boolean update(OrderIssuedMonitor orderIssuedMonitor);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderIssuedMonitor> queryOrderIssuedMonitorList(OrderIssuedMonitorQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOrderIssuedMonitorCount(OrderIssuedMonitorQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderIssuedMonitor> queryOrderIssuedMonitorListWithPage(OrderIssuedMonitorQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OrderIssuedMonitor
     * @return
     */
    public boolean delete(OrderIssuedMonitor orderIssuedMonitor);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OrderIssuedMonitor getOrderIssuedMonitorById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OrderIssuedMonitor
     * @return
     */
    public boolean exist(OrderIssuedMonitor orderIssuedMonitor);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OrderIssuedMonitor> queryOrderIssuedMonitorListByOld(OrderIssuedMonitor queryBean);

}
