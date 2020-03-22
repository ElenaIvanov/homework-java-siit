package com.siit.week04.BankPayment;

import java.util.List;

public class User {
    private String cnp;
    private String name;
    private String email;
    private String password;

    public List<Card> cards;
    public List<BankAccount> bankAccounts;

    //methods
    public void addCard(Card card){
        this.cards.add(card);
    }

    public void addBankAccount(BankAccount bankAccount){
        this.bankAccounts.add(bankAccount);
    }

    //default constructor
    public User() {
        cnp = "";
        name = "";
        email = "";
        password = "";
    }
    //constructor with all args

    public User(List<Card> cards, List<BankAccount> bankAccounts) {
        this.cards = cards;
        this.bankAccounts = bankAccounts;
    }

    //constructor with 3 args
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean clearPassword(){
        password = "";
        return true;
    }
    //getters and setters
    public String toString(){
        return name + "|" + email + "|" + bankAccounts;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
