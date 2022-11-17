package com.example.logintest.service;

import com.example.logintest.repository.UserRepository;
import com.example.logintest.userInfo.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {
    private final UserRepository userRepository;

    /**
     * @return null 로그인 실패
     */
    public UserInfo login(String loginId, String password) {
        return userRepository.findByLoginId(loginId)
                .filter(m -> m.getPassword().equals(password))
                .orElse(null);
    }
}
