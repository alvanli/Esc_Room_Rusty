import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RadioZoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadioZoom extends World
{
    Water water = new Water();
    public static boolean waterTaken = false;
    SheIsWaiting sheWaiting = new SheIsWaiting();
    private Inventory inve = new Inventory();
    private int i = 0;
    /**
     * Constructor for objects of class RadioZoom.
     * 
     */
    public RadioZoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        if(! waterTaken)
        {
            addObject(water, 350, 450);
        }
        addObject(inve, 577, 650);
        addObject(new RadioCode(),667,400);
    }
    
    public void act()
    {
        goBack();
        addPrompt();
    }
   
    public void goBack()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.north);
        }
    }
    public void addPrompt()
    {
        if(RadioCode.pwCorrect)
        {
            
            
            if( i == 0)
            {
                Greenfoot.playSound("radio.mp3");
                i++;
            }
            
            addObject(sheWaiting, 300, 150);
        }
    }
}
