import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BugZoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BugZoom extends World
{

    /**
     * Constructor for objects of class BugZoom.
     * 
     */
    private Inventory inve = new Inventory();
    public BugZoom()
    {    
        super(1169, 700, 1); 
        addObject(inve, 577, 650);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.south);
        }
    }
}
