import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenVail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenVail extends Actor
{
    /**
     * Act - do whatever the GreenVail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasGreen = false;
    public void addedToWorld()
    {
        reference.equipped.put("GreenVail", false);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new diedScreen());
        }
    }     
}
