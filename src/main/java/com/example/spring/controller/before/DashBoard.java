package com.example.spring.controller.before;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class DashBoard{
    @RequestMapping(value = "/DashList")
    public String Action_List(){
        return "./account/DashBoard/List";
    }
    @RequestMapping(value = "/DashEdit")
    public String Action_Edit(){
        return "./account/DashBoard/Edit";
    }
    @RequestMapping(value = "/DashDel")
    public String Action_Del(){
        return "./account/DashBoard/Delete";
    }
    @RequestMapping(value = "/DashView")
    public String Action_View(){
        return "./account/DashBoard/View";
    }
}