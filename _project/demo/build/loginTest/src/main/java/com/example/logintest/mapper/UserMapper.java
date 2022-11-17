package com.example.logintest.mapper;

import com.example.logintest.userInfo.UserInfo;

import java.util.List;

public interface UserMapper {
    public void save(UserInfo userInfo);

    public List<UserInfo> selectAll();

    public UserInfo selectOne(UserInfo userInfo);
}
