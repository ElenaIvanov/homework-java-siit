package com.siit.week04.BankPayment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Pos {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public void addKnownBankAccounts(BankAccount bankAccount) {
        this.bankAccounts = new ArrayList<>();
        this.bankAccounts.add(bankAccount);
    }

    public void addKnownBankAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    public String pay(BigDecimal amount, Card card) {
        BankAccount account = getBankAccountByCard(card);
        if (account != null && isCardValid(card)) {
            return account.withdrawMoney(amount);
        }
        return "Fail";
    }

    BankAccount getBankAccountByCard(Card card) {
        for (BankAccount account : bankAccounts) {
            boolean found = account.getAttachedCards().stream()
                    .anyMatch(cardNumber -> cardNumber.equals(card.getCardNumber()));
            if (found) {
                return account;
            }
        }
        return null;
    }

    private boolean isCardValid(Card card) {
        LocalDate currentDate = LocalDate.now();
        LocalDate expirationDate = card.getExpirationDate();
        return !expirationDate.isBefore(currentDate);
    }

}
