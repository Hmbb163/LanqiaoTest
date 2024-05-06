package com.lanqiao;

import java.util.HashMap;
import java.util.Map;

/**
 * �û�����
 */
public class UserService {
    /**
     * ģ���û���
     * �����ע����û�
     */
    private Map<String, User> users = new HashMap<>();
    /**
     * ��ǰ��¼�û�
     */
    private String currentUser = null;

    public UserService() {
        //���������Ѿ�ע���û�
        users.put("user1", new User("user1", "password1", "zhangsan"));
        users.put("user2", new User("user2", "password2", "lisi"));
    }

    /**
     * �û���¼����
     * @param userId �û�id
     * @param password ����
     * @return �Ƿ��¼�ɹ�
     */
    public boolean login(String userId, String password) {
        if(users.containsKey(userId)) {//��ѯ�û������Ƿ���ڴ�userId
            String pw = users.get(userId).getPassword();
            if (pw.equals(password)) {//��֤�����Ƿ���ȷ
                currentUser = userId;
                return true;
            }
        }
        return false;
    }

    /**
     * �޸��û�����
     * @param userId �û�id
     * @param newPassword ����
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
            throw new IllegalArgumentException("��������");
        }
        return user;
    }
}