import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
/**
 * Write a description of class PlanetGravity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PlanetGravity
{
    //Calculate Surface Gravity & Print into file
    public static double[] surfaceGravity(double[] mass,double[] diameter) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("surfaceGravity.txt")); //Creates new file
        
        double gravitationalConstant = 6.67 * Math.pow(10, -11);
        double[] surfaceGravity = new double[9];
        for(int i = 0; i < mass.length; i++)
        {
            double radius = diameter[i] / 2;
            surfaceGravity[i] = (gravitationalConstant * mass[i]) / Math.pow(radius, 2);
            outFile.println(surfaceGravity[i]);
        }
        outFile.close();
        return surfaceGravity;
    }
   
    //Arrays
    public static String[] planetNames()
    {
        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        return planetNames;
    }
    public static double[] planetDiameter()
    {
        double[] planetDiameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        return planetDiameter;
    }
    public static double[] planetMass()
    {
        double[] planetMass = {3.30E23, 4.869E24, 5.972E24, 6.5219E23, 1.900E27, 5.68E26, 8.683E25, 1.0247E26};
        return planetMass;
    }
   
    //Output
    public static void output(String[] planetNames, double[] planetDiameter, double[] planetMass, double[] surfaceGravity)
    {
        System.out.printf("%36s%n", "Planetary Data");
        System.out.printf("%6s%20s%15s%15s%n", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("-------------------------------------------------------------------------");
        for(int i = 0; i < planetNames.length; i++)
        {
            System.out.printf("%-14s%-17.0f%9.2e%17.2f\n", planetNames[i], planetDiameter[i], planetMass[i], surfaceGravity[i]);
        }
    }
   
   
   
    public static void main(String[] args) throws IOException
    {
        output(planetNames(), planetDiameter(), planetMass(), surfaceGravity(planetMass(), planetDiameter()));
    }
}