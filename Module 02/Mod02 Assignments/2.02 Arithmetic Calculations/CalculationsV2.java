
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Cole Current
 * @version 9/29/19
 */
public class CalculationsV2
{
    public static void main(String[ ] args)
    {
        //Defining Variables for Integers
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        int iNum4 = 13;
        int iNum5 = 4;
        int iNum6 = 22;
        
        // Addition
        System.out.println("Addition");
        System.out.println( "25 + 9 = " + (iNum1 + iNum2));
        System.out.println( "43.21 + 3.14 + 10.0 = " + (43.21 + 3.14 + 10.0));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( "11 - 9 - 25 = " + (iNum3 - iNum2 - iNum1));
        System.out.println( "3.14 - 10.0 = " + (3.14 - 10.0));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( "25 * 9 = " + (iNum1 * iNum2)); 
        System.out.println( "3.14 * 10.0 * 10.0 = " + (3.14 * 10.0 * 10.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( "9 / 25 = " + (iNum2 / iNum1));
        System.out.println( "43.21 / 10.0 = " + (43.21 / 10.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( "11 % 9 = " + (iNum3 % iNum2));
        System.out.println( "10.0 % 3.14 = " + (10.0 % 3.14));
        System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("Custom Arithmetic Expressions");
        System.out.println("11 + 4 = " + (iNum3 + iNum5));
        System.out.println("22 * 13 = " + (iNum6 * iNum4));
        System.out.println("25 % 4 = " + (iNum1 + iNum5));
        System.out.println();
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
