import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Stopwatch extends Actor
{
    private int count = 0;
    private int seconds = 0;
    
    public Stopwatch()
    {
        GreenfootImage img = getImage();
        setImage(new GreenfootImage("Time: " + seconds, 24, Color.WHITE, Color.BLACK));
    }
    
    public void act()
    {
        if (!getWorld().getObjects(Skull.class).isEmpty())
        {
            return;
        }

        count++;
    
        if (count % 60 == 0)
        {
            seconds++;
            updateImage();
        }
    }
    
    private void updateImage()
    {
        setImage(new GreenfootImage("Time: " + seconds, 24, Color.WHITE, Color.BLACK));
    }
    
    public int getSeconds()
    {
        return seconds;
    }
}
