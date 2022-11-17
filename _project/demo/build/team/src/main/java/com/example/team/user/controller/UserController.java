package com.example.team.user.controller;

import javax.annotation.PostConstruct;


import com.example.team.user.entity.UserInfoEntity;
import com.example.team.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/add")
    public String addForm() {
        return "addMemberForm";
    }
//
    @PostMapping("/add")
    public String add(@ModelAttribute UserInfoEntity user) {

        userService.save(user);

        return "redirect:/home";
    }
//
    @GetMapping("/login")
    public String loginForm() {

        return "loginForm";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UserInfoEntity user) {
        if (loginCheck(user.getUserId(), user.getPassword())) {
            return "redirect:/";
        }
        return "redirect:/user/login";
    }

    private boolean loginCheck(String userId, String password) {
        //DB에서 회원 데이터 모두 조회
        List<UserInfoEntity> users = userService.selectAll();

        //회원 데이터를 저장할 Map<아이디, 비밀번호>
        Map<String, String> usersMap = new HashMap<>();

        //조회한 회원 데이터를 Map에 넣음
        users.stream().forEach(userInfoEntity -> usersMap.put(userInfoEntity.getUserId(), userInfoEntity.getPassword()));

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

//    @RequestMapping("/list")
//    public String userlistPage(@RequestParam("page") int page, Model model) {
//    	System.out.println(dao.selectCount());
//    	int totalCount = dao.selectCount();
//        model.addAttribute("list", dao.listDao(page, totalCount));
//        model.addAttribute("totalCount", totalCount);
//        return "list";
//    }
//
//    @RequestMapping("/view")
//    public String view(HttpServletRequest request, Model model) {
//        String sId = request.getParameter("id");
//        model.addAttribute("dto", dao.viewDao(sId));
//        return "view";
//    }
//
//    @RequestMapping("/writeForm")
//    public String writeForm() {
//
//        return "writeForm";
//    }
//
//    @RequestMapping("/write")
//    public String write(Model model, HttpServletRequest request) {
//        dao.writeDao(request.getParameter("writer"),
//                     request.getParameter("title"),
//                     request.getParameter("content"));
//        return "redirect:list?page=1";
//    }
//
//    @RequestMapping("/delete")
//    public String delete(HttpServletRequest request, Model model) {
//        dao.deleteDao(request.getParameter("id"));
//        return "redirect:list?page=1";
//    }

}
