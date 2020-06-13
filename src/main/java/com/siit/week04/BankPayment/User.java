package com.siit.week04.BankPayment;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {
    private String cnp;
    private String name;
    private String email;
    private String password;

    private List<Card> cards = new ArrayList<>();
    private List<BankAccount> bankAccounts = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public void addBankAccount(BankAccount account) {
        bankAccounts.add(account);
    }
}

