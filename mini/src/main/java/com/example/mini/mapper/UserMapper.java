package com.example.mini.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.mini.userInfo.UserInfo;

import java.util.List;

@Mapper
public interface UserMapper {

    public void save(UserInfo userInfo);

    public List<UserInfo> selectAll();
}
