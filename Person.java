
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    public Person(String firstName, String lastName, int tempIdNum)
    {
        fName = firstName;
        lName = lastName;
    }

    public String getFirstName()
    {
        return fName;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    private String fName;
    private String lName;
}
