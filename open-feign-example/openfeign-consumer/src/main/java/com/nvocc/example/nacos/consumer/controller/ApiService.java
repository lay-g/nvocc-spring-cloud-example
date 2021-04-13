package com.nvocc.example.nacos.consumer.controller;

import com.nvocc.example.openfeign.provider.controller.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Lay
 * @since x.x
 */
@RestController
@RequestMapping("/api")
public class ApiService {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return String.format("Hello, welcome to view this page. Your information is [%s]", userService.get());
    }
}
