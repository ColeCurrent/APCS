/**
 * Calculate the percentage of families
 * 
 * Cole Current
 * 11/13/19
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
    public static void main(String[] args) throws IOException
    {
        //Defining File to be Processeced 
        String token = "";
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        
        //Declaring Variables
        int BB = 0;
        int GB = 0;
        int GG = 0;
        int totalFamilies = 0;
        
        //Processing Files
        while( inFile.hasNext() )
        {
            token = inFile.next();
            totalFamilies++;
            if( token.equals("BB"))
            {
                BB++;
            }
            else if( token.equals("GB"))
            {
                GB++;
            }
            else if( token.equals("BG"))
            {
                GB++;
            }
            else if( token.equals("GG"))
            {
                GG++;
            }
        }
        
        inFile.close();  //Ends file processing
        
        //Family percentage calculations
        double BBpercentage = BB / (double)totalFamilies * 100;
        double GBpercentage = GB / (double)totalFamilies * 100;
        double GGpercentage = GG / (double)totalFamilies * 100;
        
        //Output
        System.out.println("Composition statistics for families with two children.");
        System.out.println("");
        System.out.println("Total number of families: " + totalFamilies);
        System.out.println("");
        System.out.println("Number of families with");
        System.out.println("2 boys: ");
        System.out.println("    represents: " + BBpercentage + "%");
        System.out.println("2 girls: ");
        System.out.println("    represents: " + GBpercentage + "%");
        System.out.println("1 boy and 1 girl: ");
        System.out.println("    represents: " + GGpercentage + "%");
    }//end of main method
}//end of class
