import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class East here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class East extends World
{
    private GreenfootSound music = new GreenfootSound("theme.mp3");   
    Seed seed = new Seed();
    private Inventory inve = new Inventory();
    /**
     * Constructor for objects of class East.
     * 
     */
    public East()
    {    
        super(1169, 700, 1);         
        addObject( new Desk(), 777, 450);
        addObject( new Painting(), 577, 147);
        addObject(inve, 577, 650);
        addObject(seed, 220, 270);
        addObject( new timer(), 100,30);
    }
    public void act()
    {
        switchWorlds();
        music.playLoop();
    }
    
    public void switchWorlds()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.south);
            Greenfoot.delay(10);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            inve.goAway();            
            Greenfoot.setWorld(reference.north);
            Greenfoot.delay(10);
        }
    }
    
    
}
