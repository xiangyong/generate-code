package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.InvoiceProductInfoDao;
import com.peter.pms.domain.InvoiceProductInfo;
import com.peter.pms.domain.query.InvoiceProductInfoQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*InvoiceProductInfo
*下发订单发票商品信息
*/
@Repository
public class InvoiceProductInfoDaoImpl extends BaseDao implements InvoiceProductInfoDao {
    /** namespace */
    private final String namespace = InvoiceProductInfoDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<InvoiceProductInfo> queryInvoiceProductInfoList(InvoiceProductInfoQuery queryBean) {
        return (List<InvoiceProductInfo>) queryForList(namespace +".queryInvoiceProductInfoList", queryBean);
    }

    public List<InvoiceProductInfo> queryInvoiceProductInfoListByOld(InvoiceProductInfoQuery queryBean) {
        return (List<InvoiceProductInfo>) queryForList(namespace +".queryInvoiceProductInfoListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(InvoiceProductInfo InvoiceProductInfo) {
        return insert(namespace +".insert", invoiceProductInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(InvoiceProductInfo invoiceProductInfo) {
        return update(namespace +".update", invoiceProductInfo);
    }

    /**
     * {@inheritDoc}
     */
    public int queryInvoiceProductInfoCount(InvoiceProductInfoQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryInvoiceProductInfoCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<InvoiceProductInfo> queryInvoiceProductInfoListWithPage(InvoiceProductInfoQuery queryBean) {
        return (List<InvoiceProductInfo>) queryForList(namespace +".queryInvoiceProductInfoListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(InvoiceProductInfo configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public InvoiceProductInfo getInvoiceProductInfoById(Long id) {
        return (InvoiceProductInfo) queryForObject(namespace +".getInvoiceProductInfoById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(InvoiceProductInfo invoiceProductInfo) {
        int count = (Integer) queryForObject(namespace +".exist", InvoiceProductInfo);
        return count > 0;
    }
}
