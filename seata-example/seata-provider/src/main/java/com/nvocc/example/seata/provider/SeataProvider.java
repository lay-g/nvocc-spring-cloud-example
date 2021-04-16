package com.nvocc.example.seata.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lay
 * @since x.x
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.nvocc.example")
public class SeataProvider {
    public static void main(String[] args) {
        SpringApplication.run(SeataProvider.class, args);
    }
}
