
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
public class gsd
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("SpeciesList.txt"));
        Random randomNumber = new Random(); //Random # declaration
        Scanner in = new Scanner(System.in);
        
        //Scanner Input
        System.out.println("Welcome to the Fox Squirrel Simulator!");
        System.out.println("");
        System.out.println("How many trails should be run?");
        System.out.print("Enter a integer greater than 1,000: ");
        int number = in.nextInt();
        if(number < 1000)
        {
            System.out.println("You entered an integer less than 1000."); 
            System.out.print("Please enter a integer greater than 1,000: ");
            number = in.nextInt();
        }
        
        //Variable Declarations
        int GS = 0;
        int RS = 0;
        int FS = 0;
        int randomSpecies = 0;
        int num = 10;
        int counter = 0;
        
        
        //Animal Calculations
        for(int loop = 0; loop<=number; loop++)
        {
            randomSpecies = randomNumber.nextInt(num);
            //System.out.println("Random Species: " + randomSpecies);
            while(randomSpecies != 1)
            {
                if(randomSpecies <= 6)
                {
                    GS++;
                    counter++;
                }
                if(randomSpecies > 6)
                {
                    RS++;
                    counter++;
                }
                randomSpecies = randomNumber.nextInt(num);
            }
            if(randomSpecies == 1)
            {
                FS++;
                counter++;
            }
            outFile.println(counter);
            GS = GS - GS;
            RS = RS - RS;
            FS = FS - FS;
            counter -= counter;
        }
        outFile.close( ); //close file
        
        //Declares file to read
        File fileName = new File("SpeciesList.txt");
        Scanner inFile = new Scanner(fileName);
        
        //Declare Variables
        double token = 0;
        int speciesNumber = 0; 
        int total = 0;
        
        //Read file
        while(inFile.hasNext())
        {
            token = inFile.nextDouble();
            total += token;
            speciesNumber++;
        }
        
        //Calculations
        double average = (double)total / speciesNumber; 
        
        //Output
        System.out.println("");
        System.out.println("simulating trails now... one moment please..");
        System.out.println("");
        System.out.println("The results!");
        System.out.println("The average number of squirrels observed until");
        System.out.println("spotting a Fox Squirrel at the city park is: " + average);
    }
}