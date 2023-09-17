package net.codejava;
/**
 * Annual Weather description:
 * 
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.Scanner;
public class AnnualWeatherV2 
{
	public static void main(String[] args) 
	{
		//Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Gainesville";
        String state = "Florida";
        
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={54.3, 57.0, 62.5, 67.6, 74.3, 79.2, 80.9, 80.4, 77.8, 70.1, 62.8, 56.3};     //initialize with Fahrenheit values
        double [] precipitation ={3.5, 3.4, 4.3, 2.9, 3.2, 6.8, 6.1, 6.6, 4.4, 2.5, 2.2, 2.6};      //initialize with inch values
        
        String tempLabel = "";    //initialize to F
        String precipLabel = ""; //initialize to in
        double tempSum = 0;
        double averageTemp = 0;
        double averageTempLength = 0;
        double totalPrecip = 0;
        
        
        //Measurement Input
        System.out.println("Choose a tempature scale (Farenheit = F, Celcius = C): ");
        tempLabel = in.next().toUpperCase();
        System.out.println("Choose a precipitation scale (i = inches, c = centimeters)");
        precipLabel = in.next().toLowerCase();
        
        
        //Converting to celcius and centimeters
        if(tempLabel.equals("C"))
        {
        	for(int i = 0; i < temperature.length; i++)
        	{
        		temperature[i] = ((temperature[i] - 32) * 5) / 9;
        	}
        }
        
        if(precipLabel.equals("c"))
        {
        	for(int i = 0; i < temperature.length; i++)
        	{
        		precipitation[i] = precipitation[i] * 2.54;
        	}
        }
        
        //Processing - calculate average temperature and total precipitation
        for( int i = 0; i < temperature.length; i++)
        {
            averageTempLength++;
            tempSum += temperature[i];
            totalPrecip += precipitation[i];
        }
        averageTemp = tempSum / averageTempLength;
        
        
        //Convert Labels to Real Labels
        if(tempLabel.contentEquals("C"));
        {
        	tempLabel = "°C";
        }
        if(tempLabel.contentEquals("F"));
        {
        	tempLabel = "°F";
        }
        if(precipLabel.contentEquals("i"));
        {
        	precipLabel = "in";
        }
        if(tempLabel.contentEquals("c"));
        {
        	precipLabel = "cm";
        }
        
        
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
           System.out.printf("%-17s%-19.1f%-17.1f%n",month[index], temperature[index], precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.printf("Average Temperature: " + averageTemp + tempLabel + "    Total Rain Fall: " + totalPrecip + " " + precipLabel);

	}
}
