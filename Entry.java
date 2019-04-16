
/**
 * Write a description of class Region1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Entry extends Location
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Region1
     */
    public Entry()
    {
        super();
    }
    
    public void entry()
    {
        System.out.println("You entered the game.");
    }
    
    public int locationPlay()
    {
        System.out.println("You left the room from the South.");
        return 100;
    }

}
