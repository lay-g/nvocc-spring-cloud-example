package com.nvocc.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableScheduling
@SpringBootApplication
public class NacosConfigExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigExampleApplication.class, args);
    }

}

@Slf4j
@RefreshScope
@RestController
class HelloController {

    @Value("${nacos-example.config-value}")
    private String configValue;

    @GetMapping("/hi")
    public String hi() {
        return configValue;
    }
}