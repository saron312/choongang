package com.example.team.mainpage.service;

import com.example.team.mainpage.repository.CommonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
public class CommonService {
    private final CommonMapper commonMapper;
    public void init(){
        commonMapper.init();
    }
}
