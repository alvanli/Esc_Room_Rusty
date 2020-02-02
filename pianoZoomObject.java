import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * pianoZoomObject allows the user to control the keys of the piano by typing in certain keys
 * once "fdsdfffdddfhh" is typed (the tune of mary had a little lamb), the piano opens up to reveal a box
 *
 * @author  Alvin Li
 * @version 1.3
 * @since   2019-04-11 
 */

public class pianoZoomObject extends Actor
{

    private static String type;
    private static GreenfootImage[] pianoImg = new GreenfootImage[10];
    private static GreenfootImage[] pianoOpn = new GreenfootImage[13];
    private static HashMap <String, GreenfootImage> setIMG = new HashMap<String, GreenfootImage>();
    private static HashMap <String, String> setSound = new HashMap<String, String>();
    private static boolean canType;
    public void addedToWorld(World pianoZoom){
        //load all key images and opening images
        for (int i = 0; i < pianoImg.length; i++)
        {
            pianoImg[i] = new GreenfootImage("p" + (i) + ".png");
        }
        for (int i = 0; i < pianoOpn.length; i++)
        {
            pianoOpn[i] = new GreenfootImage("op" + (i+1) + ".png");
        }
        //set initial images, if it's already open, set image as opened
        if (South.isPianoOpen == 1 || South.isPianoOpen ==2)
        {
            setImage(pianoOpn[12]);
            canType = false;
        }
        else
        {
            South.isPianoOpen = 0;
            setImage(pianoImg[0]);
        }

        type = "";
        //create the hashmaps to the images and sounds
        initialiseKeys();
        initialiseSound();
    }

    public void act() 
    {
        String finalF;
        checkTyped();
        checkPiano();
        refreshType();
        //when exiting, images are not referred to anymore and cleaned up by garbage collector, save space
        if(Greenfoot.isKeyDown("down"))
        {
            for (int i = 0; i < pianoImg.length; i++)
            {
                pianoImg[i] = null;
            }
            for (int i = 0; i < pianoOpn.length; i++)
            {
                pianoOpn[i] = null;
            }
            Greenfoot.setWorld(reference.west);         
        }
        
        checkMusic();
    }    

    public void checkMusic()
    {
        if (Greenfoot.mouseClicked(this) && reference.equipped.get("Music")!= null && reference.equipped.get("Music"))
        {
            getWorld().addObject(new musicOpen(), 605,175);
        }
    }
    //limit length of type
    public void refreshType()
    {
        if (type != null && type.length() > 26)
        {
            type = type.substring(type.length()-13, type.length());
        }
    }

    //check if the typed keys have been right
    public void checkPiano()
    {
        if (type != null && type.length() > 12)
        {
            if (type.substring(type.length()-13,type.length()).equals("fdsdfffdddfhh") && South.isPianoOpen != 2)
            {
                South.isPianoOpen = 1;
                if (South.isPianoOpen == 1)
                {
                    pianoOpen();
                    getWorld().removeObjects(getWorld().getObjects(pianoCube.class));
                    getWorld().addObject(new pianoCube(), 524, 630);
                }
            } 
        }
    }

    //check which keys are pressed, play related image and sounds
    public void checkTyped()
    {
        String hold = Greenfoot.getKey();
        if (hold != null && setIMG.containsKey(hold) && !canType)
        {
            type = type + hold;
            setImage(setIMG.get(hold));
            Greenfoot.playSound(setSound.get(hold));
            Greenfoot.delay(5);
        }
        else if (South.isPianoOpen == 2)
        {
            setImage(pianoOpn[12]);
        }
        else
        {
            setImage(pianoImg[0]);
        }
    }

    public void initialiseKeys()
    {  
        //create hashmap for corresponding images
        setIMG.put("a",pianoImg[1]);
        setIMG.put("s",pianoImg[2]);
        setIMG.put("d",pianoImg[3]);
        setIMG.put("f",pianoImg[4]);
        setIMG.put("g",pianoImg[5]);
        setIMG.put("h",pianoImg[6]);
        setIMG.put("j",pianoImg[7]);
        setIMG.put("k",pianoImg[8]);
        setIMG.put("l",pianoImg[9]);
    }

    public void initialiseSound()
    {  
        //create hashmap for corresponding sounds
        setSound.put("a","B.mp3");
        setSound.put("s","C.mp3");
        setSound.put("d","D.mp3");
        setSound.put("f","E.mp3");
        setSound.put("g","F.mp3");
        setSound.put("h","G.mp3");
        setSound.put("j","A.mp3");
        setSound.put("k","B2.mp3");
        setSound.put("l","C2.mp3");
    }

    //animation for piano opening
    public void pianoOpen()
    {
        for (int i = 0; i < pianoOpn.length; i++)
        {
            setImage(pianoOpn[i]);
            Greenfoot.delay(4);
        }
        South.isPianoOpen = 2;
    }
}
