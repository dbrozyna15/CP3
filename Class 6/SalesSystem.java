import java.util.ArrayList;

public class SalesSystem
{
    public static String currency = "usd";
    
    public static void main(String[] args) {
        /** 
         * Static variables
           */
        final String hr = "\n-----------------------------------\n";
        
        /**
         * Main program
         */
        System.out.println(hr + ">>>>>>>>>> SALES SYSTEM  <<<<<<<<<<" + hr);
        
        // Create some Products
        Product p1 = new Product("sword", 150);
        Product p2 = new Product("axe", 80);
        Product p3 = new Product("arrow", 15);
        
        // Initialize a list of the Products
        ArrayList<Product> items1 = new ArrayList<Product>();
        items1.add(p1);
        items1.add(p2);
        items1.add(p3);
        
        // Create a Seller
        Seller s1 = new Seller(
            "Mark"
        );
        
        // Add some items to their inventory
        s1.addItem(p1);
        s1.addItem(p2);
        s1.addItem(p3);
        
        // Display the Seller
        System.out.println(hr + s1 + hr);
        
        // Create a Customer
        Customer c1 = new Customer(
            "John",
            100
        );
        
        // Display the Customer
        System.out.println(hr + c1 + hr);
        
        // Get item at index 0 of a seller's inventory.
        c1.purchase(0, s1);
        
        // Display a Customer and a Seller info after the failed transaction
        System.out.println(hr + s1 + hr);
        System.out.println(hr + c1 + hr);
        
        // Get item at index 0 of a seller's inventory.
        c1.purchase(1, s1);
        
        // Display a Customer and a Seller info after the succesful transaction
        System.out.println(hr + s1 + hr);
        System.out.println(hr + c1 + hr);
    }
}
