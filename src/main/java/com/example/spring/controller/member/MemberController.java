package com.example.spring.controller.member;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.service.member.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController{
    @RequestMapping(value = "/member/input", method = RequestMethod.GET)
    public void action(){
    }

    @Autowired
    MemberService MemberService;
    @RequestMapping(value = "/{action}", method = RequestMethod.GET)
    public ModelAndView actionMethod(@RequestParam Map<String,Object> paramMap, ModelAndView ModelAndView){
        String viewName = "/member/";
        Map<String,Object> resultMap = new HashMap<String,Object>();

        if("read".equals(action)){
            viewName = viewName + action;
            resultMap = (Map<String,Object>) MemberService.getObject(paramMap);
        }
        ModelAndView.setViewName(viewName);
        ModelAndView.addObject("resultMap", resultMap);
        return ModelAndView;
    }
}