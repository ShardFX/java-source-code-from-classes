
/**
 * Write a description of class Decrement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DefaultValues
{
  double dl;
  int i;
  byte b;
  short s;
  long l;
  boolean bool;
  float f;
  char c;
  String s1;
  DefaultValues d2;

    public void displayPrimitiveDefaultValues()
    {
       
        System.out.println(dl);
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(bool);
        System.out.println(f);
        System.out.println(c);
        
    
    }

    
        public void displayObjectDefaultValues()
        {
            System.out.println("default for object " + s1);
            System.out.println("default for class " + d2);
        }
        
        public static void main(String args[])
        {
        DefaultValues d = new DefaultValues();    
        d.displayPrimitiveDefaultValues();
        d.displayObjectDefaultValues();
    }
}