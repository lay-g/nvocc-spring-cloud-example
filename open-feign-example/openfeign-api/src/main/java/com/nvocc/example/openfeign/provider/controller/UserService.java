package com.nvocc.example.openfeign.provider.controller;

import com.nvocc.example.openfeign.provider.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Lay
 * @since x.x
 */
@FeignClient("openfeign-provider")
public interface UserService {

    @GetMapping("/user/get")
    User get();

}
