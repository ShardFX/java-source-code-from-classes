
/**
 * Write a description of class TestInstanceMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestStaticInstanceMethods
{
    int a = 30; // instance variable
    // static int a = 30; // static variable
    static TestMethods t = new TestMethods();
    public void main(int a, int b)
    {
        System.out.println("test instance method");
        int  c = t.getA();
    }
    public void testIM()
    {
        main(30,40);
    }
    public static void testStatic()
    {
        System.out.println("test static");
    }
    public static void main(String args[])
    {
        // System.out.println(a); // Cannot call non-static with static, can if static variable
        // t.getString(); // cannnot use t, t is ORV unless it is declared as static // not good practice
        TestMethods.getString();
        TestStaticInstanceMethods im = new TestStaticInstanceMethods();
        System.out.println(im.a);
        im.main(2, 3);
        testStatic();
    }
}


/** 
 * Static variables can be accessed inside static methods directly if they are in the same class
 * static variables can be accessed inside other classes as well via the same class
 * instance variables cannot be accessed inside static methods directly but can be accessed via ORV
 * instance methods cannot be accessed inside static methods directly but can be accessed via ORV
 * instance method can be accessed directly within another instance method if they are in the same class otherwise they can be accessed via ORV
 * 
 */
