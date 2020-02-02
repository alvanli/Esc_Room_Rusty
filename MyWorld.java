import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public static Inventory inv = new Inventory();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        GreenfootImage image = new GreenfootImage("startingScreen.png");
        setBackground(image);        
        addObject( new PlayButton(), 588, 600);
    }
}
