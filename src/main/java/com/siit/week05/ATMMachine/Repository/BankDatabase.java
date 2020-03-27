package com.siit.week05.ATMMachine.Repository;

import com.siit.week05.ATMMachine.BankAccount;
import com.siit.week05.ATMMachine.Card;
import com.siit.week05.ATMMachine.User;

import java.util.ArrayList;
import java.util.List;

public class BankDatabase {

    public final static List<BankAccount> bankAccounts= new ArrayList<>();
    public final static List<Card> cards = new ArrayList<>();
    public final static List<User> users = new ArrayList<>();

    static {

    }
}
