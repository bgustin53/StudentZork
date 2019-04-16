
/**
 * Write a description of class Region1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zzrkmen extends Location
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Region1
     */
    public Zzrkmen()
    {
        super();
    }
    
 public void entry()
    {
        String message = "Your spaceship appears hav moved to Ortjik in sector 76" +
                         "\n\nYour current health is: " + getHealth() + 
                         "\nYour current coin is: " + getCoin() +
                         "\n";
                         
        System.out.println(message);
    }
    
    public void locationPlay()
    {
        System.out.println("No play here");
    }
    
    public int exit()
    {
        System.out.println("You left sector 76.");
        return 100;
    }

}
