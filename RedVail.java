import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedVail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedVail extends Actor
{
    /**
     * Act - do whatever the RedVail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasRed = false;
    private boolean redShow = false;
    public void addedToWorld()
    {
        reference.equipped.put("RedVail", false);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            hasRed = true;
            //getWorld().addObject(new redEmpty(), 555, 350);
            getWorld().addObject(new doorKey(), 555, 490);
            getWorld().addObject(new redEmpty(), 555, 350);
            getWorld().removeObject(this);           
        }
        /**
        if (hasRed)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("RedVail", true);
                if (!redShow)
                {
                    getWorld().addObject(new redEmpty(), 555, 350);
                    noteOpen = true;
                }
                //System.out.println("key time");
            }
        }
        else
        {
            if (Greenfoot.mouseClicked(this))
            {
                MyWorld.inv.addToInventory(this);
                hasRed = true;
                getWorld().removeObject(this);
            }
        }
        if (reference.equipped.get("RedVail")!= null && reference.equipped.get("RedVail"))
        {
           getImage().setTransparency(100);
        }
        else
        {
            getImage().setTransparency(225);
        }
        **/

    }     
}
