import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DeskOpen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeskOpen extends World
{
    private Inventory inve = new Inventory();
    public DeskOpen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject( new GreenVail(), 500, 424);
        addObject( new BlueVail(), 617, 420);
        addObject( new RedVail(), 730, 419);
        addObject(inve, 577, 650);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            if (!RedVail.hasRed)
            {
                inve.goAway();
                Greenfoot.setWorld(reference.east);
            }
        }
    }
}
