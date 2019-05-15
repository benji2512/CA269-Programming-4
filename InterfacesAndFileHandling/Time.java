public class Time{
    private int hour;
    private int minute;

    public Time(String s){
        hour = Integer.parseInt(s.substring(0,2));
        minute = Integer.parseInt(s.substring(2));
    }

    public boolean isLater(Time t){
        return (hour * 60 + minute) > (t.hour * 60 + minute);
    }

    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
}
