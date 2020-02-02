import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class restart extends Actor
{
    /**
     * Act - do whatever the restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer timer;
    public void act() 
    {

        reset();
    }    
    
    public void reset()
    {
        if(Greenfoot.mouseClicked(this))
        {
            timer = new SimpleTimer();
            timer.mark();
            BirdZoom.isAlive = true;
            BirdZoom.cubeRemoved = false;
            reference.south = new South();
            reference.east = new East();
            reference.west = new West();
            reference.north = new North();
            reference.bird = new BirdZoom();
            reference.deskZoom = new DeskZoom();
            reference.desktop = new Desktop();
            reference.deskOpen = new DeskOpen();
            reference.drawerZoom = new DrawerZoom();
            reference.photoZoom = new PhotoZoom();
            reference.paintingZoom = new PaintingZoom();
            reference.bookshelfZoom = new BookshelfZoom();
            reference.standZoom = new StandZoom();
            South.isPianoOpen = 0;
            reference.radioZoom = new RadioZoom();
            while(! reference.collectedObjects.isEmpty())
            {
                for(int i = 0; i < reference.collectedObjects.size(); i ++)
                {
                    reference.collectedObjects.remove(i);
                }
            }
            reference.equipped.clear();
            reference.useBCube = false;
            reference.usePCube = false;
            reference.useLCube = false;
            reference.bIn = false;
            reference.pIn = false;
            reference.lIn = false;
            pianoZoom.pZject = new pianoZoomObject();
            StandZoom.fishIsTaken = false;
            RadioZoom.waterTaken = false;
            North.blindIsOpen = false;
            North.doorIsOpen = false;
            bugCode3. bugType3 = "0000";
            pianoCube.hasPianoCube = false;
            Water.hasWater = false;
            Seed.hasSeed = false;
            RedVail.hasRed = false;
            RadioCode.pwCorrect = false;
            Music.hasMusic = false;
            LadyCube.hasLadyCube = false;
            Key.hasKey = false;
            Inventory.inventoryShowing = false;
            GreenVail.hasGreen = false;
            ClockNote.noteOpen = false;
            ClockNote.hasClock = false;
            BlueVail.hasBlue = false;
            BirdCube.hasBirdCube = false;
            Greenfoot.setWorld(new East());
        }
    }
}
