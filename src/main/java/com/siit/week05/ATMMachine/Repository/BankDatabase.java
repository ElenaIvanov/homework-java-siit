package com.siit.week05.ATMMachine.Repository;

import com.siit.week05.ATMMachine.BankAccount;
import com.siit.week05.ATMMachine.Card;
import com.siit.week05.ATMMachine.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankDatabase extends Card {

    //private String ownerName;
    //    private BankAccount bankAccount;
    //    private String cardNumber;
    //    private String expirationDate;
    //    private int pin;

    public final static List<BankAccount> bankAccounts= new ArrayList<>();
    public final static List<Card> cards = new ArrayList<>();
    public final static List<User> users = new ArrayList<>();

        BankAccount account1 = new BankAccount("0800800800", new BigDecimal(170900.899), "1255555");

        Card card1 = new Card();

        BankAccount account2 = new BankAccount("0800800801", new BigDecimal(180700.999), "444555");


        BankAccount account3 = new BankAccount("0800800802", new BigDecimal(548779.10), "333555");



}
