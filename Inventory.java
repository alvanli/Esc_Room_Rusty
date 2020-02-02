import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory extends Actor
{
    //this is creates an arraylist that will hold the items the player collects
    public static boolean inventoryShowing = false;
    public ArrayList <Actor> inventoryObjects = new ArrayList <Actor>();
    //size of screen 1169*700

    /**
     * Act - do whatever the Inventory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkInv();
    }

    public void addToInventory(Actor x)
    {
        reference.collectedObjects.add(x);
        //System.out.println(reference.collectedObjects.size());
    }

    public void addedToWorld(World World)
    {
        getImage().setTransparency(0);
    }

    public void toggleInventory()
    {
        if(!inventoryShowing)
        {
            getImage().setTransparency(255);
            for (int i = 0; i < reference.collectedObjects.size();i++)
            {
                Actor item = reference.collectedObjects.get(i);
                GreenfootImage itemImage = new GreenfootImage(item.getImage());
                itemImage.scale(40, 40);
                item.setImage(itemImage);
                int xItem = 190+ i* 65;
                getWorld().addObject(item, xItem, getY()+15);
                inventoryObjects.add(item);
            }
            inventoryShowing = true;
        }
        else
        { //remove inventory
            getImage().setTransparency(0);
            getWorld().removeObjects(inventoryObjects);
            inventoryShowing = false;
        }
    }
    //public void useInv(Actor a)
    {
        //getWorld().removeObject(a);
        //if (Greenfoot.mouseClicked(this))
        {
            //MouseInfo mouse = Greenfoot.getMouseInfo();
            //int index = mouse.getX()/ 70 -4;
            //getWorld().removeObject(reference.collectedObjects.remove(index));
            //System.out.println("removeksldjfha");
        }
    }

    public void checkInv()
    {
        if (Greenfoot.isKeyDown("i") && !RedVail.hasRed)
        {
            toggleInventory();
            Greenfoot.delay(10);
        }
    }

    public void goAway()
    {
        getImage().setTransparency(0);
        getWorld().removeObjects(inventoryObjects);
        inventoryShowing = false;
    }
    
    public void remove (Actor a)
    {
        reference.collectedObjects.remove(a);
    }
 
        
}
