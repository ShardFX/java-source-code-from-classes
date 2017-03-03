import java.util.Scanner;

/**
 * Write a description of class CompareThreeIntegers here.
 * 
 * Anwar Haikal
 * June 11th 2015
 */
public class CompareThreeIntegers
{
    public static void main(String args[])
    {
        int x;
        int y;
        int z;
        
        System.out.println("\nEnter three integers: ");
        Scanner in = new Scanner(System.in);
        
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        
         if ( x > y && x > z && y > z)
         {
         System.out.printf("\nFirst integer which is %d is the largest.\n", x);
         System.out.printf("In ascending order: %d, %d, %d\n", z, y, x);
        }
         else if (x > y && x > z && z > y)
         {
         System.out.printf("\nFirst integer which is %d is the largest.\n", x);
         System.out.printf("In ascending order: %d, %d, %d\n", y, z, x);
        }
         else if ( y > x && y > z && x > z)
         {
         System.out.printf("\nSecond integer which is %d is the largest.\n", y);
         System.out.printf("In ascending order: %d, %d, %d\n", z, x, y);
        }
         else if ( y > x && y > z && z > x)
         {
         System.out.printf("\nSecond integer which is %d is the largest.\n", y);
         System.out.printf("In ascending order: %d, %d, %d\n", x, z, y);
        }
         else if ( z > x && z > y && x > y)
         {
         System.out.printf("\nThird integer which is %d is the largest.\n", z);
         System.out.printf("In ascending order: %d, %d, %d\n", y, x, z);
        }
         else if ( z > x && z > y && y > x)
         {
         System.out.printf("\nThird integer which is %d is the largest.\n", z);
         System.out.printf("In ascending order: %d, %d, %d\n", x, y, z);
        }
         else   
         System.out.println("One or more integers are invalid.\n");
   }
}