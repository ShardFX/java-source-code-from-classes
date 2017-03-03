import java.util.Scanner;
/**
 * Write a description of class TestArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestArray
{
   public static void main(String[] args)
   {
       int age[] = new int[5];
       
       Scanner input = new Scanner(System.in);
       System.out.println("\nSize of an array age is: " + age.length);
       System.out.println("Enter 5 integers: \n");
       for (int i = 0; i < age.length; i++) // (int = 5; i > age.length; i--)
       {
           
           age[i] = input.nextInt();

        }
        // int age[] = (1,2,3,4,5,6); // Declare & Initialize
        System.out.println("\nThe 5 integers are: ");
        /*
        for (int a:age)     // enhanced loop
        {
            System.out.println(a);
        }
        
       
       for (int i = 0; i < age.length; i++)
       {
           System.out.println(i);
        }
        */
       
       for(int i = ((age.length) - 1); i >= 0; i--) // descending order LILO
       {
           System.out.println(age[i]);
        }
   }
}
