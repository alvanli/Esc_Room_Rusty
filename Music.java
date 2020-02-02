import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Actor
{
    /**
     * Act - do whatever the Music wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasMusic = false;

    public void addedToWorld()
    {
        reference.equipped.put("Music", false);

    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            //SafeZoom.tookBook = true; 
            //getWorld().removeObject(this);
        }
        if (hasMusic)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("Music", true);
                //System.out.println("key time");
            }
        }
        else
        {
            if (Greenfoot.mouseClicked(this))
            {
                SafeZoom.tookBook = true; 
                MyWorld.inv.addToInventory(this);
                hasMusic = true;
                getWorld().removeObject(this);
            }
        }
        if (reference.equipped.get("Music")!= null && reference.equipped.get("Music"))
        {
           getImage().setTransparency(100);
        }
        else
        {
            getImage().setTransparency(225);
        }

    }     
}
