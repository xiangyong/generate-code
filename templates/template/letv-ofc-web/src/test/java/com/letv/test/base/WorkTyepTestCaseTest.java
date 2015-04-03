package com.letv.test.base;

import com.letv.common.utils.serialize.JsonHelper;
import com.letv.ofc.domain.WorkType;
import com.letv.ofc.domain.enums.ToHistoryStatusENum;
import com.letv.ofc.execute.service.OrderStatisticsService;
import com.letv.ofc.external.service.SynOrderService;
import com.letv.ofc.proxy.domain.request.order.Goods;
import com.letv.ofc.proxy.domain.request.order.OrderQuery;
import com.letv.ofc.proxy.service.OrderServiceProxy;
import com.letv.ofc.service.WorkTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { TestConstants.LOCATIONS })
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class })
public class WorkTyepTestCaseTest {

    @Autowired
    private WorkTypeService workTypeService;

    @Test
    public void testUpdate(){
        WorkType workType = new WorkType(null,
                0, ToHistoryStatusENum.OREDER_STATISTICS_WORKID.getKey());
        boolean isOk=workTypeService.updateByQuery(workType);
        System.out.println("isOk=" + isOk);

    }

}