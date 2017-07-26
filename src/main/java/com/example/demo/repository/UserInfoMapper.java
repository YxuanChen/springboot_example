package com.example.demo.repository;

import com.example.demo.entity.UserInfo;

/**
 * Created by cindy on 17-7-26.
 */
public interface UserInfoMapper {

    void createUser(String tel,String pwd);

    UserInfo getUser(Integer id);

    void updateUser(String user_id, String nickName);

    void deleteUserByUserId(Integer id);
}
