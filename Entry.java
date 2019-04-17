
/*****************************************************
 * Beginning level.  In this level player can mine
 * a planet to get additional coin.
 *
 * @author Bruce Gustin
 * @version 4/16/2019
 *****************************************************/
public class Entry extends Location
{
    private ShipOptions options;
    private String[] textOptions = new String[10];

    public Entry()
    {
        super();
    }
    
    public void entry()
    {
        String message = "Your spaceship appears adrift in what appears to be sector 62 of " +
                         "the Kebrea quadrant." +
                         "\nYou see a planet in the distance with lots of debris in between.";
        message += healthAndCoinText();                       
        System.out.println(message);
    }
    
    public void locationPlay()
    {
        options = new ShipOptions();
        options.setTextOptions("Land","Leave","","","","","","","","");
        switch(options.selectOptions())
        {
            case 0 : landOption();
                     break;
            case 1 : break;
            default : System.out.println("Doing nothing is a big problem.");
        }
    }
    
    public int exit()
    {
        System.out.println("You left the sector 62.");
        return 76;
    }
    
    public void landOption()
    {
        System.out.println("You land on the planet");
        options = new ShipOptions();
        options.setTextOptions("Mine","Explore","Leave","","","","","","","");
        boolean exit = false;
        boolean mined = false;
        while(!exit)
        {
            switch(options.selectOptions())
            {
                case 0 : if(!mined)
                         {
                             System.out.println("You mined 3 kg of Tuium worth 3 coin.");
                             setCoin(3);
                             mined = true;
                         }
                         else System.out.println("You have already minded this planet.");
                         break;
                case 1 : System.out.println("You began looking around, not much here to see.");
                         break;
    
                case 2 : exit = true;
                         break;
                default : System.out.println("Doing nothing is a big problem.");
            }
        }
    }
}
