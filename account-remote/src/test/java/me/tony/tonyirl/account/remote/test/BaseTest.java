package me.tony.tonyirl.account.remote.test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by tony on 2017/7/9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ComponentScan(basePackages = "me.tony")
@ImportResource("classpath:application.yml")
public class BaseTest {
}
