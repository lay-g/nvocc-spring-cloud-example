package com.nvocc.example.openfeign.provider.controller;

import com.nvocc.example.openfeign.provider.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lay
 * @since x.x
 */
@Slf4j
@RestController
public class UserServiceImpl implements UserService {

    public User get() {
        return new User("Lay", 25);
    }
}