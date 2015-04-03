package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.InvoiceInfo;
import com.peter.pms.domain.query.InvoiceInfoQuery;
/**
*
*@author 自动生成
*InvoiceInfo
*下发订单发票
*/
public interface InvoiceInfoDao {
    
    /**
     * 新增对象
     * 
     * @param InvoiceInfo 
     * @return
     */
    public boolean insert(InvoiceInfo invoiceInfo);

    /**
     * 更新对象
     * 
     * @param InvoiceInfo
     * @return
     */
    public boolean update(InvoiceInfo invoiceInfo);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<InvoiceInfo> queryInvoiceInfoList(InvoiceInfoQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryInvoiceInfoCount(InvoiceInfoQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<InvoiceInfo> queryInvoiceInfoListWithPage(InvoiceInfoQuery queryBean);

    /**
     * 删除记录
     * 
     * @param InvoiceInfo
     * @return
     */
    public boolean delete(InvoiceInfo invoiceInfo);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public InvoiceInfo getInvoiceInfoById(Long id);

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
    public List<InvoiceInfo> queryInvoiceInfoListByOld(InvoiceInfo queryBean);

}
