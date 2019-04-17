/**********************************************
 * Keeps track of player money
 *
 * @author Bruce Gustin
 * @version 4/16/2019
 **********************************************/
 
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
