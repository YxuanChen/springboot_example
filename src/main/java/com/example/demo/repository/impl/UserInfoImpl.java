package com.example.demo.repository.impl;

import com.example.demo.entity.UserInfo;
import com.example.demo.repository.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by cindy on 17-7-26.
 */

@Repository
public class UserInfoImpl implements UserInfoMapper{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(String tel,String pwd) {
        jdbcTemplate.update("INSERT INTO example.tp_user(tel,password,nickname,secret) VALUES (?,md5(?),?,'')",tel,pwd,tel);
    }

    @Override
    public UserInfo getUser(Integer id) {
        List<UserInfo> userList = jdbcTemplate.query("select tel,nickname,password FROM example.tp_user WHERE user_id = ?",new Object[]{id},new BeanPropertyRowMapper(UserInfo.class));
        if(userList != null && userList.size() > 0){
            UserInfo user = userList.get(0);
            return user;
        }else {
            return null;
        }
    }

    @Override
    public void updateUser(String user_id, String nickName) {
        jdbcTemplate.update("UPDATE example.tp_user SET nickname = ? WHERE user_id = ?",nickName,user_id);
    }

    @Override
    public void deleteUserByUserId(Integer id) {
        jdbcTemplate.update("DELETE FROM example.tp_user WHERE user_id = ?",id);
    }
}
