public class PeriodClass
{
    private Time start;
    private Time end;

    public Period(Time stime, Time etime)
    {
    start = stime;
    end = etime;
    }

    public Time getStart()
    {
        return start;
    }

    public Time getEnd()
    {
        return end;
    }

    public boolean overlaps(Period period)
    {
        return end.isLater(period.getStart()) && period.getEnd().isLater(start);
    }

    public String toString()
    {
        return start.toString() + " -> " + end.toString();
    }
}
