package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Form.Ex01receiveform;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {

    @ModelAttribute
    public Ex01receiveform setUpForm(){
        return new Ex01receiveform();
    }

    @RequestMapping("")
    public String index(){
        return "exam01";
    }

    @RequestMapping("/login")
    public String login(Ex01receiveform form,Model model){
        if("yamada@sample.com".equals(form.getEmail()) && "yamayama".equals(form.getPass())){
            model.addAttribute("result","成功");
        }else{
             model.addAttribute("result","失敗");
        }
        return "ex01result";
    }

}
