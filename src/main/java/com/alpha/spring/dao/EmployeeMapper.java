package com.alpha.spring.dao;

import com.alpha.spring.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;
//the controller 

@Repository
public class EmployeeMapper
{
    public List getAllEmployees()
    {
        SqlSession session = MyBatisUtil.getSqlSessionFactory();
        List employeeList =session.selectList("getAllEmployees");
        session.commit();
        session.close();
        return employeeList;
    }
}
