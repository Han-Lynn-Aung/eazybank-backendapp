package com.natrix.EazyBankBackendApp.repository;

import com.natrix.EazyBankBackendApp.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends JpaRepository<Loans,Integer> {

    List<Loans> findByCustomerIdOrderByLoanStartDateDesc(int customerId);

}
