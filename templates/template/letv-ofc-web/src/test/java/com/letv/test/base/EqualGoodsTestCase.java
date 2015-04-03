package com.letv.test.base;

import com.letv.ofc.domain.query.EqualGoodsQuery;
import com.letv.ofc.proxy.domain.request.stock.SkuQuery;
import com.letv.ofc.proxy.service.StockServiceProxy;
import com.letv.ofc.service.EqualGoodsService;
import com.letv.ofc.utils.HttpClientUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { TestConstants.LOCATIONS })
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class })
public class EqualGoodsTestCase {

    @Resource
    private EqualGoodsService equalGoodsService;

    @Test
    public void testGetEqualGoodsByOld(){
        EqualGoodsQuery query=new EqualGoodsQuery();
        query.setOldGoodsNo("602000002017");
        equalGoodsService.getEqualGoodsByOld(query);
    }

}