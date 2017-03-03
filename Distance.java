import java.util.Scanner; // import java Scanner
/**
 * LAB_03
 * 
 * Write method distance to calculate the distance between two points(x1,y1) and (x2, y2).
 * All numbers and return values should be of type double. Incorporate this method into an
 * application that enables the user to enter coordinated of the points.
 * 
 * Anwar Haikal bin Ruslan
 * 0322126
 * 20 June 2015
 */
public class Distance // name of class
{
   public static void main(String[] args) // main function
   {
       Scanner input = new Scanner(System.in); // creates Scanner object
       
       System.out.println("\nType the end-of-file indicator to terminate"); // \n to prevent same line
       System.out.println("\tOn UNIX/Linux/Mac OS X, type <ctrl> d then press Enter"); // \n to indent
       System.out.println("\tOn Windows, type <ctrl> z then press Enter"); // \n to indent
       System.out.println("Or Enter X1: "); // request input for x1
       
       while(input.hasNext()) // loop
       { // start of loop

           double x1 = input.nextDouble(); // reads and writes data for x1
           System.out.println("Or Enter Y1: "); // request input for y1
           double y1 = input.nextDouble(); // reads and writes data for y1
           System.out.println("Or Enter X2: "); // request input for x2
           double x2 = input.nextDouble(); // reads and writes data for x2
           System.out.println("Or Enter Y2: "); // request input for y2
           double y2 = input.nextDouble(); // reads and writes data for y2
           double calculate = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))); // equation
           System.out.printf("Distance is %.7f\n", calculate); // prints result, 7 decimal points
           
           System.out.println("\nType the end-of-file indicator to terminate"); // repeats process
           System.out.println("\tOn UNIX/Linux/Mac OS X, type <ctrl> d then press Enter");
           System.out.println("\tOn Windows, type <ctrl> z then press Enter");
           System.out.println("Or Enter X1: ");
        } // end of loop
       
       System.out.println("\nProgram ended\n"); // EOF when <ctrl> + <z> or <ctrl/command> + <d> 
       
   } // end of main function
} // end of class
