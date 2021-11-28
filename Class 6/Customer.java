import java.util.Arrays;
import java.util.ArrayList;

public class Customer
{
    String name;
    ArrayList<Product> ownedItems;
    int money;
    
    public Customer(
        String name,
        int money
    ) {
        this.name = name;
        this.money = money;
        this.ownedItems = new ArrayList<Product>();
    }
    
    public String toString() {
        return "CUSTOMER: " + this.name + "\n" +
        "Money: " + this.money + "\n" + 
        "Owned products: " + this.ownedItems.toString();
    }
    
    public boolean purchase(int index, Seller seller) {
        Product item = seller.inventory.get(index);
        
        if (this.money - item.price >= 0) {
            seller.inventory.remove(index);
            this.ownedItems.add(item);
            this.money -= item.price;
            seller.money += item.price;
            System.out.println("\n" + ">> The item has been successfully purchased!");
            return true;
        }
        
        System.out.println(
            "\n" + ">> Not enough money to purchase this item. " + 
            '[' + item + ']'
        );
        return false;
    }
}
