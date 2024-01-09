package com.natrix.EazyBankBackendApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/my-account")
    public String getAccount(){
        return "Here are the details of account from the DB.";
    }
}
