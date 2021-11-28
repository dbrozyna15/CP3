import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList extends ArrayList
{   
    public void addFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an item: ");
        String item = keyboard.nextLine();
        this.add(item);
    }
    
    public static void main(String[] args) {
        ShoppingList l1 = new ShoppingList();
        System.out.println(l1);
        System.out.println(l1.size());
        
        l1.add("cake");
        l1.add("butter");
        l1.add("ice cream");
        System.out.println(l1);
        System.out.println(l1.size());
        
        l1.add("carrot");
        System.out.println(l1);
        System.out.println(l1.size());
        
        l1.addFromKeyboard();
        System.out.println(l1);
        System.out.println(l1.size());
    }
}

