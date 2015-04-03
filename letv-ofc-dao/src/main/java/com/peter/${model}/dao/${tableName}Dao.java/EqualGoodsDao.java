package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.EqualGoods;
import com.peter.pms.domain.query.EqualGoodsQuery;
/**
*
*@author 自动生成
*EqualGoods
*
*/
public interface EqualGoodsDao {
    
    /**
     * 新增对象
     * 
     * @param EqualGoods 
     * @return
     */
    public boolean insert(EqualGoods equalGoods);

    /**
     * 更新对象
     * 
     * @param EqualGoods
     * @return
     */
    public boolean update(EqualGoods equalGoods);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<EqualGoods> queryEqualGoodsList(EqualGoodsQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryEqualGoodsCount(EqualGoodsQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<EqualGoods> queryEqualGoodsListWithPage(EqualGoodsQuery queryBean);

    /**
     * 删除记录
     * 
     * @param EqualGoods
     * @return
     */
    public boolean delete(EqualGoods equalGoods);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public EqualGoods getEqualGoodsById(Long id);

    /**
     * 判断是否存在
     * 
     * @param EqualGoods
     * @return
     */
    public boolean exist(EqualGoods equalGoods);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<EqualGoods> queryEqualGoodsListByOld(EqualGoods queryBean);

}
