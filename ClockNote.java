import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClockNote here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockNote extends Actor
{
    /**
     * Act - do whatever the ClockNote wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean hasClock = false;
    private boolean lookAt = false;
    public static boolean noteOpen = false;
    public void addedToWorld()
    {
        reference.equipped.put("ClockNote", false);
    }

    public void act() 
    {
        if (hasClock)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("ClockNote", true);
                //System.out.println("key time");
                if (!noteOpen)
                {
                    getWorld().addObject(new ClockNoteOpen(), 555, 350);
                    noteOpen = true;
                }
            }
        }
        else
        {
            if (Greenfoot.mouseClicked(this))
            {
                MyWorld.inv.addToInventory(this);
                getWorld().addObject(new ClockNoteOpen(), 555, 350);
                hasClock = true;
                getWorld().removeObject(this);
            }
        }

        if (reference.equipped.get("ClockNote")!= null && reference.equipped.get("ClockNote"))
        {
            getImage().setTransparency(100);
        }
        else
        {
            getImage().setTransparency(225);
        }

    }     
}
