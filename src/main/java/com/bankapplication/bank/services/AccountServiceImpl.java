package com.bankapplication.bank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapplication.bank.entity.Account;
import com.bankapplication.bank.repo.BankRepository;

@Service
public class AccountServiceImpl implements AccountService{

   @Autowired
   BankRepository repo;

    @Override
    public Account createAccount(Account account) {

        Account savedAccount = repo.save(account);
        
        return savedAccount;
    }

    @Override
    public Account depositAmount(Account account, Long amount) {
       
        return null;
    }

    @Override
    public Account getAccountbyId(Long id) {
       
        return null;
    }

    @Override
    public List<Account> getAll() {
    
        List<Account> all = repo.findAll();
        return all;
    }

    @Override
    public Account withdrawAmount(Account account, Long amount) {
        
        return null;
    }



}
