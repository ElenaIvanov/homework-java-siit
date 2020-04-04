package com.siit.week05.ATMMachine;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@Setter
@ToString

public class Card {
    private String ownerName;
    private BankAccount bankAccount;
    private String cardNumber;
    private String expirationDate;
    private int pin;


//
//    public void interogateBalance(){
//        System.out.println("Your current balance is: " + bankAccount.getBalance());
//    }
//
//    public void depositMoney(BigDecimal amountToDeposit){
//        System.out.println("Amount to deposit is " + amountToDeposit);
//        bankAccount.setBalance(bankAccount.getBalance());
//    }
//
//    public void withdrawMoney(BigDecimal amountToWithdraw){
//        bankAccount.getBalance().subtract(amountToWithdraw);
//        if()){
//            System.out.println("Please try again. No sufficient funds found in you account.");
//        } else {
//            System.out.println("Succesfully withdraw the amount of " + amountToWithdraw);
//            bankAccount.setBalance(bankAccount.getBalance() - amountToWithdraw);
//        }
//    }
//
//
}