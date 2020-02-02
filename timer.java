import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class timer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class timer extends Actor
{
    /**
     * Act - do whatever the timer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static Color colorF;
    private static int actualSeconds = 0;
    private static int actualMin = 0;
    public static String display = "";
    private static int timeE = 0;
    private static int time;
    SimpleTimer timer;
    public void addedToWorld()
    {
        timer = new SimpleTimer();
        timer.mark();
    }

    public void act() 
    {       
        if (!Forest.stopTime)
        {
            time = (int) (System.currentTimeMillis() - SimpleTimer.lastMark);
        }
        actualSeconds = (time/1000)%60;
        actualMin = (time/1000)/60;
        if (actualSeconds < 10)
        {
            display = actualMin + ":0" + actualSeconds;
        }
        else
        {
            display = actualMin + ":" + actualSeconds;
        }
        setImage(new GreenfootImage(display,60, Color.RED, Color.BLACK));
    }    
}
