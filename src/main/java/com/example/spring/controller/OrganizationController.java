package com.example.spring.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/read", method = RequestMethod.GET)
public class OrganizationController{
    public ModelAndView read(@RequestParam Map<String,Object> paramMap,ModelAndView modelAndView){
        String viewName = "/organization/read";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("paramMap", paramMap);
        return modelAndView;
    }
}