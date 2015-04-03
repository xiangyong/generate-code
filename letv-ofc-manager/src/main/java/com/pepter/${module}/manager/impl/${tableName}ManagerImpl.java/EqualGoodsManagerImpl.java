package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.EqualGoods;
import com.peter.pms.domain.enums.EqualGoodsSatusEnum;
import com.peter.pms.domain.query.EqualGoodsQuery;
import com.peter.pms.dao.EqualGoodsDao;
import com.peter.pms.manager.EqualGoodsManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * EqualGoodsManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class EqualGoodsManagerImpl extends BaseManager implements EqualGoodsManager {

    private static final Log LOG = LogFactory.getLog(EqualGoodsManagerImpl.class);
	
    @Autowired
    private EqualGoodsDao EqualGoodsDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<EqualGoods> EqualGoodsList) {
        boolean resultFlag = false;
        if (null != EqualGoodsList && EqualGoodsList.size() > 0) {
            for (EqualGoods EqualGoods : EqualGoodsList) {
                resultFlag = EqualGoodsDao.insert(EqualGoods);
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
    public boolean insert(EqualGoods EqualGoods) {
        return EqualGoodsDao.insert(EqualGoods);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final EqualGoods EqualGoods) {
        return EqualGoodsDao.update(EqualGoods);
    }

    /**
     * {@inheritDoc}
     */
    public List<EqualGoods> queryEqualGoodsList(EqualGoodsQuery queryBean) {
        return EqualGoodsDao.queryEqualGoodsList(queryBean);
    }

    public List<EqualGoods> queryEqualGoodsListByOld(EqualGoodsQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("EqualGoodsManagerImpl.getEqualGoodsByOld  ERROR!para null");
            throw new IllegalArgumentException("EqualGoodsManagerImpl.getEqualGoodsByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(EqualGoodsSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return EqualGoodsDao.queryEqualGoodsListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<EqualGoods> queryEqualGoodsListWithPage(EqualGoodsQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new EqualGoodsQuery();
        }

        // 查询总数
        int totalItem = queryEqualGoodsCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return EqualGoodsDao.queryEqualGoodsListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryEqualGoodsCount(EqualGoodsQuery queryBean) {
        return EqualGoodsDao.queryEqualGoodsCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(EqualGoods EqualGoods) {
        return EqualGoodsDao.delete(EqualGoods);
    }

    /**
     * {@inheritDoc}
     */
    public EqualGoods getEqualGoodsById(Long id) {
        return EqualGoodsDao.getEqualGoodsById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final EqualGoods[] EqualGoodss) {
        boolean resultFlag = false;
        if (null != EqualGoodss && EqualGoodss.length > 0) {
            for (int i = 0; i < EqualGoodss.length; i++) {
                resultFlag = delete(EqualGoodss[i]);
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
    public boolean exist(EqualGoods EqualGoods) {
        return EqualGoodsDao.exist(EqualGoods);
    }
}
