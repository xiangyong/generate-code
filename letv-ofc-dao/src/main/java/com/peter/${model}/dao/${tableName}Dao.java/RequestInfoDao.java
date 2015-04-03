package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.RequestInfo;
import com.peter.pms.domain.query.RequestInfoQuery;
/**
*
*@author 自动生成
*RequestInfo
*
*/
public interface RequestInfoDao {
    
    /**
     * 新增对象
     * 
     * @param RequestInfo 
     * @return
     */
    public boolean insert(RequestInfo requestInfo);

    /**
     * 更新对象
     * 
     * @param RequestInfo
     * @return
     */
    public boolean update(RequestInfo requestInfo);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<RequestInfo> queryRequestInfoList(RequestInfoQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryRequestInfoCount(RequestInfoQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<RequestInfo> queryRequestInfoListWithPage(RequestInfoQuery queryBean);

    /**
     * 删除记录
     * 
     * @param RequestInfo
     * @return
     */
    public boolean delete(RequestInfo requestInfo);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public RequestInfo getRequestInfoById(Long id);

    /**
     * 判断是否存在
     * 
     * @param RequestInfo
     * @return
     */
    public boolean exist(RequestInfo requestInfo);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<RequestInfo> queryRequestInfoListByOld(RequestInfo queryBean);

}
