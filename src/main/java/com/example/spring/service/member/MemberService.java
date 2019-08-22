package com.example.spring.service.member;

import com.example.spring.dao.ShareDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService{
    @Autowired
    private ShareDao dao;
    public Object getObject(Object dataMap){
        Object resultObject = dao.getObject(dataMap);
        return resultObject;
    }
}