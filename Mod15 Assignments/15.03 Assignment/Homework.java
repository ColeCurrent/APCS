
/**
 * Write a description of class Homework here.
 *
 * @author Cole Current
 * @version 5/12/2020
 */
public abstract class Homework implements Processing
{
    private int pagesRead;
    private String homework;
    
    public Homework(){
        pagesRead = 0;
        homework = "none:";
    }
    
    public abstract void setPagesRead(int pagesRead);
    
    public abstract void setHomework(String homework);
    
    public abstract int getPagesRead();
    
    public abstract String getHomework();
}
