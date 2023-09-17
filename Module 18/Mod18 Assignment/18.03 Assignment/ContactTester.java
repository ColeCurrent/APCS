
/**
 * Write a description of class ContactTester here.
 *
 * @author Cole Current
 * @version 5/18/2020
 */
public class ContactTester
{
    public static void main(String args[]) {
        Contact[] myContacts = { new Contact("Mason Current", "brother", "Jan 25", "(269) 612-4421", "mcurrent@gmail.com"),
                new Contact("Dana Current", "mom", "Apr 3", "(269) 277-8690", "danacurrent@yahoo.com"),
                new Contact("Cole Current", "me", "Oct 24", "(269) 277-9040", "colecurrent7@gmail.com"),
                new Contact("Mark Newton", "friend", "Oct 13", "(269) 988-7174", "kramnowten@gmail.com"),
                new Contact("Garth Current", "dad", "Jul 28", "(269) 252-1143", "garthcurrent@yahoo.com"),
                new Contact("Tyler Streu", "friend", "Nov 21", "(269) 462-6488", "cubsfan252@gmail.com") };

        int low = 0;
        int high = myContacts.length - 1;

        System.out.println("Contact list");
        System.out.println();
        printContacts(myContacts);
        System.out.println();
        System.out.println("Find Name - Mark Newton");
        findByName(myContacts, "Mark Newton", low, high);
        System.out.println();
        System.out.println("Find Name - Dana Current");
        findByName(myContacts, "Dana Current", low, high);
        System.out.println();
        System.out.println("Find Relation - friend");
        findByRelation(myContacts, "friend");
        System.out.println();
        System.out.println("Find Relation - dad");
        findByRelation(myContacts, "dad");
        System.out.println();
        System.out.println("Find Phone - (269) 612-4421");
        findByPhone(myContacts, "(269) 612-4421");
        System.out.println();
        System.out.println("Find Phone - (269) 277-9040");
        findByPhone(myContacts, "(269) 277-9040");
        System.out.println();
        System.out.println("Find Bday - October");
        findByBMonth(myContacts, "October");
        System.out.println();
        System.out.println("Find Bday - April");
        findByBMonth(myContacts, "Apr");
        System.out.println();
        System.out.println("Find Email - colecurrent7@gmail.com");
        findByEmail(myContacts, "colecurrent7@gmail.com", low, high);
        System.out.println();
        System.out.println("Find Email - danacurrent@yahoo.com");
        findByEmail(myContacts, "danacurrent@yahoo.com", low, high);
    }

    public static void printContacts(Contact[] c) {
        System.out.printf("%12s%14s%10s%19s%24s%n", "Name", "Relation", "Birthday", "Phone", "Email");
        System.out.println("---------------------------------------------------------------------------------");
        for (Contact con : c) {
            System.out.println(con);
        }
    }

    public static void mergeSortName(Contact[] c, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortName(c, low, mid);
        mergeSortName(c, mid + 1, high);

        mergeName(c, low, mid, high);
    }

    public static void mergeName(Contact[] c, int low, int mid, int high) {
        Contact[] temp = new Contact[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = c[j];
                j++;
            }
            else if (j > high) {
                temp[n] = c[i];
                i++;
            }
            else if (c[i].getName().compareTo(c[j].getName()) < 0) {
                temp[n] = c[i];
                i++;
            }
            else {
                temp[n] = c[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            c[k] = temp[k - low];
    }

    public static void findByName(Contact[] c, String toFind, int l, int h) {
        mergeSortName(c, l, h);
        int high = c.length;
        int low = -1;
        int probe;
        int index;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (c[probe].getName().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (c[low].getName().compareTo(toFind) == 0))
            index = low;
        else
            index = -1;
        if (index == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found: " + c[index]);
    }

    public static void findByRelation(Contact[] c, String toFind) {
        int found = 0;
        System.out.println("Find results:");
        for (int i = 0; i < c.length; i++)
            if (c[i].getRelation().compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    public static void findByPhone(Contact[] c, String toFind) {
        int found = 0;
        System.out.println("Find results:");
        for (int i = 0; i < c.length; i++)
            if (c[i].getPhone().compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    public static void findByBMonth(Contact[] c, String toFind) {
        int found = 0;
        System.out.println("Find results:");
        for (int i = 0; i < c.length; i++)
            if (c[i].getBday().substring(0, 3).compareTo(toFind) == 0) {
                found++;
                System.out.println(c[i]);
            }
        if (found == 0)
            System.out.println("There are no listings for " + toFind);
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }

    public static void mergeSortEmail(Contact[] c, int low, int high) {
        if (low == high)
            return;

        int mid = (low + high) / 2;

        mergeSortEmail(c, low, mid);
        mergeSortEmail(c, mid + 1, high);

        mergeEmail(c, low, mid, high);
    }

    public static void mergeEmail(Contact[] c, int low, int mid, int high) {
        Contact[] temp = new Contact[high - low + 1];

        int i = low, j = mid + 1, n = 0;

        while (i <= mid || j <= high) {
            if (i > mid) {
                temp[n] = c[j];
                j++;
            }
            else if (j > high) {
                temp[n] = c[i];
                i++;
            }
            else if (c[i].getEmail().compareTo(c[j].getEmail()) < 0) {
                temp[n] = c[i];
                i++;
            }
            else {
                temp[n] = c[j];
                j++;
            }
            n++;
        }

        for (int k = low; k <= high; k++)
            c[k] = temp[k - low];
    }

    public static void findByEmail(Contact[] c, String toFind, int l, int h) {
        mergeSortName(c, l, h);
        int high = c.length;
        int low = -1;
        int probe;
        int index;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (c[probe].getEmail().compareTo(toFind) > 0)
                high = probe;
            else
                low = probe;
        }
        if ((low >= 0) && (c[low].getEmail().compareTo(toFind) == 0))
            index = low;
        else
            index = -1;
        if (index == -1)
            System.out.println("Not Found.");
        else
            System.out.println("Found: " + c[index]);
    }
}
