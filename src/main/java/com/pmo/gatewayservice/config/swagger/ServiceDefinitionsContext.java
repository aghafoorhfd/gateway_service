package com.pmo.gatewayservice.config.swagger;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ServiceDefinitionsContext {

    private final ConcurrentHashMap<String, String> serviceDescriptions;

    private ServiceDefinitionsContext() {
        serviceDescriptions = new ConcurrentHashMap<>();
    }

    public void addServiceDefinition(String serviceName, String serviceDescription) {
        serviceDescriptions.put(serviceName, serviceDescription);
    }

    public String getSwaggerDefinition(String serviceId) {
        return this.serviceDescriptions.get(serviceId);
    }
}
