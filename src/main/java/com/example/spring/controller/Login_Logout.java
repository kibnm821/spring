package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Login_Logout {
    @RequestMapping(value = "/login")
    public String Action_Login(){
        return "Login";
    }
    @RequestMapping(value = "/logout")
    public String Action_Logout(){
        return "LogOut";
    }
}