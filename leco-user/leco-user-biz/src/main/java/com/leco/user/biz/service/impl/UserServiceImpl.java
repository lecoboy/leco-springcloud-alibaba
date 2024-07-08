package com.leco.user.biz.service.impl;

import com.leco.user.biz.dao.UserDao;
import com.leco.user.biz.entity.User;
import org.springframework.stereotype.Service;
import com.leco.user.biz.service.UserService;

import javax.annotation.Resource;

/**
 * @author greg
 * @version 2024/7/8
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.selectById(id);
    }
}
