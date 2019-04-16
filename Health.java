
/**
 * Write a description of class Health here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Health
{
    private static int health = 3;  // initial health for this game

    public void setHealth(boolean down)
    { 
        if(down) health--;
        else health++;
    }
    
    public int getHealth()
    {
        return health;
    }
}
