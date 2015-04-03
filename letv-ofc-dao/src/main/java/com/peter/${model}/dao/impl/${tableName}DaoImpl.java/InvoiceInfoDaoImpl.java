package com.peter.pms.dao.impl;

import com.letv.common.dao.mybatis.BaseDao;
import com.peter.pms.dao.InvoiceInfoDao;
import com.peter.pms.domain.InvoiceInfo;
import com.peter.pms.domain.query.InvoiceInfoQuery;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
*
*@author 自动生成
*InvoiceInfo
*下发订单发票
*/
@Repository
public class InvoiceInfoDaoImpl extends BaseDao implements InvoiceInfoDao {
    /** namespace */
    private final String namespace = InvoiceInfoDaoImpl.class.getName();
    
    /**
     * {@inheritDoc}
     */
    public List<InvoiceInfo> queryInvoiceInfoList(InvoiceInfoQuery queryBean) {
        return (List<InvoiceInfo>) queryForList(namespace +".queryInvoiceInfoList", queryBean);
    }

    public List<InvoiceInfo> queryInvoiceInfoListByOld(InvoiceInfoQuery queryBean) {
        return (List<InvoiceInfo>) queryForList(namespace +".queryInvoiceInfoListByOld", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(InvoiceInfo InvoiceInfo) {
        return insert(namespace +".insert", invoiceInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(InvoiceInfo invoiceInfo) {
        return update(namespace +".update", invoiceInfo);
    }

    /**
     * {@inheritDoc}
     */
    public int queryInvoiceInfoCount(InvoiceInfoQuery queryBean) {
        return (Integer) queryForObject(namespace +".queryInvoiceInfoCount", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public List<InvoiceInfo> queryInvoiceInfoListWithPage(InvoiceInfoQuery queryBean) {
        return (List<InvoiceInfo>) queryForList(namespace +".queryInvoiceInfoListWithPage", queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(InvoiceInfo configuration) {
        return delete(namespace +".delete", configuration);
    }

    /**
     * {@inheritDoc}
     */
    public InvoiceInfo getInvoiceInfoById(Long id) {
        return (InvoiceInfo) queryForObject(namespace +".getInvoiceInfoById", id);
    } 
    
    /**
     * {@inheritDoc}
     */
    public boolean exist(InvoiceInfo invoiceInfo) {
        int count = (Integer) queryForObject(namespace +".exist", InvoiceInfo);
        return count > 0;
    }
}
