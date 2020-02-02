import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class West here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class West extends World
{
    Piano piano = new Piano();
    private Inventory inve = new Inventory();

    public West()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject(piano, 600, 400);
        addObject(inve, 577, 650);
        addObject( new timer(), 100,30);
    }
    
    public void act()
    {
        switchWorld();        
    }
    
    public void switchWorld()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.south);
            Greenfoot.delay(10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.north);
            Greenfoot.delay(10);
        }
    }
}
