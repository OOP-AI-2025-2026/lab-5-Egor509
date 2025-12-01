package ua.opnu;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan() {
        this(0, 0);
    }

    public TimeSpan(int minutes) {
        this(0, minutes);
    }

    public TimeSpan(int hours, int minutes) {
        int totalMinutes = (hours * 60) + minutes;
        if (totalMinutes < 0) {
            totalMinutes = 0;
        }
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public TimeSpan(TimeSpan ts) {
        this(ts.hours, ts.minutes);
    }

    public void add(int hours, int minutes) {
        int totalCurrent = this.getTotalMinutes();
        int totalAdd = (hours * 60) + minutes;
        setTimeFromMinutes(totalCurrent + totalAdd);
    }

    public void add(int minutes) {
        add(0, minutes);
    }

    public void add(TimeSpan ts) {
        add(ts.hours, ts.minutes);
    }

    public void subtract(int hours, int minutes) {
        int totalCurrent = this.getTotalMinutes();
        int totalSub = (hours * 60) + minutes;
        setTimeFromMinutes(totalCurrent - totalSub);
    }

    public void subtract(int minutes) {
        subtract(0, minutes);
    }

    public void subtract(TimeSpan ts) {
        subtract(ts.hours, ts.minutes);
    }

    private int getTotalMinutes() {
        return (hours * 60) + minutes;
    }

    private void setTimeFromMinutes(int totalMinutes) {
        if (totalMinutes < 0) totalMinutes = 0;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }

    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }

    @Override
    public String toString() {
        return hours + " год " + minutes + " хв";
    }
}