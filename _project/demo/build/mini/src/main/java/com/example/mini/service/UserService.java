package com.example.mini.service;

import com.example.mini.mapper.UserMapper;
import com.example.mini.userInfo.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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

}
