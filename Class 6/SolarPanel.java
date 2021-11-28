public class SolarPanel
{
    private String brand;
    private String name;
    private float voltage;
    private float current;
    private float power;
    
    public SolarPanel(
        String brand,
        String name, 
        float voltage,
        float current
    ) {
        setBrand(brand);
        setName(name);
        setVoltage(voltage);
        setCurrent(current);
        setPower();
    }
    
    public String toString() {
        return (
            "Brand: " + getBrand() + "\n" +
            "Name: " + getName() + "\n" +
            "Power: " + getPower() + "W\n" +
            "Voltage: " + getVoltage() + "V\n" +
            "Current: " + getCurrent() + "A"
        );
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public float getVoltage() {
        return this.voltage;
    }
    
    public void setVoltage(float newVoltage) {
        this.voltage = newVoltage;
    }
    
    public float getCurrent() {
        return this.current;
    }
    
    public void setCurrent(float newCurrent) {
        this.current = newCurrent;
    }
    
    public float getPower() {
        return this.power;
    }
    
    public void setPower() {
        this.power = this.voltage * this.current;
    }
    
    public static void main(String[] args) {
        SolarPanel sp1 = new SolarPanel(
            "Good Solar EU",
            "IS-1210",
            24,
            10
        );
        
        SolarPanel sp2 = new SolarPanel(
            "Good Solar EU",
            "IS-940",
            12,
            10
        );
        
        System.out.println(sp1 + "\n\n" + sp2);
    }
}
