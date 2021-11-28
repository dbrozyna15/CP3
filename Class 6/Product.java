public class Product
{
    int id;
    String name;
    int price;
    
    public Product(
        String name,
        int price
    ) {
        this.name = name;
        this.price = price;
    }
    
    public String toString() {
        return this.name.substring(0,1).toUpperCase() + this.name.substring(1) + ": " +
        this.price + " " + SalesSystem.currency.toUpperCase();
    }
}
