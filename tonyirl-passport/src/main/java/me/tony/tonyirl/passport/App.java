package me.tony.tonyirl.passport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @author tony
 */
@SpringBootApplication(scanBasePackages = "me.tony")
@PropertySource("classpath:service-discovery.properties")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
