import java.util.Arrays;
/**
 * Write a description of class ArrayTEst here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayTEst
{
    public static void main(String args[])
    {
        double d[] = { 2.0, 5.0, 0.9, 6.6, 5.5 };
        char c[] = { 12, 2, 4, 5, 12, 31 };
        Arrays.sort(d);
        Arrays.sort(c);
        
        for (double d1: d)
        {
            System.out.println(d1);
        }
        
        for (double c1: c)
        {
            System.out.println(c1);
        }
    }
}
