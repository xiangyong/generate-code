package com.github.peter.wang.generate.utils;

import java.io.File;
import java.util.List;

/**
 * 模板处理类
 * @author wangcanpei
 *
 */
public class TemplateUtil {
	
	/**
	 * 寻找真正的模板类
	 * @return
	 */
	public static void lookforRealTemplate(String path,List<String> list){
		
		if(list==null){
			throw new IllegalArgumentException("参数为空");
		}
		
		File file=new File(path); 
		if(file.isFile()){
			list.add(file.getAbsolutePath());
		}else{
			String[] childrenList= file.list();
			for(String child:childrenList){
			   lookforRealTemplate(path+"/"+child,list);
			}
		}
	}
}
