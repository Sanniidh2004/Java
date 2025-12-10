public class TimeFormat {
    private int hour;
    private int minutes;
    private int seconds;

    // No-argument constructor
    public TimeFormat() {
        this.hour = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // One-argument constructor
    public TimeFormat(int totalSeconds) {
        this.hour = totalSeconds / 3600;
        this.minutes = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }
    // Two-argument constructor
    public TimeFormat(int minutes, int seconds) {
        this.hour = 0;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Three-argument constructor
    public TimeFormat(int hour, int minutes, int seconds) {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

  
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", this.hour, this.minutes, this.seconds);
    }
    public static void main(String[] args) {
        TimeFormat time1 = new TimeFormat();
        time1.displayTime(); 

        TimeFormat time2 = new TimeFormat(3661);
        time2.displayTime(); 

        TimeFormat time3 = new TimeFormat(30, 45);
        time3.displayTime(); 

        TimeFormat time4 = new TimeFormat(10, 45, 30);
        time4.displayTime(); 
    }
}
