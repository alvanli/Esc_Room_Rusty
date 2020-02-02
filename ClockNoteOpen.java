import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClockNoteOpen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockNoteOpen extends Actor
{
    /**
     * Act - do whatever the ClockNoteOpen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            ClockNote.noteOpen = false;
            getWorld().removeObject(this);            
        }
        if (reference.equipped.get("ClockNote")== null || !reference.equipped.get("ClockNote"))
        {
            ClockNote.noteOpen = false;
            getWorld().removeObject(this);     
        }
    }    
}
