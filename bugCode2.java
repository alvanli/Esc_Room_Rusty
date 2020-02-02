import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bugCode2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bugCode2 extends southObjects
{
    public static String bugType2;
    private static Color colorF;
    private static boolean canEditCode;
    private static Color background = new Color(197,197,197);
    public void addedToWorld(World MyWorld)
    {
        bugType2 = "";
        colorF = Color.BLACK;
        canEditCode = true;
    }

    public void act() 
    {
        //limit length to 1 character

        if (bugType2.length() > 1)
        {
            bugType2 = bugType2.substring(1,2);
        }
        setImage(new GreenfootImage(bugType2,60,colorF, background));
        //hold holds the key value
        String hold = bugCode3.lastOne3;
        bugType2 += hold;
    }      
}
