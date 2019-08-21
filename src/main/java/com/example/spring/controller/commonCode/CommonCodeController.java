package com.example.spring.controller.commonCode;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode/")
public class CommonCodeController{
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    public void action(){
    }

    @RequestMapping(value = "/{action}", method = RequestMethod.GET)
    public ModelAndView edit(@RequestParam Map<String,Object> paramMap,@PathVariable String action, ModelAndView modelAndView){
        String viewName = "/commonCode/";
        Map<String,Object> resultMap = new HashMap<String,Object>();
        List<Object> resultList = new ArrayList<Object>();

        if("show".equals(action)){
            viewName = viewName + action;
            resultMap = paramMap;
            modelAndView.setViewName(viewName);
            modelAndView.addObject("resultMap", resultMap);
        }else if("list".equals(action)){
            viewName = viewName + action;
            Map<String,Object> data01 = new HashMap<String,Object>();
            Map<String,Object> data02 = new HashMap<String,Object>();
            Map<String,Object> data03 = new HashMap<String,Object>();
            data01.put("NAME","name01");
            data01.put("COMMON_CODE_ID","490293232849");
            data01.put("DESCRIPTION","description 01");

            data02.put("NAME","name01");
            data02.put("COMMON_CODE_ID","490293232849");
            data02.put("DESCRIPTION","description 01");

            data03.put("NAME","name01");
            data03.put("COMMON_CODE_ID","490293232849");
            data03.put("DESCRIPTION","description 01");

            resultList.add(data01);
            resultList.add(data02);
            resultList.add(data03);

            modelAndView.setViewName(viewName);
            modelAndView.addObject("resultList", resultList);
        }
        return modelAndView;
    }
}