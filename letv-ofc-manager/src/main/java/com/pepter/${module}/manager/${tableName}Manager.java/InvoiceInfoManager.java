package com.peter.pms.manager;

import java.util.List;

import com.peter.pms.domain.InvoiceInfo;
import com.peter.pms.domain.query.InvoiceInfoQuery;
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
     * @param InvoiceInfoList
     * @return
     */
    public boolean insert(List<InvoiceInfo> InvoiceInfoList);

    /**
     * 单个增加对象信息
     * 
     * @param InvoiceInfo
     * @return
     */
    public boolean insert(InvoiceInfo invoiceInfo);

    /**
     * 更新 对象信息
     * 
     * @param InvoiceInfo
     *            对象信息对象
     * @return false：失败 true：成功
     */
    public boolean update(InvoiceInfo invoiceInfo);

    /**
     * 根据查询Bean获取对象集合，无翻页
     * 
     * @param queryBean
     * @return
     */
    public List<InvoiceInfo> queryInvoiceInfoList(InvoiceInfoQuery queryBean);

    /**
     * 根据查询Bean获取对象集合，带翻页
     * 
     * @param queryBean
     * @param pageUtil
     * @return
     */
    public List<InvoiceInfo> queryInvoiceInfoListWithPage(InvoiceInfoQuery queryBean,
            PageUtil pageUtil);

    /**
     * 根据查询Bean获取对象信息总数
     * 
     * @param queryBean
     *            对象信息查询对象
     * @return 对象信息总数
     */
    public int queryInvoiceInfoCount(InvoiceInfoQuery queryBean);

    /**
     * 根据主键删除对象信息，该处做的是逻辑删除
     * 
     * @param InvoiceInfo
     *            　
     * @return
     */
    public boolean delete(InvoiceInfo invoiceInfo);

    /**
     * 根据主键获取对象信息
     * 
     * @param id
     *            主键字段
     * @return 对象信息
     */
    public InvoiceInfo getInvoiceInfoById(Long id);

    /**
     * 根据主键集合批量删除对象信息，该处做的是逻辑删除
     * 
     * @param InvoiceInfos
     *            InvoiceInfo集合
     * @return
     */
    public boolean delete(InvoiceInfo[] invoiceInfos);

    /**
     * 判断是否存在
     * 
     * @param InvoiceInfo
     * @return
     */
    public boolean exist(InvoiceInfo invoiceInfo);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<InvoiceInfo> queryInvoiceInfoListByOld(InvoiceInfoQuery queryBean);
}
