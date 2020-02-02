import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class doorKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class doorKey extends Actor
{
    /**
     * Act - do whatever the doorKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean hasDoorKey = false;
    public void act() 
    {
        if (hasDoorKey)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("DoorKey", true);
                //System.out.println("key time");
            }
        }
        else
        {
            if (Greenfoot.mouseClicked(this))
            {
                RedVail.hasRed = false;
                MyWorld.inv.addToInventory(this);
                hasDoorKey = true;
                getWorld().removeObject(this);
            }
        }
        if (reference.equipped.get("DoorKey")!= null && reference.equipped.get("DoorKey"))
        {
           getImage().setTransparency(100);
        }
        else
        {
            getImage().setTransparency(225);
        }
    }    
}
