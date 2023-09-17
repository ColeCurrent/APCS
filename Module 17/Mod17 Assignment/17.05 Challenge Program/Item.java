
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    private String name;
    private String productNumber;
    private double price;
    private int quantity;
    
    public Item(String name, String productNumber, double price, int quantity)
    {
        this.name = name;
        this.productNumber = productNumber;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String toString() {
        return String.format("%s%16s%9d%6s%6.2f", productNumber, name, quantity, "$", price);
    }
    
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setProductNumber(String productNumber)
    {
        this.productNumber = productNumber;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getProductNumber()
    {
        return productNumber;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
}
