package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.InvoiceInfo;
import com.peter.pms.domain.enums.InvoiceInfoSatusEnum;
import com.peter.pms.domain.query.InvoiceInfoQuery;
import com.peter.pms.dao.InvoiceInfoDao;
import com.peter.pms.manager.InvoiceInfoManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * InvoiceInfoManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class InvoiceInfoManagerImpl extends BaseManager implements InvoiceInfoManager {

    private static final Log LOG = LogFactory.getLog(InvoiceInfoManagerImpl.class);
	
    @Autowired
    private InvoiceInfoDao InvoiceInfoDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<InvoiceInfo> InvoiceInfoList) {
        boolean resultFlag = false;
        if (null != InvoiceInfoList && InvoiceInfoList.size() > 0) {
            for (InvoiceInfo InvoiceInfo : InvoiceInfoList) {
                resultFlag = InvoiceInfoDao.insert(InvoiceInfo);
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
    public boolean insert(InvoiceInfo InvoiceInfo) {
        return InvoiceInfoDao.insert(InvoiceInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final InvoiceInfo InvoiceInfo) {
        return InvoiceInfoDao.update(InvoiceInfo);
    }

    /**
     * {@inheritDoc}
     */
    public List<InvoiceInfo> queryInvoiceInfoList(InvoiceInfoQuery queryBean) {
        return InvoiceInfoDao.queryInvoiceInfoList(queryBean);
    }

    public List<InvoiceInfo> queryInvoiceInfoListByOld(InvoiceInfoQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("InvoiceInfoManagerImpl.getInvoiceInfoByOld  ERROR!para null");
            throw new IllegalArgumentException("InvoiceInfoManagerImpl.getInvoiceInfoByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(InvoiceInfoSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return InvoiceInfoDao.queryInvoiceInfoListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<InvoiceInfo> queryInvoiceInfoListWithPage(InvoiceInfoQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new InvoiceInfoQuery();
        }

        // 查询总数
        int totalItem = queryInvoiceInfoCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return InvoiceInfoDao.queryInvoiceInfoListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryInvoiceInfoCount(InvoiceInfoQuery queryBean) {
        return InvoiceInfoDao.queryInvoiceInfoCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(InvoiceInfo InvoiceInfo) {
        return InvoiceInfoDao.delete(InvoiceInfo);
    }

    /**
     * {@inheritDoc}
     */
    public InvoiceInfo getInvoiceInfoById(Long id) {
        return InvoiceInfoDao.getInvoiceInfoById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final InvoiceInfo[] InvoiceInfos) {
        boolean resultFlag = false;
        if (null != InvoiceInfos && InvoiceInfos.length > 0) {
            for (int i = 0; i < InvoiceInfos.length; i++) {
                resultFlag = delete(InvoiceInfos[i]);
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
    public boolean exist(InvoiceInfo InvoiceInfo) {
        return InvoiceInfoDao.exist(InvoiceInfo);
    }
}
