package com.siit.week05.ATMMachine;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class User {
    public final static List<Card> cards = new ArrayList<>();
    public final static List<BankAccount> bankAccounts = new ArrayList<>();

    BankAccount firstAccount = new BankAccount("RO2344444444");
    Card card1 = new Card();
    Card card2 = new Card();
    Card card3 = new Card();

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);

        firstAccount.attachCard(card1);
        firstAccount.attachCard(card2);
        firstAccount.attachCard(card3);
        bankAccounts.add(firstAccount);

    BankAccount secondAccount = new BankAccount("RO9944444444");
    Card card11 = new Card(772233442, 1133344455567L, "john Doe Mother", 2233);
    Card card22 = new Card(662733442, 5533344455567L, "john Doe Father", 2233);
    Card card33 = new Card(882233442, 9933344455567L, "john Doe Dog", 2233);

        cards.add(card11);
        cards.add(card22);
        cards.add(card33);

        secondAccount.attachCard(card11);
        secondAccount.attachCard(card22);
        secondAccount.attachCard(card33);
        bankAccounts.add(secondAccount);

}
