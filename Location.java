
/****************************************************
 * Abstract class 
 *
 * @author Bruce Gustin
 * @version 4/16/2019
 ****************************************************/
public abstract class Location 
{
    private Health health = new Health();
    private Coin coin = new Coin();
    
    //********* abstract methods ***************************
    
    public abstract void entry();
    public abstract void locationPlay();
    public abstract int exit();
    
    //********* concrete methods ***************************    
    
    public String healthAndCoinText()
    {
        return "\n\nYour current health is: " + health.getHealth() + 
               "\nYour current coin is: " + coin.getCoin() + "\n";
    }
                         
    public int getHealth()
    {
        return health.getHealth();
    }
    
    public int getCoin()
    {
        return coin.getCoin();
    }
    
    public void setHealth(boolean drop)
    {
        health.setHealth(drop);
    }
    
    public void setCoin(int change)
    {
        coin.setCoin(change);
    }
    
    
}
