package com.github.peter.wang.generate.client;

/**
 * 数据类型，常见的类型
 * @author wangcanpei
 *
 */
public interface DataType {
	String JAVA_INTEGER = "Integer";
    String JAVA_LONG = "Long";
    String JAVA_SHORT = "Short";
    String JAVA_STRING = "String";
    String JAVA_DOUBLE = "Double";
    String JAVA_FLOAT = "Float";
    String JAVA_BYTEArray = "Byte[]";
    String JAVA_DATE = "java.util.Date";
    String JAVA_BYTE = "Byte";

    String JDBC_DECIMAL = "DECIMAL";
    String JDBC_VARCHAR = "VARCHAR";
    String JDBC_TIMESTAMP = "TIMESTAMP";
}
