
/**********************************************
 * Keeps track of player health
 *
 * @author Bruce Gustin
 * @version 4/16/2019
 **********************************************/
 
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
