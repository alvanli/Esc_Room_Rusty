import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * safeCodeZoom is a World that serves as the background to the interface where user enters the code
 * Note: safeCode allows user to enter the code
 *
 * @author  Alvin Li
 * @version 1.0
 * @since   2019-04-05 
 */

public class safeCodeZoom extends World
{
 
    public safeCodeZoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject(new safeCode(),584,300);
    }
    
    public void act()
    {
        switchWorld();       
    }
    
    public void switchWorld()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            Greenfoot.setWorld(new SafeZoom());
        }
    }
}
