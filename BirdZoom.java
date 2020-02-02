import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdZoom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdZoom extends World
{
    BirdAliveZoom bird = new BirdAliveZoom();
    BirdCube cube = new BirdCube();
    private GreenfootImage deadbird = new GreenfootImage("birddeadzoomcubegone.png");
    public static boolean isAlive = true;
    public static boolean cubeRemoved = false;
    private Inventory inve = new Inventory();
    /**
     * Constructor for objects of class BirdZoom.
     * 
     */
    public BirdZoom()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1169, 700, 1); 
        addObject(bird, 600, 348);
        addObject(inve, 577, 650);
    }
    
    public void act()
    {
        checkBird();
        checkCube();
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.south);
        }
    }
    
    public void checkBird()
    {
        if (reference.equipped.get("Seed") != null)
        {
            if(Greenfoot.mouseClicked(bird) && isAlive && reference.equipped.get("Seed")) //and poinouse seeds are equipped
            {
                bird.setImage(deadbird);
                isAlive = false;
                addObject(cube, 615, 545);
                Greenfoot.playSound("parrot.mp3");
            }
        }
    }
    public void checkCube()
    {
        if (reference.equipped.get("BirdCube") != null)
        {
            if(Greenfoot.mouseClicked(cube) && isAlive && reference.equipped.get("BirdCube"))
            {
                removeObject(cube);
                cubeRemoved = true;
               //and add to inventory
            }
        }
    }
    
}
