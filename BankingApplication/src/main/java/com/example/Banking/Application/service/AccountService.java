package com.example.Banking.Application.service;

import com.example.Banking.Application.entity.Account;
import com.example.Banking.Application.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void createAccount(Account account){
        accountRepository.save(account);

    }

    public Account printAccountDetails(Integer accountID){
        return accountRepository.findById(accountID).orElse(null);
    }

    public Integer getBalance(Integer accountID) {
        return accountRepository.findBalanceByAcctID(accountID);
    }

    public void depositAmount(Integer accountID,Integer amount) {
        accountRepository.saveBalanceByAcctID(accountID, amount);
    }

    public void withdrawAmount(Integer accountID,Integer amount) {
        accountRepository.withdrawAmountByAcctID(accountID, amount);
    }

    public void transferAmount(Integer accountID, Integer depositAccountID, Integer amount) {
        accountRepository.withdrawAmountByAcctID(accountID, amount);
        accountRepository.saveBalanceByAcctID(depositAccountID, amount);
    }


}