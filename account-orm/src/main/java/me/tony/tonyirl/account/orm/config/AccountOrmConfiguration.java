package me.tony.tonyirl.account.orm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by tony on 2017/7/7.
 */
@Configuration
@MapperScan(basePackages = "me.tony.tonyirl.account.orm.mapper")
@EnableTransactionManagement
public class AccountOrmConfiguration {

}
