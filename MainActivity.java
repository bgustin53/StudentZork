
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
        //Greeting Message
        
        //Option to get Instructions
        Location game = new Room1();
        while(!game.getIsFinished())
            switch(game.exit())
            {
                case 2: game = new Room2();
                        game.entry();
                        break;
                case 3: game = new Room3();
                        game.entry();
                        break;
                default: game.setIsFinished(true);
            
            }
        }
        //Exit Message
}
