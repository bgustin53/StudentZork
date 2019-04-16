
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
        final int LAST_ROOM = 99;  
        int currentRoom = 0;
        Location game = null;
        while(currentRoom <= LAST_ROOM)
        {
            switch(currentRoom)
            {
                case 0  : game = new Entry();
                          game.entry();
                          currentRoom = game.locationPlay();
                          break;
            }
        }
        System.out.println("Game over");
    }
}
