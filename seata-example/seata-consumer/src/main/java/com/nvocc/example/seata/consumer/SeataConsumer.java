package com.nvocc.example.seata.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lay
 * @since x.x
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.nvocc.example")
@EnableDiscoveryClient
public class SeataConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SeataConsumer.class, args);
    }
}
