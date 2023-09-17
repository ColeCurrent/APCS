
/**
 * This class defines a Circle object.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int radius;
    private String name = "Circle";

    // Constructor for objects of class Circle
    public Circle2(int x, int y, int radius)
    {
        // initialize instance variables
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "center is at (" + x + ", " + y + ").";
    }
    
    public String getName()
    {
        return name;
    }
}