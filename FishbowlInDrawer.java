import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishbowlInDrawer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishbowlInDrawer extends Actor
{
    /**
     * Act - do whatever the FishbowlInDrawer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean inInv = false;
    public void addedToWorld()
    {
        reference.equipped.put("Fishbowl", false);
    }

    public void act() 
    {
        checkFishbowl();
    }    

    public void checkFishbowl()
    {
        if (inInv)
        {
            if (Greenfoot.mouseClicked(this))
            {
                //getWorld().removeObject(this);
                reference.unEquip();
                reference.equipped.put("Fishbowl", true);
                //System.out.println("you have fish");
            }
        }
        else
        {
            if(Greenfoot.mouseClicked(this))
            {
                //add to inventory
                MyWorld.inv.addToInventory(this);
                inInv = true;
                setImage(new GreenfootImage("fishbowlempty.png"));
                getWorld().removeObject(this);
                
                //System.out.println("gotFishBowl");
                
            }
        }
        if (reference.equipped.get("Fishbowl")!= null && reference.equipped.get("Fishbowl"))
        {
            getImage().setTransparency(100);
        }
        else
        {
            getImage().setTransparency(225);
        }
        /**
        if (reference.equipped.get("Fishbowl")!= null && reference.equipped.get("Fishbowl"))
        {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        setLocation(mouse.getX()-40,mouse.getY()-40);
        }
         **/
    }
}
