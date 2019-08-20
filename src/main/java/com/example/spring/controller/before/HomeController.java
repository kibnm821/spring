package com.example.spring.controller.before;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class HomeController{
    @RequestMapping(value = "/home")
    public String action(){
        return "home";
    }
}