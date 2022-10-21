/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab4;
/**
 *
 * @author Battl
 */
public class Account {
    private String n;
    private int num;
    private double bal;
    
    public Account(String name, int number,double initialBalance) {
        n = name;
        num = number;
        bal = initialBalance;
    }
    public String getName(){
        return n;
    }
    public double getBalance(){
        return this.bal;
    }
    
    public int getNumber(){
        return num;
    }
    public boolean deposit(double amount){
        if (amount <= 0){
            return false;
        }
        bal += amount;
        return true;
    }
    public boolean withdraw(double amount){
        if (bal - amount < 0 || amount <= 0) {
            return false;
        }
        bal -= amount;
        return true;
    }

    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
        String.format("$%.2f", getBalance()) + ")";
    }
}
