package me.tony.tonyirl.account.orm.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by tony on 2017/7/7.
 */
@Configuration("myBatisAutoConfiguration")
@MapperScan(basePackages = "me.tony.tonyirl.account.orm.mapper")
@EnableTransactionManagement
public class TonyirlAccountMyBatisAutoConfiguration implements TransactionManagementConfigurer {

    public static final String SQL_SESSION_FACTORY_BEAN_NAME = "tonyirlAccountSqlSessionFactory";
    public static final String DATASOURCE_NAME = "tonyirlAccountDataSource";

    private final Environment environment;
    private final RelaxedPropertyResolver propertyResolver;

    @Autowired
    public TonyirlAccountMyBatisAutoConfiguration(Environment environment) {
        this.environment = environment;
        this.propertyResolver = new RelaxedPropertyResolver(this.environment, "spring.datasource.");
    }

    @Bean(name = DATASOURCE_NAME, initMethod = "init", destroyMethod = "close")
    @Primary
    public DruidDataSource druidDataSource() throws Exception {
        Properties prop = new Properties();
        prop.put("driverClassName", propertyResolver.getProperty("driver-class-name"));
        prop.put("url", propertyResolver.getProperty("url"));
        prop.put("username", propertyResolver.getProperty("username"));
        prop.put("password", propertyResolver.getProperty("password"));
        return (DruidDataSource) DruidDataSourceFactory.createDataSource(prop);
    }

    @Bean(name = SQL_SESSION_FACTORY_BEAN_NAME)
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(druidDataSource());
        bean.setTypeAliasesPackage("me.tony.tonyirl.account.orm.domain");
        bean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mappers/*Mapper.xml"));
        return bean.getObject();
    }

    @Bean("tonyirlAccountMybatisSqlSessionTemplate")
    @ConditionalOnBean(name = SQL_SESSION_FACTORY_BEAN_NAME)
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier(SQL_SESSION_FACTORY_BEAN_NAME) SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
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
