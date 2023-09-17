/**
 * Calculates Total Daily Energy Expenditure
 *
 * @author Cole Current
 * @version 10/28/19
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Input
        System.out.print("Please enter your name: ");
        String name = in.next();
        name += in.nextLine();
        System.out.print("Pease enter your Basal Metabolic Rate (ex. 2156): ");
        int BMR = in.nextInt();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next();
        System.out.println();
        
        //Display Activity Level
        System.out.println("Select Your Activity Level");
        System.out.println(" [A] Resting (Sleeping, Reclining)");
        System.out.println(" [B] Sedentary (Minimal Movement)");
        System.out.println(" [C] Light (Sitting, Standing)");
        System.out.println(" [D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println(" [E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println(" [F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.println();
        System.out.println("Enter the letter that represents your activity level");
        String activityLevel = in.next();
        System.out.println();
        
        //Activity Level Processing
        double activityFactor = 0;
        if(activityLevel.equalsIgnoreCase("A")){
            activityFactor = 1.0;
        }
        else if(activityLevel.equalsIgnoreCase("B")){
            activityFactor = 1.3;
        }
        else if(activityLevel.equalsIgnoreCase("C"))
        {
            if(gender.equalsIgnoreCase("M")){
                activityFactor = 1.6;
            }
            else{
                activityFactor = 1.5;
            }
        }
        else if(activityLevel.equalsIgnoreCase("D"))
        {
            if(gender.equalsIgnoreCase("M")){
                activityFactor = 1.7;
            }
            else{
                activityFactor = 1.6;
            }
        }
        else if(activityLevel.equalsIgnoreCase("E"))
        {
            if(gender.equalsIgnoreCase("M")){
                activityFactor = 2.1;
            }
            else{
                activityFactor = 1.9;
            }
        }
        else if(activityLevel.equalsIgnoreCase("F"))
        {
            if(gender.equalsIgnoreCase("M")){
                activityFactor = 2.4;
            }
            else{
                activityFactor = 2.2;
            }
        }
        
        //Calculate TDEE
        double TDEE = (BMR / activityFactor);
        
        //Output
        System.out.print("--------------------------------------------------------");
        System.out.print("Your Results:");
        System.out.print("Name: " + name);
        System.out.println("        Gender: " + gender);
        System.out.print("BMR: " + BMR);
        System.out.println("        Activity Factor: " + activityFactor);
        System.out.print("Total Daily Energy Expenditure: " + TDEE);
    }
}
