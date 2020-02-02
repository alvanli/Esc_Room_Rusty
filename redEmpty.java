import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class redEmpty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class redEmpty extends Actor
{
    private GreenfootImage[] drink = new GreenfootImage[8];
    private int num = 0;
    private boolean drunk = false;
    public void addedToWorld (World world)
    {
        for (int i = 0; i < drink.length;i++){
            drink[i] = new GreenfootImage("r" + (i+1)+ ".PNG");
        }
    }

    public void act() 
    {
        if (!drunk)
        {
            drink();
        }
        if (drunk)
        {
            getWorld().removeObject(this);
        }
        if (Greenfoot.mouseClicked(this))
        {

        }
    }    

    public void drink()
    {
        setImage(drink[num]);
        num++;
        if (num >= drink.length){
            drunk = true;
        }
        Greenfoot.delay(15);
    }
}
