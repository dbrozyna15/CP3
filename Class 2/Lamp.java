public class Lamp {
    boolean power;

    public void switchOn() {
        power = true;
    }

    public void switchOff() {
        power = false;
    }

    public void showStatus(){
        System.out.println(power);
    }
}
