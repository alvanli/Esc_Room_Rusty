import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class safe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class safe extends southObjects
{
    /**
     * Act - do whatever the safe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootImage[] safeImg = new GreenfootImage[2];

    public void addedToWorld(World world)
    {
        safeImg[0] = new GreenfootImage("safe.png");
        safeImg[1] = new GreenfootImage("safeopen.png");
        setImage(safeImg[0]);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new SafeZoom());
        }
        if (SafeZoom.isSafeOpen == 2)
        {
            setImage(safeImg[1]);
           
        }
    }    
}
