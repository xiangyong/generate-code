package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.RequestInfo;
import com.peter.pms.domain.enums.RequestInfoSatusEnum;
import com.peter.pms.domain.query.RequestInfoQuery;
import com.peter.pms.dao.RequestInfoDao;
import com.peter.pms.manager.RequestInfoManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * RequestInfoManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class RequestInfoManagerImpl extends BaseManager implements RequestInfoManager {

    private static final Log LOG = LogFactory.getLog(RequestInfoManagerImpl.class);
	
    @Autowired
    private RequestInfoDao RequestInfoDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<RequestInfo> RequestInfoList) {
        boolean resultFlag = false;
        if (null != RequestInfoList && RequestInfoList.size() > 0) {
            for (RequestInfo RequestInfo : RequestInfoList) {
                resultFlag = RequestInfoDao.insert(RequestInfo);
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
    public boolean insert(RequestInfo RequestInfo) {
        return RequestInfoDao.insert(RequestInfo);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final RequestInfo RequestInfo) {
        return RequestInfoDao.update(RequestInfo);
    }

    /**
     * {@inheritDoc}
     */
    public List<RequestInfo> queryRequestInfoList(RequestInfoQuery queryBean) {
        return RequestInfoDao.queryRequestInfoList(queryBean);
    }

    public List<RequestInfo> queryRequestInfoListByOld(RequestInfoQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("RequestInfoManagerImpl.getRequestInfoByOld  ERROR!para null");
            throw new IllegalArgumentException("RequestInfoManagerImpl.getRequestInfoByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(RequestInfoSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return RequestInfoDao.queryRequestInfoListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<RequestInfo> queryRequestInfoListWithPage(RequestInfoQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new RequestInfoQuery();
        }

        // 查询总数
        int totalItem = queryRequestInfoCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return RequestInfoDao.queryRequestInfoListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryRequestInfoCount(RequestInfoQuery queryBean) {
        return RequestInfoDao.queryRequestInfoCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(RequestInfo RequestInfo) {
        return RequestInfoDao.delete(RequestInfo);
    }

    /**
     * {@inheritDoc}
     */
    public RequestInfo getRequestInfoById(Long id) {
        return RequestInfoDao.getRequestInfoById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final RequestInfo[] RequestInfos) {
        boolean resultFlag = false;
        if (null != RequestInfos && RequestInfos.length > 0) {
            for (int i = 0; i < RequestInfos.length; i++) {
                resultFlag = delete(RequestInfos[i]);
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
    public boolean exist(RequestInfo RequestInfo) {
        return RequestInfoDao.exist(RequestInfo);
    }
}
