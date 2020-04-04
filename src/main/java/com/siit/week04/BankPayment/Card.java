package com.siit.week04.BankPayment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Card extends BankAccount{
    private long cardNumber;
    private int expirationDate;
    private String cardOwnerName;

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
        this.cardOwnerName = cardOwner;
    }
}
