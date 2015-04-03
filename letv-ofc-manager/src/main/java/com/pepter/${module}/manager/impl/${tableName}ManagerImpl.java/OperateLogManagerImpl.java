package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OperateLog;
import com.peter.pms.domain.enums.OperateLogSatusEnum;
import com.peter.pms.domain.query.OperateLogQuery;
import com.peter.pms.dao.OperateLogDao;
import com.peter.pms.manager.OperateLogManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OperateLogManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OperateLogManagerImpl extends BaseManager implements OperateLogManager {

    private static final Log LOG = LogFactory.getLog(OperateLogManagerImpl.class);
	
    @Autowired
    private OperateLogDao OperateLogDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OperateLog> OperateLogList) {
        boolean resultFlag = false;
        if (null != OperateLogList && OperateLogList.size() > 0) {
            for (OperateLog OperateLog : OperateLogList) {
                resultFlag = OperateLogDao.insert(OperateLog);
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
    public boolean insert(OperateLog OperateLog) {
        return OperateLogDao.insert(OperateLog);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OperateLog OperateLog) {
        return OperateLogDao.update(OperateLog);
    }

    /**
     * {@inheritDoc}
     */
    public List<OperateLog> queryOperateLogList(OperateLogQuery queryBean) {
        return OperateLogDao.queryOperateLogList(queryBean);
    }

    public List<OperateLog> queryOperateLogListByOld(OperateLogQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OperateLogManagerImpl.getOperateLogByOld  ERROR!para null");
            throw new IllegalArgumentException("OperateLogManagerImpl.getOperateLogByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OperateLogSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OperateLogDao.queryOperateLogListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OperateLog> queryOperateLogListWithPage(OperateLogQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OperateLogQuery();
        }

        // 查询总数
        int totalItem = queryOperateLogCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OperateLogDao.queryOperateLogListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOperateLogCount(OperateLogQuery queryBean) {
        return OperateLogDao.queryOperateLogCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OperateLog OperateLog) {
        return OperateLogDao.delete(OperateLog);
    }

    /**
     * {@inheritDoc}
     */
    public OperateLog getOperateLogById(Long id) {
        return OperateLogDao.getOperateLogById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OperateLog[] OperateLogs) {
        boolean resultFlag = false;
        if (null != OperateLogs && OperateLogs.length > 0) {
            for (int i = 0; i < OperateLogs.length; i++) {
                resultFlag = delete(OperateLogs[i]);
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
    public boolean exist(OperateLog OperateLog) {
        return OperateLogDao.exist(OperateLog);
    }
}
