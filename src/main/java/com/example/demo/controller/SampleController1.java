package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController1 {
    @GetMapping("/user/userinfo")
    public String userInfo(){

        return "/user/userinfo";
    }

    @GetMapping("/user/userdata")
    public String userData(Model model){
        model.addAttribute("username", "홍길동");
        // 뷰페이지단으로 같이 데이터(model) 전달
        return "/user/userinfo";
    }
    @GetMapping("/user/userid")
    public String userId(@RequestParam(value = "userid", required=false) String userid, Model model){

        /*
            require=true옵션은 디폴트가 true이고, 써놓지 않으면 디폴트 값으로 true가 적용된다.
            이러한 경우에는 반드시 주소창에 userid 파라미터 값을 넣어서 Http 요청을 넣어야 한다. 안그러면 페이지 에러가 발생함
            http://localhost:8080/user/userid?userid=koreamonster

            만약, false로 지정을 하면 파라미터 값을 넣지 않고 요청을 해도 페이지 에러가 발생하지 않는다.
            true가 기본값. 보통 @RequestParam("userid")
         */

        model.addAttribute("userid", userid);

        return "/user/userinfo";
    }

    @GetMapping("/user/userparams")
    public String userParams(@RequestParam(value="userid") String uid,
                             @RequestParam(value="username") String uname,
                             Model model){

        model.addAttribute("userid", uid);
        model.addAttribute("username", uname);

        return "user/userinfo";
    }
}