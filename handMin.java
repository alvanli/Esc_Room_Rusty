import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * handMin is an Actor that is shown in the World South, as the minute hand of the clock
 *
 * @author  Alvin Li
 * @version 1.0
 * @since   2019-04-09 
 */
public class handMin extends clock
{
    public void act() 
    {
        setRotation(clock.degreeM); //update the rotation
        //if bookshelf is already open, clock does not show
        if (Bookshelf.isBookshelfOpen == 1 || Bookshelf.isBookshelfOpen == 2)
        {
            getWorld().removeObject(this);
        }
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new BookshelfZoom());
        }
    }    
}
