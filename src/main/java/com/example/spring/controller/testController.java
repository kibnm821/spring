package com.example.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController{
    @RequestMapping(value = "/test")
    public ModelAndView edit(ModelAndView modelAndView){
        String viewName = "/test";
        List<Object> resultList = new ArrayList<Object>();
        Map<String,Object> data01 = new HashMap<String,Object>();
        data01.put("NAME1","name01");
        data01.put("NAME2","name02");
        data01.put("NAME3","name03");
        resultList.add(data01);
        
        modelAndView.setViewName(viewName);
        modelAndView.addObject("resultList", resultList);
        return modelAndView;
    }
}