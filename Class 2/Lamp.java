public class Lamp
{
    boolean state;
    
    public Lamp() {
        state = false;
    }
    
    public boolean isOn() {
        return state == true;
    }
    
    public void switchOn() {
        state = true;
    }
    
    public void switchOff() {
        state = false;
    }
    
    public void printState() {
        if (state) {
            System.out.println("The lamp is switched on");
        }
        else {
            System.out.println("The lamp is switched off");
        }
    }
}