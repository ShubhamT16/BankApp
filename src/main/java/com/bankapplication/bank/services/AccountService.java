package com.bankapplication.bank.services;
import java.util.List;

import com.bankapplication.bank.entity.Account;


public interface AccountService {

    public Account createAccount(Account account);
    public List<Account> getAll();
    public Account getAccountbyId(Long id);
    public Account depositAmount(Account account, Long amount);
    public Account withdrawAmount(Account account, Long amount);


}
