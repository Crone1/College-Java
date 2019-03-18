public class TimeClass
{
    private String minute;
    private String hour;
    
    public Time(String t)
    {
       hour = t.substring(0,2);
       minute = t.substring(2,4);
    }
    public boolean isLater(Time time)
    {
        int hour1 = Integer.parseInt(this.hour);
        int minute1 = Integer.parseInt(this.minute);
        int hour2 = Integer.parseInt(time.hour);
        int minute2 = Integer.parseInt(time.minute);

        if (hour1 > hour2)
        {
            return true;
        }
        
        else if (hour1 < hour2)
        {
            return false;
        }
        
        else if (minute1 > minute2)
        {
            return true;
        }
        
        else if (minute1 < minute2)
        {
            return false;
        }
        
        return false;
     }
   
    public String toString()
    {
       return (hour + ":" + minute);
    }
}
