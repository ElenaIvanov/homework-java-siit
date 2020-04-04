package com.siit.week04.BankPayment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.*;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Pos {

    private List<BankAccount> bankAccounts;

    public void addKnownBankAccounts(BankAccount bankAccount) {
        this.bankAccounts = new ArrayList<>();
        this.bankAccounts.add(bankAccount);
    }

    public String pay(BigDecimal amount, Card card) throws Exception {

        for (BankAccount account : bankAccounts) {
            for (Card accountCard : account.getAttachedCardNumbers()) {
                if (accountCard.getCardNumber() == card.getCardNumber()) {
                    account.withdrawMoney(amount);
                }
            }
        }

        String receipt = "Please see you receipt.";
        return receipt;
    }

}
