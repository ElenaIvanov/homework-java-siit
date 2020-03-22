package com.siit.week04.BankPayment;

public class Card extends BankAccount{
    private long cardNumber;
    private int expirationDate;
    private String cardOwner;

    //constructors
    public Card(String name, String cnp, String iban, long balance, long cardNumber, int expirationDate) {
        super(name, cnp, iban, balance);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public Card(String name, String cnp, String iban, long balance, long cardNumber, int expirationDate, String cardOwner) {
        super(name, cnp, iban, balance);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cardOwner = cardOwner;
    }


    //getters ans setters
    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }
}
