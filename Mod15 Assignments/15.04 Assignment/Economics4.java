
/**
 * Write a description of class Homework here.
 *
 * @author Cole Current
 * @version 5/12/2020
 */
public class Economics4 extends Homework4
{
    private String homework;
    private int pagesRead;
    
    public Economics4()
    {
        homework = "Economics";
        pagesRead = 0;
    }
    
    public void setPagesRead(int pagesRead)
    {
        this.pagesRead = pagesRead;
    }
    
    public void setHomework(String homework)
    {
        this.homework = homework;
    }
    
    public int getPagesRead()
    {
        return pagesRead;
    }
    
    public String getHomework()
    {
        return homework;
    }
    
    public String toString()
    {
        return homework + " - read " + pagesRead + " pages.";
    }
    
    public void doHomework() {
        setPagesRead(getPagesRead() - 1);
    }
}
