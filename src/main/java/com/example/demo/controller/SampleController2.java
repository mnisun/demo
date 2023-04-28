package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController2 {

    @PostMapping("post")
    public String TestPost(@RequestParam String membername, // String 뒤에 값은 post.html의 name과 맞춰줘야한다.
                                         String memberid, // 이거도 위와 마찬가지
                                         Model model){ // @RequestBody로 받아서 req가 값을 가지고 있다.
        model.addAttribute("membername", membername);
        model.addAttribute("memberid", memberid);

        /*
        *   @RequestBody는 전달된 데이터를 일관로 묶어서 출력.
        *   만약 Post 방식으로 전달한 폼(Form)데이터 폼에 대해서 개별적으로 받고자 한다면?
        *
        *   Get방식 --> @GetMapping   : @RequestParam
        *   Post방식 --> @PostMapping : @ReqeustBody(얘는 통채로), @RequestParam(개별로 받기 가능)
        */

        System.out.println("성공!!");
        System.out.println(membername);
        System.out.println(memberid);

        return "/post/post";

        /*
        *   현재 위 상태만으로는 뷰페이지쪽에서는 전달된 값이 아무것도 출력되지 않음
        *   이유는 Model model을 통해서 뷰페이지로 전달
        */
    }

    @PostMapping("self")
    public String self(@RequestParam String test,
                                     String test2,
                                     Model model){

        model.addAttribute("test", test);
        model.addAttribute("test2", test2);

        return "/post/post";
    }

}
