package com.siit.week04.BankPayment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.*;

@Getter
@Setter
@ToString
public class BankAccount extends User {
    public String iban;
    public BigDecimal balance;
    public List<Card> attachedCardNumbers;

    public BankAccount(String cnp, String name, String email, String password, List<Card> cards, List<BankAccount> bankAccounts) {
        super(cnp, name, email, password, cards, bankAccounts);
    }

    //constructors


    BigDecimal a = new BigDecimal(String.valueOf(balance));

    //methods
    public void depositAmount(BigDecimal amount) throws Exception {

        if (a.compareTo(amount) <= 0) {
            throw new Exception("Please add a positive amount multiple of 10!");
        }

        this.balance = this.balance.add(a);
    }

    public void withdrawMoney(BigDecimal amount) throws Exception {
        if (a.compareTo(amount) <= 0) {
            throw new Exception("Please withdraw a positive amount multiple of 10!");
        }

//        if(a.compareTo(amount) < amount){
//            throw new Exception("Insuficient funds!");
//        }

        this.balance = this.balance.subtract(amount);
    }


}
