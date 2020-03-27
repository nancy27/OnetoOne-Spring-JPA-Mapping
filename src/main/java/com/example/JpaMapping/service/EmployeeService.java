package com.example.JpaMapping.service;

import com.example.JpaMapping.EmployeeRepository;
import com.example.JpaMapping.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;

    public Employee getEmployee(Integer employeeId) {
       return  employeeRepository.findByEmployeeId(employeeId);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}

