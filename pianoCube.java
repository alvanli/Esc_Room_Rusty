import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pianoCube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pianoCube extends Actor
{
    /**
     * Act - do whatever the pianoCube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasPianoCube = false;
    public void addedToWorld()
    {
        reference.equipped.put("pianoCube", false);
    }

    public void act() 
    {
        if (!reference.pIn)
        {
            if (hasPianoCube)
            {
                if (Greenfoot.mouseClicked(this))
                {
                    //getWorld().removeObject(this);
                    reference.unEquip();
                    reference.equipped.put("pianoCube", true);
                    //System.out.println("key time");
                }
            }
            else
            {
                if (Greenfoot.mouseClicked(this))
                {
                    MyWorld.inv.addToInventory(this);
                    hasPianoCube = true;
                    setImage(new GreenfootImage("cube2inv.png"));
                    getWorld().removeObject(this);
                }
            }
            if (reference.equipped.get("pianoCube")!= null && reference.equipped.get("pianoCube"))
            {
                getImage().setTransparency(100);
            }
            else
            {
                getImage().setTransparency(225);
            }
        }
    }

    public void used()
    {
        if (reference.usePCube)
        {
            setImage(new GreenfootImage("cube2.png"));
            getImage().setTransparency(255);
            MyWorld.inv.remove(this);
            reference.equipped.remove("pianoCube");
            reference.pIn = true;
            reference.usePCube = false;
        }

    }     
}
