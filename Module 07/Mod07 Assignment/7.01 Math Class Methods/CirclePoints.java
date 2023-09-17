import java.util.Scanner;
/**
 * Write a description of class CirclePoints here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CirclePoints
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //Defining Variables
        double exponent = 2;
        
        //Input
        System.out.print("Please enter the amount of times you would like to increment (ex. 20)");
        int incrementTimes = in.nextInt();
        System.out.print("Please enter the value you would like to increment x by (ex. 0.1) ");
        double incrementValue = in.nextDouble();
        System.out.print("Please enter the radius (ex. 1) ");
        double radius = in.nextInt();
        System.out.print("Please enter a value for x (ex. 1) ");
        double x = in.nextInt();
        
        //Heading
        System.out.println("Points on a Circle with a Radius of " + radius);
        System.out.printf("%8s%8s%8s%8s%n", "x1", "y1", "x1", "y2");
        System.out.println("*******************************************");
        
        //Calculate and print y values
        for(int i = 0; i < incrementTimes; i++)
        {
            double y = Math.sqrt(Math.pow(radius, exponent) - Math.abs(Math.pow(x, exponent)));
            System.out.printf("%8.2f%8.2f", x, y);
            y = -Math.sqrt(Math.pow(radius, exponent) - Math.pow(x, exponent));
            System.out.printf("%8.2f%8.2f%n", x, y);
            x -= incrementValue;
        }
    }
}
