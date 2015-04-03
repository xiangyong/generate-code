package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.OfcDict;
import com.peter.pms.domain.query.OfcDictQuery;
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
     * @param OfcDictList
     * @return
     */
    public boolean insert(List<OfcDict> OfcDictList);

    /**
     * 单个增加对象信息
     * 
     * @param OfcDict
     * @return
     */
    public boolean insert(OfcDict ofcDict);

    /**
     * 更新 对象信息
     * 
     * @param OfcDict
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(OfcDict ofcDict);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<OfcDict> queryOfcDictList(OfcDictQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<OfcDict> queryOfcDictListWithPage(OfcDictQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryOfcDictCount(OfcDictQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param OfcDict
     *            　
     * @return
     */
    public boolean delete(OfcDict ofcDict);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public OfcDict getOfcDictById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param OfcDicts
     *            OfcDict集合
     * @return
     */
    public boolean delete(OfcDict[] ofcDicts);

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
    public List<OfcDict> queryOfcDictListByOld(OfcDictQuery queryBean);
}
