import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wordDied here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wordDied extends Actor
{
    /**
     * Act - do whatever the wordDied wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void addedToWorld (World w)
    {
        this.getImage().setTransparency(0);
        act();
    }
    
    public void act() 
    {
        if (this.getImage().getTransparency() < 226)
        {
            this.getImage().setTransparency(getImage().getTransparency() + 1);
        }

    }
}
