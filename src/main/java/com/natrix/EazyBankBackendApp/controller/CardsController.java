package com.natrix.EazyBankBackendApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/my-cards")
    public String getCards(){
        return "Here are the details of cards from the DB.";
    }
}
