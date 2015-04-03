package com.github.peter.wang.generate.model;

import java.util.List;


/**
 * 表的配置，用来设置那些字段、那些表不用生成代码
 * 
 * @author wangcanpei
 *
 */
public class TableConfig extends Config{
	  /**
     * 表名前缀：生成类名时去除该前缀
     * 
     * 
     */
    private String prefix;

    /**
     * 包含的表名
     * 
     * 
     */
    private List<String> include;

    /**
     * 排除的表名
     * 
     *
     */
    private List<String> exclude;
    
    /**
     * 数据库连接
     */
    private String connstr;

    
    /**
     * 数据库名称
     */
    private String DBName;
    
    /**
     * 用户名
     */
    private String userName;
    
    /**
     * 密码
     */
    private String password;
    
    
 
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public List<String> getInclude() {
        return include;
    }

    public void setInclude(List<String> include) {
        this.include = include;
    }

    public List<String> getExclude() {
        return exclude;
    }

    public void setExclude(List<String> exclude) {
        this.exclude = exclude;
    }

	public String getConnstr() {
		return connstr;
	}

	public void setConnstr(String connstr) {
		this.connstr = connstr;
	}

	public String getDBName() {
		return DBName;
	}

	public void setDBName(String dBName) {
		DBName = dBName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
