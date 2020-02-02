import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MrCrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MrCrow extends Actor
{
    //called when added to the world
    private int index = 0;
    public void addedToWorld (World w)
    {
        this.getImage().setTransparency(0);
        act();
    }
    
    public void act() 
    {
        if (this.getImage().getTransparency() < 225)
        {
            this.getImage().setTransparency(getImage().getTransparency() + 1);
        }
        update();
    }
    public void update()
    {
        if(index < 2 && Greenfoot.mouseClicked(this))
        {
            index++;
            this.setImage("mrcrow" + index + ".png");
      
        }
    }
}
