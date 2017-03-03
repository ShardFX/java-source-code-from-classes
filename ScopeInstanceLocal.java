
/**
 * Write a description of class ScopeInstanceLocal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScopeInstanceLocal
{
    public int iv;
    
    public void testIV()
    {
        iv++;
        System.out.println("\ninstance variable value is: " + iv);
    }
    
    public void displayIV()
    {
        int iv=0;
        for(int i = 0; i < 5; i++)
        {
            System.out.println("local variable value is: " + i);
        }
        System.out.println("local variable value is: " + this.iv);
    }
    
    public static void main(String[] args)
    {
        ScopeInstanceLocal s = new ScopeInstanceLocal();
        s.testIV();
        s.displayIV();
    }
}
