public class Computer {
    String brand;
    String model;
    int yearOfProduction;
    Processor cpu;
    String gpu;
    String[] externalDevices;
    
    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.cpu = new Processor("AMD", "6500");
    }
    
    public String toString() {
            return "Computer: " + this.brand + " " + this.model + " " + this.cpu;
    }
        
    public void turnOn() {}
    public void turnOff() {}
    public void turnOnSafeMode() {}
    
    public static void main(String[] args) {
        Computer computer1 = new Computer("Lenovo", "Legion 5");
        System.out.println(computer1);
        System.out.println(computer1.cpu);
        computer1.cpu.turnOnSafeMode();
    }
}