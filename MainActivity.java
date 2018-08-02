
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
                case 2: System.out.println("You are heading into room 2");
                        game = new Room2();
                        game.entry();
                        break;
                default: game.setIsFinished(true);
            
            }
        }
        //Exit Message
}
