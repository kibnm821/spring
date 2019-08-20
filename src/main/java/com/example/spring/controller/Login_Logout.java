package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class Login_Logout {
    @RequestMapping(value = "/login")
    public String Action_Login(){
        return "./account/Login";
    }
    @RequestMapping(value = "/logout")
    public String Action_Logout(){
        return "./account/Logout";
    }
    @RequestMapping(value = "/Create_Account")
    public String Action_Create_Account(){
        return "./account/Create_Account";
    }
    @RequestMapping(value = "/DashBoard")
    public String Action_DashBoard(){
        return "./account/DashBoard";
    }
}