package com.example.spring.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrganizationDao {
    @Autowired
    private SqlSessionTemplate sqlSession;
    public Object getList(String sqlMapid, Object dataMap){
        Object result = sqlSession.selectList(sqlMapid,dataMap);
        return result;
    }
    public Object insertList(Object dataMap){
        Object result = sqlSession.selectList("organization.insert",dataMap);
        return result;
    }
}