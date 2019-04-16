
/**
 * Write a description of class MainActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainActivity
{
    public static void main(String[] args)
    {
        final int LAST_SECTOR = 99;  
        int currentSector = 62;
        Location game = null;
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
