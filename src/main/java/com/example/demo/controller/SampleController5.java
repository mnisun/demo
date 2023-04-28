package com.example.demo.controller;

import com.example.demo.dto.BookDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
    Form과 View그리고 tymeleaf로 뷰페이지 만들기
    BookDTO사용
*/
@Controller
public class SampleController5 {

    @GetMapping("/SampleController5Form")
    public String insertBook(Model model){

        model.addAttribute("bookDTO", new BookDTO());
        return "/post/SampleController5Form";
    }
}
