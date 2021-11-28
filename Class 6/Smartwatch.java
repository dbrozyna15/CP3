public class Smartwatch
{
    String currentDate;
    String currentTime;
    String alarmTime;
    int steps;
    
    public void setAlarm(String time) {
        this.alarmTime = time;
    }
    
    public void setTime(String time) {
        this.currentTime = time;
    }
    
    public void setDate(String date) {
        this.currentDate = date;
    }
    
    public void setNoSteps(int steps) {
        this.steps = steps;
    }
    
    public boolean checkAlarm() {
        if (this.currentTime == alarmTime) {
            buzz();
            return true;
        }
        return false;
    }
    
    public void buzz() {
        System.out.println("BUZZ!");
    }
    
    public void displayNumberOfSteps() {
        System.out.println(steps);
    }
    
    public void connectToPhone(String login, String password) {
        System.out.println("Connecting to your device...");
    }
}
