 
/**
 * Write a description of class MusicTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicTester
{
    public static void main(String args[]) {
        Music[] myMusic = { new Music("Caroline", 2017, "Amine"),
                new Music("Reel It In", 2018, "Amine"), new Music("Blackjack", 2018, "Amine"),
                new Music("Spice Girl", 2017, "Amine"), new Music("Blackjack", 2018, "Amine"),
                new Music("Banana Pancakes", 2005, "Jack Johnson"), new Music("Better Together", 2005, "Jack Johnson"),
                new Music("Sitting, Waiting, Wishing", 2005, "Jack Johnson"), new Music("Breakdown", 2005, "Jack Johnson"),
                new Music("Good People", 2005, "Jack Johnson"), new Music("In the Still of the Night", 1956, "The Five Satins") };

        System.out.println("Music library:");
        System.out.println("----------------");
        printMusic(myMusic);
        System.out.println();
        System.out.println("Seach - Title - Caroline");
        searchTitle(myMusic, "Caroline");
        System.out.println();
        System.out.println("Search - Title - Good People");
        searchTitle(myMusic, "Good People");
        System.out.println();
        System.out.println("Search - Year - 2018");
        searchYear(myMusic, 2018);
        System.out.println();
        System.out.println("Search - Year - 2005");
        searchYear(myMusic, 2005);
        System.out.println();
        System.out.println("Search - Singer - Amine");
        searchArtist(myMusic, "Amine");
        System.out.println();
        System.out.println("Search - Singer - Jack Johnson");
        searchArtist(myMusic, "Jack Johnson");
    }

    public static void printMusic(Music[] m) {
        for (Music song : m) {
            System.out.println(song);
        }
    }

    public static void searchTitle(Music[] m, String toFind) {
        int found = -1;

        for (int i = 0; i < m.length; i++)
            if (m[i].getTitle().compareTo(toFind) == 0) {
                found = i;
                break;
            }
        if (found != -1) {
            System.out.println("We found " + toFind + " in the library: ");
            System.out.println(m[found]);
        }
        else
            System.out.println(toFind + " is not in the library");
    }

    public static void searchYear(Music[] m, int toFind) {
        System.out.println("Find results:");
        int found = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getYear() == toFind) {
                found++;
                System.out.println(m[i]);
            }
        }
        if (found > 0)
            System.out.println("There were " + found + " listings for " + toFind);
        else
            System.out.println("There are no listings for " + toFind);
    }

    public static void searchArtist(Music[] m, String toFind) {
        System.out.println("Find results:");
        int found = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i].getArtist().compareTo(toFind) == 0) {
                found++;
                System.out.println(m[i]);
            }
        }
        if (found > 0)
            System.out.println("There were " + found + " listings for " + toFind);
        else
            System.out.println("There are no listings for " + toFind);
    }
}
