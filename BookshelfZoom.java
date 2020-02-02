import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BookshelfZoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BookshelfZoom extends World
{
    clock1 clockclock = new clock1();
    private Inventory inve = new Inventory();
    /**
     * Constructor for objects of class BookshelfZoom.
     * 
     */
    public BookshelfZoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject (clockclock, 594, 443);
        addObject (new handMin1(), 594, 443);
        addObject (new handHour1(), 594, 443);
        addObject(inve, 577, 650);
    }

    public void act()
    {
        //checkTime();
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.south);
        }
    }

    /**
    public void checkTime()
    {
        //put in time code
        if(Greenfoot.mouseClicked(clock))
        {
            //moveShelf();
            Greenfoot.setWorld(new SafeZoom());
            shelfMoved = true;
        }
    }
    **/
}
