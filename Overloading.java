
/**
 * Write a description of class Overloading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Overloading
{
   public int add(int a, int b)
   {
       return(a + b);
    }
    
    public double add(double a, double b)
    {
        return(a + b);
    }
    
    public double add(int a, double b)
    {
        return(a + b);
    }
    
    public double add(float a, float b)
    {
        return(a + b);
    }
    
    public double add(double a, int b)
    {
        return(a + b);
    }
    
    public static void main(String[] args) // method overloading
    {
        Overloading o = new Overloading();
        int a =o.add(2, 3);
        double b = o.add(2.3, 4.5);
        double c = o.add(2, 8.5);
        double d = o.add(3.21, 4.232);
        double e = o.add(3.232, 4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
