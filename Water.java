import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    /**
     * Act - do whatever the pianoCube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasWater = false;
    public void addedToWorld()
    {
        reference.equipped.put("Water", false);
    }

    public void act() 
    {
        if (hasWater)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("Water", true);
                //System.out.println("key time");
            }
        }
        else
        {
            if (Greenfoot.mouseClicked(this))
            {
                MyWorld.inv.addToInventory(this);
                hasWater = true;
                getWorld().removeObject(this);
            }
        }
        if (reference.equipped.get("Water")!= null && reference.equipped.get("Water"))
        {
            getImage().setTransparency(100);
        }
        else
        {
            getImage().setTransparency(225);
        }
    }
}
