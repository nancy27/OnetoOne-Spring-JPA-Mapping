package com.example.JpaMapping.controller;

import com.example.JpaMapping.entity.Employee;
import com.example.JpaMapping.service.EmployeeService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
       return employeeService.getEmployee(employeeId);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/employee")
    public Employee CreateEmployee(@RequestBody Employee employee){
       return employeeService.createEmployee(employee);
    }


}
