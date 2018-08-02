
/**
 * Write a description of class Region1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room1 extends Location
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Region1
     */
    public Room1()
    {
        super();
        //regionExit();
    }
    
    public void entry()
    {
        System.out.println("You entered room 1.");
    }
    
    public int exit()
    {
        System.out.println("You left the room from the North.");
        return 2;
    }

}
