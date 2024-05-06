package com.lanqiao;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户服务
 */
public class UserService {
    /**
     * 模拟用户表
     * 存放已注册的用户
     */
    private Map<String, User> users = new HashMap<>();
    /**
     * 当前登录用户
     */
    private String currentUser = null;

    public UserService() {
        //创建两个已经注册用户
        users.put("user1", new User("user1", "password1", "zhangsan"));
        users.put("user2", new User("user2", "password2", "lisi"));
    }

    /**
     * 用户登录方法
     * @param userId 用户id
     * @param password 密码
     * @return 是否登录成功
     */
    public boolean login(String userId, String password) {
        if(users.containsKey(userId)) {//查询用户表里是否存在此userId
            String pw = users.get(userId).getPassword();
            if (pw.equals(password)) {//验证密码是否正确
                currentUser = userId;
                return true;
            }
        }
        return false;
    }

    /**
     * 修改用户密码
     * @param userId 用户id
     * @param newPassword 密码
     * @return
     */
    public User updatePassword(String userId, String newPassword) {
        User user = null; 
        if (userId != null && newPassword != null) {
            if (userId.equals(currentUser)){
                user = users.get(userId);
                user.setPassword(newPassword);
            }
        }else {
            throw new IllegalArgumentException("参数错误");
        }
        return user;
    }
}