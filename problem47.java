// Java Program that contains a class Account with acc_no, name and balance as field.
// Accept(), withdraw(), deposite() as methods. If balance<500 then raise exception
// "MinimumBalanceException". If name contains digits then raise exception
// "invalidNameException".

import java.io.*;

class MinimumBalanceException extends Exception
{
    MinimumBalanceException(String msg)
    {
        super(msg);
    }
}

class InvalidNameException extends Exception
{
    InvalidNameException(String msg)
    {
        super(msg);
    }
}

class Account
{
    int acc_no;
    String name;
    double bal;

    public void Accept(int an, String n, double b)throws InvalidNameException
    {
        acc_no = an;
        name = n;
        for(int i = 0; i<n.length(); i++)
        {
            if(Character.isDigit(n.charAt(i)))
            {
                throw new InvalidNameException("Name defined string but contains Int");
            }           
        }
        bal = b;
    }
    public void withdraw(double amount)throws MinimumBalanceException
    {
        if(amount>bal)
        {
            System.out.println("You don't have that much amount in your bank.");
        }
        if((bal-amount)<500)
        {
            throw new MinimumBalanceException("Withdrawal Denied.");
        }
        else
        {
             bal = bal-amount;
            System.out.println("Withdrawal amount:"+ amount+"\nBalance: "+ bal);
        }
    }
    public void deposit(double amount)
    {
        bal = bal+amount;
        System.out.println("Amount Deposited: "+amount+ "\nBalance: "+bal);
    }
}

public class problem47
{
    public static void main(String[] args){
        Account p1 = new Account();
        Account p2 = new Account();
        Account p3 = new Account();
        Account p4 = new Account();
        try
        {
        System.out.println("Rakesh Kumar\n"); 
        p1.Accept(6789, "Rakesh kumar", 80000);
        p1.deposit(1000);
        p1.withdraw(4000);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
            System.out.println("raju\n");
            p2.Accept(98766, "Raju",600);
            p2.withdraw(200);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("6rjau\n");
        p3.Accept(4563, "6rjau",400);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            System.out.println("Babubhai jalela\n");
        p4.Accept(345, "Babubhai_jalela", 90000);
        p4.withdraw(100000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}