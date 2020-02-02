import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StandZoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandZoom extends World
{
    Drawer3 d3 = new Drawer3();
    GreenfootImage drawer3 = new GreenfootImage("drawer3.png");
    GreenfootImage drawer3Open = new GreenfootImage("drawer3open.png");
    GreenfootImage drawer3FishRevived = new GreenfootImage("drawer3fishrevived.png");
    GreenfootImage drawer3Empty = new GreenfootImage("drawer3empty.png");
    private boolean d3IsOpen = false;
    private boolean fishIsRevived = false;
    public static boolean fishIsTaken = false;
    private Inventory inv = new Inventory();
    /**
     * Constructor for objects of class StandZoom.
     * 
     */
    public StandZoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject(d3,590,267);
        addObject(inv, 577, 650);
    }
    
    public void act()
    {
        checkD3();
        goBack();
    }
    
    public void checkD3()
    {
        if(Greenfoot.mouseClicked(d3))
        {
            if(reference.equipped.get("Water") != null)
            {
                if(!d3IsOpen)
                {
                    d3.setImage(drawer3Open);
                    d3.setLocation(d3.getX(), d3.getY() + 98 );
                    d3IsOpen = true;
                    Greenfoot.playSound("opendrawer.mp3");
                }
                else if(reference.equipped.get("Water") && !fishIsRevived && d3IsOpen)
                {
                    fishIsRevived = true;
                    Greenfoot.playSound("water.mp3");
                    d3.setImage(drawer3FishRevived);
                }
                if(reference.equipped.get("Fishbowl") != null)
                {
                    if(fishIsRevived && d3IsOpen && reference.equipped.get("Fishbowl"))
                    {
                        fishIsTaken = true;
                        GreenfootImage itemImage = new GreenfootImage("fishbowwithfish.png");
                        itemImage.scale(40, 40);
                        getObjects(FishbowlInDrawer.class).get(0).setImage(itemImage);
                        d3.setImage(drawer3Empty);
                    }
                }
                else if(d3IsOpen && fishIsRevived)
                {  
                    //nothing
                }
                else
                {
                    
                    d3.setImage(drawer3);
                    d3.setLocation(d3.getX(), d3.getY() - 98 );
                    d3IsOpen = false;
                    addObject(d3,590,450);
                    Greenfoot.playSound("closedrawer.mp3");
                    
                }
            }
            else
            {
                if(d3IsOpen == false)
                {
                    d3.setImage(drawer3Open);
                    d3.setLocation(d3.getX(), d3.getY() + 98 );
                    d3IsOpen = true;
                    Greenfoot.playSound("opendrawer.mp3");
                }
                else
                {
                    d3.setImage(drawer3);
                    d3.setLocation(d3.getX(), d3.getY() - 98 );
                    d3IsOpen = false;
                    addObject(d3,590,450);
                    Greenfoot.playSound("closedrawer.mp3");
                }
            }
        }
    }
    
    public void goBack()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            Greenfoot.setWorld(reference.north);
        }
    }
}

