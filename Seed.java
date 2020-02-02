import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seed extends Actor
{
    /**
     * Act - do whatever the Seed wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public static boolean hasSeed = false;
    public void addedToWorld()
    {
        reference.equipped.put("Seed", false);
    }

    public void act() 
    {
        if (hasSeed)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("Seed", true);
                //System.out.println("key time");
            }
        }
        else
        {
            if (Greenfoot.mouseClicked(this))
            {
                MyWorld.inv.addToInventory(this);
                hasSeed = true;
                getWorld().removeObject(this);
            }
        }
        if (reference.equipped.get("Seed")!= null && reference.equipped.get("Seed"))
        {
            getImage().setTransparency(100);
        }
        else
        {
            getImage().setTransparency(225);
        }
        /**
        if (reference.equipped.get("Key")!= null && reference.equipped.get("Key"))
        {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation(mouse.getX()-40,mouse.getY()-40);
        }
         **/
    }  
}
