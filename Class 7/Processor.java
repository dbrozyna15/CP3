public class Processor {
    String brand;
    String model;
    int yearOfProduction;
    int frequency;
    int cores;
    
    public Processor (String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public String toString() {
        return "CPU: " + this.brand + " " + this.model;
    }
    
    public void turnOnSafeMode() {
        System.out.println("WARRING, WARRING!");
    }
}