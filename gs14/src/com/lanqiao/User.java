package com.lanqiao;

/**
 * �û�����ģ��
 */
public class User {
    private String userId;//�û�id
    private String name;//�û���
    private String password;//����

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
