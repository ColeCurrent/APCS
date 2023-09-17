import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class EstimatePi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EstimatePi
{
    public static double piCalculation(int loop)//int loops)
    {
        Random rand = new Random();
        int hit = 0;
        for(int i = 0; i < loop; i++)
        {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            double pyth = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            if(pyth <= 1)
            {
                hit++;
            }
        }
        int pi = 4 * (hit / loop);
        return pi;
    }
    
    public static void main(String[] args)
    {
        System.out.print(piCalculation());
    }
}
