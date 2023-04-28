package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
* 스프링부트 객체 전달 (userDTO 객체 사용)
*/
@Controller
public class SampleController3 {

    /*
    @PostMapping("/SampleController3")
    public String userForm(@RequestParam String userName, // @RequestParam 생략
                           @RequestParam String userId,
                           @RequestParam String userPhone){


        System.out.println(userName);
        System.out.println(userId);
        System.out.println(userPhone);

        return "post/SampleController3View";

    }
*/

    @PostMapping("/SampleController3")
    public String userForm(UserDTO userDTO,
                           Model model){

        //userDTO 객체를 통해 출력
        System.out.println(userDTO.getUserName());
        System.out.println(userDTO.getUserId());
        System.out.println(userDTO.getUserPhone());


        return "/post/SampleController3View";


    }

}
