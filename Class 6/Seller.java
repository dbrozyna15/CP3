import java.util.ArrayList;

public class Seller
{
    int money = 0;
    String name;
    ArrayList<Product> inventory;
    
    public String toString() {
        return "SELLER: " + this.name + "\n" +
        "Items: " + this.inventory + "\n" +
        "Money: " + this.money;
    }
    
    public Seller(
        String name
    ) {
        this.name = name;
        this.inventory = new ArrayList<Product>();
    }
    
    public void addItem(Product item) {
        this.inventory.add(item);
    }
}
