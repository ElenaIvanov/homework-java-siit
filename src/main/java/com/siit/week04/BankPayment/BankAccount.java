package com.siit.week04.BankPayment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class BankAccount {
    private String iban;
    private BigDecimal balance;
    private List<String> attachedCards = new ArrayList<>();


    public BankAccount(String iban) {
        this.iban = iban;
    }

    public void attachCard(String cardNumber) {
        attachedCards.add(cardNumber);
    }

    public String addMoney(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) >= 0) {
            balance = balance.add(amount);
            return "Success";
        }
        return "Fail";
    }

    String withdrawMoney(BigDecimal amount) {
        if (balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
            return "Success";
        }
        return "Fail";
    }

}
