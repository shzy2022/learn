package com.hyl.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class jdbcConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    DataSource dataSource(){
        DruidDataSource d = new DruidDataSource();
        d.setDriverClassName(driver);
        d.setUrl(url);
        d.setUsername(username);
        d.setPassword(password);
        return d;
    }
}
