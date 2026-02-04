package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Form.ReceiveNameController;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

    @ModelAttribute
    public  ReceiveNameController setUpForm(){
        return new ReceiveNameController();
    }
    @RequestMapping("")
    public String name(){
        return "ex03";
    }

    //演習４
    @RequestMapping("/showname")
    public String showname(Exam03Controller receiveNameController){
        System.out.println(receiveNameController.getName());
        return "finished";
    }

    //演習３
    //@RequestMapping("/showname")
    //public String showname(String name){
        //System.out.println(name);
        //return "finished";
    }
