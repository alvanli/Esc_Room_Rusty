import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class South here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class South extends World//something
{
    Bird bird = new Bird();
    //Clock clock = new Clock();
    Bookshelf bookshelf = new Bookshelf();
    GreenfootImage deadbird = new GreenfootImage("birddead.png");
    GreenfootImage deadbirdcubegone = new GreenfootImage("birddeadcubegone.png");
    public static int isPianoOpen;
    private Inventory inve = new Inventory();
    public South()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject( bird, 250, 312);
        addObject( new Drawer(), 250, 525);
        addObject( new BugCollection(), 550, 200);
        addObject( new Photo(), 560, 473);
        //addObject(bookshelf, 953, 383);
        addObject( new safe(), 890, 355);

        //addObject( bookshelf, 890, 340);
        addObject( bookshelf, 900, 381);
        addObject( new clockFace(), 897, 368);
        addObject( new handMin(), 897, 368);
        addObject( new handHour(), 897, 368);
        addObject( new blockWall(), 1133,328);
 
        //addObject(clock, 870, 348);
        addObject(inve, 577, 650);
        addObject( new timer(), 100,30);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.east);
            Greenfoot.delay(10);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.west);
            Greenfoot.delay(10);
        }
        checkBird();
        checkCube();
        //checkClock();
    }
    
    
    public void checkBird()
    {
        
        if(! BirdZoom.isAlive)
        {
            bird.setImage(deadbird);
        }
       
    }
    
    public void checkCube()
    {
        if(BirdZoom.cubeRemoved)
        {
            bird.setImage(deadbirdcubegone);
        }
    }
    /*
    public void checkClock()
    {
        if(Greenfoot.mouseClicked(clock))
        {
            Greenfoot.setWorld(reference.bookshelfZoom);
        }
    }
    */
}
