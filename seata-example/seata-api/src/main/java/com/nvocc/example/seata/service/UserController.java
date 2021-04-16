package com.nvocc.example.seata.service;

import com.nvocc.example.seata.entity.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lay
 * @since x.x
 */
@FeignClient("seata-provider")
public interface UserController {

    @RequestMapping("/add")
    void add(@RequestBody UserDTO user);

}
