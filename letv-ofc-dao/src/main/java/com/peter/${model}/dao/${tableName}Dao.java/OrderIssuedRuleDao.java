package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OrderIssuedRule;
import com.peter.pms.domain.query.OrderIssuedRuleQuery;
/**
*
*@author 自动生成
*OrderIssuedRule
*
*/
public interface OrderIssuedRuleDao {
    
    /**
     * 新增对象
     * 
     * @param OrderIssuedRule 
     * @return
     */
    public boolean insert(OrderIssuedRule orderIssuedRule);

    /**
     * 更新对象
     * 
     * @param OrderIssuedRule
     * @return
     */
    public boolean update(OrderIssuedRule orderIssuedRule);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleList(OrderIssuedRuleQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOrderIssuedRuleCount(OrderIssuedRuleQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleListWithPage(OrderIssuedRuleQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OrderIssuedRule
     * @return
     */
    public boolean delete(OrderIssuedRule orderIssuedRule);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OrderIssuedRule getOrderIssuedRuleById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OrderIssuedRule
     * @return
     */
    public boolean exist(OrderIssuedRule orderIssuedRule);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleListByOld(OrderIssuedRule queryBean);

}
