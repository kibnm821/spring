package com.example.spring.controller.before;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController{
    @RequestMapping(value = "/member/list")
    public void memberAction(){
    }
}