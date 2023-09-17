/**
 * Annual Weather description:
 * 
 * @author Cole Current
 * @version 12/3/19
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
        
        //To test 2nd set, comment the current city, temperature, precipitation, and uncomment the next three lines
        //String city = "Fort Myers";
        //double [] temperature ={64.9, 66.0, 69.9, 73.6, 78.8, 82.2, 83.0, 83.1, 82.1, 77.5, 71.7, 66.4};
        //double [] precipitation ={2.2, 2.1, 2.7, 1.7, 3.4, 9.8, 9.0, 9.5, 7.9, 2.6, 1.7, 1.6};
            
        String tempLabel = "";    //initialize to F
        String precipLabel = ""; //initialize to in
        double tempSum = 0;
        double averageTemp = 0;
        double averageTempLength = 0;
        double totalPrecip = 0;
        
        
        //Measurement Input
        System.out.print("Choose a tempature scale (Farenheit = F, Celcius = C): ");
        tempLabel = in.next().toUpperCase();
        System.out.print("Choose a precipitation scale (i = inches, c = centimeters): ");
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
            totalPrecip = totalPrecip + precipitation[i];
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
        System.out.printf("%16s%11s%2s%7s%n", "Location: ", city, ", ", state);
        System.out.printf("%-10s%-12s%1s%2s%-6s%-14s%1s%2s%1s%n", "Month", "Temperature", "(", tempLabel, ")", "Precipitation", "(", precipLabel, ")");
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
           System.out.printf("%-17s%1.1f%2s%17.1f%2s%n",month[index], temperature[index], tempLabel, precipitation[index], precipLabel);
        }
        System.out.println("***************************************************");
        System.out.printf("%24s%5.1f%2s%22s%2.1s%2s","Average Temperature:", averageTemp, tempLabel, "Total Rain Fall:", totalPrecip, precipLabel);

	}
}
