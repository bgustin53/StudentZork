/**
 * Write a description of class coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    private static int coin = 10;   //initial coin for this game

    public void setCoin(int change)
    { 
        coin += change;
    }
    
    public int getCoin()
    {
        return coin;
    }
}
