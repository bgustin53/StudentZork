
/*****************************************************
 * Another random level.  This level has no gameplay.
 *
 * @author Bruce Gustin
 * @version 4/16/2019
 *****************************************************/
 
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
        String message = "Your spaceship appears to have moved to Ortjik in sector 76";
        message += healthAndCoinText();              
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
