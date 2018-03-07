package com.qqs.jdbcConnectionPoll.demo;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * HikariCP使用
 * Created by qqs on 27/02/18.
 */
public class DataSourceHikari {
    private HikariDataSource ds;

    /**
     * 初始化连接池
     *
     * @param minimum
     * @param Maximum
     */
    public void init(int minimum, int Maximum) {
        //连接池配置
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("com.mysql.jdbc.Driver");
        config.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/testdb?user=root&password=123456&useUnicode=true&characterEncoding=utf8");
        config.addDataSourceProperty("cachePrepStmts", true);
        config.addDataSourceProperty("prepStmtCacheSize", 500);
        config.addDataSourceProperty("prepStmtCacheSqlLimit", 2048);
        config.setConnectionTestQuery("SELECT 1");
        config.setAutoCommit(true);
        //池中最小空闲链接数量
        config.setMinimumIdle(minimum);
        //池中最大链接数量
        config.setMaximumPoolSize(Maximum);

        ds = new HikariDataSource(config);

    }


//    private HikariDataSource dataSource() {
//        final HikariDataSource ds = new HikariDataSource();
//        ds.setMaximumPoolSize(100);
//        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//        ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:XE"); ;
//        ds.setUsername("username");
//        ds.setPassword("password");
//        return ds;
//    }

//    private HikariDataSource dataSource() {
//        final HikariDataSource ds = new HikariDataSource();
//        ds.setMaximumPoolSize(100);
//        ds.setDataSourceClassName("oracle.jdbc.pool.OracleDataSource");
//        ds.addDataSourceProperty("serverName", "yourServer");
//        ds.addDataSourceProperty("port", "1521");
//        ds.addDataSourceProperty("databaseName", "XE");
//        ds.addDataSourceProperty("user", "username");
//        ds.addDataSourceProperty("password", "password");
//        return ds;
//    }

    /**
     * 销毁连接池
     */
    public void shutdown() {
        ds.shutdown();
    }

    /**
     * 从连接池中获取链接
     *
     * @return
     */
    public Connection getConnection() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            ds.resumePool();
            return null;
        }
    }

    public static void main(String[] args) throws SQLException {
        DataSourceHikari ds = new DataSourceHikari();
        ds.init(10, 50);
        Connection conn = ds.getConnection();
        //......
        //最后关闭链接
        conn.close();
    }

}
