package com.example.ex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class Ex2Application {

    public static void main(String[] args) {
        SpringApplication.run(Ex2Application.class, args);
    }

}
