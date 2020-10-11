package com.xin.bean;

import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-16 10:22
 */
public class Userconfiguration {
    @Bean
    public User getUser() {
        User user = new User();
        user.setUsername("xiaoxin");
        user.setAge(21);
        return user;
    }
}
