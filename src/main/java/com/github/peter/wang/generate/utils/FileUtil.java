package com.github.peter.wang.generate.utils;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;

/**
 * 文件的帮助类
 * @author wangcanpei
 *
 */
public class FileUtil extends FileUtils{
	
	/**
	 * 创建文件夹
	 * @param file
	 */
	public static void mkdir(File file){
		
		if(!file.exists()){
			file.setReadable(true);
			file.setExecutable(true);
			file.mkdirs();
		}
		
		
	}
	

    
   
    /**
     * 判断该路径是否包含list里的路径
     * @param path路径
     * @param list 包含的路径
     * @return
     */
    public static boolean isContainPath(String path,List<String> list){
    	if(CollectionUtils.isEmpty(list)){
    		return false;
    	}
    	for(String str:list){
    		 if(path.contains(str)){
    			 return true;
    		 }
    	}
    	return false;
    }
}
