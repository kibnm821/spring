package com.example.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao {
    @Autowired
    private SqlSessionTemplate sqlSession;
    public Object saveObject(String sqlMapid, Object dataMap){
        Object result = sqlSession.selectList(sqlMapid,dataMap);
        return result;
    }
}