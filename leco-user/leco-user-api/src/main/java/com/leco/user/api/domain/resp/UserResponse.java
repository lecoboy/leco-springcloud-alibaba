package com.leco.user.api.domain.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * @author greg
 * @version 2024/7/8
 **/
@Data
public class UserResponse implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
}
