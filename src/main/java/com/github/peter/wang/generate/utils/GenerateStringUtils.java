package com.github.peter.wang.generate.utils;

import org.apache.commons.lang.StringUtils;

import com.github.peter.wang.generate.constant.Constant;

/**
 * string的操作类
 * @author wangcanpei
 *
 */
public class GenerateStringUtils extends StringUtils{


		/**
		 * 把第一个字母大写
		 * @param str
		 * @return
		 */
	     public static String getUppercaseChar(String str){
	         return str.substring(0,1).toUpperCase()+str.substring(1);
	     }
	     
	     /**
	      * 获取驼峰命名方式
	      * @param tableName
	      * @return
	      */
	     public static String getClassName(String tableName){
	    	 if(tableName == null) {
				 return "" ;
			 }
			 //先按照"_"来把名称分隔开
			 String[] classNames=tableName.split(Constant.DB_TABLE_SEPARATOR);
			 StringBuffer className= new StringBuffer();
			 for(String classN:classNames){
				// 首字母大写
				 String UppercaseChar=getUppercaseChar(classN);
				 className.append(UppercaseChar);
			 }
			return className.toString(); 
	     }
	     
	     /**
	      * 获取列的名字
	      * @param tableName
	      * @return
	      */
	     public static String getColumnName(String tableName){
	    	 if(tableName == null) {
				 return "" ;
			 }
			 //先按照"_"来把名称分隔开
			 String[] classNames=tableName.split(Constant.DB_TABLE_SEPARATOR);
			 StringBuffer className= new StringBuffer();
			 for(int i=0;i<classNames.length;i++){
				String classN=classNames[i];
				// 首字母大写
				 if(i==0){
					 className.append(classN);
				 }else{
					 String UppercaseChar=getUppercaseChar(classN);
					 className.append(UppercaseChar);
				 }
				
			 }
			return className.toString(); 
	     }
	     
	    

}
