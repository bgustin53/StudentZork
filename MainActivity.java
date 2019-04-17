
/*****************************************************
 * Main Driver moves player between levels
 *
 * @author Bruce Gustin
 * @version 4/16/2019
 *****************************************************/
public class MainActivity
{
    public static void main(String[] args)
    {
        final int LAST_SECTOR = 99;  // Sets the maximum number of levels
        int currentSector = 62;      // Sets the opening level
        Location game = null;        // Creates a Location object for polymorphism
        
        while(currentSector <= LAST_SECTOR)
        {
            switch(currentSector)
            {
                case 62  : game = new Entry();
                          break;
                case 76  : game = new Zzrkmen();
                          break;
            }
            game.entry();
            game.locationPlay();
            currentSector = game.exit();
        }
        System.out.println("Game over");
    }
}
