
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test{
    public static void main(String[] args){
        String value1 = "teddy";
        String value2 = "banana";
        
        if (value1.compareTo(value2) < 0 )
        {
            System.out.println("value1 comes before value2 in the dictionary");
        }
        else
        {
            System.out.println("value2 comes before value1 in the dictionary, or they are the same");
        }
    }
}
