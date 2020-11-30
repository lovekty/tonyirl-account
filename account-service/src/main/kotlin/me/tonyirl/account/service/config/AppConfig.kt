package me.tonyirl.account.service.config

import me.tonyirl.account.thrift.api.AccountService
import me.tonyirl.tremote.core.ServiceInfo
import me.tonyirl.tremote.core.ServicePublisher
import org.apache.curator.framework.CuratorFramework
import org.apache.curator.framework.CuratorFrameworkFactory
import org.apache.curator.retry.ExponentialBackoffRetry
import org.apache.curator.x.discovery.ServiceDiscovery
import org.apache.curator.x.discovery.ServiceDiscoveryBuilder
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author tony.zhuby
 * @date 2020/11/30
 */
@Configuration
class AppConfig {

    @Value("\${tremote.register.zk-url:#{\"127.0.0.1:2181\"}}")
    lateinit var zkUrl: String

    @Bean(initMethod = "start")
    fun zkClient(): CuratorFramework {
        return CuratorFrameworkFactory.builder()
            .connectString(zkUrl)
            .sessionTimeoutMs(5000)
            .connectionTimeoutMs(5000)
            .retryPolicy(ExponentialBackoffRetry(1000, 3))
            .build()
    }

    @Bean(initMethod = "start")
    fun discovery(zk: CuratorFramework): ServiceDiscovery<ServiceInfo>? {
        return ServiceDiscoveryBuilder.builder(ServiceInfo::class.java)
            .basePath("services")
            .client(zk)
            .build()
    }


    @Bean(initMethod = "publish")
    fun servicePublisher(
        discovery: ServiceDiscovery<ServiceInfo>,
        service: AccountService.Iface
    ): ServicePublisher<AccountService.Iface> {
        val si = ServiceInfo("account-service")
        si.port = 10086
        return ServicePublisher<AccountService.Iface>(service, si, discovery)
    }
}