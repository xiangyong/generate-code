package com.github.peter.wang.generate.client;

import java.io.IOException;

import org.junit.Test;

/**
 * 
 * @author wangcanpei
 *
 */
public class GenerateClientTest {
	
	@Test
	public void testTableGenerate(){
		GenerateClient client=new GenerateClient();
		try {
			client.init();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			client.tableGenerate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
