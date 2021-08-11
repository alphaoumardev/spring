package com.alpha.spring.controller;

import com.alpha.spring.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Employee
{
    @Autowired
   EmployeeMapper employeeMapper;

//    public Employee(EmployeeMapper employeeMapper)
//    {
//        this.employeeMapper = employeeMapper;
//    }

    @RequestMapping("/home")
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("list",employeeMapper.getAllEmployees());
        return modelAndView;
    }
}
