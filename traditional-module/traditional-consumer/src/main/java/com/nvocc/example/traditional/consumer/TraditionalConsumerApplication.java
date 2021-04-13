package com.nvocc.example.traditional.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lay
 * @since x.x
 */
@SpringBootApplication
public class TraditionalConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TraditionalConsumerApplication.class);
    }
}

@Configuration
class InitialConfiguration {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}