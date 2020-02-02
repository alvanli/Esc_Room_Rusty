import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RadioCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadioCode extends Actor
{
    private static String type;
    private static Color color;
    private static boolean canEditCode;
    private static Color background = new Color(203,196,195);
    public static boolean pwCorrect = false;
    /**
     * Act - do whatever the RadioCode wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World MyWorld)
    {
        type = "000";
        color = Color.BLACK;
        canEditCode = true;
    }
    public void act() 
    {
        if (type.length() > 3)
        {
            type = type.substring(1,4);
        }
        setImage(new GreenfootImage(type,60,color, background));
        
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
            else if (hold.equals("enter"))
            {
                if (type.equals("885"))
                {
                    //type = type + "\n" + "Correct!";               
                    color = Color.GREEN;
                    Greenfoot.delay(50);
                    pwCorrect = true;
                }  
            }
            else if(Greenfoot.isKeyDown("down"))
            {
                Greenfoot.setWorld(reference.north);
            }
            //add characters to the current sequence
            else if( hold.equals("0") || hold.equals("1") || hold.equals("2") || hold.equals("3") || hold.equals("4") || hold.equals("5") || hold.equals("6") || hold.equals("7") || hold.equals("8") || hold.equals("9"))
            {
                type = type + hold;
            }
            
        }    
    }
}
