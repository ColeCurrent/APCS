import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Write a description of class Homework here.
 *
 * @author Cole Current
 * @version 5/12/2020
 */
public class HomeworkTester
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        List<Homework> homework = new ArrayList<Homework>();
        
        homework.add(new Anatomy());
        homework.add(new Calculus());
        homework.add(new Economics());
        homework.add(new English());
        
        for (Homework i : homework)
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
    }
}
