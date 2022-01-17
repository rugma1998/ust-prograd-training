package com.example.Banking.Application.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Integer accountID;
    @Column(nullable = false, unique = true)
    private String customerName;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String password;

    public Customer(){

    }

    public Customer(Integer accountID,String customerName,String phoneNumber,String password){
        super();
        this.accountID=accountID;
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;
        this.password=password;
    }


    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}