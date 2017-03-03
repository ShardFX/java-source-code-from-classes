
/**
 * Addition from textbook.
 * inputs 2 numbers then display their sum
 * Anwar Haikal 
 * 1/6/15
 */

import java.util.Scanner;

public class Addition_TextBook
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;
        int sum;
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.printf("Sum is %d%n", sum);
    }
}
        
    