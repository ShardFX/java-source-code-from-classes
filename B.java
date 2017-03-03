import java.util.Scanner;
/**
 * Write a description of class B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B
{
   int inputInteger;
   double inputDouble;
   
   public int square(int i) // method/function overloading
   {
    return(i*i);
    }
    
    public double square(double d) // method/function overloading
    {
        return (d*d);
    }
    
    public static void main(String[] args)
    {
        B b = new B();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the integer value to square: ");
        
        b.inputInteger = s.nextInt(); // calling/invoking a method(instance)
        // int result = b.squareInt(b.input);
        // System.out.println(result);
        System.out.println(b.square(b.inputInteger));
        
        
        System.out.println("Enter the double value to square: ");
        
        b.inputDouble = s.nextDouble(); // calling/invoking a method(instance)
        // int result = b.squareInt(b.input);
        // System.out.println(result);
        System.out.println(b.square(b.inputDouble));
   
}
}
