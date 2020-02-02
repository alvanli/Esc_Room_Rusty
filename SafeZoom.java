import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * safeZoom is a World that controls the image status of the safe (open/closed)
 * if it is clicked after the proper code is entered, the knob will turn the safe will open 
 *
 * @author  Alvin Li
 * @version 1.0
 * @since   2019-04-09 
 */
public class SafeZoom extends World
{

    /**
     * Constructor for objects of class SafeZoom.
     * 
     */
    private GreenfootImage[] safeImg = new GreenfootImage[3];
    public static int isSafeOpen;
    public static int startSpin;
    public static boolean tookBook; 
    private Inventory inve = new Inventory();
    public SafeZoom()
    {    
        super(1169, 700, 1); 
        //safeImg[0] = new GreenfootImage("safezoom.png");
        safeImg[1] = new GreenfootImage("safezoomopen.png");
        safeImg[2] = new GreenfootImage("safezoom2.PNG");
        //setImage(safeImg[0]);
        addObject(inve, 577, 650);
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            if (isSafeOpen == 1 || isSafeOpen == 2)
            {
                //user must take book to exit the world, if the book is unlocked
                if (tookBook)
                {
                    inve.goAway();
                    Greenfoot.setWorld(reference.south);
                }
            }else
            {
                //exit world
                inve.goAway();
                Greenfoot.setWorld(reference.south);
            }
        }
        if(Greenfoot.mouseClicked(this))
        {
            if (isSafeOpen == 2)
            {
                
            }
            else if (isSafeOpen != 1)
            {
                //enter the zoomed in version of the world
                inve.goAway();
                Greenfoot.setWorld(new safeCodeZoom());
            }
            else if (isSafeOpen == 1)
            {
                //turns knob
                addObject( new SafeKnob(), 648, 395);
                setBackground(safeImg[2]);
                startSpin = 1;
            }
        }
        if (startSpin == 2)
        {
            //when knob is turned, change image to open
            setBackground(safeImg[1]);
            isSafeOpen = 2;
        }
    }
}
