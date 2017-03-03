
/**
 * Write a description of class AccountTest here.
 * 
 * Anwar Haikal 
 * 1/5/15
 */

//Creating and manipulating an Account object

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Anwar");
        Account account2 = new Account("Haikal");
        
        System.out.printf("account1 name is %s%n", account1.getName());
        System.out.printf("account2 name is %s%n", account2.getName());
        
    }
}
        