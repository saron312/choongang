package com.example.mini.userInfo;

import com.example.mini.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
@RequiredArgsConstructor
public class UserInfoController {

    private final UserService userService;

    @PostMapping("/add")
    public String save(@ModelAttribute UserInfo userInfo) {

        userService.save(userInfo);

        return "redirect:/";
    }
}
