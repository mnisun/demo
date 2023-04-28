package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @GetMapping("/home")
    public String homeMethod(){

        return "home";

    }

    @GetMapping("/member/add")
    public String memberMethod(){

        return "member/add";
    }
}
