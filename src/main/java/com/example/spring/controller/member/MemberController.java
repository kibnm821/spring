package com.example.spring.controller.member;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.service.member.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController{
    @Autowired
    MemberService MemberService;

    @RequestMapping(value = "/member/input")
    public ModelAndView actionMethod(@RequestParam Map<String,Object> paramMap, ModelAndView modelAndView){
        String viewName = "/member/input";
        Map<String,Object> resultMap = new HashMap<String,Object>();

        resultMap = (Map<String,Object>)MemberService.getObject(paramMap);
        modelAndView.setViewName(viewName);
        modelAndView.addObject("resultMap", resultMap);
        return modelAndView;
    }
}