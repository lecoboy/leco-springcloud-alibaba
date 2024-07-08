package com.leco.user.api.service;

import com.leco.user.api.domain.resp.UserResponse;

/**
 * @author greg
 * @version 2024/7/8
 **/
public interface UserRemoteService {
    UserResponse getUserById(Integer id);
}
