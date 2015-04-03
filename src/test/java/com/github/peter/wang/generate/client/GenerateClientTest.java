package com.github.peter.wang.generate.client;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.peter.wang.generate.model.TableConfig;

/**
 * 
 * @author wangcanpei
 *
 */
public class GenerateClientTest {
	
	@Test
	public void testTableGenerate(){
		TableConfig config=new TableConfig();
		config.setInPath("E:/templates/template/");
		config.setOutPath("d://generateCode//out//");
		config.setModule("pms");
		config.setUserName("wangjiu");
		config.setPassword("wangjiu");
		config.setConnstr("jdbc:mysql://10.154.250.19:3306/ofc?characterEncoding=UTF-8&amp;zeroDateTimeBehavior=convertToNull");
		config.setDBName("ofc");
		List<String> copyPaths=new ArrayList<String>();
		copyPaths.add("static");
		config.setCopyPaths(copyPaths);
		GenerateClient client=new GenerateClient();
		try {
			client.tableGenerate(config);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
