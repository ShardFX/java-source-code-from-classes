
/**
 * Product of three integers
 * Textbook
 * Anwar Haikal 
 * 1/6/15
 */

import java.util.Scanner;

public class Product_TB
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int x;
        int y;
        int z;
        int result;
        
        System.out.print("First Integer: ");
        x = input.nextInt();
        
        System.out.print("Second Integer: ");
        y = input.nextInt();
        
        System.out.print("Third Integer: ");
        z = input.nextInt();
        
        result = x * y * z;
        
        System.out.printf("Result is %d%n", result);
    }
}
        
        
    