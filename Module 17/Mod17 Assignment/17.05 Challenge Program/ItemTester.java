import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ItemTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemTester
{
    public static void main(String[] args)
    {
        Item[] basics = { new Item("Globe", "1111", 49.99, 16), new Item("Candles", "5209", 6.99, 31), 
                    new Item("Lotion", "4228", 3.99, 28), new Item("Lamp", "3825", 14.99, 20),
                    new Item("Silverware", "6142", 9.99, 40), new Item("Wrench Set", "6206", 12.99, 16) };
                    
        Item[] dest = new Item[basics.length];
            System.out.println("Original Array:");
            System.out.println();
            printInventory(basics);
            System.out.println();
            System.out.println("Sorted by ID:");
            dest = sortID(basics, 1);
            System.out.println();
            printInventory(dest);
            System.out.println();
            System.out.println("Sorted by Name:");
            dest = sortName(basics, 1);
            System.out.println();
            printInventory(dest);
            System.out.println();
            System.out.println("Sorted by inStore");
            sortInStore(basics, 1);
            System.out.println();
            printInventory(basics);
            System.out.println();
            System.out.println("Sorted by Price");
            sortPrice(basics, 0, basics.length - 1);
            System.out.println();
            printInventory(basics);
        }
    
        public static void printInventory(Item[] inventory) {
            System.out.printf("%s%11s%14s%9s%n", "itemID", "itemName", "inStore", "price");
            System.out.println("--------------------------------------------");
    
            for (Item item : inventory) {
                System.out.println(item);
            }
        }
    
        public static Item[] sortID(Item[] source, int order) {
    
            Item[] dest = new Item[source.length];
            if (order == 1) {
                for (int i = 0; i < source.length; i++) {
                    Item next = source[i];
                    int insertindex = 0;
                    int k = i;
                    while (k > 0 && insertindex == 0) {
                        if (next.getProductNumber().compareTo(dest[k - 1].getProductNumber()) > 0) {
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
                    Item next = source[i];
                    int insertindex = 0;
                    int k = i;
                    while (k > 0 && insertindex == 0) {
                        if (next.getProductNumber().compareTo(dest[k - 1].getProductNumber()) < 0) {
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
    
        public static Item[] sortName(Item[] source, int order) {
    
            Item[] dest = new Item[source.length];
            if (order == 1) {
                for (int i = 0; i < source.length; i++) {
                    Item next = source[i];
                    int insertindex = 0;
                    int k = i;
                    while (k > 0 && insertindex == 0) {
                        if (next.getName().compareTo(dest[k - 1].getName()) > 0) {
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
                    Item next = source[i];
                    int insertindex = 0;
                    int k = i;
                    while (k > 0 && insertindex == 0) {
                        if (next.getName().compareTo(dest[k - 1].getName()) < 0) {
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
        
        public static void sortInStore(Item[] source, int order) {
            if (order == 1) {
                int posmax;
                Item temp;
    
                for (int i = source.length - 1; i > 0; i--) {
                    posmax = 0;
                    for (int k = 1; k <= i; k++) {
                        if (source[k].getQuantity() > source[posmax].getQuantity())
                            posmax = k;
                    }
                    temp = source[i];
                    source[i] = source[posmax];
                    source[posmax] = temp;
                }
            }
            else if (order == 2) {
                int posmax;
                Item temp;
    
                for (int i = source.length - 1; i > 0; i--) {
                    posmax = 0;
                    for (int k = 1; k <= i; k++) {
                        if (source[k].getQuantity() < source[posmax].getQuantity())
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
    
        public static void sortPrice(Item[] movies, int low, int high) {
            if (low == high)
                return;
    
            int mid = (low + high) / 2;
    
            sortPrice(movies, low, mid);
            sortPrice(movies, mid + 1, high);
    
            mergePrice(movies, low, mid, high);
        }
    
        public static void mergePrice(Item[] a, int low, int mid, int high) {
            Item[] temp = new Item[high - low + 1];
    
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
                else if (a[i].getPrice() < a[j].getPrice()) {
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
