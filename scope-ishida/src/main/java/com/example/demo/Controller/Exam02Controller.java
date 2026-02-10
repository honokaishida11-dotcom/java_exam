package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/ex02")
public class Exam02Controller {

   @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index(){
        return "exam02";
    }

    @RequestMapping("/calc")
    public String calc(String name){
        session.setAttribute("num1",name);
        session.setAttribute("num2",name);
        return "exam02-result";
    }

    @RequestMapping("/to-resultpage")
    public String toRsult(String name){
        session.setAttribute("num1",name);
        session.setAttribute("num2",name);
        return "exam02-result2";
    }

     @RequestMapping("/to-next")
    public String toNext(){
        return "exam02-result2";
    }



}
