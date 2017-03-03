
/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A
{
    private int a = 20;
    
    public int getA(){
        return a;
    }
    public int getB()
    {
        //return this.a;
        return this.getA();
    }
    public static void main(String[] args)
    {
        A varA = new A();
        System.out.println(varA.a);
        
        // a is visible from 15 to 18
    }
    
    
}
