package com.rays.oop;

public class Account {

    public double balance;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amt){
        System.out.println("current balance; " + balance);
        balance = balance + amt;
        System.out.println("balance after deposit; " + balance);
    }

    public void withdrawal(double amt){
        System.out.println("current balance; " + balance);
        if ((balance-2000) < amt){
            System.out.println("low balance");
        } else {
            balance = balance - amt;
            System.out.println("balance after withdrawal; " + balance);
        }
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.setBalance(5000.0);
        a.deposit(200);
        a.withdrawal(3000);
    }
}
