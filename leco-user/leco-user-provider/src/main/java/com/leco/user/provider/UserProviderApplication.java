package com.leco.user.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author greg
 * @version 2024/7/8
 **/
@SpringBootApplication(scanBasePackages = {"com.leco"})
@EnableDubbo
@MapperScan("com.leco.**.dao")
public class UserProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication.class);
    }
}
