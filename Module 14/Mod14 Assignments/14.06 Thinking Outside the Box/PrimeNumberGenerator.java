import java.util.ArrayList;
/**
 * Write a description of class PrimeNumberGenerator here.
 *
 * @author Cole Current
 * @version 5/12/2020
 */
public class PrimeNumberGenerator
{
    public static ArrayList<Integer> findPrimes(int low, int high)
    {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for(int i = low; i < high; i++)
        {
           boolean prime = true;
        
           int j = 2;
           while(j <= i/2)
           {
               if(i % j == 0)
               {
                   prime = false;
                   j += i;
                }
                j++;
            } 
            if(prime) 
            {
                primes.add(i);
            }
        }
        
        return primes;
    }
}
