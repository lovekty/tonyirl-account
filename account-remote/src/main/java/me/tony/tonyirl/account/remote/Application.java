package me.tony.tonyirl.account.remote;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by tony on 2017/3/9.
 */
@SpringBootApplication(scanBasePackages = "me.tony.tonyirl")
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(Application.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}
