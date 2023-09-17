import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class InventoryDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InventoryDemo {

    public static void takeInventory(String name, List<Product> products) {
        int totalQuant = 0;
        double totalCost = 0;
        for (Product p : products) {
            if (p.getName().equals(name)) {
                totalQuant++;
                totalCost += p.getCost();
            }
        }
        System.out.println(name + ": Quantity = " + totalQuant + ", Total cost = " + totalCost);
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<Product>();
        products.add(new Car("Honda", 1000000.00));
        products.add(new Car("Nissan", 17000.00));
        products.add(new Tool("JigSaw", 149.18));
        products.add(new Car("Honda", 1100000.00));
        products.add(new Car("Ford", 17500.00));
        products.add(new Car("Nissan", 17875.32));
        products.add(new Truck("Ford", 35700.00));
        products.add(new Tool("CircularSaw", 200.00));
        products.add(new Tool("CircularSaw", 150.00));

        Tool saw1 = new Tool("Saw", 55.99);
        Tool saw2 = new Tool("Saw", 22.99);
        
        System.out.printf("%23s%n", "Inventory");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
        takeInventory("Honda", products);
        takeInventory("Nissan", products);
        takeInventory("JigSaw", products);
        takeInventory("Ford", products);
        takeInventory("CircularSaw", products);
        
        System.out.println();
        System.out.printf("%26s%n", "Comparing the tools");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
        if (saw1.compareTo(saw2) < 0)
            System.out.println("The second saw is more expensive");
        else if (saw1.compareTo(saw2) > 0)
            System.out.println("The first saw is more expensive");
        else
            System.out.println("The saws are the same price");
    }
}