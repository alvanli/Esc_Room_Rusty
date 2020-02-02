import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaintingZoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaintingZoom extends World
{
    private Inventory inve = new Inventory();
    public PaintingZoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject(inve, 577, 650);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.east);
        }
    }
}
