/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;
/**
 *
 * @author pc
 */
public class BankAccount {
    private int number;
    private Person owner;
    private double balance;
    
    public BankAccount(int number,Person owner){
        this.number = number;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }
      public double deposit(double amount){
        return this.balance += amount;
    }

    public double withdraw(double amount){
        return this.balance -= amount;
    }

    public void transfer(double amount, BankAccount account){
        withdraw(amount);
        account.deposit(amount);
    }

    @Override
    public String toString() {
        return owner + " account balance: " + balance ;
    }
}
    
    

