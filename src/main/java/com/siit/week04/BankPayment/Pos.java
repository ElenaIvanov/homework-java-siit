package com.siit.week04.BankPayment;

import java.util.*;

public class Pos {

    private List<BankAccount> bankAccounts;

    public void addKnownBankAccounts(BankAccount bankAccount)
    {
        this.bankAccounts = new ArrayList<BankAccount>();
        this.bankAccounts.add(bankAccount);
    }

    public String pay(long amount, Card card) throws Exception {

        for (BankAccount account:bankAccounts) {
            for (Card accountCard: account.getAttachedCardNumbers()) {
                if(accountCard.getCardNumber() == card.getCardNumber()){
                    account.withdrawMoney(amount);
                }
            }
        }

        String receipt = "Check your receipt!";
        return receipt;
    }

}
