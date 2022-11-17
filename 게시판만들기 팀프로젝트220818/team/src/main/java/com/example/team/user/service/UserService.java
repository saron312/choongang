package com.example.team.user.service;

import com.example.team.user.entity.UserInfoEntity;
import com.example.team.user.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

     // 최초 table 생성 및 기초 data 입력


    public void save(UserInfoEntity user) {
        userMapper.save(user);
    } // 회원 가입 용

    public List<UserInfoEntity> selectAll() {
        return userMapper.selectAll();
    } // 전체 UserInfo 조회


}
