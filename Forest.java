import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
{
    MrCrow mrCrow = new MrCrow();
    private boolean startApear = false;
    private int transparency = 0;
    public static boolean stopTime = false;
    /**
     * Constructor for objects of class Forest.
     * 
     */
    public Forest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        stopTime = true;
        addObject(new timer(), 100, 50);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            addObject(mrCrow, 520, 400);
        }
    }
    
    public void checkCrow()
    {
        
    }
    
}
