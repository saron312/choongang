package com.example.logintest.service;

import com.example.logintest.mapper.UserMapper;
import com.example.logintest.userInfo.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public void save(UserInfo user) {
        userMapper.save(user);
    }

    public List<UserInfo> selectAll() {
        List<UserInfo> users = userMapper.selectAll();
        return users;
    }

    public

}