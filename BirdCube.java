import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdCube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdCube extends Actor
{
    /**
     * Act - do whatever the BirdCube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasBirdCube = false;
    public void addedToWorld()
    {
        reference.equipped.put("BirdCube", false);
    }

    public void act() 
    {
        if (!reference.bIn)
        {
            if (hasBirdCube)
            {
                if (Greenfoot.mouseClicked(this))
                {
                    //getWorld().removeObject(this);
                    reference.unEquip();
                    reference.equipped.put("BirdCube", true);
                    //System.out.println("key time");
                }
            }
            else
            {
                if (Greenfoot.mouseClicked(this))
                {
                    MyWorld.inv.addToInventory(this);
                    hasBirdCube = true;
                    setImage(new GreenfootImage("cube1inv.png"));
                    getWorld().removeObject(this);
                }
            }
            if (reference.equipped.get("BirdCube")!= null && reference.equipped.get("BirdCube"))
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
        if (reference.useBCube)
        {
            setImage(new GreenfootImage("cube1.png"));
            getImage().setTransparency(255);
            MyWorld.inv.remove(this);
            reference.equipped.remove("BirdCube");
            reference.useBCube = false;
            reference.bIn = true;
        }
    }
}
