
import java.util.Scanner;

/**
 * Write a description of class TestSwitch here.
 * 
 * Anwar Haikal 
 * 7 June 2015
 */
public class TestSwitch
{
    public static void main(String args[])
    {
        int month;
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a valid month");
        System.out.println("1 to 12");
        month = s.nextInt();
    
        
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            System.out.println("31 days");
            break;
            
            case 4:
            case 6:
            case 9:
            case 11:
            System.out.println("30 days");
            break;
            
            case 2:
            System.out.println("28 or 29 days");
            break;
            
            default:
            System.out.println("invalid month");
        }
            
        
    }
}
            
        