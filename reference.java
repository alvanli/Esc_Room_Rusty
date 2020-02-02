import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class something here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class reference extends World
{
   public static int connor = 5;
    public static South south = new South();
    public static East east = new East();
    public static West west = new West();
    public static North north = new North();
    public static BirdZoom bird = new BirdZoom();
    public static DeskZoom deskZoom = new DeskZoom();
    public static Desktop desktop = new Desktop();
    public static DeskOpen deskOpen = new DeskOpen();
    public static DrawerZoom drawerZoom = new DrawerZoom();
    public static PhotoZoom photoZoom = new PhotoZoom();
    public static PaintingZoom paintingZoom = new PaintingZoom();
    public static BookshelfZoom bookshelfZoom = new BookshelfZoom();
    public static StandZoom standZoom = new StandZoom();
    public static RadioZoom radioZoom = new RadioZoom();
    public static ArrayList <Actor> collectedObjects = new ArrayList <Actor>();
    public static HashMap <String, Boolean> equipped = new HashMap <String, Boolean>();
    public static boolean useBCube = false;
    public static boolean usePCube = false;
    public static boolean useLCube = false;
    public static boolean bIn = false;
    public static boolean pIn = false;
    public static boolean lIn = false;
    /**
     * Constructor for objects of class something.
     * 
     */
    public reference()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public static void unEquip()
    {
        for (String i : equipped.keySet())
        {
            equipped.put(i, false);
        }
        //System.out.println("unequipping");
    }
}
