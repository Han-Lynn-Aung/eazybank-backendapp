package com.natrix.EazyBankBackendApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account_transactions")
public class AccountTransactions {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "transaction_date")
    private Date transactionDate;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amount")
    private int transactionAmount;

    @Column(name = "closing_balance")
    private int closingBalance;

    @Column(name = "transaction_create_date")
    private Date transactionCreateDate;
}
