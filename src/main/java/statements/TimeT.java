package statements;

public class TimeT {
    private int hour;
    private int minute;
    private int second;

    public TimeT(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getInMinutes() {
        return 60 * hour + minute;
    }

    public int getInSeconds() {
        return (60 * hour + minute) * 60 + second;
    }

    //  Én if-fel akarom megoldani, de nem működik.
    // A 'solutions' megoldást nem értem.



}
