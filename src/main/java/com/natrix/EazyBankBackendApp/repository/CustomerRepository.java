package com.natrix.EazyBankBackendApp.repository;

import com.natrix.EazyBankBackendApp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    List<Customer> findByEmail(String email);
}
