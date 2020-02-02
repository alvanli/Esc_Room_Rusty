import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class handMin1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class handMin1 extends clock
{
    /**
     * Act - do whatever the handMin1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(clock.degreeM); //update current rotation
        controlHand(); 
        done();
        if (Bookshelf.isBookshelfOpen == 1 || Bookshelf.isBookshelfOpen == 2)
        {
            getWorld().removeObject(this);
        }
    }    

    // Check
    public void controlHand()
    {
        int increments = 6;
        if (Greenfoot.isKeyDown("d"))
        {
            clock.degreeM += increments;
            Greenfoot.delay(9);
        }
        else if (Greenfoot.isKeyDown("a"))
        {
            clock.degreeM -= increments;
            Greenfoot.delay(9);
        }
    }

    public void done()
    {
        if (handHour.degreeH < 0)
        {
            handHour.degreeH += 360;
        }
        if (handHour.degreeM < 0)
        {
            handHour.degreeM += 360;
        }
        if (handHour.degreeH%360 == 180 && clock.degreeM%360 == 282)
        {
            clock.degreeM = 0;
            handHour.degreeH = 0;
            Greenfoot.setWorld(new South());
            Bookshelf.isBookshelfOpen = 1;
        }
    }
}
