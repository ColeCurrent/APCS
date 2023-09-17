
/**
 * Write a description of class MovieTester3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MovieTester3
{
    public static void main(String args[]) {
        Movie3[] myMovies = { new Movie3("Fight Club", 1999, "20th Century Fox"),
                new Movie3("The Shinning", 1980, "Warner Bros"), new Movie3("Shrek 2", 2004, "Dreamworks"),
                new Movie3("The Incredibles", 2004, "Pixar"), new Movie3("Nanny McPhee", 2006, "Univeral"),
                new Movie3("The Curse of the Were-Rabbit", 2006, "Aardman"),
                new Movie3("Ice Age", 2002, "20th Century Fox"), new Movie3("Lilo and Stitch", 2002, "Disney"),
                new Movie3("Robots", 2005, "20th Century Fox"), new Movie3("Monsters Inc", 2001, "Pixar") };

        System.out.println("Before Sorting:");
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Title - ascending:");
        sortTitles(myMovies, 1);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Year - descending:");
        sortYears(myMovies, 2);
        printMovies(myMovies);
        System.out.println();
        System.out.println("Sorted by Studio - ascending:");
        sortStudios(myMovies, 1);
        printMovies(myMovies);
    }
    
    public static void printMovies(Movie3[] movies) {
        for (Movie3 m : movies)
            System.out.println(m);
    }

    public static void sortTitles(Movie3[] source, int order) {
        if (order == 1) {
            int posmax;
            Movie3 temporaryPos;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                temporaryPos = source[i];
                for (int k = 1; k <= i; k++) {
                    if (source[k].getTitle().compareTo(source[posmax].getTitle()) > 0)
                        posmax = k;
                    }
                source[i] = source[posmax];
                source[posmax] = temporaryPos;
            }
        }
        else if (order == 2) {
            int posmax;
            Movie3 temp;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                for (int k = 1; k <= i; k++) {
                    if (source[k].getTitle().compareTo(source[posmax].getTitle()) < 0)
                        posmax = k;
                }
                temp = source[i];
                source[i] = source[posmax];
                source[posmax] = temp;
            }
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
    }
    
    public static void sortYears(Movie3[] source, int order) {
        if (order == 1) {
            int posmax;
            Movie3 temp;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                for (int k = 1; k <= i; k++) {
                    if (source[k].getYear() > source[posmax].getYear())
                        posmax = k;
                }
                temp = source[i];
                source[i] = source[posmax];
                source[posmax] = temp;
            }
        }
        else if (order == 2) {
            int posmax;
            Movie3 temp;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                for (int k = 1; k <= i; k++) {
                    if (source[k].getYear() < source[posmax].getYear())
                        posmax = k;
                }
                temp = source[i];
                source[i] = source[posmax];
                source[posmax] = temp;
            }
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
    }
    
    public static void sortStudios(Movie3[] source, int order) {
        if (order == 1) {
            int posmax;
            Movie3 temp;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                for (int k = 1; k <= i; k++) {
                    if (source[k].getStudio().compareTo(source[posmax].getStudio()) > 0)
                        posmax = k;
                }
                temp = source[i];
                source[i] = source[posmax];
                source[posmax] = temp;
            }
        }
        else if (order == 2) {
            int posmax;
            Movie3 temp;

            for (int i = source.length - 1; i > 0; i--) {
                posmax = 0;
                for (int k = 1; k <= i; k++) {
                    if (source[k].getTitle().compareTo(source[posmax].getTitle()) < 0)
                        posmax = k;
                }
                temp = source[i];
                source[i] = source[posmax];
                source[posmax] = temp;
            }
        }
        else {
            System.out.println("Please enter a valid order number!");
        }
    }
}
