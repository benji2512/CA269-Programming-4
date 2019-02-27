public class Period
{
    private Time start;
    private Time end;

    public Period(Time s, Time e) {
    start = s;
    end = e;
    }

    public Time getStart() {
        return start;
    }

    public Time getEnd() {
        return end;
    }

    public boolean overlaps(Period p) {
        return end.isLater(p.getStart()) && p.getEnd().isLater(start);
    }

    public String toString() {
        return start.toString() + " -> " + end.toString();
    }
}
