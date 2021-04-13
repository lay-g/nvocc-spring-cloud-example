package com.nvocc.example.cloud.loadbalancer.controller;

import com.nvocc.example.cloud.loadbalancer.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lay
 * @since x.x
 */
@RestController
@RequestMapping("/user")
public class UserService {

    @GetMapping("/get")
    public User get() {
        return User.builder().name("Lay").age(25).build();
    }

}
