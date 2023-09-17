
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
public class AnimalPopulation
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("SpeciesList.txt"));
        Random randomNumber = new Random();
        
        //Variable Declarations
        int GS = 0;
        int RS = 0;
        int FS = 0;
        int randomSpecies = 0;
        int num = 10;
        
        //Animal Calculations
        for(int loop = 0; loop<=10; loop++)
        {
            randomSpecies = randomNumber.nextInt(num);
            //System.out.println("Random Species: " + randomSpecies);
            while(randomSpecies != 1)
            {
                if(randomSpecies <= 6)
                {
                    GS++;
                }
                if(randomSpecies > 6)
                {
                    RS++; 
                }
                randomSpecies = randomNumber.nextInt(num);
                //System.out.println("Random Species: " + randomSpecies);
            }
            if(randomSpecies == 1)
            {
                FS++;
            }
            outFile.println(GS);
            outFile.println(RS);
            outFile.println(FS);
            GS = GS - GS;
            RS = RS - RS;
            FS = FS - FS;
        }
        
        outFile.close( );
    }
}
