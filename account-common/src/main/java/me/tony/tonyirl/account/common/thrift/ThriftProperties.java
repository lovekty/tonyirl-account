package me.tony.tonyirl.account.common.thrift;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.List;

@ConfigurationProperties(prefix = "thrift")
@ConditionalOnProperty(name = "spring.cloud.zookeeper.enabled")
public class ThriftProperties {

    @NestedConfigurationProperty
    private List<ThriftRpc> providers;

    @NestedConfigurationProperty
    private List<ThriftRpc> consumers;

    public List<ThriftRpc> getProviders() {
        return providers;
    }

    public void setProviders(List<ThriftRpc> providers) {
        this.providers = providers;
    }

    public List<ThriftRpc> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<ThriftRpc> consumers) {
        this.consumers = consumers;
    }

    public static class ThriftRpc {
        Class<?> service;
        int port;
        boolean asyncEnable;

        public Class<?> getService() {
            return service;
        }

        public void setService(Class<?> service) {
            this.service = service;
        }

        public int getPort() {
            return port;
        }

        public void setPort(int port) {
            this.port = port;
        }

        public boolean isAsyncEnable() {
            return asyncEnable;
        }

        public void setAsyncEnable(boolean asyncEnable) {
            this.asyncEnable = asyncEnable;
        }
    }
}
