package com.leco.web.controller;

import com.leco.user.api.domain.resp.UserResponse;
import com.leco.user.api.service.UserRemoteService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author greg
 * @version 2024/7/8
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Reference(timeout = 10000, check = false, version = "1.0.0")
    private UserRemoteService userRemoteService;

    @GetMapping("/{id}")
    public UserResponse user(@PathVariable Integer id) {
        log.info("查询id为{}的用户", id);
        return userRemoteService.getUserById(id);
    }
}
