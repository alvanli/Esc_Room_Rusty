import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DrawerZoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawerZoom extends World
{
    Drawer1 d1 = new Drawer1();
    Drawer2 d2 = new Drawer2();
    FishbowlInDrawer fishbowl = new FishbowlInDrawer();
    ClockNote clockNote = new ClockNote();
    private GreenfootImage drawer1Open = new GreenfootImage("drawer1openempty.png");
    private GreenfootImage drawer2Open = new GreenfootImage("drawer2empty.png");
    private GreenfootImage drawer1 = new GreenfootImage("drawer1.png");
    private GreenfootImage drawer2 = new GreenfootImage("drawer2.png");
    private boolean d1IsOpen = false;
    private boolean d2IsOpen = false;
    private boolean fishbowlIsTaken = false;
    private boolean clockNoteIsTaken = false;
    private bugCode bugcode = new bugCode();
    private boolean codeWasRight = false;
    private bugCode3 bugcode3 = new bugCode3();
    private bugCode2 bugcode2 = new bugCode2();
    private Inventory inve = new Inventory();
    /**
     * Constructor for objects of class DrawerZoom.
     * 
     */
    public DrawerZoom()
    {    
        super(1169, 700, 1); 
        addObject(d1,604,267);
        addObject(d2,602,450);
        addObject(bugcode, 495,470);
        addObject(bugcode3, 735,470);
        addObject(bugcode2, 615,470);
        addObject(inve, 577, 650);
    }

    public void act()
    {
        checkD1();
        checkD2();
        switchWorld();  
        //checkGotObject();   
    }

    public void checkGotObject()
    {
        if (Greenfoot.mouseClicked(fishbowl))
        {
            fishbowlIsTaken = true;
        }
        if (Greenfoot.mouseClicked(clockNote))
        {
            clockNoteIsTaken = true;
        }
    }

    public void switchWorld()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.south);
        }
    }

    public void checkD1()
    {
        if (reference.equipped.get("Key") != null)
        {
            if(Greenfoot.mouseClicked(d1) && reference.equipped.get("Key")) 
            {
                if(d1IsOpen)
                {
                    d1.setImage(drawer1);
                    d1.setLocation(d1.getX(), d1.getY() - 98 );
                    d1IsOpen = false;
                    addObject(d2,602,450);
                    removeObject(fishbowl);
                    addObject(bugcode, 495,470);
                    addObject(bugcode3, 735,470);
                    addObject(bugcode2, 615,470);
                    Greenfoot.playSound("closedrawer.mp3");
                }
                else if (reference.equipped.get("Key"))
                {
                    d1.setImage(drawer1Open);
                    d1.setLocation(d1.getX(), d1.getY() + 98 );
                    d1IsOpen = true;
                    removeObject(d2);
                    if(! fishbowlIsTaken)
                    {
                        addObject(fishbowl, 610, 278);
                        fishbowlIsTaken = true;
                    }
                    removeObject(bugcode);
                    removeObject(bugcode2);
                    removeObject(bugcode3);
                    Greenfoot.playSound("opendrawer.mp3");
                    d2IsOpen = false;
                }
            }
        }
    }

    public void checkD2()
    {
        if(Greenfoot.mouseClicked(d2))
        {
            if((d2IsOpen) && clockNoteIsTaken)
            {
                d2.setImage(drawer2);
                d2.setLocation(d2.getX(), d2.getY() - 102 );
                d2IsOpen = false;
                removeObject(clockNote);
                Greenfoot.playSound("closedrawer.mp3");
            }
            else if (bugCode3.bugType3.equals("237") && !d2IsOpen)
            {
                d2.setImage(drawer2Open);
                d2.setLocation(d2.getX(), d2.getY() + 102 );
                removeObject(bugcode);
                removeObject(bugcode2);
                removeObject(bugcode3);
                d2IsOpen = true;
                codeWasRight = true;
                Greenfoot.playSound("opendrawer.mp3");
                if(! clockNoteIsTaken)
                {
                    addObject(clockNote, 610, 480);

                    clockNoteIsTaken = true;

                }
            }
        }
    }
}
