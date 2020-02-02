import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * pianoZoom is a World that the user needs to solve by typing certain piano keys
 * once "fdsdfffdddfhh" is typed (the tune of mary had a little lamb), the piano opens up to reveal a box
 * Note: pianoZoom does not allow the user to control the keys of the piano, pianoZoomObject does
 *
 * @author  Alvin Li
 * @version 1.0
 * @since   2019-04-05 
 */
public class pianoZoom extends World
{
    private Inventory inve = new Inventory();
    public static pianoZoomObject pZject = new pianoZoomObject();
    public pianoZoom()
    {
        super(1169, 700, 1); 
        addObject (new pianoContainer(), 584,350);
        if (!pianoCube.hasPianoCube)
        {            
            addObject (new pianoCube(), 524, 630);
        }
        addObject (pZject, 584, 350);
        addObject(inve, 577, 650);
    }

    public void act()
    {
        switchWorld();
    }
    
    public void switchWorld()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            inve.goAway();
            Greenfoot.setWorld(reference.west);
        }
    }
}
