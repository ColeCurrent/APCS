import java.util.ArrayList;
/**
 * Write a description of class CircleTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleTester
{
    public static void showCenter(Circle2 c)
    {
        System.out.println("For this " + c.getName() + " the " + c.getCenter());
    }
    
    //Main Method
    public static void main(String[] args)
    {
        //Initializes Objects
        Circle2 cir = new Circle2( 4, 1, 5);
        Circle2 cyl = new Cylinder2( 3, 5, 2, 6);
        Circle2 ov = new Oval2( 4, 7, 5, 8);
        Circle2 ovCyl = new OvalCylinder2( 8, 3, 9, 6, 10);
        
        //Initializes Array List of Circles
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(cir);
        circles.add(cyl);
        circles.add(ov);
        circles.add(ovCyl);
        
        for(int i = 0; i < circles.size(); i++)
        {
            showCenter(circles.get(i));
        }
    }
}

