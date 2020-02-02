import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * handHour1 allows user to control the hour hand of the clock, when zoomed in
 *
 * @author  Alvin Li
 * @version 1.0
 * @since   2019-04-05 
 */
public class handHour1 extends clock
{
    /**
     * Act - do whatever the handHour1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setRotation(clock.degreeH); //constantly update rotation
        controlHand();
        // Add your action code here.
        if (Bookshelf.isBookshelfOpen == 1 || Bookshelf.isBookshelfOpen == 2)
        {
            getWorld().removeObject(this);
        }
    }    

    public void controlHand()
    {
        int increments = 30; //every increment is 30 degrees, 1 hr on the clock
        if (Greenfoot.isKeyDown("w"))
        {
            clock.degreeH += increments; //goes forward 1 hour if 'w' is pressed
            Greenfoot.delay(9); //gives it a clicky feel
        }
        else if (Greenfoot.isKeyDown("s"))
        {
            clock.degreeH -= increments; //goes back 1 hour if 's' is pressed
            Greenfoot.delay(9);
        }
    }
}
