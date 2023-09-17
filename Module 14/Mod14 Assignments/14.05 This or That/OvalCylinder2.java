
/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class OvalCylinder2 extends Oval2
{
    // instance variables
    private int height;
    private String name = "Oval Cylinder";

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int height)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }
    
    public String getName()
    {
        return name;
    }
}