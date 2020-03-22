package com.siit.week04.BankPayment;

public class BankAccount extends User{
    public String iban;
    public long balance;
    public String attachedCardNumbers;

    public BankAccount(String iban, long balance, String attachedCardNumbers. String cnp, String name) {
        this.iban = iban;
        this.balance = balance;
        this.attachedCardNumbers = attachedCardNumbers;
    }

    //methods
    public void addMoney() {

    }

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

    public String getAttachedCardNumbers() {
        return attachedCardNumbers;
    }

    public void setAttachedCardNumbers(String attachedCardNumbers) {
        this.attachedCardNumbers = attachedCardNumbers;
    }
}
