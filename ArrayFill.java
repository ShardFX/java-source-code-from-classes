import java.util.Arrays;
/**
 * Write a description of class ArrayFill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayFill
{
    public static void main(String args[])
    {
      double[] intArray = { 1, 2, 3, 4, 5, 6 };
      double[] intArrayCopy = new double[ intArray.length ];
      System.arraycopy( intArray, 0, intArrayCopy, 0, intArray.length );
      //displayArray( intArray, "intArray" );
      //displayArray( intArrayCopy, "intArrayCopy" );
      
      double d[] = { 2.0, 3.0};
      double d1[] = new double[2];
      
      for (int i = 0; i < d.length; i++)
      {
          d1[i] = d[i];
        }
    }
}
