package com.natrix.EazyBankBackendApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "loan_number")
    private Integer loanNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name="loan_start_date")
    private Date loanStartDate;

    @Column(name = "loan_type")
    private String loanType;


    @Column(name = "total_loan")
    private int totalLoan;

    @Column(name = "amount_paid")
    private int amountPaid;


    @Column(name = "outstanding_amount")
    private int outstandingAmount;

    @Column(name = "loan_create_date")
    private Date loanCreateDate;
}
