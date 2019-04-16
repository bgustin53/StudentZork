
/**
 * Write a description of class ShipOptions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ShipOptions
{
    private String[] options = new String[10];
    
   
    public int selectOptions()
    {
        String text = "Choose one of the possible options,"; 
        for(int i = 0; i < options.length; i++)
             if(options[i].length() > 0) text += "\n     " + options[i];
        System.out.println(text);
        Scanner ui = new Scanner(System.in);
        String choice = ui.nextLine();
        for(int i = 0; i < options.length; i++)
        {
            if(choice.toLowerCase().contains(options[i].toLowerCase()))
                 return i;
        }
        return options.length;
    }
    
    public void setTextOptions(String a, String b, String c, String d, String e, 
                               String f, String g, String h, String i, String j)
    {
        options[0] = a;
        options[1] = b;
        options[2] = c;
        options[3] = d;
        options[4] = e;
        options[5] = f;
        options[6] = g;
        options[7] = h;
        options[8] = i;
        options[9] = j;
    }
}
    