import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SafeKnob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SafeKnob extends southObjects
{
    /**
     * Act - do whatever the SafeKnob wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int rotation = 0;
    public void act() 
    {
        if (SafeZoom.startSpin == 1)
        {
            if (rotation > -360)
            {
                setRotation(rotation--);
            }
            else
            {
                SafeZoom.startSpin = 2;
                getWorld().addObject (new Music(), 595, 370);
                getWorld().removeObject(this);
                Greenfoot.playSound("opensafe.mp3");
            }
        }
    }    
}
