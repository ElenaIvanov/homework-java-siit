package com.siit.week04.BankPayment;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        User myBank = new User();
        int choice = 1;

        //create card obj
        Card card = new Card(); //parameters to add
        BankAccount account = new BankAccount("RO01BRD1234135623450001");
        account.attachCard(card);

        //create user pbj
        User client = new User();
        client.addBankAccount(account);
        client.addCard(card);

        //create pos obj
        Pos pos = new Pos();
        pos.addKnownBankAccounts(account);
        pos.pay(4700,card);


    }


}