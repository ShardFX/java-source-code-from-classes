
/**
 * Write a description of class TestPromotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestPromotion
{
    public double add(int a, int b) // int add(double a, double b);
    {
        return(a + b);  // return int(a + b);
    }
    public static void main(String args[])
    {
        TestPromotion t = new TestPromotion();
        t.add(23, 33);
        //int a = 22, b = 33;
        System.out.println(t.add(23, 33));
        
        //int in = 33;
        //double d = in; // promotion(automatic)
        //double f = 10.27f;
        //int i = (int)(f);// float is converted into double(casting)
        //System.out.println(i);
        
        // String s = 5;
    }
}
