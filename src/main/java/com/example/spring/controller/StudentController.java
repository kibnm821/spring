package com.example.spring.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.respository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController{
    @Autowired
    private StudentRepository repository;
    @RequestMapping(value = "/student/lisk")
    public ModelAndView actionMethod(ModelAndView modelAndView){
        String viewName = "/student/lisk";
        List<Object> resultList = new ArrayList<Object>();
        resultList = (List)repository.findAll();
        modelAndView.setViewName(viewName);
        modelAndView.addObject("resultList", resultList);
        return modelAndView;
    }
}