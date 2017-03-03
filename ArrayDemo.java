
/**
 * Write a description of class ArrayDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayDemo
{
    public void passByValue(int a)
    {
        a+=2;
        System.out.println("\t" + a);
    }
    public void passByReference(int a[])
    {
        for(int i=0; i<a.length; i++)
        a[i] *= 2;
    }
    public static void main(String[] args)
    {
        int a[] = {1, 2, 3, 4};
        ArrayDemo CLASS = new ArrayDemo();
        System.out.println();
        System.out.println("Before call by value " + a[3]);
        System.out.println("After call by value " + a[3]);
        CLASS.passByValue(a[3]);
        System.out.println("Before call by reference");
        for(int value:a)
        System.out.print("\t" + value);
        System.out.println();
        System.out.println("After call by reference");
        CLASS.passByReference(a);
        for(int value:a)
        System.out.print("\t" + value);
        System.out.println();
    }
}
