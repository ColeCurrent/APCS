
/**
 * Write a description of class Homework here.
 *
 * @author Cole Current
 * @version 5/12/2020
 */
public abstract class Homework4 implements Processing4, Comparable<Homework4>
{
    private int pagesRead;
    private String homework;
    
    public Homework4(){
        pagesRead = 0;
        homework = "none:";
    }
    
    public abstract void setPagesRead(int pagesRead);
    
    public abstract void setHomework(String homework);
    
    public abstract int getPagesRead();
    
    public abstract String getHomework();
    
    public int compareTo(Homework4 hw)
    {
        return this.pagesRead - hw.getPagesRead();
    }
}
