package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/members")
public class MemberController {
	@Autowired
	private MemberRepository memberepository;

	
	@GetMapping("") 
    public String index() {

        // 問題５　全件取得（年齢順）　
        List<Member> list = memberepository.findAll();
        System.out.println("手順1findAll");
        list.forEach(System.out::println);

        // 問題５　ジロー（id=２を取得）
        System.out.println("手順2ジローを呼び出す");
        Member loaded = memberepository.load(2);
        System.out.println(loaded);

        // 登録　問題６　
        System.out.println("私の情報を追加");
        Member newMember = new Member();
        newMember.setName("いしだほのか");
        newMember.setAge(27);
        newMember.setDepId(1);
        memberepository.save(newMember);

        
        return "member";

        

	 
}
}
