package com.siit.week04.BankPayment;

public class User {
    private String cnp;
    private String name;
    private String email;
    private String password;

    public Card[] card;
    public BankAccount[] bankAccounts;

    //methods
    public void addCard(Card card){

    }

    public void addBankAccount(BankAccount bankAccount){

    }

    //default constructor
    public User() {
        cnp = "";
        name = "";
        email = "";
        password = "";
    }
    //constructor with all args
    public User(String cnp, String name, String email, String password) {
        this.cnp = cnp;
        this.name = name.toLowerCase();
        this.email = email.toLowerCase();
        this.password = password;
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

    public String openNewAccount(String cn, double d) {
    }

    public void depositTo(int an, double da) {
    }

    public void withdrawFrom(int acn, double wa) {
    }

    public void printAccountInfo(int anum) {
    }
}
