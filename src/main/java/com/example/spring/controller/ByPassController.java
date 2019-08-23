package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class ByPassController{
    @RequestMapping(value = {"/thymeleafmerge/thymeleafBase"})
    public void byPass(){
    }
}