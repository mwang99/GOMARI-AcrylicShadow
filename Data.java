import java.util.Calendar;
import java.util.Date;
/**
 * Write a description of class Data here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Data
{
    // instance variables - replace the example below with your own
    private String date;
    private String checkInTime;
    private String checkOutTime;
    private boolean absent;

    /**
     * Constructor for objects of class Data
     */
    public Data()
    {
        absent = false;
    }

    /**
     */
    public void checkInTime()
    {
        // create a calendar instance, and get the date from that
        // instance; it defaults to "today", or more accurately,
        // "now".
        Date today = Calendar.getInstance().getTime();
        // store today's date
        checkInTime = today.toString();
    }
    
    /**
     */
    public void checkOutTime()
    {
        // create a calendar instance, and get the date from that
        // instance; it defaults to "today", or more accurately,
        // "now".
        Date today = Calendar.getInstance().getTime();
        // store today's date
        checkOutTime = today.toString();
    }
    
    /**
     */
    public void setAbsent()
    {
        absent = true;
    }
    
    /**
     */
    public String getCheckInTime()
    {
        // create a calendar instance, and get the date from that
        return checkInTime;
    }
    
    /**
     */
    public String getCheckOutTime()
    {
        // create a calendar instance, and get the date from that
        return checkOutTime;
    }
    
}
