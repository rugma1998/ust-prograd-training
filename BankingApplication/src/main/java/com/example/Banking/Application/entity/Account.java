package com.example.Banking.Application.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;


@Entity
public class Account {

    @Id
    private Integer accountID;
    private Integer balance;
    private String accountStatus;

    public Account(){

    }

    public Account(Integer accountID,Integer balance,String accountStatus){
        super();
        this.accountID=accountID;
        this.balance=balance;
        this.accountStatus=accountStatus;
    }


    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}