package me.tony.tonyirl.account.orm.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tony on 2017/7/7.
 */
@Configuration("myBatisAutoConfiguration")
public class MyBatisAutoConfiguration {

    @Bean("mybatisSqlSessionTemplate")
    @ConditionalOnBean(SqlSessionFactory.class)
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @AutoConfigureAfter(SqlSessionTemplate.class)
    @Bean("accountOrmMapperScanner")
    public MapperScannerConfigurer mapperScannerConfigurer() {
        final
    }

}
