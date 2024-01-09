package com.natrix.EazyBankBackendApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/my-balance")
    public String getBalance(){
        return "Here are the details of balance from the DB.";
    }
}
