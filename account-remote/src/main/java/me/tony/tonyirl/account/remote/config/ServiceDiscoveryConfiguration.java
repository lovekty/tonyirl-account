package me.tony.tonyirl.account.remote.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by tony on 2017/3/9.
 */
@ConfigurationProperties(prefix = "remote")
public class ServiceDiscoveryConfiguration {

    private String serviceGroup;

    private String serviceName;

    public String getServiceGroup() {
        return serviceGroup;
    }

    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
