package com.bankapplication.bank.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bankapplication.bank.entity.Account;
import com.bankapplication.bank.services.AccountService;

@RestController
public class MyController {

@Autowired
AccountService service;

@PostMapping("/create")
public Account createAccount(@RequestBody Account account){

    service.createAccount(account);

    Account account2 = service.createAccount(account);

return account2;

}

@GetMapping("/getall")
public List<Account> getallAccounts()
{

    List<Account> all = service.getAll();
    return all;
}


}
