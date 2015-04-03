package com.letv.ofc.utils;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * <p/> excel表格解析工具类
 * User: wanghui
 * Date: 2014年8月29日
 * Time: 下午4:46:38
 * Version: 1.0
 */
public class ExcelUtil {

	private final static Logger log = LogManager.getLogger(ExcelUtil.class);
	
	public static <T> List<T> exportExcel(InputStream in, String fileName,Class<T> entityClass) {
		List<T> list = new ArrayList<T>();
		 String suffix = fileName.substring(fileName.lastIndexOf("."));  // 文件后辍.
		Workbook wb;
		try {
			 if(".xls".equals(suffix)){ //97-03
				 wb= new HSSFWorkbook(in);
             }else if(".xlsx".equals(suffix)){ //2007
            	 wb = new XSSFWorkbook(in);
             }else{
                 System.out.println("不支持的文件类型！");
                 return null;
             }
	        //得到第一页 sheet 
	        //页Sheet是从0开始索引的 
	        Sheet sheet =   wb.getSheetAt(0);
	        Field[] fields = entityClass.getDeclaredFields();
	        int rowNum = sheet.getLastRowNum();
	        //利用foreach循环 遍历sheet中的所有行 
	        for (int i=1;i<=rowNum;i++) { 
	        	  T entity=entityClass.newInstance();  
	        	Row row = sheet.getRow(i);   
                int cellNum=row.getLastCellNum(); 
	            for (int j=0;j<cellNum;j++) { 
	            	Field field = fields[j];
					String fieldName = field.getName();
					Field nameField = entityClass.getDeclaredField(fieldName);
					 Class<?> fieldType = field.getType();    
					 nameField.setAccessible(true);
					  if (String.class == fieldType) {    
						  nameField.set(entity, String.valueOf(row.getCell(j)));
		                } else if ((Integer.TYPE == fieldType)    
		                        || (Integer.class == fieldType)) {    
		                	nameField.set(entity, Integer.valueOf(row.getCell(j).toString()));  
		                } else if ((Long.TYPE == fieldType)    
		                        || (Long.class == fieldType)) {    
		                	nameField.set(entity, Long.valueOf(row.getCell(j).toString()));   
		                } else if ((Float.TYPE == fieldType)    
		                        || (Float.class == fieldType)) {    
		                	nameField.set(entity, Float.valueOf(row.getCell(j).toString()));   
		                } else if ((Short.TYPE == fieldType)    
		                        || (Short.class == fieldType)) {    
		                	nameField.set(entity, Short.valueOf(row.getCell(j).toString()));  
		                } else if ((Double.TYPE == fieldType)    
		                        || (Double.class == fieldType)) {    
		                	nameField.set(entity, Double.valueOf(row.getCell(j).toString()));  
		                } else if(Date.class==fieldType){ 
		                	//personNameField.set(entity, String.valueOf(row.getCell(j))); 
		                	Date date = new SimpleDateFormat("yyyy-MM-dd").parse(row.getCell(j).toString());
		                	nameField.set(entity,date );  
		                }else{  
		                	nameField.set(entity, true);  
		                }  
	            } 
	            list.add(entity);
	        } 
		} catch (Exception e) {
			log.info("excel解析出错"+e.getMessage());
			throw new RuntimeException("excel解析出错,数据格式有问题");
		}
		return list;
	}
}
