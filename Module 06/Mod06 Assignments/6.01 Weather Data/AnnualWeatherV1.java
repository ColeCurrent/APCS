/**
 * Annual Weather description:
 * 
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void main (String [ ] args)
    {
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Gainesville";
        String state = "Florida";
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={54.3, 57.0, 62.5, 67.6, 74.3, 79.2, 80.9, 80.4, 77.8, 70.1, 62.8, 56.3};     //initialize with Fahrenheit values
        double [] precipitation ={3.5, 3.4, 4.3, 2.9, 3.2, 6.8, 6.1, 6.6, 4.4, 2.5, 2.2, 2.6};      //initialize with inch values
    
        String tempLabel = "°F";    //initialize to F
        String precipLabel = "in."; //initialize to in
        double tempSum = 0;
        double averageTemp = 0;
        double averageTempLength = 0;
        double totalPrecip = 0;
        
    
        //Processing - calculate average temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
            averageTempLength++;
            tempSum += temperature[index];
            totalPrecip += precipitation[index];
        }
        averageTemp = tempSum / averageTempLength;
    
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
           System.out.println(month[index] + ".         " + temperature[index] + tempLabel + "                   " + precipitation[index] + " " + precipLabel);
        }
        System.out.println("***************************************************");
        System.out.println("Average Temperature: " + averageTemp + tempLabel + "    Total Rain Fall: " + totalPrecip + " " + precipLabel);
    }//end main
}//end class
