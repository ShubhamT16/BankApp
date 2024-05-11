package com.bankapplication.bank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankapplication.bank.entity.Account;


public interface BankRepository extends JpaRepository<Account, Long>{


}
