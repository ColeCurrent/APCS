import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * Write a description of class PlanetWeight here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlanetWeight
{
    //Reads surface gravity from text file
    public static double[] surfaceGravity() throws IOException
    {
        int i = 0;
        double[] surfaceGravity = new double[9];
        File fileName = new File("surfaceGravity.txt");
        Scanner inFile = new Scanner(fileName);
        while(inFile.hasNext())
        {
            surfaceGravity[i] = inFile.nextDouble();
            surfaceGravity[i] = surfaceGravity[i] * 0.000001;
            i++;
        }
        inFile.close();
        return surfaceGravity;
    }
    
    //Arrays
    public static String[] planetNames()
    {
        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        return planetNames;
    }
    
    public static double userMass()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your weight (on earth) in pounds: ");
        int userWeight = in.nextInt();
        
        double userMass = userWeight * (453.59237) / (9.8/9.8);
        return userMass;
    }
    
    public static double[] newWeight(double userMass, double[] surfaceGravity)
    {
        double[] newWeight = new double[9];
        for(int i = 0; i < surfaceGravity.length; i++)
        {
            newWeight[i] = userMass * (surfaceGravity[i] / 9.8) / 453.59237;
        }
        return newWeight;
    }
    
    //Output
    public static void output(double[] surfaceGravity, double[] newWeight, String[] planetNames)
    {
        System.out.printf("%30s%n", "My Weight on the Planets");
        System.out.printf("%-12s%-12s%-12s%n", "Planet", "Gravity", "Weight(lbs)");
        System.out.println("-----------------------------------");
        for(int i = 0; i < (newWeight.length - 1); i++)
        {
            System.out.printf("%-13s%-12.2f%-6.2f%n", planetNames[i], surfaceGravity[i], newWeight[i]);
        }
    }
    
    
    
    public static void main(String[] args) throws IOException
    {
        output(surfaceGravity(), newWeight(userMass(), surfaceGravity()), planetNames());
    }
}
