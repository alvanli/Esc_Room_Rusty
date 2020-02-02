import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LadyCube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LadyCube extends Actor
{
    public static boolean hasLadyCube = false;
    public void addedToWorld()
    {
        reference.equipped.put("LadyCube", false);
    }

    public void act() 
    {
        if (!reference.lIn)
        {
            GreenfootImage itemImage = new GreenfootImage("cube3inv.png");
            itemImage.scale(40, 40);
            this.setImage(itemImage);
            if (hasLadyCube)
            {
                if (Greenfoot.mouseClicked(this))
                {
                    //getWorld().removeObject(this);
                    reference.unEquip();
                    reference.equipped.put("LadyCube", true);
                    //System.out.println("key time");
                }
            }
            else
            {
                if (Greenfoot.mouseClicked(this))
                {
                    MyWorld.inv.addToInventory(this);
                    hasLadyCube = true;
                    setImage(new GreenfootImage("cube3inv.png"));
                    getWorld().removeObject(this);
                }
            }
            if (reference.equipped.get("LadyCube")!= null && reference.equipped.get("LadyCube"))
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
        if (reference.useLCube)
        {
            setImage(new GreenfootImage("cube3.png"));
            getImage().setTransparency(255);
            MyWorld.inv.remove(this);
            reference.equipped.remove("LadyCube");
            reference.useLCube = false;
            reference.lIn = true;
        }
    }
}
