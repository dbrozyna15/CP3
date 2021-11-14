public class Product {
    private String name;
    private boolean isVegetarian;

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Is vegetarian: " + this.isVegetarian + "\n";
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean getIsVegetarian(boolean isVegetarian) {
        return this.isVegetarian;
    }

    public void setIsVegetarian(boolean newIsVegetarian) {
        this.isVegetarian = newIsVegetarian;
    }
    
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setName("Water");
        p1.setIsVegetarian(true);
        System.out.println(p1);
    }
    
}
