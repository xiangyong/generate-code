package com.letv.test.base;

import com.letv.common.utils.serialize.JsonHelper;
import com.letv.ofc.domain.OrderContractMachine;
import com.letv.ofc.external.service.SynOrderService;
import com.letv.ofc.proxy.domain.request.order.Goods;
import com.letv.ofc.proxy.domain.request.order.OrderQuery;
import com.letv.ofc.proxy.domain.request.stock.OperaDetailPara;
import com.letv.ofc.proxy.domain.request.stock.OperaPara;
import com.letv.ofc.proxy.domain.request.stock.SkuQuery;
import com.letv.ofc.proxy.service.OrderServiceProxy;
import com.letv.ofc.proxy.service.StockServiceProxy;
import com.letv.ofc.utils.HttpClientUtil;
import com.letv.ofc.utils.QueueIdGen;
import com.letv.order.manager.OrderContractMachineManager;
import org.apache.log4j.helpers.DateTimeDateFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { TestConstants.LOCATIONS })
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class })
public class OrderTestCaseTest {

    @Resource
    private OrderServiceProxy orderServiceProxy;

    @Resource
    private SynOrderService synOrderService;

    @Resource
    private OrderContractMachineManager orderContractMachineManager ;


    @Test
    public void testSynOrderOrigin(){
        OrderQuery query=new OrderQuery();
        query.setOrder_id("1410211678752");
        query.setOrder_status_id("8");
        query.setOperator("lisi");
        query.setIssued_rule("1,11");
        query.setRemark("test");
        query.setOperate_desc("生成包裹状态");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        query.setOperate_time(format.format(new Date()));
        boolean isOk=orderServiceProxy.synOrderOrigin(query,null);
        System.out.println("isOk=" + isOk);
    }

    @Test
    public void testSynOrderOriginHas(){
        OrderQuery query=new OrderQuery();
        query.setOrder_id("1408221682046");
        query.setOrder_status_id("8");
        query.setStorage_id("139");
        query.setEc_name("北京顺义圆通");
        query.setEc_id("13");
        query.setOperator("lisi");
        query.setIssued_rule("1,11");
        query.setRemark("test");
        query.setOperate_desc("生成包裹状态");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        query.setOperate_time(format.format(new Date()));

        Goods g=new Goods();
        g.setProduct_origin_id("602000001574");
        g.setProduct_id("409900000269");
//        g.setProduct_name("测试");
        g.setQuantity("5");
        List<Goods> l=new ArrayList<Goods>();
        l.add(g);
        String aa= JsonHelper.toJson(l);
        query.setGoods_list(aa);

//        List<Goods> gl=JsonHelper.toList(aa,Goods.class);
//        System.out.println(gl.size());

        boolean isOk=orderServiceProxy.synOrderOrigin(query,null);
        System.out.println("isOk=" + isOk);
    }


    @Test
    public void SynOrderTest(){
        OrderQuery query=new OrderQuery();
        query.setOrder_id("1408221682046");
        query.setOrder_status_id("8");
        query.setStorage_id("139");
        query.setEc_name("北京顺义圆通");
        query.setEc_id("13");
        query.setOperator("lisi");
        query.setIssued_rule("1,11");
        query.setRemark("test");
        query.setOperate_desc("生成包裹状态");
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        query.setOperate_time(format.format(new Date()));

        Goods g=new Goods();
        g.setProduct_origin_id("602000001574");
        g.setProduct_id("409900000269");
//        g.setProduct_name("测试");
        g.setQuantity("5");
        List<Goods> l=new ArrayList<Goods>();
//        l.add(g);
        String aa= JsonHelper.toJson(l);
        query.setGoods_list(aa);

        synOrderService.synOrderOrigin(query);


    }

    @Test
    public void queryContractMachineByOrder(){
        OrderContractMachine queryMan =new OrderContractMachine();
        queryMan.setOrderId("1502151226720");
        List<OrderContractMachine> conManList= null;
        conManList = orderContractMachineManager.queryContractMachineByOrder(queryMan);
        System.out.println(conManList);

    }

}