package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.OrderIssuedRule;
import com.peter.pms.domain.query.OrderIssuedRuleQuery;
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
     * @param OrderIssuedRuleList
     * @return
     */
    public boolean insert(List<OrderIssuedRule> OrderIssuedRuleList);

    /**
     * 单个增加对象信息
     * 
     * @param OrderIssuedRule
     * @return
     */
    public boolean insert(OrderIssuedRule orderIssuedRule);

    /**
     * 更新 对象信息
     * 
     * @param OrderIssuedRule
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(OrderIssuedRule orderIssuedRule);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleList(OrderIssuedRuleQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<OrderIssuedRule> queryOrderIssuedRuleListWithPage(OrderIssuedRuleQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryOrderIssuedRuleCount(OrderIssuedRuleQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderIssuedRule
     *            　
     * @return
     */
    public boolean delete(OrderIssuedRule orderIssuedRule);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public OrderIssuedRule getOrderIssuedRuleById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param OrderIssuedRules
     *            OrderIssuedRule集合
     * @return
     */
    public boolean delete(OrderIssuedRule[] orderIssuedRules);

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
    public List<OrderIssuedRule> queryOrderIssuedRuleListByOld(OrderIssuedRuleQuery queryBean);
}
