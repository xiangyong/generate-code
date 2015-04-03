package com.github.peter.wang.generate.utils;

import java.util.HashMap;
import java.util.Map;

import com.github.peter.wang.generate.constant.DataType;

/**
 * 数据库列的类型对应的java类型
 * @author wangcanpei
 *
 */
public enum JavaDataType {
	 TINYINT(DataType.JAVA_INTEGER), SMALLINT(DataType.JAVA_INTEGER), INTEGER(DataType.JAVA_INTEGER), INT(
	            DataType.JAVA_INTEGER), BIGINT(DataType.JAVA_LONG), FLOAT(DataType.JAVA_FLOAT), DOUBLE(DataType.JAVA_DOUBLE), CHAR(
	            DataType.JAVA_STRING), VARCHAR(DataType.JAVA_STRING), TEXT(DataType.JAVA_STRING), CLOB(DataType.JAVA_STRING), BLOB(
	            DataType.JAVA_BYTEArray), TIMESTAMP(DataType.JAVA_DATE), DATE(DataType.JAVA_DATE), TIME(DataType.JAVA_DATE), DATETIME(
	            DataType.JAVA_DATE), BOOLEAN(DataType.JAVA_INTEGER);

	    public final String type;
	    private static Map<String, String> typeLookup = new HashMap<String, String>();

	    static {
	        for (JavaDataType type : JavaDataType.values()) {
	            typeLookup.put(type.toString().toLowerCase(), type.type);
	        }
	    }

	    private JavaDataType(String type) {
	        this.type = type;
	    }

	    public static String forType(String type) {
	        String javaType = typeLookup.get(type);
	        if (javaType == null || "".equals(javaType)) {
	            javaType = DataType.JAVA_STRING;
	        }
	        return javaType;
	    }
}
