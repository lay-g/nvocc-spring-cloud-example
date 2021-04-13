package com.nvocc.example.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lay
 * @since x.x
 */
@SpringBootApplication
public class NacosConsumer {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer.class);
    }
}

@Configuration
@EnableDiscoveryClient
class InitialConfiguration {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}