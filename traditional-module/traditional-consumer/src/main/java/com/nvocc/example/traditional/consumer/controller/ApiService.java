package com.nvocc.example.traditional.consumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Lay
 * @since x.x
 */
@RestController
@RequestMapping("/api")
public class ApiService {

    private final RestTemplate restTemplate;

    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String hello() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/user/get", String.class);
        return String.format("Hello, welcome to view this page. Your information is [%s]", response.getBody());
    }
}
