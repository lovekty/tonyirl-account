package cn.bootz.account

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

/**
 * @author tony.zhuby
 * @date 2020/11/30
 */
@SpringBootApplication
@EnableDiscoveryClient
class AppMain

fun main(args: Array<String>) {
    runApplication<AppMain>(*args)
}
