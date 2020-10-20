package com.lea.bean;

import org.springframework.stereotype.Component;

/**
 * @author lzc
 * @create 2020-10-20 16:35
 */
@Component
public class User {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
