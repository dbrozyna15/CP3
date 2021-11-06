public class Smartphone {
    String name;
    String brand;
    String model;
    boolean rooted; 
    float storage;

    public void displayInfo() {
        System.out.println(name +"\n"+ brand +"\n"+ model);
    }

    public void displayStatus(){
        System.out.println(rooted);
    }

    public void changeStatus() {
        rooted = !rooted;
    }

}
