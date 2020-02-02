import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bugCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bugCode extends southObjects
{
    public static String bugType;
    private static Color colorF;
    private static boolean canEditCode;
    private static Color background = new Color(197,197,197);
    public void addedToWorld(World MyWorld)
    {
        bugType = "";
        colorF = Color.BLACK;
        canEditCode = true;
    }

    public void act() 
    {
        //limit length to 1 character
        String hold = bugCode3.lastOne2;
        if (bugType.length() > 1)
        {
            bugType = bugType.substring(1,2);
        }

        setImage(new GreenfootImage(bugType,60,colorF, background));
        //hold holds the key value

        bugType += hold;

    }    
}
