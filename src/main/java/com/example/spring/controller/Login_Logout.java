package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Login_Logout {
    @RequestMapping(value = "/login")
    public void Action_Login(){
    }
    @RequestMapping(value = "/logout")
    public void Action_Logout(){
    }
    @RequestMapping(value = "/Create_Account")
    public void Action_Create_Account(){
    }
}