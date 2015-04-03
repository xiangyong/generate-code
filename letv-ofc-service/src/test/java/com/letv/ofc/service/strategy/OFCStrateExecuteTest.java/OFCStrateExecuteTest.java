package com.letv.ofc.service.strategy;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.letv.ofc.domain.TaskOrder;

@ContextConfiguration(locations = { "classpath:/spring/spring-config-strategy.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class OFCStrateExecuteTest {

	@Resource
	private OFCStrategyExecute ofcStrategyExecute;
	
	@Test
	public void testHandler(){
		TaskOrder task=new TaskOrder();
		try {
			ofcStrategyExecute.handler(task);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
