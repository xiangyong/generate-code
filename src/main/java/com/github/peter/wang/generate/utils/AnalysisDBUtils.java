package com.github.peter.wang.generate.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.github.peter.wang.generate.model.Column;
import com.github.peter.wang.generate.model.Table;

/**
 * 解析数据库帮助类
 * @author wangcanpei
 *
 */
public class AnalysisDBUtils {
	
	
    private static Connection conn ;
	
	/**
     * 读取数据库中所有表名及表的注释
     * @param DBName 数据库名称
     * @return
     */
    public static final List<Table> readDB(String DBName) {
        List<Table> list = new ArrayList<Table>();
        String sql = "SELECT TABLE_NAME ,TABLE_COMMENT FROM information_schema.tables "
                + " WHERE table_schema ='"+DBName+"'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            	Table tm = new Table() ;
                tm.setTableCode(rs.getString("TABLE_NAME")) ;
                tm.setTableComment(rs.getString("TABLE_COMMENT")) ;
                list.add(tm) ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
     
    /**
     * 读取表里的字段信息
     * @param 
     * @param tables
     */
    public static final void readTables(List<Table> tables) {
        if(tables != null) {
            for(Table tm : tables) {
                readTable(tm) ;
            }
        }
        close() ;
    }
     
    /**
     * 读取表结构
     * @param table
     */
    private static final void readTable(Table table) {
        List<Column> list = new ArrayList<Column>() ;
        String sql = "SELECT COLUMN_NAME ,COLUMN_TYPE,COLUMN_KEY,COLUMN_COMMENT "
        + " FROM information_schema.columns WHERE table_name = '" + table.getTableCode() + "'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
            	Column fm = new Column() ;
                fm.setColumnCode(rs.getString("COLUMN_NAME")) ;
                fm.setColumnType(rs.getString("COLUMN_TYPE")) ;
                fm.setColumnKey(rs.getString("COLUMN_KEY")) ;
                fm.setColumnComment(rs.getString("COLUMN_COMMENT")) ;
                list.add(fm) ;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        table.setColumnList(list) ;
    }

    
    

    /**
     * 创建数据库连接
     * @param conStr
     * @param userName
     * @param password
     * @return
     */
    public static final Connection createConnection(String conStr,String userName,String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(conStr,userName,password) ;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn ;
    }
     
    /**
     * 关闭数据库连接
     */
    public static final void close() {
        if(conn != null) {
            try {
                conn.close() ;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     

}
