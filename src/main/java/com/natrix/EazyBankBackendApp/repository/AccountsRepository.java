package com.natrix.EazyBankBackendApp.repository;

import com.natrix.EazyBankBackendApp.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Integer> {
    Accounts findByCustomerId(int customerId);
}
