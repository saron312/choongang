package com.example.team.mainpage.contorller;

import com.example.team.mainpage.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class CommonController {
    private final CommonService commonService;

    @PostConstruct // do method when starting App
    public void init(){
        commonService.init();
    }

    @RequestMapping(value = {"/", "/index","/home","/main","/index.html","main.html" })
    public String home() {
        return "home";
    }

}
