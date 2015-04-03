package com.peter.pms.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.pms.domain.MotherWarehouseSetting;
import com.peter.pms.domain.enums.MotherWarehouseSettingSatusEnum;
import com.peter.pms.domain.query.MotherWarehouseSettingQuery;
import com.peter.pms.dao.MotherWarehouseSettingDao;
import com.peter.pms.manager.MotherWarehouseSettingManager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * MotherWarehouseSettingManager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class MotherWarehouseSettingManagerImpl extends BaseManager implements MotherWarehouseSettingManager {

    private static final Log LOG = LogFactory.getLog(MotherWarehouseSettingManagerImpl.class);
	
    @Autowired
    private MotherWarehouseSettingDao MotherWarehouseSettingDao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<MotherWarehouseSetting> MotherWarehouseSettingList) {
        boolean resultFlag = false;
        if (null != MotherWarehouseSettingList && MotherWarehouseSettingList.size() > 0) {
            for (MotherWarehouseSetting MotherWarehouseSetting : MotherWarehouseSettingList) {
                resultFlag = MotherWarehouseSettingDao.insert(MotherWarehouseSetting);
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
    public boolean insert(MotherWarehouseSetting MotherWarehouseSetting) {
        return MotherWarehouseSettingDao.insert(MotherWarehouseSetting);
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final MotherWarehouseSetting MotherWarehouseSetting) {
        return MotherWarehouseSettingDao.update(MotherWarehouseSetting);
    }

    /**
     * {@inheritDoc}
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingList(MotherWarehouseSettingQuery queryBean) {
        return MotherWarehouseSettingDao.queryMotherWarehouseSettingList(queryBean);
    }

    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListByOld(MotherWarehouseSettingQuery query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("MotherWarehouseSettingManagerImpl.getMotherWarehouseSettingByOld  ERROR!para null");
            throw new IllegalArgumentException("MotherWarehouseSettingManagerImpl.getMotherWarehouseSettingByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(MotherWarehouseSettingSatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return MotherWarehouseSettingDao.queryMotherWarehouseSettingListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<MotherWarehouseSetting> queryMotherWarehouseSettingListWithPage(MotherWarehouseSettingQuery queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new MotherWarehouseSettingQuery();
        }

        // 查询总数
        int totalItem = queryMotherWarehouseSettingCount(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return MotherWarehouseSettingDao.queryMotherWarehouseSettingListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int queryMotherWarehouseSettingCount(MotherWarehouseSettingQuery queryBean) {
        return MotherWarehouseSettingDao.queryMotherWarehouseSettingCount(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(MotherWarehouseSetting MotherWarehouseSetting) {
        return MotherWarehouseSettingDao.delete(MotherWarehouseSetting);
    }

    /**
     * {@inheritDoc}
     */
    public MotherWarehouseSetting getMotherWarehouseSettingById(Long id) {
        return MotherWarehouseSettingDao.getMotherWarehouseSettingById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final MotherWarehouseSetting[] MotherWarehouseSettings) {
        boolean resultFlag = false;
        if (null != MotherWarehouseSettings && MotherWarehouseSettings.length > 0) {
            for (int i = 0; i < MotherWarehouseSettings.length; i++) {
                resultFlag = delete(MotherWarehouseSettings[i]);
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
    public boolean exist(MotherWarehouseSetting MotherWarehouseSetting) {
        return MotherWarehouseSettingDao.exist(MotherWarehouseSetting);
    }
}
