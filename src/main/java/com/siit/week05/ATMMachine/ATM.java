package com.siit.week05.ATMMachine;

import com.siit.week05.ATMMachine.Repository.BankDatabase;

import java.util.Scanner;

import static com.siit.week05.ATMMachine.Repository.BankDatabase.cards;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();
        BankAccount account1 = new BankAccount("123456789", 4700.00);
        atm.addCard(new Card());
        atm.addCard(new Card());


        BankAccount account2 = new BankAccount("123456788", 5800.00);
        atm.addCard(new Card());
        BankAccount account3 = new BankAccount("123456878", 5900.00);
        atm.addCard(new Card());

    }

    private void addCard(Card card) {
        cards.add((Card) cards);
    }
}
