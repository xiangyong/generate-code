package com.peter.${module}.manager.impl;

import java.util.Date;
import java.util.List;

import com.letv.common.manager.BaseManager;
import com.letv.common.utils.page.PageUtil;
import com.peter.${module}.domain.${table.tableName};
import com.peter.${module}.domain.enums.${table.tableName}SatusEnum;
import com.peter.${module}.domain.query.${table.tableName}Query;
import com.peter.${module}.dao.${table.tableName}Dao;
import com.peter.${module}.manager.${table.tableName}Manager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ${table.tableName}Manager接口的实现类
 * 
 * 自动生成
 * 
 */
@Component
public class ${table.tableName}ManagerImpl extends BaseManager implements ${table.tableName}Manager {

    private static final Log LOG = LogFactory.getLog(${table.tableName}ManagerImpl.class);
	
    @Autowired
    private ${table.tableName}Dao ${table.tableName}Dao;

    /**
     * {@inheritDoc}
     */
    public boolean insert(final List<${table.tableName}> ${table.tableName}List) {
        boolean resultFlag = false;
        if (null != ${table.tableName}List && ${table.tableName}List.size() > 0) {
            for (${table.tableName} ${table.tableName} : ${table.tableName}List) {
                resultFlag = ${table.tableName}Dao.insert(${table.tableName});
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
    public boolean insert(${table.tableName} ${table.tableName?cap_first}) {
        return ${table.tableName}Dao.insert(${table.tableName?cap_first});
    }

    /**
     * {@inheritDoc}
     */
    public boolean update(final ${table.tableName} ${table.tableName?cap_first}) {
        return ${table.tableName}Dao.update(${table.tableName?cap_first});
    }

    /**
     * {@inheritDoc}
     */
    public List<${table.tableName}> query${table.tableName}List(${table.tableName}Query queryBean) {
        return ${table.tableName}Dao.query${table.tableName}List(queryBean);
    }

    public List<${table.tableName}> query${table.tableName}ListByOld(${table.tableName}Query query) {
        if(null==query
                ||null==query.getOldGoodsNo()){
            LOG.error("${table.tableName}ManagerImpl.get${table.tableName}ByOld  ERROR!para null");
            throw new IllegalArgumentException("${table.tableName}ManagerImpl.get${table.tableName}ByOld  ERROR!para null");
        }
        //当前日期必须再有效期区间
        Date now=new Date();   //当前时间
        query.setStartTime(now);
        query.setEndTime(now);
        query.setStatus(new Integer(${table.tableName}SatusEnum.AVAILABLE.getKey()));  //可用
        query.setYn(1);
       return ${table.tableName}Dao.query${table.tableName}ListByOld(query);
    }

    /**
     * {@inheritDoc}
     */
    public List<${table.tableName}> query${table.tableName}ListWithPage(${table.tableName}Query queryBean,
            PageUtil pageUtil) {
        if (null == queryBean) {
            queryBean = new ${table.tableName}Query();
        }

        // 查询总数
        int totalItem = query${table.tableName}Count(queryBean);

        if (pageUtil == null) {
            pageUtil = new PageUtil();
        }
        pageUtil.setTotalRow(totalItem);
        pageUtil.init();
        
        if (totalItem > 0) {
            queryBean.setPageIndex(pageUtil.getCurPage());
            queryBean.setPageSize(pageUtil.getPageSize());
            // 调用Dao翻页方法
            return ${table.tableName}Dao.query${table.tableName}ListWithPage(queryBean);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public int query${table.tableName}Count(${table.tableName}Query queryBean) {
        return ${table.tableName}Dao.query${table.tableName}Count(queryBean);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(${table.tableName} ${table.tableName?cap_first}) {
        return ${table.tableName}Dao.delete(${table.tableName?cap_first});
    }

    /**
     * {@inheritDoc}
     */
    public ${table.tableName} get${table.tableName}ById(Long id) {
        return ${table.tableName}Dao.get${table.tableName}ById(id);
    }

    /**
     * {@inheritDoc}
     */
    public boolean delete(final ${table.tableName}[] ${table.tableName?cap_first}s) {
        boolean resultFlag = false;
        if (null != ${table.tableName?cap_first}s && ${table.tableName?cap_first}s.length > 0) {
            for (int i = 0; i < ${table.tableName?cap_first}s.length; i++) {
                resultFlag = delete(${table.tableName?cap_first}s[i]);
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
    public boolean exist(${table.tableName} ${table.tableName?cap_first}) {
        return ${table.tableName}Dao.exist(${table.tableName?cap_first});
    }
}
