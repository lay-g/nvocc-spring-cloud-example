package com.nvocc.example.seata.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.nvocc.example.seata.consumer.repository.LogRepository;
import com.nvocc.example.seata.consumer.repository.entity.Log;
import com.nvocc.example.seata.entity.UserDTO;
import com.nvocc.example.seata.service.UserController;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lay
 * @since x.x
 */
@RestController
public class UserOperateController {

    private final LogRepository logRepository;
    private final UserController userController;

    public UserOperateController(LogRepository logRepository, UserController userController) {
        this.logRepository = logRepository;
        this.userController = userController;
    }

    @PostMapping("/addSuccess")
    @GlobalTransactional(rollbackFor = Exception.class)
    public void addSuccess(@RequestBody UserDTO param) {
        userController.add(param);

        Log log = new Log();
        log.setOperateType("addUser");
        log.setInfo(JSON.toJSONString(param));
        this.logRepository.save(log);
    }

    @PostMapping("/addFail")
    @GlobalTransactional(rollbackFor = Exception.class)
    public void addFail(@RequestBody UserDTO param) {
        userController.add(param);

        Log log = new Log();
        log.setOperateType("addUser");
        log.setInfo(JSON.toJSONString(param));
        this.logRepository.save(log);

        throw new RuntimeException("Force rollback global transaction");
    }
}
