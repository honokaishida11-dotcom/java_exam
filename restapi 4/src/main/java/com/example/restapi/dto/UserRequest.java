package com.example.restapi.dto;

import jakarta.validation.constraints.NotBlank;

// Request用DTOクラスの作成
public class UserRequest {

    @NotBlank(message = "名前は必須です。")
    private String name ;

    @NotBlank(message = "メールアドレスは必須です。")
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public UserRequest() {
    }

    public UserRequest(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return "UserRequest [name=" + name + ", email=" + email + "]";
    }

    

    
    
}
