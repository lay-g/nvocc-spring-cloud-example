package com.nvocc.example.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Lay
 * @since x.x
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider.class);
    }
}
