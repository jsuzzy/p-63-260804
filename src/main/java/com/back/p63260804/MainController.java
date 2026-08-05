package com.back.p63260804;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //스프링이 웹브라우저 환경에서 접근할 수 있도록 추가구현해줌(웹에 특화되게) , 브라우저를 통해 해당 클래스의 함수를 호출할 수 있다
public class MainController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        System.out.println("index() 메서드 호출됨!");
        return "index() 메서드 호출됨!";
    } 


    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
            System.out.println("hello() 메서드 호출됨!"); //서버 콘솔

        return "hello() 메서드 호출됨!";
        }



}
