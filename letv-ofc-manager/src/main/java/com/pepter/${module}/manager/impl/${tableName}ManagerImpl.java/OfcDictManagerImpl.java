package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.OfcDict;
import com.peter.pms.domain.enums.OfcDictSatusEnum;
import com.peter.pms.domain.query.OfcDictQuery;
import com.peter.pms.dao.OfcDictDao;
import com.peter.pms.manager.OfcDictManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * OfcDictManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class OfcDictManagerImpl extends BaseManager implements OfcDictManager {

    private static final Log LOG = LogFactory.getLog(OfcDictManagerImpl.class);
	
    @Autowired
    private OfcDictDao OfcDictDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<OfcDict> OfcDictList) {
        boolean resultFlag = false;
        if (null != OfcDictList && OfcDictList.size() > 0) {
            for (OfcDict OfcDict : OfcDictList) {
                resultFlag = OfcDictDao.insert(OfcDict);
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
    public boolean insert(OfcDict OfcDict) {
        return OfcDictDao.insert(OfcDict);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final OfcDict OfcDict) {
        return OfcDictDao.update(OfcDict);
    }

    /**
     * {@inheritDoc}
     */
    public List<OfcDict> queryOfcDictList(OfcDictQuery queryBean) {
        return OfcDictDao.queryOfcDictList(queryBean);
    }

    public List<OfcDict> queryOfcDictListByOld(OfcDictQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("OfcDictManagerImpl.getOfcDictByOld  ERROR!para null");
            throw new IllegalArgumentException("OfcDictManagerImpl.getOfcDictByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(OfcDictSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return OfcDictDao.queryOfcDictListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<OfcDict> queryOfcDictListWithPage(OfcDictQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new OfcDictQuery();
        }

        // 查询总数
        int totalItem = queryOfcDictCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return OfcDictDao.queryOfcDictListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryOfcDictCount(OfcDictQuery queryBean) {
        return OfcDictDao.queryOfcDictCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(OfcDict OfcDict) {
        return OfcDictDao.delete(OfcDict);
    }

    /**
     * {@inheritDoc}
     */
    public OfcDict getOfcDictById(Long id) {
        return OfcDictDao.getOfcDictById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final OfcDict[] OfcDicts) {
        boolean resultFlag = false;
        if (null != OfcDicts && OfcDicts.length > 0) {
            for (int i = 0; i < OfcDicts.length; i++) {
                resultFlag = delete(OfcDicts[i]);
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
    public boolean exist(OfcDict OfcDict) {
        return OfcDictDao.exist(OfcDict);
    }
}
