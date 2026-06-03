package com.rays.oop;

public class Account {

    public double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("TOTAL BALANCE: " + balance);
    }

    public void withdrawal(double amount){
        if (amount > balance){
            System.out.println("not sufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("TOTAL BALANCE: " + balance);
        }

    }

    public static void main(String[] args) {
        Account ac = new Account();
        ac.setBalance(6000);
        ac.deposit(2000);
        ac.withdrawal(200);
    }

}
