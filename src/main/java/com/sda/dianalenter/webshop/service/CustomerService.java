package com.sda.dianalenter.webshop.service;

import com.sda.dianalenter.webshop.model.Account;
import com.sda.dianalenter.webshop.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final AccountRepository accountRepository;

    //injected by spring by constructor
    public CustomerService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    public void addCustomer(Account account){
        accountRepository.save(account );
    }
    public Iterable<Account> getCustomerAccounts(){
        return accountRepository.findAll();
    }
}
