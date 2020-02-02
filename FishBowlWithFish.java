import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishBowlWithFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishBowlWithFish extends Actor
{
    /**
     * Act - do whatever the FishBowlWithFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage itemImage = new GreenfootImage("fishbowwithfish.png");
        itemImage.scale(120, 105);
        this.setImage(itemImage);
    }    
}
