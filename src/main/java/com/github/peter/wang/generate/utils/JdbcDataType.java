package com.github.peter.wang.generate.utils;

import java.util.HashMap;
import java.util.Map;

import com.github.peter.wang.generate.client.DataType;

 
 /**
  * 数据库列的类型对应的Mybatis JdbcType类型
  * 常见的类型
  * @author wangcanpei
  *
  */
public enum JdbcDataType {
	
	    TINYINT(DataType.JDBC_DECIMAL), SMALLINT(DataType.JDBC_DECIMAL), INTEGER(DataType.JDBC_DECIMAL), INT(
	            DataType.JDBC_DECIMAL), BIGINT(DataType.JDBC_DECIMAL), FLOAT(DataType.JDBC_DECIMAL), DOUBLE(
	            DataType.JDBC_DECIMAL), CHAR(DataType.JDBC_VARCHAR), VARCHAR(DataType.JDBC_VARCHAR), TEXT(
	            DataType.JDBC_VARCHAR), CLOB(DataType.JDBC_VARCHAR), BLOB(DataType.JDBC_DECIMAL), TIMESTAMP(
	            DataType.JDBC_TIMESTAMP), DATE(DataType.JDBC_TIMESTAMP), TIME(DataType.JDBC_TIMESTAMP), DATETIME(
	            DataType.JDBC_TIMESTAMP), BOOLEAN(DataType.JDBC_DECIMAL);

	    public final String JAVA_TYPE;
	    private static Map<String, String> typeLookup = new HashMap<String, String>();

	    static {
	        for (JdbcDataType type : JdbcDataType.values()) {
	            typeLookup.put(type.toString().toLowerCase(), type.JAVA_TYPE);
	        }
	    }

	    private JdbcDataType(String type) {
	        this.JAVA_TYPE = type;
	    }

	    public static String forType(String type) {
	        String jdbcType = typeLookup.get(type);
	        if (jdbcType == null || "".equals(jdbcType)) {
	            jdbcType = DataType.JDBC_VARCHAR;
	        }
	        return jdbcType;
	    }
	}


