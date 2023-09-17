
/**
 * Write a description of class ElectionTesterV1 here.
 *
 * @author Cole Current
 * @version 5/16/2020
 */
public class ElectionTesterV1
{
    public static int getTotal(Candidate[] candidates)
    {
        int total = 0;
        for(Candidate c : candidates)
        {
            total += c.getVotes();
        }
        return total;
    }
    
    public static void printResults(Candidate[] candidates)
    {
        double total = getTotal(candidates);
        System.out.printf("%-24s%-26s%s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (Candidate c : candidates) {
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getVotes(), (int)((c.getVotes() / total) * 100));
        }
    }
    
    public static void main(String[] args)
    {
        Candidate[] candidates = new Candidate[5];
        candidates[0] = new Candidate("Hillary Clinton", 65853514);
        candidates[1] = new Candidate("Donald Trump", 62984828);
        candidates[2] = new Candidate("Gary Jonson", 4489341);
        candidates[3] = new Candidate("Jill Stein", 1457218);
        candidates[4] = new Candidate("Evan McMullin", 731991);
        
        printResults(candidates);
    }
}
