/**
 * This program calculates BMI
 * 
 * Cole Current
 * 10/27/19
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        //Input
        System.out.print("Enter your name (first last): ");
        String name = in.next();
        name += in.nextLine();
        System.out.print("Enter your weight lbs (ex. 175): ");
        double weightLbs = in.nextInt();
        System.out.print("Enter your height in feet and inches (ex. 5 9): ");
        String heightFt = in.next();
        heightFt += in.nextLine();
        System.out.println("");
        System.out.println("Body Mass Index Calculator");
        System.out.println("[][][][]][][][][][][][][][][][][][][][][][][][][][][]");
        
        //Process
        double kgConversion = 0.453592;
        double weightKg = weightLbs * kgConversion;            //lbs to kg conversion
        String feet1 = heightFt.substring(0,1);
        String inches1 = heightFt.substring(2);
        double feet = Double.parseDouble(feet1);
        double inches = Double.parseDouble(inches1);
        double heightMeters = ((feet * 12) + inches) * 0.0254; //inches to meters conversion
        double BMI = weightKg / (heightMeters * heightMeters);
        
        //Condtional Statements
        String BMIStatus;
        if ( BMI < 18.5 )
          BMIStatus = "Underweight";
        else if ( BMI < 25 )
          BMIStatus = "Healthy Weight";
        else if ( BMI < 30 )
          BMIStatus = "Overweight";
        else
          BMIStatus = "Obese";
        
        String BMIStr = Double.toString(BMI);   //Convert BMI to string for substring method
          
        //Output
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + heightMeters);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("BMI: " + BMIStr.substring(0,4));
        System.out.println("Category: " + BMIStatus);
    }
}
    
    
    


