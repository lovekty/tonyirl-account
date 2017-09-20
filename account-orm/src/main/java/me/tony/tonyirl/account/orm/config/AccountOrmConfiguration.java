package me.tony.tonyirl.account.orm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import java.util.Properties;

/**
 * Created by tony on 2017/7/7.
 */
@Configuration
@MapperScan(basePackages = "me.tony.tonyirl.account.orm.mapper")
@EnableTransactionManagement
public class AccountOrmConfiguration implements TransactionManagementConfigurer {


    private final DataSourceProperties dataSourceProperties;

    @Autowired
    public AccountOrmConfiguration(DataSourceProperties dataSourceProperties) {
        this.dataSourceProperties = dataSourceProperties;
    }

    @Bean(name = "druidDataSource", initMethod = "init", destroyMethod = "close")
    @Primary
    public DruidDataSource druidDataSource() throws Exception {
        Properties prop = new Properties();
        prop.put("driverClassName", dataSourceProperties.getDriverClassName());
        prop.put("url", dataSourceProperties.getUrl());
        prop.put("username", dataSourceProperties.getUsername());
        prop.put("password", dataSourceProperties.getPassword());
        return (DruidDataSource) DruidDataSourceFactory.createDataSource(prop);
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        try {
            return new DataSourceTransactionManager(druidDataSource());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
