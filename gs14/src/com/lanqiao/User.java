package com.lanqiao;

/**
 * 用户对象模型
 */
public class User {
    private String userId;//用户id
    private String name;//用户名
    private String password;//密码

    public User(String userId, String password, String name) {
        this.userId = userId;
        this.name = name;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
