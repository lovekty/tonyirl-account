package me.tony.tonyirl.account.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "me.tony")
//@EnableJpaRepositories(basePackages = "me.tony.tonyirl.account.jpa")
public class MockMain {
    public static void main(String[] args) {
        SpringApplication.run(MockMain.class, args);
    }
}
