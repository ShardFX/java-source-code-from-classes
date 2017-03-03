import java.util.Scanner;
/**
 * Write a description of class TestSentinelControlLoop here.
 * 
 * Anwar Haikal
 * June 9th 2015
 */
public class TestSentinelControlLoop
{
    public static void main(String args[])
    {
        
        int counter;
        int limit;
        System.out.println("Dear User, please enter your limit -1 to end");
        Scanner s = new Scanner(System.in);
        limit = s.nextInt();
        
        while(limit != -1)
        {
            counter = 1;
            while (counter<=limit)
            {
                System.out.println("Counter is: " + counter);
                counter++;
            }
            
            System.out.println("Dear user, please enter your limit -1 to end");
            limit = s.nextInt();
        }
    }
}
            