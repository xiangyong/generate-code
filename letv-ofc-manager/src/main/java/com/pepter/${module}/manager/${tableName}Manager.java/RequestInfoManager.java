package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.RequestInfo;
import com.peter.pms.domain.query.RequestInfoQuery;
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
     * @param RequestInfoList
     * @return
     */
    public boolean insert(List<RequestInfo> RequestInfoList);

    /**
     * 单个增加对象信息
     * 
     * @param RequestInfo
     * @return
     */
    public boolean insert(RequestInfo requestInfo);

    /**
     * 更新 对象信息
     * 
     * @param RequestInfo
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(RequestInfo requestInfo);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<RequestInfo> queryRequestInfoList(RequestInfoQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<RequestInfo> queryRequestInfoListWithPage(RequestInfoQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryRequestInfoCount(RequestInfoQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param RequestInfo
     *            　
     * @return
     */
    public boolean delete(RequestInfo requestInfo);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public RequestInfo getRequestInfoById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param RequestInfos
     *            RequestInfo集合
     * @return
     */
    public boolean delete(RequestInfo[] requestInfos);

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
    public List<RequestInfo> queryRequestInfoListByOld(RequestInfoQuery queryBean);
}
