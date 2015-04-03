package com.peter.pms.dao;

import java.util.List;

import com.peter.pms.domain.InvoiceProductInfo;
import com.peter.pms.domain.query.InvoiceProductInfoQuery;
/**
*
*@author 自动生成
*InvoiceProductInfo
*下发订单发票商品信息
*/
public interface InvoiceProductInfoDao {
    
    /**
     * 新增对象
     * 
     * @param InvoiceProductInfo 
     * @return
     */
    public boolean insert(InvoiceProductInfo invoiceProductInfo);

    /**
     * 更新对象
     * 
     * @param InvoiceProductInfo
     * @return
     */
    public boolean update(InvoiceProductInfo invoiceProductInfo);

    /**
     * 根据查询Bean获取对象集合，不带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<InvoiceProductInfo> queryInvoiceProductInfoList(InvoiceProductInfoQuery queryBean);

    /**
     * 根据查询Bean获取总数
     * 
     * @param queryBean
     * @return
     */
    public int queryInvoiceProductInfoCount(InvoiceProductInfoQuery queryBean);

    /**
     * 根据查询Bean获取集合，带翻页
     * 
     * @param queryBean
     * @return
     */
    public List<InvoiceProductInfo> queryInvoiceProductInfoListWithPage(InvoiceProductInfoQuery queryBean);

    /**
     * 删除记录
     * 
     * @param InvoiceProductInfo
     * @return
     */
    public boolean delete(InvoiceProductInfo invoiceProductInfo);

    /**
     * 根据主键获取对象
     * 
     * @param id
     *            主键字段
     * @return
     */
    public InvoiceProductInfo getInvoiceProductInfoById(Long id);

    /**
     * 判断是否存在
     * 
     * @param InvoiceProductInfo
     * @return
     */
    public boolean exist(InvoiceProductInfo invoiceProductInfo);

    /**
     * 根据原sku获得等价物料号
     * @param queryBean
     * @return
     */
    public List<InvoiceProductInfo> queryInvoiceProductInfoListByOld(InvoiceProductInfo queryBean);

}
