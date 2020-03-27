package com.example.JpaMapping.service;

import com.example.JpaMapping.AccountRepository;
import com.example.JpaMapping.EmployeeRepository;
import com.example.JpaMapping.entity.Account;
import com.example.JpaMapping.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    EmployeeRepository employeeRepository;

    public Account getAccount(String employeeName) throws Exception {
        Employee employee= employeeRepository.findByEmployeeName(employeeName);
        Integer employeeId= employee.getEmployeeId();
        if(accountRepository.findByEmployeeId(employeeId) == null) {
            throw new Exception ("Not Found");
        }

        return accountRepository.findByEmployeeId(employeeId);
    }

    public Account createAccount(Account account, String employeeName) throws Exception {
        Employee employee = employeeRepository.findByEmployeeName(employeeName);
        account.setEmployee(employee);
       return accountRepository.save(account);
    }
}
