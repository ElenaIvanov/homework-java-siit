package com.siit.week05.ATMMachine;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Card {
    private String ownerName;
    private BankAccount bankAccount;
    private String cardNumber;
    private String expirationDate;
    private int password;

    public Card() {
        this.ownerName = ownerName;
        this.bankAccount = bankAccount;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.password = password;
    }

    public void interogateBalance(){
        System.out.println("Your current balance is: " + bankAccount.getBalance());
    }

    public void depositMoney(double amountToDeposit){
        System.out.println("Amount to deposit is " + amountToDeposit);
        bankAccount.setBalance(bankAccount.getBalance() + amountToDeposit);
    }

    public void withdrawMoney(double amountToWithdraw){

        if(bankAccount.getBalance() - amountToWithdraw < 0){
            System.out.println("Please try again. No sufficient funds found in you account.");
        } else {
            System.out.println("Succesfully withdraw the amount of " + amountToWithdraw);
            bankAccount.setBalance(bankAccount.getBalance() - amountToWithdraw);
        }
    }

    public void changePassword(int password){
        System.out.println("Pin succesfully changed");
        setPassword(password);
    }
}
