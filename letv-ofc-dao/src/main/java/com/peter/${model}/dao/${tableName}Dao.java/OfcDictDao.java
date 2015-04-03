package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.OfcDict;
import com.peter.pms.domain.query.OfcDictQuery;
/**
*
*@author 自动生成
*OfcDict
*
*/
public interface OfcDictDao {
    
    /**
     * 新增对象
     * 
     * @param OfcDict 
     * @return
     */
    public boolean insert(OfcDict ofcDict);

    /**
     * 更新对象
     * 
     * @param OfcDict
     * @return
     */
    public boolean update(OfcDict ofcDict);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OfcDict> queryOfcDictList(OfcDictQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryOfcDictCount(OfcDictQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OfcDict> queryOfcDictListWithPage(OfcDictQuery queryBean);

    /**
     * 删除记录
     * 
     * @param OfcDict
     * @return
     */
    public boolean delete(OfcDict ofcDict);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public OfcDict getOfcDictById(Long id);

    /**
     * 判断是否存在
     * 
     * @param OfcDict
     * @return
     */
    public boolean exist(OfcDict ofcDict);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<OfcDict> queryOfcDictListByOld(OfcDict queryBean);

}
