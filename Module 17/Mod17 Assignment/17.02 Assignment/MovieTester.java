import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class MovieTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieTester
{
    public static void main(String args[]) {
        Movie[] myMovies = { new Movie("Fight Club", 1999, "20th Century Fox"),
                new Movie("The Shinning", 1980, "Warner Bros"), new Movie("Shrek 2", 2004, "Dreamworks"),
                new Movie("The Incredibles", 2004, "Pixar"), new Movie("Nanny McPhee", 2006, "Univeral"),
                new Movie("The Curse of the Were-Rabbit", 2006, "Aardman"),
                new Movie("Ice Age", 2002, "20th Century Fox"), new Movie("Lilo and Stitch", 2002, "Disney"),
                new Movie("Robots", 2005, "20th Century Fox"), new Movie("Monsters Inc", 2001, "Pixar") };
        Movie[] myMoviesSorted = new Movie[myMovies.length];

        System.out.println("Before Sorting:");
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Title - ascending:");
        myMoviesSorted = sortTitles(myMovies, 1);
        printMovies(myMoviesSorted);
        System.out.println();
        System.out.println("Sorted by Year - descending:");
        myMoviesSorted = sortYears(myMovies, 2);
        printMovies(myMoviesSorted);
        System.out.println();
        System.out.println("Sorted by Studio - ascending:");
        myMoviesSorted = sortStudios(myMovies, 1);
        printMovies(myMoviesSorted);
    }
    
    public static void printMovies(Movie[] movies) {
        for (Movie m : movies)
            System.out.println(m);
    }

    public static Movie[] sortTitles(Movie[] source, int order) {

        Movie[] dest = new Movie[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Movie next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) > 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else if (order == 2) {
            for (int i = 0; i < source.length; i++) {
                Movie next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getTitle().compareTo(dest[k - 1].getTitle()) < 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
        return dest;
    }

    public static Movie[] sortYears(Movie[] source, int order) {

        Movie[] dest = new Movie[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Movie next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getYear() > dest[k - 1].getYear()) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else if (order == 2) {
            for (int i = 0; i < source.length; i++) {
                Movie next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getYear() < dest[k - 1].getYear()) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
        return dest;
    }

    
    public static Movie[] sortStudios(Movie[] source, int order) {

        Movie[] dest = new Movie[source.length];
        if (order == 1) {
            for (int i = 0; i < source.length; i++) {
                Movie next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) > 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else if (order == 2) {
            for (int i = 0; i < source.length; i++) {
                Movie next = source[i];
                int insertindex = 0;
                int k = i;
                while (k > 0 && insertindex == 0) {
                    if (next.getStudio().compareTo(dest[k - 1].getStudio()) < 0) {
                        insertindex = k;
                    }
                    else {
                        dest[k] = dest[k - 1];
                    }
                    k--;
                }

                dest[insertindex] = next;
            }
            return dest;
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
        return dest;
    }
}
