public class DateClass
{
    private int day;
    private int month;
    private int year;
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    
    public Date()
    { 
        day = 1;
        month = 1;
        year = 2000;
    }
    
    public Date(String s)
    {
        String[] parts = s.split(" ");
        day = Integer.parseInt(parts[0]);
        month = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
    }
    
    public boolean isOnOrAfter(Date date2)
    {
        int day1 = this.day;
        int month1 = this.month;
        int year1 = this.year;
        int day2 = date2.day;
        int month2 = date2.month;
        int year2 = date2.year;
        
        if (year1 > year2)
        {
            return true;
        }
        
        else if (year1 < year2)
        {
            return false;
        }
        
        else if (month1 > month2)
        {
            return true;
        }
        
        else if (month1 < month2)
        {
            return false;
        }
        
        else if (day1 > day2)
        {
            return true;
        }
        
        else if (day1 < day2)
        {
            return false;
        }
        
        return true;
    }
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        String line;
        Date latest = new Date(0,0,0);
        while(in.hasNextLine())
        {
           line = in.nextLine();
           if(line.length() != 0)
           {
                Date date = new Date(line);
                if (!latest.isAfter(date))
                {
                    latest = date;
                }
           }
        }
        System.out.println(latest);
    }
}
