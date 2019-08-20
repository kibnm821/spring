package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class DashBoard{
    @RequestMapping(value = "/DashList")
    public void Action_List(){
    }
    @RequestMapping(value = "/DashEdit")
    public void Action_Edit(){
    }
    @RequestMapping(value = "/DashDel")
    public void Action_Del(){
    }
    @RequestMapping(value = "/DashView")
    public void Action_View(){
    }
}