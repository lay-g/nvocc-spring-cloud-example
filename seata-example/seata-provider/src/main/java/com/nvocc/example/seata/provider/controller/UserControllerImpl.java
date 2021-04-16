package com.nvocc.example.seata.provider.controller;

import com.nvocc.example.seata.entity.UserDTO;
import com.nvocc.example.seata.provider.repository.UserRepository;
import com.nvocc.example.seata.provider.repository.entity.User;
import com.nvocc.example.seata.service.UserController;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lay
 * @since x.x
 */
@RestController
public class UserControllerImpl implements UserController {

    private final UserRepository userRepository;

    public UserControllerImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public void add(UserDTO param) {
        User user = new User();
        user.setName(param.getName());
        user.setAge(param.getAge());
        userRepository.save(user);
    }
}
