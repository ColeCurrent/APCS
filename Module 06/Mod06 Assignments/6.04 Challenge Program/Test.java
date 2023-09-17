
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String[] args)
    {
        double [] array = {24.6, 22.3, 28.4, 20.9, 24.7, 25.2, 23.8};
        double average = 0;
        double minValue = Integer.MAX_VALUE;
        double maxValue = Integer.MIN_VALUE;
        
        for(int i = 0; i < array.length;i++)
        {
            if(array[i] < minValue)
            {
                minValue = array[i];
            }
            if(array[i] > maxValue)
            {
                maxValue = array[i];
            }
        }
        
        for(int i = 0; i < array.length;i++)
        {
            if(array[i] != minValue)
            {
                if(array[i] != maxValue)
                {
                    average += array[i];
                    System.out.println("The value of the score in position " + (i + 1) + " is " + array[i] + ".");
                }
            }
        }
        average = average / array.length;
        System.out.println("The average score is " + average + ".");
        
    }
}