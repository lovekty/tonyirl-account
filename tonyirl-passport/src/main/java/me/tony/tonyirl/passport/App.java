package me.tony.tonyirl.passport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.PropertySource;

/**
 * @author tony
 */
@SpringBootApplication(scanBasePackages = "me.tony")
@PropertySource(value = "classpath:service-discovery.properties", name = "remote")
@EnableDiscoveryClient(autoRegister = false)
@EnableFeignClients
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
