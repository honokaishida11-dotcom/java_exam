package com.example.thymeleaf_ishida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.thymeleaf_ishida.domain.Member;
import com.example.thymeleaf_ishida.form.MemberForm;

@Controller
@RequestMapping("/ex01")
public class Ex01Controller {

    @ModelAttribute
	public MemberForm setUpForm() {
		return new MemberForm();
	}

	@RequestMapping("")
	public String index() {
		return "ex-thymeleaf-input";
	}

	@RequestMapping("/input")
	public String input(MemberForm receiveForm, Model model) {
		
		Member member = new Member();
		member.setName(receiveForm.getName());
		member.setAge(receiveForm.getIntAge());
        model.addAttribute("member", member);

		member.setHobbyList(receiveForm.getHobbyList());
		model.addAttribute("hobbyList", receiveForm);
		
		return "ex-thymeleaf-result";
	}

}
