package com.company.oop1;

public class BankAccountPrivate {
    private int ID;
    private int balance;

    // getters and setters

    public int getID(){
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    // constructor
    public BankAccountPrivate(int ID, int balance){
        this.ID = ID;
        this.balance = balance;
    }
    //public methods

    public void deposit (int depositAmount){
        balance += depositAmount;
    }
    public void withdraw (int withdrawAmount){
        if(balance >= withdrawAmount)
        balance -= withdrawAmount;
        else System.out.println("Your account has insufficient funds");
    }
}
