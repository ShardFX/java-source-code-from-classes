
/**
 * Write a description of class ReadingValuesFromKeyboard here.
 * 
 * Anwar Haikal 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class ReadingValuesFromKeyboard
{
    public static void main(String[] args)
    {
        int integer1;
        int integer2;
        int result;
        
        // double d1, d2, resultd;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter first integer");
            integer1 = s.nextInt();
            
        System.out.println("enter second integer");
            integer2 = s.nextInt();
            
            result = integer1 + integer2;
        
        System.out.println("sum is: " + result);
    }
}
        
        