import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BlueVail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueVail extends Actor
{
    /**
     * Act - do whatever the BlueVail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasBlue = false;
    public void addedToWorld()
    {
        reference.equipped.put("BlueVail", false);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new diedScreen());
        }
    }     
}
