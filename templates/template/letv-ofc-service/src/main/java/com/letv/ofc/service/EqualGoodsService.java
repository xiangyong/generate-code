package com.letv.ofc.service;

import java.util.List;

import com.letv.ofc.domain.EqualGoods;
import com.letv.ofc.domain.query.EqualGoodsQuery;
import com.letv.common.utils.page.PageUtil;
import org.perf4j.aop.Profiled;

/**
 * EqualGoodsService接口
 * 
 * @author zhaohengchong
 * @version 2014-9-26 14:43:48
 * 
 */
public interface EqualGoodsService {

    /**
     * 批量增加对象信息
     * 
     * @param equalGoodsList
     * @return
     */
    public boolean insert(List<EqualGoods> equalGoodsList);

    /**
     * 单个增加对象信息
     * 
     * @param equalGoods
     * @return
     */
    public boolean insert(EqualGoods equalGoods);

    /**
     * 更新 对象信息
     * 
     * @param equalGoods
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(EqualGoods equalGoods);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<EqualGoods> queryEqualGoodsList(EqualGoodsQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<EqualGoods> queryEqualGoodsListWithPage(EqualGoodsQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param equalGoods
     *            　
     * @return
     */
    public boolean delete(EqualGoods equalGoods);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public EqualGoods getEqualGoodsById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param equalGoodss
     *            EqualGoods集合
     * @return
     */
    public boolean delete(EqualGoods[] equalGoodss);

    /**
     * 目前只取一个等价物料号
     * @param query
     * @return
     */
    public EqualGoods getEqualGoodsByOld(EqualGoodsQuery query);
}
