
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
    public Date(int month, int day, int year)
    {
        if (month <= 0 || month > 12)
        System.out.println("month must be 1-12");
        
        if (day 
        System.out.println("Days must be
        
        this.month = month;
        this.day = day;
        this.year = year;
        
        System.out.println("");
    }
    
    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
    
    public void setDay (intDay)
    {
        this.day = day;
    }
    
    public int getDay()
    {
        return day;
    }
}
