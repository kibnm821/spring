package com.example.spring.controller.Organization;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrganizationController{
    @RequestMapping(value = "member/insert", method = RequestMethod.GET)
    public void asd(){
    }

    @RequestMapping(value = "/member/read", method = RequestMethod.GET)
    public ModelAndView read(@RequestParam Map<String,Object> paramMap,ModelAndView modelAndView){
        String viewName = "/member/read";
        modelAndView.setViewName(viewName);
        modelAndView.addObject("paramMap", paramMap);
        return modelAndView;
    }
}