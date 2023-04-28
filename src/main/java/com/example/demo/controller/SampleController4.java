package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/*
    스프링부트 객체 전달 - Form과 View를 template폴더 내에서 처리
*/

@Controller
public class SampleController4 {

    @GetMapping("/SampleController4Form")
    public String mainPage(){ // form으로 가기 위해서 작성

        return "/post/SampleController4Form";

    }

    @PostMapping("/SampleController4View")
    public String userForm( // form에서 온 자료를 view로 보내기 위해서 작성
                            UserDTO userDTO,
                            Model model){

        // userDTO 객체를 통해서 출력
        System.out.println(userDTO.getUserId());
        System.out.println(userDTO.getUserName());
        System.out.println(userDTO.getUserPhone());

        // model에 데이터 추가
        model.addAttribute("heading", "User Information");

        return "/post/SampleController4View";

    }

}
