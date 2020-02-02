import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Painting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Painting extends Actor
{
    /**
     * Act - do whatever the Painting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new PaintingZoom());
        }
        if(Greenfoot.isKeyDown("down"))
        {
            Greenfoot.setWorld(reference.east);
        }
    }    
}
