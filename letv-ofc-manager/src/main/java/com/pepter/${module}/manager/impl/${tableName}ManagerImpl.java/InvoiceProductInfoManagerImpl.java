package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.InvoiceProductInfo;
import com.peter.pms.domain.enums.InvoiceProductInfoSatusEnum;
import com.peter.pms.domain.query.InvoiceProductInfoQuery;
import com.peter.pms.dao.InvoiceProductInfoDao;
import com.peter.pms.manager.InvoiceProductInfoManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * InvoiceProductInfoManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class InvoiceProductInfoManagerImpl extends BaseManager implements InvoiceProductInfoManager {

    private static final Log LOG = LogFactory.getLog(InvoiceProductInfoManagerImpl.class);
	
    @Autowired
    private InvoiceProductInfoDao InvoiceProductInfoDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<InvoiceProductInfo> InvoiceProductInfoList) {
        boolean resultFlag = false;
        if (null != InvoiceProductInfoList && InvoiceProductInfoList.size() > 0) {
            for (InvoiceProductInfo InvoiceProductInfo : InvoiceProductInfoList) {
                resultFlag = InvoiceProductInfoDao.insert(InvoiceProductInfo);
                if (!resultFlag) {
                    throw new RuntimeException("批量新增表信息异常");
                }
            }
        }

        return resultFlag;
    }

    /**
     * {@inheritDoc}
     */
    public boolean insert(InvoiceProductInfo InvoiceProductInfo) {
        return InvoiceProductInfoDao.insert(InvoiceProductInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final InvoiceProductInfo InvoiceProductInfo) {
        return InvoiceProductInfoDao.update(InvoiceProductInfo);
    }

    /**
     * {@inheritDoc}
     */
    public List<InvoiceProductInfo> queryInvoiceProductInfoList(InvoiceProductInfoQuery queryBean) {
        return InvoiceProductInfoDao.queryInvoiceProductInfoList(queryBean);
    }

    public List<InvoiceProductInfo> queryInvoiceProductInfoListByOld(InvoiceProductInfoQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("InvoiceProductInfoManagerImpl.getInvoiceProductInfoByOld  ERROR!para null");
            throw new IllegalArgumentException("InvoiceProductInfoManagerImpl.getInvoiceProductInfoByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(InvoiceProductInfoSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return InvoiceProductInfoDao.queryInvoiceProductInfoListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<InvoiceProductInfo> queryInvoiceProductInfoListWithPage(InvoiceProductInfoQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new InvoiceProductInfoQuery();
        }

        // 查询总数
        int totalItem = queryInvoiceProductInfoCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return InvoiceProductInfoDao.queryInvoiceProductInfoListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryInvoiceProductInfoCount(InvoiceProductInfoQuery queryBean) {
        return InvoiceProductInfoDao.queryInvoiceProductInfoCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(InvoiceProductInfo InvoiceProductInfo) {
        return InvoiceProductInfoDao.delete(InvoiceProductInfo);
    }

    /**
     * {@inheritDoc}
     */
    public InvoiceProductInfo getInvoiceProductInfoById(Long id) {
        return InvoiceProductInfoDao.getInvoiceProductInfoById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final InvoiceProductInfo[] InvoiceProductInfos) {
        boolean resultFlag = false;
        if (null != InvoiceProductInfos && InvoiceProductInfos.length > 0) {
            for (int i = 0; i < InvoiceProductInfos.length; i++) {
                resultFlag = delete(InvoiceProductInfos[i]);
                if (!resultFlag) {
                    throw new RuntimeException("批量删除表信息异常!");
                }
            }
        }

        return resultFlag;
    }

    /**
     * {@inheritDoc}
     */
    public boolean exist(InvoiceProductInfo InvoiceProductInfo) {
        return InvoiceProductInfoDao.exist(InvoiceProductInfo);
    }
}
