package com.leco.user.provider.service;

import com.leco.user.api.domain.resp.UserResponse;
import com.leco.user.api.service.UserRemoteService;
import com.leco.user.biz.entity.User;
import com.leco.user.biz.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author greg
 * @version 2024/7/8
 **/
@Service(version = "1.0.0")
public class UserRemoteServiceProvider implements UserRemoteService {
    @Autowired
    private UserService userService;

    @Override
    public UserResponse getUserById(Integer id) {
        User user = userService.getUserById(id);
        UserResponse userResponse = new UserResponse();
        BeanUtils.copyProperties(user, userResponse);
        return userResponse;
    }
}
