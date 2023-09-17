
/**
 * Write a description of class Music2 here.
 *
 * @author Cole Current
 * @version 5/18/2020
 */
public class Music2
{
    // instance variables
    private int year;
    private String title;
    private String artist;

    // Constructor for objects of class Music
    public Music2(String t, int y, String a)
    {
        // initialize instance variables
        title = t;
        year = y;
        artist = a;
    }

    public String getTitle()
    {
        return title;
    }
   
    public void setTitle(String t)
    {
        this.title = title;
    }
   
    public String getArtist()
    {
        return artist;
    }
    
    public void setArtist(String a)
    {
        this.artist = artist;
    }
   
    public int getYear()
    {
        return year;
    }
    
    public void setTitle(int y)
    {
        this.year = year;
    }
   
    public String toString()
    {
        String str = String.format( "%-25s %4d   %-20s ", title,  year , artist);
        return str;
    }
}