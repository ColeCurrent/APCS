
/**
 * Write a description of class MovieTester3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieTester4
{
    public static void main(String args[]) {
        Movie4[] myMovies = { new Movie4("Fight Club", 1999, "20th Century Fox"),
                new Movie4("The Shinning", 1980, "Warner Bros"), new Movie4("Shrek 2", 2004, "Dreamworks"),
                new Movie4("The Incredibles", 2004, "Pixar"), new Movie4("Nanny McPhee", 2006, "Univeral"),
                new Movie4("The Curse of the Were-Rabbit", 2006, "Aardman"),
                new Movie4("Ice Age", 2002, "20th Century Fox"), new Movie4("Lilo and Stitch", 2002, "Disney"),
                new Movie4("Robots", 2005, "20th Century Fox"), new Movie4("Monsters Inc", 2001, "Pixar") };

        System.out.println("Before Sorting:");
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Title - ascending:");
        sortTitles(myMovies, 0, myMovies.length - 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Year - descending:");
        sortYears(myMovies, 0, myMovies.length - 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Studio - ascending:");
        sortStudios(myMovies, 0, myMovies.length - 1);
        printMovies(myMovies);
    }
    
    public static void printMovies(Movie4[] movies) {
        for (Movie4 m : movies)
            System.out.println(m);
    }

    public static void sortTitles(Movie4[] movies, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        sortTitles(movies, low, mid);
        sortTitles(movies, mid + 1, high);

        mergeTitles(movies, low, mid, high);
    }
    
    public static void mergeTitles(Movie4[] a, int low, int mid, int high) {
        Movie4[] temp = new Movie4[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = a[j];
                j++;
            }
            else if (j > high) {
                temp[n] = a[i];
                i++;
            }
            else if (a[i].getTitle().compareTo(a[j].getTitle()) < 0) {
                temp[n] = a[i];
                i++;
            }
            else {
                temp[n] = a[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            a[k] = temp[k - low];

    }
    
    public static void sortYears(Movie4[] movies, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        sortYears(movies, low, mid);
        sortYears(movies, mid + 1, high);

        mergeYears(movies, low, mid, high);
    }
    
    public static void mergeYears(Movie4[] a, int low, int mid, int high) {
        Movie4[] temp = new Movie4[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = a[j];
                j++;
            }
            else if (j > high) {
                temp[n] = a[i];
                i++;
            }
            else if (a[i].getYear() > a[j].getYear()) {
                temp[n] = a[i];
                i++;
            }
            else {
                temp[n] = a[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            a[k] = temp[k - low];

    }
    
    public static void sortStudios(Movie4[] movies, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        sortStudios(movies, low, mid);
        sortStudios(movies, mid + 1, high);

        mergeStudios(movies, low, mid, high);
    }
    
    public static void mergeStudios(Movie4[] a, int low, int mid, int high) {
        Movie4[] temp = new Movie4[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = a[j];
                j++;
            }
            else if (j > high) {
                temp[n] = a[i];
                i++;
            }
            else if (a[i].getStudio().compareTo(a[j].getStudio()) < 0) {
                temp[n] = a[i];
                i++;
            }
            else {
                temp[n] = a[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            a[k] = temp[k - low];

    }
}
