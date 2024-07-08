package com.leco.user.biz.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leco.user.biz.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author greg
 * @version 2024/7/8
 **/
@Mapper
public interface UserDao extends BaseMapper<User> {
}
