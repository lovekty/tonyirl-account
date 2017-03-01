package me.tony.tonyirl.passport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "me.tony.tonyirl")
public class TonyirlPassportApplication {

    public static void main(String[] args) {
        SpringApplication.run(TonyirlPassportApplication.class, args);
    }
}
