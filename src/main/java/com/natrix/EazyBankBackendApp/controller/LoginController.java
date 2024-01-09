package com.natrix.EazyBankBackendApp.controller;

import com.natrix.EazyBankBackendApp.model.Customer;
import com.natrix.EazyBankBackendApp.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Customer customer) {
        try {
            String hashPassword = passwordEncoder.encode(customer.getCustomerPassword());
            customer.setCustomerPassword(hashPassword);
            Customer savedCustomer = customerRepository.save(customer);
            if (savedCustomer.getId() > 0) {
                return ResponseEntity.status(HttpStatus.CREATED).body("Given user details are successfully registered.");
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Given user details are invalid.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An exception occurred due to " + e.getMessage());
        }
    }

}
