package com.onion.singleton;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;

/**
 * 使用枚举方式创建c3p0连接池的单例
 */
public enum EnumSingleTon {
    DataSource;

    private ComboPooledDataSource cpds;

    private EnumSingleTon(){
        try {
            cpds = new ComboPooledDataSource();
            cpds.setDriverClass("com.mysql.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://10.8.8.61:3306/mysql");
            cpds.setUser("root");
            cpds.setPassword("123456");
            System.out.println("初始化好了c3p0连接池！");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        try{
            Connection connection = cpds.getConnection();
            return connection;
        }catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
