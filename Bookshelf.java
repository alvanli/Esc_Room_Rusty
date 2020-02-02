import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bookshelf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bookshelf extends southObjects
{
    /**
     * Act - do whatever the Bookshelf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int isBookshelfOpen; 
    public static int bookX;
    private int num = 0;
    public static int bookY;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new BookshelfZoom());
        }
        bookX = getX();
        
        bookY = getY();
        if (isBookshelfOpen == 1)
        {
            setLocation(bookX+4,bookY);
            if(num == 0 )
           {
               Greenfoot.playSound("slidebookshelf.mp3");
               num++;
           }
            
            if (getX() > 3000)
            {
                isBookshelfOpen = 2;
            }
        }
    }    
}
