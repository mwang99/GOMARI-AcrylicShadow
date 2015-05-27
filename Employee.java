import java.util.ArrayList;
/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private ArrayList<Data> attendance;
    private int idNum;
    private int dataNum;
    /**
     * Constructor for objects of class Employee
     */
    public Employee(String firstName, String lastName, int tempIdNum)
    {
        super(firstName, lastName, tempIdNum);
        dataNum = 0;
    }

    /**
     */
    public void clockIn()
    {
        Data temp = new Data() ;
        temp.checkInTime();
        attendance.add(temp);
    }
    
     /**
     */
    public void clockOut()
    {
        attendance.get(dataNum).checkOutTime();
    }
}
