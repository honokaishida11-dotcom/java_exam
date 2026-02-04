package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @RequestMapping("/show-company-introduction")
    public String shoeCompany(){
        return "redirect:/exam02/company";
    }

    @RequestMapping("/company")
    public String company(){
        return "exam-02";
    }

}
