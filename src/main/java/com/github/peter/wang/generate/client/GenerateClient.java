package com.github.peter.wang.generate.client;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;

import com.github.peter.wang.generate.constant.Constant;
import com.github.peter.wang.generate.model.Table;
import com.github.peter.wang.generate.model.TableConfig;
import com.github.peter.wang.generate.service.Parse;
import com.github.peter.wang.generate.service.TableParse;
import com.github.peter.wang.generate.utils.FileUtil;
import com.github.peter.wang.generate.utils.TemplateUtil;

import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 生成执行类
 * 配置模板路径
 * 数据源获取
 * 生成代码输出
 * @author wangcanpei
 *
 */
public class GenerateClient {
	
	/**
	 * 
	 */
	private Configuration cfg ;
	
	/**
	 * 基本配置，输出地址，输入地址等
	 */
	private TableConfig config;
	
	/**
	 * 配置模板路径
	 * 数据源信息
	 * 代码输出地址
	 * @throws IOException 
	 */
	private void init(TableConfig config) throws IOException{
		this.config=config;
		//ClassTemplateLoader ctl = new ClassTemplateLoader(GenerateClient.class, config.getInPath());
		FileTemplateLoader ctl=new FileTemplateLoader(new File(config.getInPath()));
		cfg=new Configuration();
		cfg.setTemplateLoader(ctl);
	}
	
	/**
	 * 根据数据库连接生成代码方式
	 * @throws Exception 
	 */
	public void tableGenerate(TableConfig config) throws Exception{
		init(config);
		//用来获取数据，即Data数据
		Parse parse=new TableParse();
		
		List<Table> tableList=null;
		try {
			tableList=parse.parse(config);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Table table:tableList){
			generateCode(table);
		}
		
		
		
	}

	/**
	 * 根据模板和
	 * @param table
	 * @throws IOException
	 * @throws TemplateException
	 */
	private void generateCode(Table table) throws IOException,
			TemplateException {
		List<String> templateList=new ArrayList<String>();
		
		TemplateUtil.lookforRealTemplate(config.getInPath(),templateList);
		if(CollectionUtils.isNotEmpty(templateList)){
			for(String templatePath:templateList){
				//数据输出。把数据和模板合并
				String realPath=templatePath.substring(config.getInPath().length());
				//是模板的进行模板处理，不是模板的直接复制，判断依据以目录来区分。比如static、download、Web.xml目录下的都不需要模板处理
				if(FileUtil.isContainPath(realPath, config.getCopyPaths())){
					//复制整个目录
					FileUtil.copyFile(new File(templatePath), new File(config.getOutPath()+Constant.PATH_SEPARATOR+realPath));
				}
				Template temp = cfg.getTemplate(realPath);
				Map<String,Object> root = new HashMap<String,Object>();
				root.put("table", table);
				root.put("module", config.getModule());
				
				String outPath=config.getOutPath()+realPath.substring(0,realPath.lastIndexOf(Constant.PATH_SEPARATOR)).replace("${module}", config.getModule());
				File outFile=new File(outPath);
				FileUtil.mkdir(outFile);
				//得到模板的名字
				String tempName=realPath.substring(realPath.lastIndexOf(Constant.PATH_SEPARATOR)).replace("${tableName}", table.getTableName());
				Writer write=new FileWriter(outFile+Constant.PATH_SEPARATOR+tempName);
				
				temp.process(root, write);
			}
				
		}
	}
	
	
	
	
}
