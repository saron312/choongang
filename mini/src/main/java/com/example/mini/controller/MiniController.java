package com.example.mini.controller;

import com.example.mini.service.UserService;
import com.example.mini.userInfo.UserInfo;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class MiniController {

    private final UserService userService;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add")
    public String addForm() {
        return "addMemberForm";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute UserInfo user) {

        userService.save(user);

        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginForm() {

        return "loginForm";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UserInfo user) {
        if (loginCheck(user.getUserId(), user.getPassword())) {
            return "redirect:/";
        }
        return "redirect:/login";
    }

    private boolean loginCheck(String userId, String password) {
        //DB에서 회원 데이터 모두 조회
        List<UserInfo> users = userService.selectAll();

        //회원 데이터를 저장할 Map<아이디, 비밀번호>
        Map<String, String> usersMap = new HashMap<>();

        //조회한 회원 데이터를 Map에 넣음
        users.stream().forEach(userInfo -> usersMap.put(userInfo.getUserId(), userInfo.getPassword()));

        //검증
        if (!usersMap.containsKey(userId)) {
            return false;
        } else {
            if (usersMap.get(userId).equals(password)) {
                return true;
            }
        }

        return false;
    }
}
