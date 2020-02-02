import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasKey = false;
    public void addedToWorld()
    {
        reference.equipped.put("Key", false);
    }

    public void act() 
    {
        if (hasKey)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("Key", true);
                //System.out.println("key time");
            }
        }
        else
        {
            if (Greenfoot.mouseClicked(this))
            {
                MyWorld.inv.addToInventory(this);
                hasKey = true;
                getWorld().removeObject(this);
            }
        }
        if (reference.equipped.get("Key")!= null && reference.equipped.get("Key"))
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
