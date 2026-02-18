package com.example.thymeleaf_ishida.form;

import java.util.ArrayList;
import java.util.List;

public class MemberForm {

   
	private String name;
	
	private String age;

    List<String> hobbyList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIntAge1() {
		return Integer.parseInt(age);
	}

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public Integer getIntAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIntAge'");
    }

   

   


    
    

	
}
