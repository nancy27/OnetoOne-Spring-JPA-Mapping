package com.example.JpaMapping.controller;

import com.example.JpaMapping.entity.Account;
import com.example.JpaMapping.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("/employee/{employeeName}/account")
    public Account getAccount(@PathVariable String employeeName) throws Exception {
        return accountService.getAccount(employeeName);
    }

    @RequestMapping(method = RequestMethod.POST,value="/employee/{employeeName}/account")
    public Account createAccount(@RequestBody Account account, @PathVariable String employeeName) throws Exception {
        return accountService.createAccount(account,employeeName);
    }
}
