import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class North here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class North extends World
{
    Door door = new Door();
    Stand stand = new Stand();
    Blinds blinds = new Blinds();
    StandTop standTop = new StandTop();
    clue clue = new clue();
    Lady lady = new Lady();
    LadyCube ladyC = new LadyCube();
    GreenfootImage blindOpen = new GreenfootImage("blindsfolded.png");
    GreenfootImage blindClosed = new GreenfootImage("blinds.png");
    GreenfootImage doorOpen = new GreenfootImage("dooropen.png");
    GreenfootImage standTopNoWater = new GreenfootImage("standtopnowater.png");
    public static boolean blindIsOpen = false;
    public static boolean doorIsOpen = false;
    private boolean isFish = false;
    private boolean isLady = false;
    private boolean hasLCube = false;
    private Inventory inve = new Inventory();
    /**
     * Constructor for objects of class North.
     * 
     */
    public North()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 

        prepare();
        addObject( new timer(), 100,30);
    }

    public void act()
    {
        switchWorld();
        checkBlinds();
        checkDoor();
        checkStand();
        checkStandTop();
        putLady();
    }

    public void switchWorld()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.west);
            Greenfoot.delay(10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.east);
            Greenfoot.delay(10);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(door,578,378);
        addObject(stand,916,530);
        addObject(lady, 260, 430);
        lady.getImage().setTransparency(0);
        addObject(blinds,190,387);
        addObject(standTop,910,356);
        addObject(clue,914,206);
        addObject(inve, 577, 650);
    }

    public void checkBlinds()
    {
        if(Greenfoot.mouseClicked(blinds))
        {
            if(blindIsOpen)
            {
                blinds.setImage(blindClosed);
                blinds.setLocation(blinds.getX() + 96, blinds.getY() );
                blindIsOpen = false;
                if(isLady == true && isFish == true && blindIsOpen == false && hasLCube == false)
                {
                    hasLCube = true;
                    lady.getImage().setTransparency(255);
                    Greenfoot.delay(100);
                    removeObjects(getObjects(FishBowlWithFish.class));
                    removeObjects(getObjects(Lady.class));
                    addObject(ladyC,300,600);
                    GreenfootImage itemImage = new GreenfootImage("cube3inv.png");
                    itemImage.scale(40, 40);
                    ladyC.setImage(itemImage);
                    Greenfoot.delay(100);
                    blinds.setImage(blindOpen);
                    blinds.setLocation(blinds.getX() - 96, blinds.getY() );
                    blindIsOpen = true;

                }
            }
            else
            {
                blinds.setImage(blindOpen);
                blinds.setLocation(blinds.getX() - 96, blinds.getY() );
                blindIsOpen = true;
            }
            if(reference.equipped.get("Fishbowl") != null &&  Greenfoot.mouseClicked(null))
            {
                if(reference.equipped.get("Fishbowl")  && blindIsOpen == true && reference.standZoom.fishIsTaken == true && isFish == false && isLady == true)
                {
                    isFish = true;
                    inve.goAway();
                    addObject(new FishBowlWithFish(),300,600);
                }
            }
        }
    }

    public void checkDoor()
    {
        if(Greenfoot.mouseClicked(door) && reference.equipped.get("DoorKey") != null && reference.equipped.get("DoorKey"))
        {
            if(! doorIsOpen) //&& the key is equiped
            {
                door.setImage(doorOpen);
                Greenfoot.playSound("unlock.mp3");
                Greenfoot.playSound("dooropen.mp3");
                doorIsOpen = true;
            }
            else
            {
                Greenfoot.setWorld(new Forest());
            }
        }
    }

    public void checkStand()
    {
        if(Greenfoot.mouseClicked(stand))
        {
            Greenfoot.setWorld(reference.standZoom);
        }
    }

    public void checkStandTop()
    {
        if(Water.hasWater)
        {
            standTop.setImage(standTopNoWater);
        }
        if(Greenfoot.mouseClicked(standTop))
        {
            Greenfoot.setWorld(reference.radioZoom);
        }
    }

    public void putLady()
    {
        if(RadioCode.pwCorrect)
        {
            isLady = true;
            if(!blindIsOpen)
            {
                lady.getImage().setTransparency(255);
            }
            else
            {
                lady.getImage().setTransparency(0);
            }
        }

    }
}
