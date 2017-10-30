package me.tony.tonyirl.account.remote.config;

import me.tony.tonyirl.account.api.AccountApi;
import me.tony.tonyirl.account.remote.provider.AccountApiProvider;
import me.tony.tonyirl.account.service.AccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.cloud.zookeeper.ZookeeperAutoConfiguration;
//import org.springframework.cloud.zookeeper.discovery.ConditionalOnZookeeperDiscoveryEnabled;
//import org.springframework.cloud.zookeeper.discovery.ZookeeperDiscoveryAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by tony on 2017/3/9.
 */
//@Configuration
//@ConditionalOnZookeeperDiscoveryEnabled
//@AutoConfigureAfter({ZookeeperDiscoveryAutoConfiguration.class, ZookeeperAutoConfiguration.class})
//@EnableConfigurationProperties(ThriftConfiguration.class)
public class ThriftConfiguration {

    private final AccountService accountService;

    @Autowired
    public ThriftConfiguration(AccountService accountService) {
        this.accountService = accountService;
    }

//    @Bean
    public AccountApi.Iface accountApi() {
//        AccountApi.Iface service =
        try {
            return new FactoryBean<AccountApi.Iface>() {
                @Override
                public AccountApi.Iface getObject() throws Exception {
                    return new AccountApiProvider(accountService);
                }

                @Override
                public Class<?> getObjectType() {
                    return AccountApiProvider.class;
                }

                @Override
                public boolean isSingleton() {
                    return true;
                }
            }.getObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
