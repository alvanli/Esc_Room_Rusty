import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * safeCode is an Actor that allows the user the enter the code, maximum 8 characters, correct code is 'macaroni'
 * backspace - delete one character, any other character keys - add the character
 * enter - submit code, when submitted, user will be returned to SafeZoom
 *
 * @author  Alvin Li
 * @version 1.0
 * @since   2019-04-05 
 */

public class safeCode extends southObjects
{
    /**
     * Act - do whatever the safeCode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static String type;
    private static Color colorF;
    private static boolean canEditCode;
    private static Color background = new Color(230,229,229);
    public void addedToWorld(World MyWorld)
    {
        type = "";
        colorF = Color.BLACK;
        canEditCode = true;
    }

    public void act() 
    {
        //limit length to 8 characters
        if (type.length() > 8)
        {
            type = type.substring(1,9);
        }
        setImage(new GreenfootImage(type,60,colorF, background));
        //hold holds the key value
        String hold = Greenfoot.getKey();
        if (hold != null && canEditCode)
        {
            //delete one character
            if (hold.equals("backspace"))
            {
                if (type.length() != 0)
                {
                    type = type.substring(0,type.length()-1);
                }
            }
            //add a space
            else if (hold.equals("space"))
            {
                type = type + " ";
            }
            //submit for validation
            else if (hold.equals("enter"))
            {
                if (type.equals("macaroni"))
                {             
                    colorF = Color.GREEN;
                    setImage(new GreenfootImage(type,60,colorF, background));
                    Greenfoot.delay(10);
                    SafeZoom.isSafeOpen = 1;
                    Greenfoot.setWorld(new SafeZoom());
                }  
            }
            //to exit this world
            else if(Greenfoot.isKeyDown("down"))
            {
                Greenfoot.setWorld(new SafeZoom());
            }
            //add characters to the current sequence
            else
            {
                type = type + hold;
            }  
        }
    }    
}
