import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clockFace here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockFace extends clock
{
    /**
     * Act - do whatever the clockFace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
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
