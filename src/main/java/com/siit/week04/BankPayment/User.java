package com.siit.week04.BankPayment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private String cnp;
    private String name;
    private String email;
    private String password;

    public List<Card> cards;
    public List<BankAccount> bankAccounts;

    //methods
    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void addBankAccount(BankAccount bankAccount) {
        this.bankAccounts.add(bankAccount);
    }
}

