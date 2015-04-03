package com.letv.test.base;

import com.letv.common.utils.serialize.JsonHelper;
import com.letv.ofc.dao.TaskOrderDao;
import com.letv.ofc.domain.TaskOrder;
import com.letv.ofc.proxy.domain.request.stock.OperaDetailPara;
import com.letv.ofc.proxy.domain.request.stock.OperaPara;
import com.letv.ofc.proxy.domain.request.stock.SkuQuery;
import com.letv.ofc.proxy.domain.request.stock.core.StockResult;
import com.letv.ofc.proxy.service.StockServiceProxy;
import com.letv.ofc.utils.HttpClientUtil;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { TestConstants.LOCATIONS })
@TestExecutionListeners(listeners = { DependencyInjectionTestExecutionListener.class })
public class StockTestCaseTest {

    @Resource
    private StockServiceProxy stockServiceProxy;
    @Resource
	private TaskOrderDao taskOrderDao;
	
	@Test
	public void testHandler(){
		TaskOrder taskOrder = new TaskOrder();
		taskOrder.setKeyword1("2014010288878");
		taskOrder.setTaskStatus(22);
		
	}
    @Test
    public void testIsEnoughSkuStock(){
        SkuQuery query=new SkuQuery();
        query.setSkuId("GWGT402005");
        query.setStockId("5");
        stockServiceProxy.isEnoughSkuStock(query,100);
    }

    @Test
    public void testLockStock(){
//        OperaPara
        List<OperaDetailPara>  list=new ArrayList<OperaDetailPara>();
        OperaDetailPara query=new OperaDetailPara();
        query.setProduct_id("GWGT402005");    //
        query.setWarehouse_id(5);
        query.setStock_num(4);
        list.add(query);

        OperaPara pra=new OperaPara();
        pra.setOrderNo("test2014111301");
        pra.setList(list);

        boolean isok=stockServiceProxy.lockSkuStock(pra);
        System.out.println("isok="+isok);
    }

    @Test
    public void unLockStock(){
        List<OperaDetailPara>  list=new ArrayList<OperaDetailPara>();
        OperaDetailPara query=new OperaDetailPara();
        query.setProduct_id("GWGT402005");
        query.setWarehouse_id(5);
        query.setStock_num(4);
        list.add(query);

        OperaPara pra=new OperaPara();
        pra.setOrderNo("DD2014102202");
        pra.setList(list);

        boolean isok=stockServiceProxy.unlockSkuStock(pra);
        System.out.println("isok="+isok);
    }


    @Test
    public void testPost(){
        String type = "text/html; charset=UTF-8";
        try {
            String result = HttpClientUtil.postForObject("http://www.baidu.com", type,"");
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testJson(){
        String s = "{\"statusCode\":-1,\"errorCode\":-1,\"errorList\":[{\"warehouse_id\":\"\",\"product_id\":\"GWGT402005\",\"statusCode\":-1,\"errorCode\":11}]}";
        try {
            StockResult stockResult = JsonHelper.toBean(s, StockResult.class);
            System.out.println(stockResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}