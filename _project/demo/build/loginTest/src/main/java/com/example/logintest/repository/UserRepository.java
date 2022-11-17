package com.example.logintest.repository;

import com.example.logintest.userInfo.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;

@Slf4j
@Repository
public class UserRepository {
    private static Map<Long, UserInfo> store = new HashMap<>();   // static 사용
    private static long sequence = 0L;  // static 사용

    public UserInfo findById(Long id) {
        return store.get(id);
    }

    public Optional<UserInfo> findByLoginId(String loginId) {
        return findAll().stream()
                .filter(m -> m.getUserId().equals(userId))
                .findFirst();
    }

    public List<UserInfo> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
