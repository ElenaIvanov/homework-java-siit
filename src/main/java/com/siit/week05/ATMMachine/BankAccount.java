package com.siit.week05.ATMMachine;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankAccount {
    private String iban;
    private double balance;

    public BankAccount(String iban, double balance) {
        this.iban = iban;
        this.balance = balance;
    }

}
