package com.example.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.spring.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web .servlet.ModelAndView;

@Controller
public class StudentController{
    @Autowired
    private StudentService service;
    @RequestMapping(value = "/student/{action}")
    public ModelAndView actionMethod(@RequestParam Map<String,Object> paramMap,@PathVariable String action,ModelAndView modelAndView){
        String viewName = "/student/";
        List<Object> resultList = new ArrayList<Object>();
        if("lisk".equals(action)){
            viewName = viewName + action;
            resultList = (List<Object>)service.getObject(paramMap);
        }
        modelAndView.setViewName(viewName);
        modelAndView.addObject("resultList", resultList);
        return modelAndView;
    }
}