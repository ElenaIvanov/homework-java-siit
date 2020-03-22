package com.siit.week04.BankPayment;

import java.util.*;

public class BankAccount extends User{
    public String iban;
    public long balance;
    public List<Card> attachedCardNumbers;

    //constructors
    public BankAccount(String iban){
        this.iban = iban;
    }

    public BankAccount(String name, String cnp, String iban, long balance) {
        this.iban = iban;
        this.attachedCardNumbers = new ArrayList<Card>();
    }

    //methods
    public void addMoney(long amount) throws Exception {
        if(amount <= 0){
            throw new Exception("Please add a positive amount multiple of 10!");
        }

        this.balance = this.balance + amount;
    }

    public void withdrawMoney(long amount) throws Exception {
        if(amount < 0){
            throw new Exception("Please withdraw a positive amount multiple of 10!");
        }

        if(this.balance < amount){
            throw new Exception("Insuficient funds!");
        }

        this.balance = this.balance - amount;
    }

    public void attachCard(Card cardNumber) {
        this.attachedCardNumbers.add(cardNumber);
    }

    //getters and setters
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public List<Card> getAttachedCardNumbers() {
        return attachedCardNumbers;
    }

    public void setAttachedCardNumbers(List<Card> attachedCardNumbers) {
        this.attachedCardNumbers = attachedCardNumbers;
    }
}
