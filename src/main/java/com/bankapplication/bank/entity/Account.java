package com.bankapplication.bank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column
    private long accountId;

    @Column
    private String accountName;

    @Column
    private  long balance;

    @Override
    public String toString() {
        return "Account [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance + "]";
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public long getBalance() {
        return balance;
    }

    public Account() {
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

  

    public Account(long accountId, String accountName, long balance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = balance;
    }




    
}
