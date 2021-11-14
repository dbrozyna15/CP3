public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock() {
        this.hour = 0;
        this.minute = 0;
    }
    
    Clock(int hour, int minute) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
        
        if (minute > 0 && minute < 60) {
            this.minute = minute;
        }
    }
    
    public void setClock() {
        this.hour = 0;
        this.minute = 0;
    }
    
    public void setClock(int hour, int minute) {
        if (hour > 0 && hour < 24) {
            this.hour = hour;
        }
        
        if (minute > 0 && minute < 60) {
            this.minute = minute;
        }
    }
    
    public void displayTime() {
        String formatted = String.format("\n%02d:%02d", hour, minute);
        System.out.print(formatted);
    }
    
    public void addOneMinute() {
        if (minute < 60) {
            this.minute++;
        }
        
        if (minute == 60 && hour == 23) {
            setClock();
        } else if (minute == 60) {
            this.minute = 0;
            this.hour++;
        }
        
        if (shouldTurnAlarm()) {
            runAlarm();
        }
    }
    
    public void setAlarm(int hour, int minute) {
        if (hour > 0 && hour < 24) {
            this.alarmHour = hour;
        }
        
        if (minute > 0 && minute < 60) {
            this.alarmMinute = minute;
        }
    }
    
    public void runAlarm() {
        System.out.println("\nbeep-beep-beep-beep !!");
    }
    
    public boolean shouldTurnAlarm() {
        return (this.hour == this.alarmHour && this.minute == this.alarmMinute);
    }
}
