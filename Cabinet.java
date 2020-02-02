import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cabinet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabinet extends Actor
{
    /**
     * Act - do whatever the Cabinet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if ( Greenfoot.mouseClicked(this) && reference.bIn && reference.pIn && reference.lIn)
        {
            Greenfoot.playSound("cabinetopen.mp3");
            Greenfoot.setWorld(reference.deskOpen);
        }
    }    
}
