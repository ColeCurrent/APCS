import java.util.ArrayList;
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
        //Class Instances
        Homework anatomy = new Anatomy();
        Homework calculus = new Calculus();
        Homework english = new English();
        Homework economics = new Economics();
        
        //ArrayList of classes
        ArrayList<Homework> classes = new ArrayList<Homework>();
        
        classes.add(anatomy);
        classes.add(calculus);
        classes.add(english);
        classes.add(economics);
        
        anatomy.setHomework("Anatomy");
        anatomy.setPagesRead(4);
        calculus.setHomework("Calculus");
        calculus.setPagesRead(1);
        english.setHomework("English");
        english.setPagesRead(7);
        economics.setHomework("Economics");
        economics.setPagesRead(2);
        
        //Output
        System.out.println(anatomy.toString());
        System.out.println(calculus.toString());
        System.out.println(english.toString());
        System.out.println(economics.toString());
        
    }
}
