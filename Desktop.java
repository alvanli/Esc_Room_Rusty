import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Desktop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desktop extends World
{
    KeyBox keyBox = new KeyBox();
    Key key = new Key();
    Letter letter = new Letter();
    pianoCube pCube = new pianoCube();
    BirdCube bCube = new BirdCube();
    LadyCube lCube = new LadyCube();
    private GreenfootImage box = new GreenfootImage("keybox.png");
    private GreenfootImage openBox = new GreenfootImage("keyboxempty.png");
    private GreenfootImage letterzoom = new GreenfootImage("letterzoom.png");
    private GreenfootImage letterpng = new GreenfootImage("letter.png");
    private boolean isOpen = false;
    private boolean isZoom = false;
    private Inventory inve = new Inventory();
    
    /**
     * Constructor for objects of class Desktop.
     * 
     */
    public Desktop()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject( keyBox, 370, 400);
        addObject(inve, 577, 650);
        addObject(letter, 735, 410);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.deskZoom);
            Greenfoot.delay(10);
        }
        checkBox();
        checkLetter();
        putCube();
    }
    
    public void checkBox()
    {
        if ( Greenfoot.mouseClicked(keyBox))
        {
            if(isOpen)
            {
                keyBox.setImage(box);
                removeObject(key);
                isOpen = false;
                Greenfoot.playSound("keybox.mp3");
            }
            else
            {
                keyBox.setImage(openBox);
                if(! Key.hasKey)
                {
                    addObject( key, 370, 420);
                }                
                isOpen = true;
                Greenfoot.playSound("keybox.mp3");
            }
        }
    }
    
    public void checkLetter()
    {
        if(Greenfoot.mouseClicked(letter))
        {
            if(isZoom)
            {
                letter.setImage(letterpng);
                letter.setLocation(letter.getX() + 100, letter.getY() + 50);
                isZoom = false;
            }
            
            else
            {
                letter.setImage(letterzoom);
                letter.setLocation(letter.getX() - 100, letter.getY() - 50);
                isZoom = true;
            }
            
            
        }
    }
    public void putCube()
    {
        if (Greenfoot.mouseClicked(null))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int x = mouse.getX();
            int y = mouse.getY();
            if (x>= 500 && x <= 685 && y >= 189 && y <= 270)
            {
                if (reference.equipped.get("pianoCube") != null && reference.equipped.get("pianoCube"))
                {
                    reference.usePCube = true;
                    pCube.used();
                    reference.unEquip();
                    addObject ( pCube, 592, 227);
                    Greenfoot.playSound("insertcube.mp3");
                    reference.usePCube = false;
                }
                if (reference.equipped.get("BirdCube") != null && reference.equipped.get("BirdCube"))
                {
                    reference.useBCube = true;
                    bCube.used();
                    reference.unEquip();
                    addObject (bCube, 530, 227);
                    Greenfoot.playSound("insertcube.mp3");
                    reference.useBCube = false;
                }
                if (reference.equipped.get("LadyCube") != null && reference.equipped.get("LadyCube"))
                {
                    reference.useLCube = true;
                    lCube.used();
                    reference.unEquip();
                    addObject (lCube, 651, 227);
                    Greenfoot.playSound("insertcube.mp3");
                    reference.useLCube = false;
                }
            }
        }
    }

    
}
