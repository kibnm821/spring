package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/account")
public class CommonCodeController {
    @RequestMapping(value = "/LogIn", method = {RequestMethod.GET, RequestMethod.POST})
    public void LogIn(){}
    @RequestMapping(value = "/LogOut", method = {RequestMethod.GET, RequestMethod.POST})
    public void LogOut(){}
    @RequestMapping(value = "/DashBoard", method = {RequestMethod.GET, RequestMethod.POST})
    public void DashBoard(){}
    @RequestMapping(value = "/Create_Account", method = {RequestMethod.GET, RequestMethod.POST})
    public void Create_Account(){}
}