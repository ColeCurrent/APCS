
/**
 * Write a description of class MusicTester2 here.
 *
 * @author Cole Current
 * @version 5/18/2020
 */
public class MusicTester2
{
    public static void main(String args[]) {
        Music2[] myMusic = { new Music2("Caroline", 2017, "Amine"),
                new Music2("Reel It In", 2018, "Amine"), new Music2("Blackjack", 2018, "Amine"),
                new Music2("Spice Girl", 2017, "Amine"), new Music2("Blackjack", 2018, "Amine"),
                new Music2("Banana Pancakes", 2005, "Jack Johnson"), new Music2("Better Together", 2005, "Jack Johnson"),
                new Music2("Sitting, Waiting, Wishing", 2005, "Jack Johnson"), new Music2("Breakdown", 2005, "Jack Johnson"),
                new Music2("Good People", 2005, "Jack Johnson"), new Music2("In the Still of the Night", 1956, "The Five Satins") };
        
        int low = 0;
        int high = myMusic.length - 1;
        int index;
        System.out.println("Music library:");
        System.out.println("----------------");
        printMusic(myMusic);
        System.out.println();
        System.out.println("Search - Title - Caroline");
        mergeSortTitle(myMusic, low, high);
        index = searchTitle(myMusic, "Caroline");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Title - Good People");
        mergeSortTitle(myMusic, low, high);
        index = searchTitle(myMusic, "Good People");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Year - 2005");
        mergeSortYear(myMusic, low, high);
        index = searchYear(myMusic, 2005);
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Year - 2018");
        mergeSortYear(myMusic, low, high);
        index = searchYear(myMusic, 2018);
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Artist - Amine");
        mergeSortArtist(myMusic, low, high);
        index = searchArtist(myMusic, "Amine");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
        System.out.println();
        System.out.println("Search - Singer - Jack Johnson");
        mergeSortArtist(myMusic, low, high);
        index = searchArtist(myMusic, "Jack Johnson");
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found: " + myMusic[index]);
    }

    public static void printMusic(Music2[] m) {
        for (Music2 song : m) {
            System.out.println(song);
        }
    }
    
    public static void mergeSortTitle(Music2[] m, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortTitle(m, low, mid);
        mergeSortTitle(m, mid + 1, high);

        mergeTitle(m, low, mid, high);
    }
    
    public static void mergeTitle(Music2[] m, int low, int mid, int high) {
        Music2[] temp = new Music2[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = m[j];
                j++;
            }
            else if (j > high) {
                temp[n] = m[i];
                i++;
            }
            else if (m[i].getTitle().compareTo(m[j].getTitle()) < 0) {
                temp[n] = m[i];
                i++;
            }
            else {
                temp[n] = m[j];
                j++;
            }
            n++;
        }
    }
    
    public static void mergeSortYear(Music2[] m, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortYear(m, low, mid);
        mergeSortYear(m, mid + 1, high);

        mergeYear(m, low, mid, high);
    }
    
    public static void mergeYear(Music2[] m, int low, int mid, int high) {
        Music2[] temp = new Music2[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = m[j];
                j++;
            }
            else if (j > high) {
                temp[n] = m[i];
                i++;
            }
            else if (m[i].getYear() < m[j].getYear()) {
                temp[n] = m[i];
                i++;
            }
            else {
                temp[n] = m[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            m[k] = temp[k - low];
    }
    
    public static void mergeSortArtist(Music2[] m, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortArtist(m, low, mid);
        mergeSortArtist(m, mid + 1, high);

        mergeArtist(m, low, mid, high);
    }

    public static void mergeArtist(Music2[] m, int low, int mid, int high) {
        Music2[] temp = new Music2[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = m[j];
                j++;
            }
            else if (j > high) {
                temp[n] = m[i];
                i++;
            }
            else if (m[i].getArtist().compareTo(m[j].getArtist()) < 0) {
                temp[n] = m[i];
                i++;
            }
            else {
                temp[n] = m[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            m[k] = temp[k - low];
    }
    
    public static int searchTitle(Music2[] m, String toFind) {
        int high = m.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (m[probe].getTitle().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (m[low].getTitle().compareTo(toFind) == 0))
            return low;
        else
            return -1;
    }

    public static int searchYear(Music2[] m, int toFind) {
        int high = m.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (m[probe].getYear() > toFind)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (m[low].getYear() == toFind))
            return low;
        else
            return -1;
    }

    public static int searchArtist(Music2[] m, String toFind) {
        int high = m.length;
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (m[probe].getArtist().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (m[low].getArtist().compareTo(toFind) == 0))
            return low;
        else
            return -1;
    }
}
