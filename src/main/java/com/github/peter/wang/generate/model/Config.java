package com.github.peter.wang.generate.model;

import java.util.List;

/**
 * 配置信息、
 * 包含读取目录
 * 输出目录等信息
 * @author wangcanpei
 *
 */
public class Config {
	
	 /**
     * 数据库方式
     */
    String DATABASE_STRATEGY = "database";
    /**
     * 文件方式
     */
    String FILE_STRATEGY = "file";
	
	/**
	 * 输入目录
	 */
	private String inPath;
	
	
	
	/**
	 * 输出目录
	 */
	private String outPath;
	
	/**
	 * 直接拷贝的目录,不需要模板处理
	 */
	private List<String> copyPaths;
	
	
	/**
	 * 项目名称，用来在目录和package里使用
	 */
	private String module;

	public String getInPath() {
		return inPath;
	}

	public void setInPath(String inPath) {
		this.inPath = inPath;
	}

	public String getOutPath() {
		return outPath;
	}

	public void setOutPath(String outPath) {
		this.outPath = outPath;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public List<String> getCopyPaths() {
		return copyPaths;
	}

	public void setCopyPaths(List<String> copyPaths) {
		this.copyPaths = copyPaths;
	}
	
	
	
}
