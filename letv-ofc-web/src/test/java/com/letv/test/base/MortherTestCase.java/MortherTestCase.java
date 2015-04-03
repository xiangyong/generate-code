package com.letv.test.base;

import com.letv.ofc.domain.query.EqualGoodsQuery;
import com.letv.ofc.domain.query.MotherWarehouseSettingQuery;
import com.letv.ofc.service.EqualGoodsService;
import com.letv.ofc.service.MotherWarehouseSettingService;
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
public class MortherTestCase {

    @Resource
    private MotherWarehouseSettingService motherWarehouseSettingService;

    @Test
    public void testMotherGoodsByChild(){
        MotherWarehouseSettingQuery query=new MotherWarehouseSettingQuery();
        query.setChildWarehouseNo("12");
        motherWarehouseSettingService.getMotherWarehouseByChild(query);
    }

}