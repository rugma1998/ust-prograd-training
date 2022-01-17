package com.example.Banking.Application.repository;


import com.example.Banking.Application.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface AccountRepository extends JpaRepository<Account,Integer> {

    @Query("select balance from Account where accountID = ?1")
    public Integer findBalanceByAcctID(Integer accountID);


    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Account set balance = balance+?2 where accountID=?1")
    public void saveBalanceByAcctID(Integer accountID,Integer amount);

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Account set balance = balance-?2 where accountID=?1")
    public void withdrawAmountByAcctID(Integer accountID,Integer amount);
}
