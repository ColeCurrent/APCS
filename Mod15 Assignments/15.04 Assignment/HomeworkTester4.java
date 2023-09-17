import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Write a description of class Homework here.
 *
 * @author Cole Current
 * @version 5/12/2020
 */
public class HomeworkTester4
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        List<Homework4> homework = new ArrayList<Homework4>();
        
        homework.add(new Anatomy4());
        homework.add(new Calculus4());
        homework.add(new Economics4());
        homework.add(new English4());
        
        //Print Homework and assigned reading
        System.out.printf("%24s%n", "My Homework");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
        for (Homework4 i : homework)
        {
            System.out.println(i.getHomework());
            System.out.print("Before reading: ");
            i.setPagesRead(rand.nextInt(10));
            System.out.println(i.getPagesRead());
            System.out.print("After reading: ");
            i.doHomework();
            System.out.println(i);
            System.out.println();
        }
        System.out.println();
        
        
        //Compare the ammount of work for each class
        System.out.printf("%24s%n", "Comparing My Homework");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
        for (Homework4 i : homework)
        {
            for (Homework4 j : homework)
            {
                if(i != j)
                {
                    if(i.getHomework().compareTo(j.getHomework()) == 0)
                    {
                        System.out.println("The homework for " + i.getHomework() + " and " + j.getHomework() + " are the SAME number of pages.");
                    }
                    else if(i.getHomework().compareTo(j.getHomework()) < 0)
                    {
                        System.out.println("The homework for " + i.getHomework() + " has LESS pages to tread than " + j.getHomework() + ".");
                    }
                    else
                    {
                        System.out.println("The homework for " + i.getHomework() + " has MORE pages to tread than " + j.getHomework() + ".");
                    }
                }
            }
        }
    }
}
