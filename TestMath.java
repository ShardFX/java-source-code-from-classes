import java.util.Scanner;
/**
 * Write a description of class TestMath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestMath
{
   public static void main(String args[])
   {
       System.out.println("\nEnter two values to find max: ");
       Scanner s = new Scanner(System.in);
       double d = s.nextDouble();
       double c = s.nextDouble();
       double a = s.nextDouble();
       System.out.println(Math.max(a, Math.max(d, c)));
    }
}
