package com.example.spring.service;

import java.util.HashMap;
import java.util.Map;

import com.example.spring.respository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{
    @Autowired
    private StudentRepository respository;
    public Object getObject(Object paramMap){
        Object resultObject = respository.findAll();
        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap = (Map)respository.getOne((Long)paramMap.get("id"));
        return resultObject;
    }
}