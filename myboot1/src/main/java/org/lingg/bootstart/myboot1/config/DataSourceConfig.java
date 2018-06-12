package org.lingg.bootstart.myboot1.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/biz?useUnicode=true&amp;characterEncoding=UTF-8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        return dataSource;
    }
}
