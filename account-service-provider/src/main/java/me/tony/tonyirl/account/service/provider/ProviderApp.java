package me.tony.tonyirl.account.service.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 用springcloud microservice临时取代thrift rpc服务，等tremote完成以后由account-remote服务替代
 *
 * @author tony
 */
@SpringBootApplication(scanBasePackages = "me.tony")
@EnableDiscoveryClient
@MapperScan(basePackages = "me.tony.tonyirl.account.orm.mapper")
@EnableTransactionManagement
public class ProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
