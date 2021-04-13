package com.nvocc.example.cloud.loadbalancer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.List;

/**
 * @author Lay
 * @since x.x
 */
@SpringBootApplication
public class LoadbalancerConsumer {
    public static void main(String[] args) {
        SpringApplication.run(LoadbalancerConsumer.class);
    }
}

@Configuration
@LoadBalancerClient(name = "cloud-loadbalancer-provider", configuration = LoadbalancerProviderConfiguration.class)
class InitialConfiguration {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

@Configuration
class LoadbalancerProviderConfiguration {

    @Bean
    @Primary
    ServiceInstanceListSupplier serviceInstanceListSupplier() {
        return new DemoServiceInstanceListSuppler("cloud-loadbalancer-provider");
    }

}

class DemoServiceInstanceListSuppler implements ServiceInstanceListSupplier {

    private final String serviceId;

    DemoServiceInstanceListSuppler(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String getServiceId() {
        return serviceId;
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        return Flux.just(Collections.singletonList(
                new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8080, false)));
    }
}