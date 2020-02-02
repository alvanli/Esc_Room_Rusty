import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class diedScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diedScreen extends World
{
    
    /**
     * Constructor for objects of class diedScreen.
     * 
     */
    public diedScreen()
    {    
        super(1169, 700, 1); 
        addObject(new wordDied(), 585, 390);
        addObject(new restart(), 585, 560);
    }
}
