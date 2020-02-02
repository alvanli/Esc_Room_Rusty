import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bugCode3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bugCode3 extends southObjects
{
    public static String bugType3="0000";
    private static Color colorF;
    private static boolean canEditCode;
    private static Color background = new Color(197,197,197);
    public static String lastOne3;
    public static String lastOne2;
    public void addedToWorld(World MyWorld)
    {
        colorF = Color.BLACK;
        canEditCode = true;
    }

    public void act() 
    {
        //limit length to 1 character

        if (bugType3.length() > 3)
        {
            lastOne2 = bugType3.substring(1,2);
            lastOne3 = bugType3.substring(2,3);
            bugType3 = bugType3.substring(1,4);
        }
        
        setImage(new GreenfootImage(bugType3.substring(2,3),60,colorF, background));
        //hold holds the key value
        String hold = Greenfoot.getKey();
        if (hold != null && canEditCode)
        {
            //delete one character
            if (hold.equals("backspace"))
            {
                if (bugType3.length() != 0)
                {
                    bugType3 = bugType3.substring(0,bugType3.length()-1);
                }
            }
            //add a space
            else if (hold.equals("space"))
            {
                bugType3 = bugType3 + " ";
            }
            //submit for validation
            else if (hold.equals("enter"))
            {
                if (bugType3.equals("macaroni"))
                {
                    bugType3 = bugType3 + "\n" + "Correct!";               
                    colorF = Color.RED;
                    Greenfoot.delay(50);
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
            else if (hold.equals("1") || hold.equals("2") || hold.equals("3") || hold.equals("4") || hold.equals("5") || hold.equals("6") || hold.equals("7") || hold.equals("8") || hold.equals("9") || hold.equals("0"))
            {
                bugType3 = bugType3 + hold;
            }  
        }
    }    
}
