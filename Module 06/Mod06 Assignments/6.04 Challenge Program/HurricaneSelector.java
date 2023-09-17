import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
/**
 * Write a description of class HurricaneSelector here.
 *
 * @author Cole Current
 * @version 12/5/19
 */
public class HurricaneSelector
{
    public static void main(String[] args) throws IOException
    {
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        
        //Initializing Variables
        int index = 0;
        int arrayLength = 100;
        double avgCategory = 0;
        double avgPressure = 0;
        double avgWindSpeed = 0;
        int minCategory = Integer.MAX_VALUE;
        int minPressure = Integer.MAX_VALUE;
        double minWindSpeed = Integer.MAX_VALUE;
        int maxCategory = Integer.MIN_VALUE;
        int maxPressure = Integer.MIN_VALUE;
        double maxWindSpeed = Integer.MIN_VALUE;
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        
        //Initializing Array lists
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];
        int [] pressure = new int[arrayLength];
        double [] windSpeed = new double[arrayLength];
        String [] name = new String[arrayLength];
        int [] category = new int[arrayLength];
        
        //Transfering from File to Arrays
        while(inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            windSpeed[index] = inFile.nextDouble();
            windSpeed[index] = windSpeed[index] * 1.15078;
            name[index] = inFile.next();
            index++;
        }
        inFile.close();
        index = 0;
        
        
        //Organizing Arrays
        for(int i = 0; i < arrayLength; i++)
        {
            //Determining Categories
            if(windSpeed[index] < 96) //Category 1
            {
                category[index] = 1;
                cat1++;
            }
            else if(windSpeed[index] < 111) //Category 2
            {
                category[index] = 2;
                cat2++;
            }
            else if(windSpeed[index] < 130) //Category 3
            {
                category[index] = 3;
                cat3++;
            }
            else if(windSpeed[i] < 157) //Category 4
            {
                category[index] = 4;
                cat4++;
            }
            else if(windSpeed[index] > 157) //Category 5
            {
                category[index] = 5;
                cat5++;
            }
            avgPressure += pressure[index];
            avgCategory += category[index];
            avgWindSpeed += windSpeed[index];
            
            //Find Maximums and Minimums
            if(pressure[index] < minPressure)
            {
                minPressure = pressure[index];
                
            }
            if(pressure[index] > maxPressure)
            {
                maxPressure = pressure[index];
            }
            if(category[index] < minCategory)
            {
                minCategory = category[index];
            }
            if(category[index] > maxCategory)
            {
                maxCategory = category[index];
            }
            if(windSpeed[index] < minWindSpeed)
            {
                minWindSpeed = windSpeed[index];
            }
            if(windSpeed[index] > maxWindSpeed)
            {
                maxWindSpeed = windSpeed[index];
            }
            index++;
        }
        index = 0;
        avgPressure = avgPressure / arrayLength;
        avgCategory = avgCategory / arrayLength;
        avgWindSpeed = avgWindSpeed / arrayLength;
        
        
        //Output
        System.out.printf("%39s%n", "Hurricanes 1995 - 2007");
        System.out.println("");
        System.out.printf("%4s%15s%14s%19s%22s%n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("====================================================================================================");
        for(int i = 0; i < 100; i++)
        {
            System.out.printf("%-11d%-17s%1d%18d%22.2f%n", year[i], name[i], category[i], pressure[i], windSpeed[i]);
        }
        System.out.println("====================================================================================================");
        System.out.printf("%15s%17.2f%18.2f%19.2f%n", "Average:", avgCategory, avgPressure, avgWindSpeed);
        System.out.printf("%15s%14d%18d%21.2f%n", "Minimum:", minCategory, minPressure, minWindSpeed);
        System.out.printf("%15s%14d%18d%21.2f%n", "Maximum:", maxCategory, maxPressure, maxWindSpeed);
        System.out.println();
        
        System.out.println("Summary of Categories:");
        System.out.printf("%8s%3s%n", "Cat 1:", cat1);
        System.out.printf("%8s%3s%n", "Cat 2:", cat2);
        System.out.printf("%8s%3s%n", "Cat 3:", cat3);
        System.out.printf("%8s%3s%n", "Cat 4:", cat4);
        System.out.printf("%8s%3s%n", "Cat 5:", cat5);
    }
}
